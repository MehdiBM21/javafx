package tmp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {


    @Override
    public void start(Stage stage) throws IOException {
        /*FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();*/
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/com/example/javafx/hello-view.fxml"));//creating a root node that dictates how the other nodes will be arranged
            Scene scene = new Scene(root);//adding the root to the Scene
            scene.getStylesheets().add(getClass().getResource("/com/example/javafx/hello.css").toExternalForm());
            Image icon = new Image(getClass().getResourceAsStream("logo.png"));
            stage.getIcons().add(icon);
            stage.setTitle("Scene test");

            stage.setScene(scene);//adding a scene to the stage
            stage.show();//showing the result
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        launch(args);
    }

}