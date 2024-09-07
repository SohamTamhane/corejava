
abstract class Car{

    public abstract void drive();

    public void playMusic(){
        System.out.println("Play Music");
    }
}

// This is a Concrete Class
class WagorR extends Car{
    public void drive(){
        System.out.println("Drive Car....");
    }
}


public class j23Abstract {
    public static void main(String[] args) {
        Car obj = new WagorR();
        obj.drive();
        obj.playMusic();
    }
}
