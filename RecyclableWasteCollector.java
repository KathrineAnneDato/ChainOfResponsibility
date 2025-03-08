class RecyclableWasteCollector implements WasteCollector {
    private WasteCollector nextCollector;

    @Override
    public void setNextCollector(WasteCollector nextCollector) {
        this.nextCollector = nextCollector;
    }

    @Override
    public void collect(WasteContainer container) {
        if ("recyclable".equalsIgnoreCase(container.getType()) && container.isFull()) {
            System.out.println("Recyclable waste collected and processed.");
        } else if (nextCollector != null) {
            nextCollector.collect(container);
        }
    }
}