
class Mobile{

    String brand;
    int price;
    static String name;

    static{
        System.out.println("In Static Block");
    }

    public Mobile(String b, int p){
        brand = b;
        price = p;
    }

    public void show(){
        System.out.println(brand + ": " + price + ": " + name);
    }

    public static void show1(){
        System.out.println(name);
        System.out.println("In Static Method");
    }

    public static void show2(Mobile obj){
        System.out.println(obj.brand + ": " + obj.price + ": " + name);
        System.out.println("In Static Method");
    }

}

public class j12StaticMethod {
    public static void main(String[] args) {
        // We can call a static method without creating any object of Class
        Mobile.show1();

        Mobile obj1 = new Mobile("Apple", 1234);
        Mobile.show2(obj1);
    }
}
