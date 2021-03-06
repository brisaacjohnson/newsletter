import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("ung/mccb/csci/csci3300/view/subscriberview.fxml"));
        primaryStage.setTitle("Newsletter Portal");
        primaryStage.setScene(new Scene(root, 350, 350));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
