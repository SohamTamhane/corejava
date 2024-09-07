
class A extends Thread {
    public void run(){
        for(int i=0; i<10; i++){
            System.out.println("Hii");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class B extends Thread{
    public void run(){
        for(int i=0; i<10; i++){
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class j36Thread {
    public static void main(String[] args) {
        
        A obj1 = new A();
        B obj2 = new B();

        System.out.println(obj1.getPriority());
        System.out.println(obj2.getPriority());

        obj2.setPriority(Thread.MAX_PRIORITY);
        System.out.println(obj2.getPriority());

        // To Start the Thread, we need to call start() method
        obj1.start();
        obj2.start();
        
    }
}
