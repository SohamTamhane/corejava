
class Calculator{
    
    // Instance Variable
    int num = 10;

    // Method Overloading
    // Method Having same name but different number of parameters or parameter with different datatypes

    // This is a Add Method
    public int add(int n1, int n2){
        // n1 & n2 -> are local Variable
        return n1 + n2;
    }

    public int add (int n1, int n2, int n3){
        return n1 + n2 + n3;
    }

    public double add(double n1, int n2){
        return n1 + n2;
    }

}

public class j6OOP{
    public static void main(String args[]){
        
        int data = 10;

        // calc is a Reference Variable not an object
        Calculator calc = new Calculator();
        int res = calc.add(10, 20);
        System.out.println(res);

    }
}