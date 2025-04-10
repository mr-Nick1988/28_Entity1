package telran.model.dao;
import telran.model.Entity;



public interface EntityCollection {
    void add(Entity entity);

    Entity removeMaxValue();
}
