interface Bicycle {
    float PI = 3.145f;

    void Break();

    void run();

    private void inner() {
        System.out.println("It is the inner part.");
    }

    default void logo() {
        System.out.println("Default method can be implemented here.");
        inner();
    }
}

class Running implements Bicycle {
    public void Break() {
        System.out.println("Break function");
    }

    public void run() {
        System.out.println("Run cycle" + PI);
    }
}

public class InterfaceLerning {
    public static void main(String[] args) {
        Running rrr = new Running();
        rrr.Break();
        rrr.run();
    }
}
