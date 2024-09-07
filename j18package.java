import tools.Calc;
// import tools.*;

public class j18package {
    public static void main(String args[]){
        Calc obj = new Calc();
        int r1 = obj.add(10, 20);
        System.out.println(r1 + ": " + obj.marks);

        /*
         * 
         * public - Access from anywhere
         * private - Access within the Same Class
         * default - It can be accessed in the same package
         * protected - It can be accessed within the same package and also in its subclass
         * 
         */
    }
}
