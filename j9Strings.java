public class j9Strings {
    public static void main(String args[]){

        
        String name = new String("Soham Tamhane");
        
        System.out.println(name);
        System.out.println(name.length());
        System.out.println("Hashcode: " + name.hashCode());
        System.out.println(name.charAt(0));
        System.out.println(name.concat(", Hello"));
        // System.out.println("String after Concat: " + name);

        String str = "Soham";
        str = str + " Tamhane";
        System.out.println(str);

        System.out.println(name.contains("Soham"));
        System.out.println(name.equals(str));
        System.out.println(name.indexOf("Soham"));
        System.out.println(name.replace("Soham", "Hello, Soham"));
        System.out.println(name.startsWith("Soham"));
        System.out.println(name.endsWith("Tamhane"));

        char ch[] = name.toCharArray();
        System.out.println(ch[0]);
        System.out.println(name.substring(1, name.length()));

        String arr[] = name.split(" ");
        for(String i: arr){
            System.out.println(i);
        }
    }
}
