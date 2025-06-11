import java.util.*;
import java.util.stream.Stream;
import java.util.function.*;

public class j47StreamAPI {
    public static void main(String args[]){
        List<Integer> arr = Arrays.asList(1, 2, 3, 4);
        arr.forEach(n -> System.out.println(n));

        Stream<Integer> s1 = arr.stream();
        Stream<Integer> s2 = s1.filter(n -> n%2==0);
        // Performing Some Operation on Data
        Stream<Integer> s3 = s2.map(n->n*2);
        // s3.forEach(n->System.out.println(n));
        int res = s3.reduce(0, (c,e)->c+e);
        System.out.println(res);


        // Writing all the above in one Line
        int result = arr.stream().filter(n->n%2==0).map(n->n*2).reduce(0, (c,e)->c+e);
        System.out.println(result);


        Predicate<Integer> p = new Predicate<Integer>(){
            public boolean test(Integer n){
                if(n%2==0){
                    return true;
                }
                else{
                    return false;
                }
            }
        };

        // <Accepts Datatype, Return Datatype>
        Function<Integer, Integer> f = new Function<Integer, Integer>() {
            public Integer apply(Integer n){
                return n*2;
            }
        };

        Stream<Integer> s10 = arr.stream().filter(p).map(f).sorted();
        s10.forEach(n->System.out.println(n));
    }
}
