
class Box2 {
    double width;
    double height;
    double depth;
    // constructor used when all dimensions specified
    Box2(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
    // constructor used when no dimensions specified
    Box2() {
        width = -1; // use -1 to indicate
        height = -1; // an uninitialized
        depth = -1; // box
    }
    // constructor used when cube is created
    Box2(double len) {
        width = height = depth = len;
    }
    // compute and return volume
    double volume() {
        return width * height * depth;
    }
}
public class Class_04_OverloadCons {
    public static void main(String[] args) {
        Box2 cube1 = new Box2(10,20,15);
        Box2 cube2 = new Box2();
        Box2 cube3 = new Box2(7);

        System.out.println(cube1.volume());
        System.out.println(cube2.volume());
        System.out.println(cube3.volume());
    }
}
