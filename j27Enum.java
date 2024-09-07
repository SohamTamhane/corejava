// enum is a Class
// But we cannot extends enum
enum Status{
    Running, Failed, Pending, Success
}

enum Laptop{
    // Objects
    Macbook(1000), ASUS(2000), HP(3000);

    int price;
    // Constructor
    Laptop(int price){
        this.price = price;
    }

}

public class j27Enum {
    public static void main(String[] args) {
        // Enumeration - Name Constants
        Status s = Status.Success;
        System.out.println(s);
        System.out.println();

        Status[] ss = Status.values();
        for(Status i: ss){
            System.out.println(i);
        }


        Laptop lap = Laptop.Macbook;
        System.out.println(lap + ": " + lap.price);
        System.out.println();

        Laptop[] laps = Laptop.values();
        for(Laptop i: laps){
            System.out.println(i + ": " + i.price);
        }
    }
}
