public class j10StringBuilder {
    public static void main(String args[]){
        
        // The StringBuilder class differs from the StringBuffer class on the basis of synchronization.
        // The StringBuilder class provides no guarantee of synchronization whereas the StringBuffer class does.
        // Therefore this class is designed for use as a drop-in replacement for StringBuffer in places where the StringBuffer was being used by a single thread (as is generally the case).
        // It will be faster under most implementations.
        // Instances of StringBuilder are not safe for use by multiple threads. If such synchronization is required then it is recommended that StringBuffer be used.
        // String Builder is not thread-safe and high in performance compared to String buffer.

        StringBuilder str = new StringBuilder("Soham");
        System.out.println("Length: " + str.length());
        System.out.println("Capacity: " + str.capacity());

        str.append(" Tamhane");
        System.out.println(str);

        str.insert(0, "Hello, ");
        System.out.println(str);

        str.replace(0, 5, "Hi");
        System.out.println(str);

        str.delete(0, 2);
        System.out.println(str);

        str.reverse();
        System.out.println(str);

        String str1 = str.toString();
        System.out.println(str1=="Hello");
    }
}
