
class A{
    public void show1(){
        System.out.println("In A Show");
    }
}

class B extends A{
    public void show2(){
        System.out.println("In B Show");
    }
}

public class j22UpcastingDownCasting {
    public static void main(String[] args) {
        // Similar to Typecasting
        
        // Upcasting
        A obj = new B();
        obj.show1();

        // Downcasting
        B obj1 = (B) obj;
        obj1.show2();
    }
}
