
class A{
    public void show(){
        System.out.println("A Show");
    }
}

class B extends A{
    @Override
    public void show(){
        System.out.println("B Show");
    }
}

public class j17DynamicMethodDispatch {
    public static void main(String[] args) {
        A obj = new B();
        obj.show();

        obj = new A();
        obj.show();
    }
}
