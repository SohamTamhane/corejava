interface A{
    String brand = "Apple";
    int price = 1000;
    void show();
    void run();
}

interface B{
    void config();
}

class C implements A, B{
    public void show(){
        System.out.println("In C Show");
    }
    public void run(){
        System.out.println("In C Run");
    }
    public void config(){
        System.out.println("In C Config");
    }
}

interface D extends A,B{
    void play();
}

public class j26Interface {
    public static void main(String[] args) {
        C obj = new C();
        obj.show();
        obj.run();
        obj.config();
    }   
}