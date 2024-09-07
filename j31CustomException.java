
class MyZeroException extends Exception{

    public MyZeroException(String string){
        super(string);
    }
    
}

public class j31CustomException {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        try{
            int j = num1 / num2;
            System.out.println("Result: " + j);
            if(j==0){
                throw new MyZeroException("The Result was Zero");
            }
        }
        catch(MyZeroException e){
            System.out.println("Arithmetic Exception");
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
