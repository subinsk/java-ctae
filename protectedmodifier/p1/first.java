package p1;

public class first {
    protected void _protected_() {
        System.out.println("This is a Protected Access modifier");
    }

    public static void main(String[] args) {
        first B = new first();
        test testobj = new test();
        B._protected_();
        testobj.display();
    }
}

class test {
    public void display() {
        System.out.println("\nAnother class in the same package:");
        first testobj = new first();
        testobj._protected_();
    }
}
