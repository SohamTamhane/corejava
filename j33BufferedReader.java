import java.io.BufferedReader;
import java.io.InputStreamReader;

public class j33BufferedReader {
    public static void main(String[] args) {
        System.out.println("Enter a Number");

        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);
        try{
            int num1 =  Integer.parseInt(bf.readLine());
            System.out.println(num1);
            bf.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
