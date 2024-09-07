public class j35Finally {
    public static void main(String[] args) {
        int num1 = 10;
        try{
            int res = 20/num1;
            System.out.println("Result: " + res);
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("Finally Block is Executed Everytime...");
        }
    }
}
