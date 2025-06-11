import java.util.Arrays;

public class j42ArrayMethods {

    public static void printArray(int arr[]){
        for(int i: arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        int arr1[] = {10, 20, 30, 40};
        int arr2[] = {10, 20, 300, 40};

        int index = Arrays.binarySearch(arr1, 20);
        System.out.println(index);

        System.out.println(Arrays.equals(arr1, arr2));

        Arrays.sort(arr2);
        printArray(arr2);

        String s1 = Arrays.toString(arr2);
        System.out.println(s1 + " " + s1.getClass());

        System.out.println("Hashcode: " + arr1.hashCode());
        System.out.println("Hashcode: " + arr2.hashCode());
    }
}
