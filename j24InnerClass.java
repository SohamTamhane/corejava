
class A{
    int num1 = 10;
    public void show(){
        System.out.println("In Show");
    }

    class B{
        public void config(){
            System.out.println("In Config");
        }
    }

    static class C{
        public void dbConnect(){
            System.out.println("In dbConnect");
        }
    }
}

public class j24InnerClass {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        A.B obj1 = obj.new B();
        obj1.config();

        // For Static Class we does not need to create an object of it
        // Static Class can only be used for inner Class
        A.C obj2 = new A.C();
        obj2.dbConnect();
    }
}
