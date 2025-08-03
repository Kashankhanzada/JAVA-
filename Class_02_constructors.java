// constructors

class rectangle{
    double width;
    double height;
    double depth;

    //constructor
    rectangle(double w ,double h , double d){
        this.width = w;
        this.height=h;
        this.depth=d;
    }
    public double volume(){
        return depth *width * height;
    }
}
public class Class_02_constructors {
    public static void main(String[] args) {
        rectangle green = new rectangle(10,10,10);
        System.out.println(green.volume());
    }
}

//****************************** this keyword **************************************
// it is used for instance variable hiding
/*
 Use this to resolve name-space collisions.
Box(double width, double height, double depth) {
    this.width = width;
    this.height = height;
    this.depth = depth;
}
 */