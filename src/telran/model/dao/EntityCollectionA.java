package telran.model.dao;

import telran.model.Entity;

import java.util.*;

public class EntityCollectionA implements EntityCollection {
    private final HashSet<Entity> entities = new HashSet<>();
    private Entity maxEntity = null;


    //O(1)
    @Override
    public void add(Entity entity) {
        if (entities.add(entity) && (maxEntity == null || entity.compareTo(maxEntity) > 0)) {
            maxEntity = entity;
        }

    }

    //O(n)
    @Override
    public Entity removeMaxValue() {
        if (entities.isEmpty()) {
            return null;
        }
        Entity res = maxEntity;
        entities.remove(maxEntity);
        maxEntity = entities.stream()
                .max(Entity::compareTo)
                .orElse(null);
        return res;
    }
}
