/* Write a JavaFX program that displays a bar chart to represent the percentage distribution of overall 
grades using Rectangle shapes.  
● Projects: 20%, displayed in Red  
● Quizzes: 10%, displayed in Blue  
● Midterm Exams: 30%, displayed in Green  
● Final Exam: 40%, displayed in Orange  
Requirements:  
1. Each category should be displayed with a labeled bar.  
2. Bars should be proportional in height to the percentage.  
3. Use the Rectangle class to create the bars.  
4. Display the labels (e.g., "Projects — 20%") under each bar.  
5. Arrange the bars horizontally in the scene using an HBox or Pane.*/

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.geometry.Pos;

public class Practical35 extends Application
{
    public void start(Stage stage)
    {
        HBox hb = new HBox(30);
        hb.setAlignment(Pos.BOTTOM_CENTER);

        VBox v1 = new VBox(10);
        v1.setAlignment(Pos.BOTTOM_CENTER);

        Rectangle r1 = new Rectangle(60, 100);
        r1.setFill(Color.RED);

        Label l1 = new Label("Projects - 20%");

        v1.getChildren().addAll(r1, l1);

        VBox v2 = new VBox(10);
        v2.setAlignment(Pos.BOTTOM_CENTER);

        Rectangle r2 = new Rectangle(60, 50);
        r2.setFill(Color.BLUE);

        Label l2 = new Label("Quizzes - 10%");

        v2.getChildren().addAll(r2, l2);

        VBox v3 = new VBox(10);
        v3.setAlignment(Pos.BOTTOM_CENTER);

        Rectangle r3 = new Rectangle(60, 150);
        r3.setFill(Color.GREEN);

        Label l3 = new Label("Midterm Exams - 30%");

        v3.getChildren().addAll(r3, l3);

        VBox v4 = new VBox(10);
        v4.setAlignment(Pos.BOTTOM_CENTER);

        Rectangle r4 = new Rectangle(60, 200);
        r4.setFill(Color.ORANGE);

        Label l4 = new Label("Final Exam - 40%");

        v4.getChildren().addAll(r4, l4);

        hb.getChildren().addAll(v1, v2, v3, v4);

        Scene scene = new Scene(hb, 600, 350);

        stage.setTitle("Bar Chart");

        stage.setScene(scene);

        stage.show();
    }

    public static void main(String[] args)
    {
        launch(args);
    }
}
