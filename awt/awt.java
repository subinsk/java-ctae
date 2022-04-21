
// importing Java AWT class  
import java.awt.*;

// extending Frame class to our class AWTExample1  
public class awt extends Frame {

    // initializing using constructor
    awt() {
        Label firstName = new Label("First Name");
        firstName.setBounds(20, 50, 80, 20);

        Label lastName = new Label("Last Name");
        lastName.setBounds(20, 80, 80, 20);

        Label dob = new Label("Age");
        dob.setBounds(20, 110, 80, 20);

        TextField firstNameTF = new TextField();
        firstNameTF.setBounds(120, 50, 100, 20);

        TextField lastNameTF = new TextField();
        lastNameTF.setBounds(120, 80, 100, 20);

        TextField dobTF = new TextField();
        dobTF.setBounds(120, 110, 100, 20);

        Button sbmt = new Button("Submit");
        sbmt.setBounds(20, 160, 100, 30);

        Button reset = new Button("Reset");
        reset.setBounds(120, 160, 100, 30);

        add(firstName);
        add(lastName);
        add(dob);
        add(firstNameTF);
        add(lastNameTF);
        add(dobTF);
        add(sbmt);
        add(reset);

        setSize(300, 300);
        setLayout(null);
        setVisible(true);
    }

    // main method
    public static void main(String args[]) {

        // creating instance of Frame class
        awt f = new awt();

    }

}