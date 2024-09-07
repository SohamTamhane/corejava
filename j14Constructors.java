
class Human{
    private int age;
    private String name;

    public Human(){
        System.out.println("In Default Constructor");
    }
    
    public Human(int age, String name){
        this.age = age;
        this.name = name;
        System.out.println("In Parameterized Constructor");
    }

}

public class j14Constructors {
    public static void main(String[] args) {

        Human obj1 = new Human();
        Human obj2 = new Human(20, "Soham");
        
    }
}
