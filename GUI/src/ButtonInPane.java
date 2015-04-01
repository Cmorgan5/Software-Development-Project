import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ButtonInPane extends Application
{
	// Override the start method in the Application class
	public void start(Stage primaryStage)
	{
		// Create a scene and place a button in the scene
		StackPane pane = new StackPane();
		pane.getChildren().add(new Button("Yes"));
		Scene scene = new Scene(pane, 200, 50);
		primaryStage.setTitle("Button in a pane"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
		
		Pane pane2 = new HBox(10);
	    pane2.setPadding(new Insets(5, 5, 5, 5));
	    Image image = new Image("http://exp.cdn-hotels.com/hotels/1000000/10000/5200/5158/5158_104_z.jpg,");
	    pane2.getChildren().add(new ImageView(image));
	    
	    ImageView imageView2 = new ImageView(image);
	    imageView2.setFitHeight(100);
	    imageView2.setFitWidth(100);
	    pane2.getChildren().add(imageView2);   

	    ImageView imageView3 = new ImageView(image);
	    imageView3.setRotate(90);
	    pane2.getChildren().add(imageView3);     
	    
	    // Create a scene and place it in the stage
	    Scene scene2 = new Scene(pane2);
	    primaryStage.setTitle("ShowImage"); // Set the stage title
	    primaryStage.setScene(scene2); // Place the scene in the stage
	    primaryStage.show(); // Display the stage
	}

	/**
	 * The main method is only needed for the IDE with limited JavaFX support.
	 * Not needed for running from the command line.
	 */
	public static void main(String[] args)
	{
		launch(args);
	}
}
