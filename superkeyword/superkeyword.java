package superkeyword;

public class superkeyword {
    static class parent {
        int variable = 20;

        void show() {
            System.out.println("This is method of parent class");
        }
    }

    static class derived extends parent {
        int variable = 30;

        void show() {
            System.out.println("This is method of derived class");
        }

        void display() {
            show();
            // use of super keyword for method
            // this will call the show method of parent class
            super.show();
        }

        void print_var() {
            // use of super keyword for variable
            // this will show the value of variable of parent class
            System.out.println("Value of the variable of parent class is : " + super.variable);
            System.out.println("Value of the variable of derived class is : " + variable);
        }
    }

    public static void main(String[] args) {
        derived obj = new derived();
        obj.display();
        obj.print_var();
    }
}
