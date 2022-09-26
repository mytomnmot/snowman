import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SnowMan extends Application {
   @Override
   public void start(Stage stage) throws Exception {
      // loads SnowMan.fxml 
      Parent root = 
         FXMLLoader.load(getClass().getResource("SnowMan.fxml"));

      Scene scene = new Scene(root); // attach scene graph to scene
      stage.setTitle("雪人"); // displayed in window's title bar
      stage.setScene(scene); // attach scene to stage
      stage.show(); // display the stage
   }

   public static void main(String[] args) {
      launch(args); // create a object and call its start method
   }
}
