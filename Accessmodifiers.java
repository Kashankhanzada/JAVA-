class Myemployee{
    private int id;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public void setId(int i) {
        id = i;
    }

    public int getId() {
        return id;
    }


}

public class Accessmodifiers {
    public static void main(String[] args) {
        Myemployee ali = new Myemployee();

        //when we use private so we don't set values like this we use methods to set these things,
        //ali.id=1;
        //ali.name="ali raza";

        ali.setName("ali raza");
        ali.setId(1);
        System.out.println(ali.getName());
        System.out.println(ali.getId());
    }
}
