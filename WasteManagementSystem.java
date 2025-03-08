public class WasteManagementSystem {
    public static void main(String[] args) {
        WasteManagementChain wasteChain = new WasteManagementChain();

        WasteContainer organicBin = new WasteContainer("organic", 50);
        WasteContainer recyclableBin = new WasteContainer("recyclable", 40);
        WasteContainer hazardousBin = new WasteContainer("hazardous", 30);
        WasteContainer unknownBin = new WasteContainer("electronics", 20);

        organicBin.addWaste(50);
        recyclableBin.addWaste(40);
        hazardousBin.addWaste(30);
        unknownBin.addWaste(20);

        System.out.println("Processing waste collection...");
        wasteChain.collect(organicBin);
        wasteChain.collect(recyclableBin);
        wasteChain.collect(hazardousBin);
        wasteChain.collect(unknownBin);
    }
}
