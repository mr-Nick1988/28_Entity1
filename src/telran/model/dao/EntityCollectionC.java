package telran.model.dao;

import com.sun.source.tree.Tree;
import telran.model.Entity;

import java.util.*;

public class EntityCollectionC implements EntityCollection {
    private final TreeSet<Entity> entities = new TreeSet<>();

    //O(log n)
    @Override
    public void add(Entity entity) {
        entities.add(entity);
    }

    //O(1)
    @Override
    public Entity removeMaxValue() {
        if (entities.isEmpty()) {
            return null;
        }
        Entity maxEntity = entities.pollLast();
        return maxEntity;
    }
}
