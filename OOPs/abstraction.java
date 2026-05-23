abstract class animal{
    abstract void walk();
    animal(){
        System.out.println("creating an animal");
    }
    public void eat(){
        System.out.println("Can Eat");
    }
}

class horse extends animal{
    horse(){
        System.out.println("horse is crated");
    }
    void walk() {
        System.out.println("walks on 4 legs");
    }
}
class chicken extends animal{
    void walk() {
        System.out.println("walks on 2 legs only");
    }
}
public class abstraction{
    public static void main(String[] args) {
        horse horse1 = new horse();
        horse1.walk();
        horse1.eat();
    }
}