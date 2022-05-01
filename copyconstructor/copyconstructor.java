public class copyconstructor {
    private double fprice;
    private String fname;

    copyconstructor(double fPrice, String fName) {
        fprice = fPrice;
        fname = fName;
    }

    copyconstructor(copyconstructor fruit) {
        System.out.println("\nAfter invoking the Copy Constructor:\n");
        fprice = fruit.fprice;
        fname = fruit.fname;
    }

    double showPrice() {
        return fprice;
    }

    String showName() {
        return fname;
    }

    public static void main(String args[]) {
        copyconstructor f1 = new copyconstructor(399, "Ruby Roman Grapes");
        System.out.println("Name of the first fruit: " + f1.showName());
        System.out.println("Price of the first fruit: " + f1.showPrice());

        copyconstructor f2 = new copyconstructor(f1);
        System.out.println("Name of the second fruit: " + f2.showName());
        System.out.println("Price of the second fruit: " + f2.showPrice());
    }
}
