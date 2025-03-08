public class WasteManagementChain implements WasteCollector {
        public WasteCollector nextCollector;
    
        public WasteManagementChain() {
            WasteCollector organic = new OrganicWasteCollector();
            WasteCollector recyclable = new RecyclableWasteCollector();
            WasteCollector hazardous = new HazardousWasteCollector();
    
            organic.setNextCollector(recyclable);
            recyclable.setNextCollector(hazardous);
            this.nextCollector = organic;
        }
    
        @Override
        public void collect(WasteContainer container) {
            nextCollector.collect(container);
        }
    
        @Override
        public void setNextCollector(WasteCollector nextCollector) {
            this.nextCollector = nextCollector;
        }
    }
