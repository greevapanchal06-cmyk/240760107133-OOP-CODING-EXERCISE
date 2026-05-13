/* Design a registration form UI with fields: Roll_NO (numeric), Name, Age (numeric), Email and a 
Submit button. Requirements:  
● Validate inputs on submit:  
o RollNo and Age must be integers.  
o Email must contain @ and . (basic check).  
● On success show a confirmation Alert with entered data.  
● On validation failure show an error alert describing the issue.  
UI / Classes to use: GridPane, TextField, Button, Alert, FileChooser, FileWriter/BufferedWriter. */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.geometry.Insets;

public class Practical34 extends Application
{
    public void start(Stage stage)
    {
        GridPane gp = new GridPane();

        gp.setPadding(new Insets(20));
        gp.setHgap(10);
        gp.setVgap(10);

        Label l1 = new Label("Roll No");
        Label l2 = new Label("Name");
        Label l3 = new Label("Age");
        Label l4 = new Label("Email");

        TextField t1 = new TextField();
        TextField t2 = new TextField();
        TextField t3 = new TextField();
        TextField t4 = new TextField();

        Button b = new Button("Submit");

        gp.add(l1, 0, 0);
        gp.add(t1, 1, 0);

        gp.add(l2, 0, 1);
        gp.add(t2, 1, 1);

        gp.add(l3, 0, 2);
        gp.add(t3, 1, 2);

        gp.add(l4, 0, 3);
        gp.add(t4, 1, 3);

        gp.add(b, 1, 4);

        b.setOnAction(e ->
        {
            try
            {
                int roll = Integer.parseInt(t1.getText());
                int age = Integer.parseInt(t3.getText());

                String name = t2.getText();
                String email = t4.getText();

                if(!email.contains("@") || !email.contains("."))
                {
                    Alert a = new Alert(Alert.AlertType.ERROR);
                    a.setTitle("Error");
                    a.setHeaderText("Invalid Email");
                    a.setContentText("Email must contain @ and .");
                    a.show();
                }
                else
                {
                    Alert a = new Alert(Alert.AlertType.INFORMATION);

                    a.setTitle("Success");
                    a.setHeaderText("Registration Successful");

                    a.setContentText(
                            "Roll No : " + roll +
                            "\nName : " + name +
                            "\nAge : " + age +
                            "\nEmail : " + email
                    );

                    a.show();
                }
            }
            catch(NumberFormatException ex)
            {
                Alert a = new Alert(Alert.AlertType.ERROR);

                a.setTitle("Error");
                a.setHeaderText("Invalid Input");
                a.setContentText("Roll No and Age must be integers");

                a.show();
            }
        });

        Scene scene = new Scene(gp, 400, 300);

        stage.setTitle("Registration Form");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args)
    {
        launch(args);
    }
}
