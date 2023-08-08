class Base {
    void on() {
        System.out.println("Method which are call for on the system");
    }

    void off() {
        System.out.println("Method which are use to off the system.");
    }
}

class Derived extends Base {
    void on() {
        System.out.println("Method which are call for Start the system");
    }

    void initializer() {
        System.out.println("Initialization run...");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        /**
         * Technique to create derived method run time.
         */
        Base bb = new Derived();
        bb.on();/// It is run for Derived class
        bb.off();// It is available in base.
        // bb.initializer()//It will gave error because off it is only available in
        // Derived.
    }
}
