
class Subjectmarks{
    int id;
    String name;
    int english;
    int urdu;
    int math;


    public void details(){
        System.out.println("Student name : "+ name + " with id no.#"+id );
        System.out.println("marks of english , urdu , math is :" + english +","+ urdu +","+ math);
        System.out.println("obtain marks is : " + (english+urdu+math) + " from : 300");
    }



}

public class OOPS_3 {
    public static void main(String[] args) {

        Subjectmarks ali = new Subjectmarks();
        ali.id=1;
        ali.name="MUhammad Ali";
        ali.english=85;
        ali.math=90;
        ali.urdu=45;

        ali.details();
    }
}
