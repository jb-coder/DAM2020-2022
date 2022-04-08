package application;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.StageStyle;

public class VistaController implements Initializable{

	
	@FXML private TextField txtNombre;
	@FXML private TextField txtApellido1;
	@FXML private TextField txtApellido2;
	@FXML private TextField txtEmpresa;
	@FXML private TextField txtCorreo;
	@FXML private TextField txtNacompañantes;
	@FXML private TextArea txtObservaciones;
	@FXML private TextArea txtarea;
	@FXML private Button reservar;
	Alert ventanaemergente=new Alert(AlertType.INFORMATION);

	public VistaController() {
	}
	
	public void reservarAction(ActionEvent event) {
		
		ventanaemergente.setTitle("Error");
		ventanaemergente.setHeaderText(null);
		ventanaemergente.setContentText("Campo vacio");
		ventanaemergente.initStyle(StageStyle.UTILITY);

		
		//Comprobacion de campos, si no hay nada relleno el campo se rellena en color rojo
		
		if(txtNombre.getText().isEmpty()) {
			txtNombre.setStyle("-fx-control-inner-background:#ef9a9a");
			ventanaemergente.showAndWait();
		} else if(txtApellido1.getText().isEmpty()) {
			txtApellido1.setStyle("-fx-control-inner-background:#ef9a9a");
			ventanaemergente.showAndWait();

			
		} else if(txtApellido2.getText().isEmpty()) {
			txtApellido2.setStyle("-fx-control-inner-background:#ef9a9a");
			ventanaemergente.showAndWait();

			
		} else if(txtEmpresa.getText().isEmpty()) {
			txtEmpresa.setStyle("-fx-control-inner-background:#ef9a9a");
			ventanaemergente.showAndWait();

			
		} else if (ValidarEmail(txtCorreo)==false) {
			txtCorreo.setStyle("-fx-control-inner-background:#ef9a9a");
			ventanaemergente.setContentText("Introduzca un email valido");
			ventanaemergente.showAndWait();
			
		} else if(txtNacompañantes.getText().isEmpty()) {
			txtNacompañantes.setStyle("-fx-control-inner-background:#ef9a9a");
			ventanaemergente.showAndWait();

			
		} else if(txtObservaciones.getText().isEmpty()) {
			txtObservaciones.setStyle("-fx-control-inner-background:#ef9a9a");
			ventanaemergente.showAndWait();

		
		
			
		} else {
			txtarea.setText("Reserva confirmada");
			ventanaemergente.setTitle("Registro completo");
			ventanaemergente.setContentText("Reserva confirmada");
			ventanaemergente.showAndWait();

		}
		
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
	System.out.println("Inicializacion de eventos");
	reservar.setOnAction(this::reservarAction); 
	}

	//Metodo booleano para verificar si el email es correcto.
	public boolean ValidarEmail(TextField txtCorreo) {
		Pattern pattern=Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9._]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+");
		Matcher mather=pattern.matcher(txtCorreo.getText());
		return mather.find();
	}
	

	
	//Metodo para eliminar todos los campos rellenos
	public void limpiar() {
		
		txtNombre.setText(null);
		txtNombre.setStyle(null);
		
		txtApellido1.setText(null);
		txtApellido1.setStyle(null);

		txtApellido2.setText(null);
		txtApellido2.setStyle(null);
		
		txtEmpresa.setText(null);
		txtEmpresa.setStyle(null);

		txtCorreo.setText(null);
		txtCorreo.setStyle(null);

		txtNacompañantes.setText(null);
		txtNacompañantes.setStyle(null);

		txtObservaciones.setText(null);
		txtObservaciones.setStyle(null);

		txtarea.setText(null);
		txtarea.setStyle(null);

	}


	
	
	
}
