
class A{
    public void show() throws ClassNotFoundException{
        Class.forName("Calc");
    }
}

public class j32ThrowsKeyword {
    public static void main(String[] args) {
        A obj = new A();
        try{
            obj.show();
        }
        catch(Exception e){
            System.out.println(e);
            e.printStackTrace();
        }
    }
}
