package Login;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.scene.Node;





public class Controller implements Initializable {

    private Label label;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // TODO
    }

    @FXML
    private void handleClose (MouseEvent event){
        System.exit(0);
    }

    @FXML
    private void handleMin (ActionEvent event){
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        stage.setIconified(true);
        //stage.setFullScreen(true);
        //stage.close();
    }

}
