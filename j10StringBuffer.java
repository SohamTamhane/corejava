public class j10StringBuffer {
    public static void main(String[] args) {

        // Gives us 16 space extra
        StringBuffer sb = new StringBuffer("Soham");
        System.out.println(sb);
        System.out.println(sb.capacity());
        System.out.println(sb.length());

        // The append() method concatenates the given argument with this string.
        sb.append(" Tamhane");
        System.out.println(sb);
        
        // The delete() method of the StringBuffer class deletes the string from the specified start to end-1.
        sb.delete(0, 5);
        System.out.println(sb);

        // The insert() method inserts the given string with this string at the given position. 
        sb.insert(0, "Soham");
        System.out.println(sb);

        // The replace() method replaces the given string from the specified start and end-1.
        sb.replace(0, 5, "Hello,");
        System.out.println(sb);

        String str = sb.toString();
        System.out.println(str);
        System.out.println(str.length());
        
        // The reverse() method of the StringBuilder class reverses the current string.
        sb.reverse();
        System.out.println(sb);
    }
}
