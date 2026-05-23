class pen{
    String color;
    String type;

    public void write(){
        System.out.println("pen is ready ");
    }

    public void printcolor(){
        System.out.println(this.color);
        System.out.println(this.type);
    }
}

class student{
    String name;
    int age;

    public void printinfo(){
        System.out.println("name = "+this.name);
        System.out.println("age = "+this.age);
    }

    //constructor
    student(student s2){
        this.name = s2.name;
        this.age = s2.age;
    }
    student(){

    }   
}

public class classes{
    public static void main(String[] args) {
        // pen pen1 = new pen();
        // pen1.color = "blue";
        // pen1.type = "ballpen";

        // pen pen2 = new pen();
        // pen2.color = "black";
        // pen2.type = "dot";

        // pen1.printcolor();
        // pen2.printcolor();

        student s1 = new student();
        
        s1.name = "sam";
        s1.age = 10;
        
        student s2 = new student(s1);
        s2.printinfo();
    }
}