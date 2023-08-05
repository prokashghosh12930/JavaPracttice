
class Base {
    int y = 10;
    int z = 234;

    void setZ(int val) {
        z = val;
    }

    void zIncrease() {
        z++;
    }
}

class derived extends Base {
    int x = 100;

    void setX(int x) {
        this.x = x;
        System.out.println("X value is\t" + this.x);
    }
}

public class Inharitance {
    public static void main(String[] args) {
        derived now = new derived();
        now.zIncrease();
        now.zIncrease();
        System.out.println("Now is" + now.z);
    }

}
