
class Student{
    int roll;
    String name;
    int marks;

    Student(int r, String n, int m){
        this.roll = r;
        this.name = n;
        this.marks = m;
    }
}

public class j8ArrayOfObjects {
    public static void main(String args[]){
        Student s1 = new Student(1, "Soham", 60);
        Student s2 = new Student(2, "Abhi", 80);
        Student s3 = new Student(3, "Prakash", 50);

        Student stud[] = new Student[3];
        stud[0] = s1;
        stud[1] = s2;
        stud[2] = s3;

        for(int i=0; i<stud.length; i++){
            System.out.println(stud[i].name + ": " + stud[i].marks);
        }

        // For Each Loop
        for(Student s: stud){
            System.out.println(s.name + ": " + s.marks);
        }
    }
}
