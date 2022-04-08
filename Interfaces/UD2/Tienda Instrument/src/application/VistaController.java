package application;

import java.net.URL;
import java.util.ResourceBundle;

import clases.Instrumento;
import clases.Transporte;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class VistaController implements Initializable{
	private ObservableList<Transporte> transportes;
	private ObservableList<Instrumento> instrumentos;

	
	@FXML private ComboBox<Transporte> cboTransporte;
	@FXML private ListView<Instrumento> lstInstrumentos;
	
	
	@FXML private TextField txtInstrumento;
	@FXML private TextField txtPeso;
	@FXML private TextField txtCantidad;
	@FXML private DatePicker txtFecha;
	@FXML private TextArea txtObservaciones;


	public VistaController() {

	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		
		transportes = FXCollections.observableArrayList();
		instrumentos = FXCollections.observableArrayList();

		
		transportes.add(new Transporte("Tipsa"));
		transportes.add(new Transporte("MRW"));
		transportes.add(new Transporte("DHL"));
	
		
		cboTransporte.setItems(transportes);
		lstInstrumentos.setItems(instrumentos);
	}
	
	@FXML
	public void agregar() {
		System.out.println("Instrumentos agregados");
		
		instrumentos.add(
				new Instrumento(
				txtInstrumento.getText(),
				Integer.parseInt(txtCantidad.getText()),
				Float.parseFloat(txtPeso.getText()),
				txtFecha.getValue().toString(),
				cboTransporte.getSelectionModel().getSelectedItem(),
				txtObservaciones.getText()
				)
				);
		
	}
	public void limpiar() {
		
		txtInstrumento.setText(null);
		txtCantidad.setText(null);
		txtPeso.setText(null);
		txtFecha.setValue(null);
		cboTransporte.getSelectionModel().select(null);
		txtObservaciones.setText(null);
	}
}
