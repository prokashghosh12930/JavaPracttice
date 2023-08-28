package prokash1;

class C1 {
    public int x = 5;
    protected int y = 45;
    int z = 6;
    private int a = 78;

    public void meth1() {
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
}

class C2 extends C1 {
    C2() {
        z = 6;
        y = 54;
        // a = 12; Private not access in subclass
        System.out.println("z is - " + z + "y is - " + y);

    }
}

public class AccessModifire {
    public static void main(String[] args) {
        C1 c = new C1();
        // c.meth1();
        // System.out.println(c.x);
        // System.out.println(c.y);
        // System.out.println(c.z);
        C2 d = new C2();
    }
}
