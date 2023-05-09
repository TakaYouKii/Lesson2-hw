public class Iphon extends Telephon {
    String IOS = "iOS 16";
    private String GPS = "GPS, A-GPS, GLONASS, Galileo, QZSS";
    private String storage = "6GB | 256Gb";
    private String model = "iPhone 14 Pro Max";
    String processor = "Apple A16 Bionic (4 nm)";
    String display = "LTPO Super Retina XDR OLED, 120Гц";
    private String fastCharging = "50% in 30 min";
    private int price = 165732;

    @Override
    public void print() {
        System.out.println("OS: " + IOS
        + "\nGPS: " + GPS
        +"\nStorage: " + storage
        +"\nModel: " + model
        +"\nProcessor: " + processor
        +"\nDisplay: " + display
        +"\nFast charge: "+ fastCharging
        +"\nPrice: " + price);
    }
}
