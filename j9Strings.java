public class j9Strings {
    public static void main(String args[]){

        
        String name = new String("Soham Tamhane");
        
        System.out.println(name);
        System.out.println("Hashcode: " + name.hashCode());
        System.out.println(name.charAt(0));
        System.out.println(name.concat(", Hello"));
        System.out.println(name);

        String str = "Soham";
        str = str + " Tamhane";
        System.out.println(str);
    }
}
