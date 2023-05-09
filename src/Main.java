import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Printable> phones = new ArrayList<>();
        phones.add(createObject("Xiaomi"));
        phones.add(createObject("Iphone"));
        phones.add(createObject("Samsung"));

        for(int i = 0; i < phones.size(); i++){
            phones.get(i).print();
            System.out.println("=========================");
        }
    }
    public static Telephon createObject(String className){
        Telephon phone = null;
        if(className == "Xiaomi"){
            phone = new Xiaomi();
        } else if (className == "Samsung") {
            phone = new Samsung();
        } else if (className == "Iphone") {
            phone = new Iphon();
        }
        return phone;
    }

}