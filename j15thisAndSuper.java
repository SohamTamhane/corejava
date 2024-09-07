
class A{
    public A(){
        super();
        System.out.println("In A");
    }

    public A(int n){
        super();
        System.out.println("In A Parameterized Constructor");
    }
}

class B extends A{
    public B(){
        // By Default, Call the Default Constructor of Super Class
        super();
        System.out.println("In B");
    }

    public B(int n){
        // Calling the Parameterized Constructor of Super Class
        super(n);
        System.out.println("In B Parameterized Constructor");
    }
}

class C extends B{
    public C(){
        System.out.println("In C");
    }

    public C(int n){
        this();
        System.out.println("In C Parameterized Constructor");
    }
}

public class j15thisAndSuper {
    public static void main(String[] args) {
        // B obj = new B(10);

        C obj = new C(10);

    }
}
