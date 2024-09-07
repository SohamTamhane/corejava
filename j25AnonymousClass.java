
class A{
    public void show(){
        System.out.println("In Show");
    }
}

abstract class B{
    public abstract void show();
}

public class j25AnonymousClass {
    public static void main(String[] args) {
        A obj = new A(){
            public void show(){
                System.out.println("In New Show");
            }
        };

        B obj1 = new B(){
            public void show(){
                System.out.println("In B Show");
            }
        };

        obj.show();
        obj1.show();
    }
}
