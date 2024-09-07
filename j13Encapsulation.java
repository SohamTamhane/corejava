
class Human{
    private int age;
    private String name;

    // setter
    public void setAge(int age){
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }

    // getter
    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }
}

public class j13Encapsulation {
    public static void main(String[] args) {
        Human obj = new Human();
        obj.setAge(20);
        obj.setName("Soham");
        System.out.println(obj.getName() + ": " + obj.getAge());
    }
}
