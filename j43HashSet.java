import java.util.*;;

public class j43HashSet {
    public static void main(String[] args) {
        Set<Integer> st = new HashSet<>();
        st.add(10);
        st.add(20);
        st.add(20);
        st.add(30);

        System.out.println(st);
        for(int i: st){
            System.out.println(i);
        }

        // Sorted Format
        Set<Integer> st1 = new TreeSet<>();
        st1.add(10);
        st1.add(20);
        st1.add(20);
        st1.add(30);

        System.out.println(st1);


        Collection<Integer> arr = new HashSet<>();
        arr.add(100);
        arr.add(200);
        arr.add(300);

        Iterator<Integer> it = arr.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }


    }
}
