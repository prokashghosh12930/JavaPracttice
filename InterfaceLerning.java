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

// Inharitance of interface
interface BicycleProMaxLegend extends Bicycle {
    void autoPilot();

    void autoBreak();

    void displayMap();
}

class Running implements Bicycle {
    public void Break() {
        System.out.println("Break function");
    }

    public void run() {
        System.out.println("Run cycle" + PI);
    }
}

// class using inerface of inhritance.
class AutoRunning implements BicycleProMaxLegend {
    public void Break() {
        System.out.println("Break function");
    }

    public void run() {
        System.out.println("Run cycle" + PI);
    }

    public void autoPilot() {
        System.out.println("showinng autoilot");
    }

    public void autoBreak() {
        System.out.println("");
    }

    public void displayMap() {
        System.out.println("Displayiunng map.");
    }
}

public class InterfaceLerning {
    public static void main(String[] args) {
        Running rrr = new Running();
        rrr.Break();
        rrr.run();
    }
}
