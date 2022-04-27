package p1;

import java.text.NumberFormat.Style;

public class first {

    public static void main(String[] args) {
        test testobj = new test();
        try {
            testobj._private_();
        } catch (Exception e) {
            System.out.println("Cannot access private methods in another class\n");
        } finally {
            testobj.display();
        }
    }
}

class test {
    private void _private_() {
        System.out.println("This is a Private Access Modifier");
    }

    public void display() {
        System.out.println("Accessing private method in the same class:");
        _private_();
    }
}
