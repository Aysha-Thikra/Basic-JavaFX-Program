package Navigation;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.util.Objects;

public class DashboardController {
    public AnchorPane content;

    public void onActionLog() throws IOException {
        setUi("../Navigation/Login");
    }

    public void onActionCreate() throws IOException {
        setUi("../Navigation/Signup");
    }

    private void setUi(String location) throws IOException {
        content.getChildren().clear();
        content.getChildren().add(FXMLLoader.load(
                Objects.requireNonNull(getClass().getResource(location + ".fxml"))));
    }
}
