class shape{
    public void area() {
        System.out.println("Display's Area");
    }
}
class Triangle extends shape{
    public void area(int l, int h){
        System.out.println(0.5*l*h);
    }
}
class EquilateralTriangle extends Triangle{
    public void area(int l, int h){
        System.out.println(0.5*l*h);
    }
}
class circle extends shape{
    int r;
    public void area(int r){
        System.out.println(Math.PI*r*r);
    }
}

public class inheritance {
    public static void main(String args[]){
        EquilateralTriangle tri = new EquilateralTriangle();
        tri.area(3,4);

        circle c = new circle();
        c.area(4);
    }
}
