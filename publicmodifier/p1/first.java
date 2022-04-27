package p1;

public class first {
    public void _public_() {
        System.out.println("This is a Public Access modifier");
    }

    public static void main(String[] args) {
        first B = new first();
        test testobj = new test();
        B._public_();
        testobj.display();
    }
}

class test {
    public void display() {
        System.out.println("\nAnother class in the same package:");
        first testobj = new first();
        testobj._public_();
    }
}
