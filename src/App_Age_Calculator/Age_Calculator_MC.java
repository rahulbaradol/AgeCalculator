package App_Age_Calculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

public class Age_Calculator_MC extends Application {

    @Override
    public void start(Stage ps) {
        try {
            Scene sc = new Scene(FXMLLoader.load(getClass().getResource("/App_Age_Calculator/FXML_Files/Welcome.fxml")));

            ps.setTitle("Age Calculator - Welcome");
            ps.setScene(sc);
            ps.setResizable(false);
            ps.show();
        } catch (Exception ep) {
            Alert error = new Alert(Alert.AlertType.ERROR);

            error.setTitle("Age Calculator");
            error.setContentText("Error loading the file. \nCould not find the file.");
            error.showAndWait();
        }
    }

}