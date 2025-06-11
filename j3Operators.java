class j3Operators{
    public static void main(String args[]){
        
        // ----- Arithmetic Operator ---------
        
        int num1 = 20;
        int num2 = 15;

        int res1 = num1 + num2;
        System.out.println("num1 + num2: " + res1);

        res1 = num1 - num2;
        System.out.println("num1 - num2: " + res1);

        res1 = num1 * num2;
        System.out.println("num1 * num2: " + res1);

        double res2 = num1 / num2;
        System.out.println("num1 / num2: " + res2);

        res1 = num1 % num2;
        System.out.println("num1 % num2: " + res1);


        num1 = 10;
        num1 += 2;
        System.out.println("num1 += 2 : " + num1);

        int num = 10;
        // Pre-Increment Operator
        int res = ++num;
        System.out.println("++num : " + res);

        // Post-Increment Operator
        res = num++;
        System.out.println("num++ : " + res);




        // ----------- Relational Operator ----------
        // >, <, ==, >=, <=, !=
        int x = 6;
        int y = 5;
        boolean z = x > y;
        System.out.println("x>y: " + z);


       // ----------- Logical Operator ----------
       // &&, ||, !


    }
}