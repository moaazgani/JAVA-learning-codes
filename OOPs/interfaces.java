interface animal {
    public void walk();
}

class horse implements animal{
    public void walk(){
        System.out.println("Horse can walk");
    }
}

public class interfaces {
    public static void main(String[] args) {
        horse H = new horse();
        H.walk();
    }
}
