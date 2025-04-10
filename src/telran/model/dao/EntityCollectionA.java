package telran.model.dao;

import telran.model.Entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class EntityCollectionA implements EntityCollection {
    private final List<Entity> entities = new ArrayList<>();
    private Entity maxEntity = null;


    //O(1)
    @Override
    public void add(Entity entity) {
        entities.add(entity);
        if (maxEntity == null || entity.compareTo(maxEntity) > 0) {
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
