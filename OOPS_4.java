// problem 1
class Employee1{
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }
}

//problem 2
class Cellphone{

    public void ringing(){
        System.out.println("ringing.........");
    }
    public void vibrating(){
        System.out.println("vibrating.........");
    }
}

//problem 3
class Square{
    int side;
    public int area(){
        return side*side;
    }
    public int parameter(){
        return 4*side;
    }
}

public class OOPS_4 {
    public static void main(String[] args) {

        //problem 1
        Employee1 raza = new Employee1();

        raza.setName("raza haider");
        System.out.println(raza.getName());
        raza.salary =12000;
        System.out.println(raza.getSalary());


        //problem 2
        Cellphone tecno = new Cellphone();
        tecno.ringing();
        tecno.vibrating();


        //problem 3
        Square sq = new Square();
        sq.side=4;
        System.out.println(sq.area());
        System.out.println(sq.parameter());
    }
}
