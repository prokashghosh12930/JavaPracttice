
class Emp {
    private int id;
    private String name;

    // constructor
    public Emp() {// Employee with 0 arguement
        id = 0;
        name = "Solan";
    }

    // constructor
    public Emp(int ids) {// Constructor wth 1 arguments
        id = ids;
    }

    public void printDetails() {
        System.out.println("My id is -\t" + id);
        System.out.println("My name is :-\t" + name);
    }

    public void setId(int getId, String getName) {
        id = getId;
        name = getName;
    }
}

public class CustomClass {
    public static void main(String[] args) {
        Emp parokas = new Emp();
        parokas.setId(23, "Joker");
        // System.out.println("id off employee" + parokas.id);//not allowed for private
        // access members.
        parokas.printDetails();// not allowed for private access members.
    }
}
