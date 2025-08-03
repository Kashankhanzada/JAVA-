
//create a new class
class Employee{

    int id;
    String name;
    int salary;

    public void details(){
        System.out.println("my id is " + id);
        System.out.println("my name is " + name );
    }
}

public class OOPS_2 {
    public static void main(String[] args) {

        System.out.println("this is our our class");

        // create a object foe new employee
        Employee kashan = new Employee();
        Employee umer = new Employee();

        // enter deatails of this employe with refrence " . " sign
        kashan.id = 1;
        kashan.name ="kashan ali khan";
        kashan.salary=120000;
        umer.id = 2;
        umer.name ="umer ali khan";
        umer.salary=3000;

        //print details
        //System.out.println(kashan.id);
        //System.out.println(kashan.name);

        kashan.details();//here we call details method
        System.out.println("-----------------");
        umer.details();//here we call details method
    }
}
