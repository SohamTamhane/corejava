
@FunctionalInterface
interface A{
    void show(String name);
}

public class j46LambdaExp {
    public static void main(String args[]){
        // A obj = new A(){
        //     public void show(String name){
        //         System.out.println(name);
        //     }
        // };

        A obj = (String name) -> {
                System.out.println(name);
            };


        obj.show("I'm a Lambda Expression ...");
    }
}
