class BaseClass {
    // declaring constructor
    BaseClass() {
        System.out.println("Run Base class 0 parameter constructor");
    }

    BaseClass(int a, int b) {
        System.out.println("Running in base class a, b parameter constructor-\t" + a + b);
    }
}

class DerivedClass extends BaseClass {
    DerivedClass() {
        super(23, 230);// run with out super key word and see the difference
        System.out.println("Running derived class-");
    }
}

public class UseSuperKeyword {
    public static void main(String[] args) {
        DerivedClass ab = new DerivedClass();
    }
}
