public class Xiaomi extends Telephon{
    String MIUI = "MIUI 13";
    String storage = "8GB | 128Gb";
    String model = "Redmi 10";
    String protection = "Corning Gorilla Glass 3";
    String processor = "Mediatek MT8781 Helio G99 (6nm)";
    String display = "Super AMOLED";
    String batteryType ="Li-Po 5000 mAh, non-removable";
    int price = 28537;

    @Override
    public void print() {
        System.out.println("OS: " +  MIUI
                + "\nBattery type: " + batteryType
                +"\nStorage: " + storage
                +"\nModel: " + model
                +"\nProcessor: " + processor
                +"\nDisplay: " + display
                +"\nProtection: "+ protection
                +"\nPrice: " + price);
    }
}
