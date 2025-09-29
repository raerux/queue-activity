public class Task {
    private String name;
    private String description;
    private boolean isPriority;
    private long timestamp;
    
    public Task(String name, String description, boolean isPriority) {
        this.name = name;
        this.description = description;
        this.isPriority = isPriority;
        this.timestamp = System.currentTimeMillis();
    }
    
    // Getters
    public String getName() { return name; }
    public String getDescription() { return description; }
    public boolean isPriority() { return isPriority; }
    public long getTimestamp() { return timestamp; }
    
    @Override
    public String toString() {
        return String.format("[%s%s] %s: %s", 
            isPriority ? "PRIORITY " : "",
            isPriority ? "STACK" : "QUEUE",
            name, description);
    }
}