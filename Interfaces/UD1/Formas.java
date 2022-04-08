import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Formas extends Application {
	
	
    public void start(Stage primaryStage){

        Group root = new Group();
        Scene scene = new Scene(root, 600, 450, Color.AQUAMARINE); //Escena donde representaremos las formas
        Stage stage = new Stage();

        
        
        
        /*---------LINEA1---------*/
        
        
        Line linea1 = new Line();
        linea1.setStartX(40); //Comienzo linea en eje X
        linea1.setStartY(40); //Comienzo linea en eje Y
        linea1.setEndX(120); //Final linea eje X
        linea1.setEndY(40); //Final linea eje Y
        linea1.setStrokeWidth(2); //Grosor de linea
        linea1.setRotate(10); // Rotación
        linea1.setStroke(Color.ORANGE); //Color de linea
        
        /*---------LINEA2---------*/

        
        Line linea2 = new Line();
        linea2.setStartX(230);
        linea2.setStartY(40);
        linea2.setEndX(310);
        linea2.setEndY(40);
        linea2.setStrokeWidth(10);
        linea2.setRotate(300);
        linea2.setStroke(Color.BLUE);
        
        /*---------LINEA3---------*/


        Line linea3 = new Line();
        linea3.setStartX(450);
        linea3.setStartY(40);
        linea3.setEndX(530);
        linea3.setEndY(40);
        linea3.setStrokeWidth(15);
        linea3.setRotate(150);
        linea3.setStroke(Color.RED);

        /*---------PENTAGONO---------*/

        
        Polygon pentagono = new Polygon();
        pentagono.getPoints().setAll( //Con el metodo establecemos cada coordenada de cada uno de los vertices
        		35.0,200.0,
        		80.0,160.0,
        		125.0,200.0,
        		100.0,250.0,
        		60.0,250.0
        		);

        /*---------CIRCULO---------*/

       
        Circle circulo = new Circle();
        circulo.setCenterX (270);
        circulo.setCenterY (200);
        circulo.setRadius (50);

        /*---------CUADRADO---------*/

        
        Rectangle cuadrado = new Rectangle();
        cuadrado.setX(450);
        cuadrado.setY(155);
        cuadrado.setWidth(100);
        cuadrado.setHeight(100);

        /*---------TEXTO---------*/

        
        Text texto = new Text();
        texto.setText("DESARROLO DE INTERFACES");
        texto.setX(150);
        texto.setY(400);
        texto.setFont(Font.font("Arial",20)); //Fuente de la letra
        
        
        
        
        
        root.getChildren().add(linea1);     
        root.getChildren().add(linea2);
        root.getChildren().add(linea3);
        
        
        root.getChildren().add(pentagono);
        root.getChildren().add(circulo);
        root.getChildren().add(cuadrado);
        root.getChildren().add(texto);


        stage.setTitle("DESARROLOINTERFACES_UD1");
        stage.setScene(scene);
        stage.show();
    }
    

}