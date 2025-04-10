package telran.model.dao;

import telran.model.Entity;

import java.util.*;

public class EntityCollectionC implements EntityCollection {
    private final LinkedList<Entity> entities = new LinkedList<>();

    //O(n)
    @Override
    public void add(Entity entity) {
        int index = Collections.binarySearch(entities, entity);
        if (index < 0) {
            index = -index - 1;
        }
        entities.add(index, entity);
    }

    //O(1)
    @Override
    public Entity removeMaxValue() {
        return entities.isEmpty() ? null : entities.removeFirst();
    }
}
