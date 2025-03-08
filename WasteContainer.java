public class WasteContainer {
    private String type;
    private int capacity;
    private int currentLoad;

    public WasteContainer(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
        this.currentLoad = 0;
    }

    public boolean isFull() {
        return currentLoad >= capacity;
    }

    public String getType() {
        return type;
    }

    public void addWaste(int amount) {
        this.currentLoad += amount;
    }
}