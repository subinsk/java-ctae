package varargs;

public class varargs {

    void sum(int... args) {
        int sum = 0;

        for (int i : args) {
            sum = sum + i;
        }

        System.out.println("\nSum of given arguments: " + sum);
    }

    void product(int... args) {
        int product = 1;

        for (int i : args) {
            product = product * i;
        }

        System.out.println("Product of given arguments: " + product);
    }

    void display(int... args) {
        System.out.print("Arguments are: ");
        for (int i : args) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        varargs calc = new varargs();
        calc.display(2, 4, 6, 7);
        calc.sum(2, 4, 6, 7);
        calc.product(2, 4, 6, 7);
    }
}
