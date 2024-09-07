class j4ConditionalStatement{
    public static void main(String args[]){

        // -------------- If-Else, Else If ------------

        int x = -10;
        
        if(x>0){
            System.out.println("Positive Number");
        }
        else if(x==0){
            System.out.println("Zero");
        }
        else{
            System.out.println("Negative");
        }


        // ----------- Ternary Operator -------------

        int n = 11;
        boolean isEven = (n%2==0) ? true : false;
        System.out.println("isEven: " + isEven);



        // -------------- Switch Case ---------------
        int day = 3;
        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Enter a Valid Number");
        }

    }
}