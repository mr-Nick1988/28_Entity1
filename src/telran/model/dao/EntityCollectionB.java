package telran.model.dao;

import telran.model.Entity;

import java.util.TreeSet;

public class EntityCollectionB implements EntityCollection{
  private final TreeSet<Entity> entities = new TreeSet<>((a,b)-> b.compareTo(a));

    //O(log n)
    @Override
    public void add(Entity entity) {
        entities.add(entity);
    }

    //O(log n)
    @Override
    public Entity removeMaxValue() {
        return entities.pollFirst();
    }
}
