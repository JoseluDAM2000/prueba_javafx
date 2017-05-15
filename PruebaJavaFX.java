import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;

public class PruebaJavaFX extends Application {

    private boolean fondoCambiado = false;
    private static Image imagen1 = new Image("https://cdn.pixabay.com/photo/2015/05/16/22/24/mosaic-770394_960_720.jpg");
    private static Image imagen2 = new Image("http://www.clker.com/cliparts/2/H/2/H/U/1/dasd-md.png");
    private static ImageView iv = new ImageView();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        BorderPane contenedor = new BorderPane();
        iv.setImage(imagen1);
        contenedor.getChildren().add(iv);
        Button btn = new Button("Saludo");
        btn.setOnAction((event) -> {System.out.println("Hola"); 
                cambiarFondo();
            });
        contenedor.setLeft(btn);
        Scene scene = new Scene(contenedor, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.setTitle("PruebaJavaFX");
        primaryStage.show();
    }

    private void cambiarFondo(){
        fondoCambiado = !fondoCambiado;
        if(fondoCambiado){
            iv.setImage(imagen2);
        }else{
            iv.setImage(imagen1);
        }
    }
}