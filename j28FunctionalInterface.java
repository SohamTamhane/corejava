
// Having only on Function
@FunctionalInterface
interface A{
    void show(int i);
}

public class j28FunctionalInterface {
    public static void main(String[] args) {
        
        // A obj = new A() {
        //     public void show(){
        //         System.out.println("In Show");
        //     }
        // };
        // obj.show();

        // Replacing Above Anonymous Class with Lambda Expression

        A obj = (int i) -> {
            System.out.println("In Show: " + i);
        };
        obj.show(10);
    }
}
