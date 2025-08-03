
class box{
    int width;
    int height;
    int depth;

    public int volume(){
        return depth*width*height;
    }
    //here we takes parameters
    double sum ( int a , int b ){
        return a + b;
    }
}
public class Class_01 {
    public static void main(String[] args) {

        //creating a new object
        // class variable = new class();

        box box1 = new box();
        box1.depth=10;
        box1.height=10;
        box1.width=10;

        System.out.println(box1.volume());
        System.out.println(box1.sum(4,4));
    }
}
