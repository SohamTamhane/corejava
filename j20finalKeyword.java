
// To Stop inheritance we use final class

final class Calc{
    public void show(){
        System.out.println("In Calc Show");
    }
}

class AdvCalc{
    // No one can override final Method
    final public void show(){
        System.out.println("In AdvCalc Show");
    }
    public int add(int n1, int n2){
        return n1+n2;
    }
}

class VeryAdvCalc extends AdvCalc{
    public int add(int n1, int n2){
        return n1+n2+1;
    }
}

public class j20finalKeyword {
    public static void main(String[] args) {
        // final -> constant (We cannot change the value of final variable)
        final int marks = 10;
        // marks = 20;
        System.out.println(marks);
    }
}
