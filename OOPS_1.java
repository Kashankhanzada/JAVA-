public class OOPS_1 {
    public static void main(String[] args) {
        SimpleCircle Cirle1 = new SimpleCircle();
        System.out.println("the area of the circle of radius" + Cirle1.Radius + " is " +
                Cirle1.getarea());
    }
}

class SimpleCircle{
    double Radius;

    SimpleCircle(){
        Radius = 1;
    }

    SimpleCircle( double newRadius){
        Radius = newRadius;
    }

    double getarea(){
        return Radius * Radius * Math.PI;
    }

    double getparameter(){
        return 2 * Radius * Math.PI;
    }

    void setRadius(double newRadius){
    Radius = newRadius;
    }
}