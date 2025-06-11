import java.util.*;

public class j39ArrayList {
    public static void main(String[] args) {
        // Similar as Array - Dynamic Size

        ArrayList<String> stud = new ArrayList<>();
        stud.add("Soham");
        stud.add("ABC");

        for(String i: stud){
            System.out.print(i + " ");
        }
        System.out.println();

        /*
         * size - n
         *        n + n/2 + 1
        */


        List<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        System.out.println("Adding 10, 20: " + arr);
        arr.add(1, 30);
        System.out.println("Adding 30 at index 1: " + arr);

        System.out.println("Printing the Array using ForEach Loop");
        arr.forEach(n->System.out.println(n));

        List<Integer> arr2 = new ArrayList<>();
        arr2.add(1);
        arr2.add(2);
        arr.addAll(arr2);
        // toString() is invoked whenever object is passed into System.out.println();
        System.out.println(arr);

        System.out.println("Element at Index 0: " + arr.get(0));
        System.out.println("Finding Index of Element 20: " + arr.indexOf(20));

        arr.remove(1);
        System.out.println("Removing Element at index 1: " + arr);

        arr.remove(Integer.valueOf(20));
        System.out.println("Removing First Occurrence of Element by Value 20: " + arr);

        arr.set(1, 100);
        System.out.println("Updating the Value by 10 at index 1: " + arr);
        
        System.out.println("Does ArrayList Contains 100: " + arr.contains(100));
        System.out.println("Maximum Value in Arr: " + Collections.max(arr));

        arr.clear();
        System.out.println("Deleting All Data: " + arr);
        System.out.println("isEmpty() : " + arr.isEmpty());
    }
}
