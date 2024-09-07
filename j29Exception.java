public class j29Exception {
    public static void main(String[] args) {
        int i = 10;
        int arr[] = new int[5];
        try{
            double j = 18/i;
            System.out.println(j);

            System.out.println(arr[i]);
        }
        catch(ArithmeticException e){
            System.out.println("Cannot Divide by Zero");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index is out of Bound...");
        }
        catch(Exception e){
            System.out.println("Something Went Wrong.....");
            System.out.println(e);
        }
        System.out.println("Bye");
    }
}
