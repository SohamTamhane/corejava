
class Mobile{
    String brand;
    int price;

    // Default Constructor
    Mobile(){
        this.brand = "";
        this.price = 0;
    }

    // Parameterized Constructor
    Mobile(String brand, int price){
        this.brand = brand;
        this.price = price;
    }

    // Copy Constructor
    Mobile(Mobile obj){
        this.brand = obj.brand;
        this.price = obj.price;
    }
}

public class j11Contructor {
    public static void main(String args[]){
        Mobile obj1 = new Mobile();
        System.out.println(obj1.price);

        Mobile obj2 = new Mobile("Apple", 10);
        System.out.println(obj2.brand);

        Mobile obj3 = new Mobile(obj2);
        System.out.println(obj3.brand);
    }
}
