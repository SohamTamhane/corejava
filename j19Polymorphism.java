
class A{
    public void show(){
        System.out.println("In A Show");
    }
}

class B extends A{
    public void show(){
        System.out.println("In B Show");
    }
}

class C extends A{
    public void show(){
        System.out.println("In C Show");
    }
}

public class j19Polymorphism {
    public static void main(String[] args) {
        // Runtime Polymorphism -> Method Overriding
        // Using Dynamic Method Dispatch
        A obj = new A();
        obj.show();

        obj = new B();
        obj.show();

        obj = new C();
        obj.show();
    }
}
