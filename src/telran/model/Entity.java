package telran.model;

public class Entity implements Comparable<Entity> {
    private final int value;

    public Entity(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public int compareTo(Entity other) {
        return Integer.compare(this.value, other.value);
    }
}
