import java.util.*;

class Student{
    int age;
    String name;

    public Student(int age, String name){
        this.age = age;
        this.name = name;
    }

    public String toString(){
        return this.age + ":" + this.name;
    }
}

class Employee implements Comparable<Employee>{
    int age;
    String name;

    public Employee(int age, String name){
        this.age = age;
        this.name = name;
    }

    public String toString(){
        return this.age + ":" + this.name;
    }

    public int compareTo(Employee that){
        if(this.age > that.age){
            return 1;
        }
        else{
            return -1;
        }
    }
}

public class j45Sorting {
    public static void main(String args[]){

        Comparator<Integer> com = new Comparator<Integer>() {
    
            public int compare(Integer i, Integer j) {
                if(i%10 > j%10){
                    // Want to Swap -> 1
                    return 1;
                }
                else{
                    // Don't Swap -> -1
                    return -1;
                }
            }
        };

        List<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(2);
        arr.add(13);
        arr.add(1);
        System.out.println(arr);

        Collections.sort(arr);
        System.out.println(arr);

        Collections.sort(arr, com);
        System.out.println(arr);



        Comparator<Student> com2 = new Comparator<Student>() {
            public int compare(Student s1, Student s2){
                if(s1.age > s2.age){
                    return 1;
                }
                else{
                    return -1;
                }
            }
        };


        List<Student> arr2 = new ArrayList<Student>();
        arr2.add(new Student(10, "Soham"));
        arr2.add(new Student(1, "ABC"));
        arr2.add(new Student(31, "XYZ"));

        System.out.println(arr2);

        Collections.sort(arr2, com2);
        System.out.println(arr2);



        List<Employee> arr3 = new ArrayList<Employee>();
        arr3.add(new Employee(10, "Soham"));
        arr3.add(new Employee(1, "ABC"));
        arr3.add(new Employee(31, "XYZ"));

        System.out.println(arr3);

        Collections.sort(arr3);
        System.out.println(arr3);
    }
}
