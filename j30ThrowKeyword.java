public class j30ThrowKeyword {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        try{
            int j = num1 / num2;
            System.out.println("Result: " + j);
            if(j==0){
                throw new ArithmeticException("The Result was Zero");
            }
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception");
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
