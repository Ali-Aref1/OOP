import javafx.application.Application;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;

public class ShowCircle extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Circle");
        StackPane pane = new StackPane();
        Scene scene = new Scene(pane,500,500);
        Circle circle = new Circle();
        circle.setCenterX(250);
        circle.setCenterY(250);
        circle.setStroke(Color.BLACK);
        circle.setFill(null);
        circle.setRadius(125);
        pane.getChildren().add(circle);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
