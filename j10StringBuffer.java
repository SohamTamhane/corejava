public class j10StringBuffer {
    public static void main(String[] args) {

        // Gives us 16 space extra
        StringBuffer sb = new StringBuffer("Soham");
        System.out.println(sb);
        System.out.println(sb.capacity());
        System.out.println(sb.length());

        sb.append(" Tamhane");
        System.out.println(sb);
        
        sb.delete(0, 5);
        System.out.println(sb);

        sb.insert(0, "Soham");
        System.out.println(sb);

        String str = sb.toString();
        System.out.println(str);
        System.out.println(str.length());
    }
}
