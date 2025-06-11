class j2TypeConversionAndCasting{
    public static void main(String args[]){
        // Type Casting
        byte b = 126;
        int a = 258;
        b = (byte) a;
        // byte Range - 256
        // b = 258 % 256;
        System.out.println(b);

        // Type Promotion
        byte b1 = 10;
        byte b2 = 30;
        int result = b1*b2;
        System.out.println(result);
        
    }
}