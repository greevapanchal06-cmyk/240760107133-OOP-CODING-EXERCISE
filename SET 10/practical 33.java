/*Write a JavaFX program that displays five Text nodes vertically (stacked). For each Text:  
● Use font Times New Roman, bold + italic, size 22 px.  
● Assign a random color and random opacity (between 0.3 and 1.0) to each text.  
● Center the texts horizontally in the window and add spacing between them.  
UI / Classes to use: VBox, Text, Font, Color, Random.  
On launch the window shows five vertically arranged lines (e.g., “Text 1”, … “Text 5”) each with 
different color & opacity and same font style. */



import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.geometry.Pos;

import java.util.Random;

public class Practical33 extends Application
{
    public void start(Stage stage)
    {
        VBox vb = new VBox(20);
        vb.setAlignment(Pos.CENTER);

        Random r = new Random();

        for(int i = 1; i <= 5; i++)
        {
            Text t = new Text("Text " + i);

            t.setFont(Font.font("Times New Roman",
                    FontWeight.BOLD,
                    FontPosture.ITALIC,
                    22));

            Color c = Color.color(r.nextDouble(),
                                  r.nextDouble(),
                                  r.nextDouble());

            t.setFill(c);

            double opacity = 0.3 + (0.7 * r.nextDouble());
            t.setOpacity(opacity);

            vb.getChildren().add(t);
        }

        Scene scene = new Scene(vb, 400, 300);

        stage.setTitle("Five Text Nodes");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args)
    {
        launch(args);
    }
}
