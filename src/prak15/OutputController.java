package prak15;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class OutputController {

    @FXML
    private Label lblNpm;

    @FXML
    private Label lblNama;

    @FXML
    private Label lblAlamat;
    
    @FXML
    private Button btnNew;
    
    @FXML
    void openForm(ActionEvent event) throws IOException {
        
        Parent root = FXMLLoader.load(getClass().getResource("FormInput.fxml"));
        
        Stage stage = (Stage) btnNew.getScene().getWindow();
        stage.setScene(new Scene(root));
        
    }
    
    public void showValue(Mahasiswa mhs){
        lblNpm.setText(mhs.getNPM());
        lblNama.setText(mhs.getNama());
        lblAlamat.setText(mhs.getAlamat());
    }

}
