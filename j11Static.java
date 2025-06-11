
class Mobile{

    String brand;
    int price;
    // Making it as a Class Member not an Object Member
    static String name;

    static{
        name = "Smartphone";
        System.out.println("In Static Block");
    }

    static void getName(){
        System.out.println("Name: " + name);
    }

    // Default Constructor
    public Mobile(){
        brand = "";
        price = 200;
        System.out.println("In Default Constructor");
    }

    public Mobile(String b, int p){
        brand = b;
        price = p;
        System.out.println("In Parameterized Constructor");
    }

    public void show(){
        System.out.println(brand + ": " + price + ": " + name);
    }
}

public class j11Static {
    public static void main(String args[]){

        // Mobile obj1 = new Mobile();
        // obj1.brand = "Apple";
        // obj1.price = 1500;
        
        // // Static Variable should be called with className
        // Mobile.name = "Smartname";
        // // obj1.name = "Smartphone";

        // Mobile obj1 = new Mobile("Apple", 1300);
        // obj1.show();

        // try {
        //     Class.forName("Mobile");
        // } catch (ClassNotFoundException e) {
        //     e.printStackTrace();
        // }

        Mobile.getName();
    }
}
