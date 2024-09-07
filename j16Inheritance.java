
class Calc{
    
    public int add(int n1, int n2){
        return n1 + n2;
    }

    public int sub(int n1, int n2){
        return n1 - n2;
    }

}

// Single Level Inheritance
class AdvanceCalc extends Calc{
    public int mul(int n1, int n2){
        return n1*n2;
    }

    public int div(int n1, int n2){
        return n1/n2;
    }
}

// Multi-Level Inheritance
class VeryAdvanceCalc extends AdvanceCalc {
    public double power(int n1, int n2){
        return Math.pow(n1, n2);
    }
}

public class j16Inheritance {
    public static void main(String args[]){
        VeryAdvanceCalc obj = new VeryAdvanceCalc();
        System.out.println(obj.add(10, 4));
        System.out.println(obj.sub(10, 4));
        System.out.println(obj.mul(10, 4));
        System.out.println(obj.div(10, 4));
        System.out.println(obj.power(4, 2));
    }
}
