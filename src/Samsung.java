public class Samsung extends Telephon{

    private String Android = "Android 9.0 Pie";
    private int year = 2019;
    private String model = "Samsung Galaxy Note 10";

    private String processor = "12-Core Samsung Exynos 9 9825";
    private String display;
    private String storage = "8GB | 256Gb";
    private String color = "Black";
    int price = 67435;

    @Override
    public void print() {
        System.out.println("OS: " + Android
                + "\nColor: " + color
                +"\nStorage: " + storage
                +"\nModel: " + model
                +"\nProcessor: " + processor
                +"\nDisplay: " + display
                +"\nYear: "+ year
                +"\nPrice: " + price);
    }
}
