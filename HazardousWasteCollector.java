class HazardousWasteCollector implements WasteCollector {
    public WasteCollector nextCollector;
    
    @Override
    public void setNextCollector(WasteCollector nextCollector) {
        this.nextCollector = nextCollector;
    }
    
    @Override
    public void collect(WasteContainer container) {
        if (container.getType().equalsIgnoreCase("hazardous") && container.isFull()) {
            System.out.println("Hazardous waste collected with safety measures.");
        } else {
            System.out.println("No collector found for waste type: " + container.getType());
        }
    }
}