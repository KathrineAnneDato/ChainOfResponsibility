class OrganicWasteCollector implements WasteCollector {
    private WasteCollector nextCollector;

    @Override
    public void setNextCollector(WasteCollector nextCollector) {
        this.nextCollector = nextCollector;
    }

    @Override
    public void collect(WasteContainer container) {
        if ("organic".equalsIgnoreCase(container.getType()) && container.isFull()) {
            System.out.println("Organic waste collected and composted.");
        } else if (nextCollector != null) {
            nextCollector.collect(container);
        }
    }
}