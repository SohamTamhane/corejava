
class Laptop{
    String model;
    int price;

    public String toString(){
        return model + ": " + price;
    }
}

public class j21ObjectClass {
    public static void main(String[] args) {
        Laptop obj = new Laptop();
        obj.model = "Asus";
        obj.price = 2000;

        // Produces the Same Output
        // System.out.println(obj);
        // System.out.println(obj.toString());

        // toString() is a method of Object Class
        // Every Class inherits the Object Class

        System.out.println(obj);
    }
}
