package sample;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

public class Controller {
    @FXML
    public Label lbX;
    @FXML
    public Label lbY;
    @FXML
    public Pane pnArea;
    private EventHandler<MouseEvent> myClickHandler = new EvHandlerMouseClicked(this);

    @FXML
    private void initialize() {
        pnArea.setOnMouseClicked(myClickHandler);
    }

//    public void handleMouseClick(MouseEvent mouseEvent) {
//        lbX.setText("!"+mouseEvent.getX());
//        lbY.setText("!"+mouseEvent.getY());
//    }

}