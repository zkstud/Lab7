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
    //    private EventHandler<MouseEvent> myClickHandler = new EvHandlerMouseClicked(this);
//    private EventHandler<MouseEvent> myClickHandler = new EventHandler<MouseEvent>() {
//        @Override
//        public void handle(MouseEvent mouseEvent) {
//            lbX.setText("@" + mouseEvent.getX());
//            lbY.setText("@" + mouseEvent.getY());
//        }
//    };
    private EventHandler<MouseEvent> myClickHandler = (MouseEvent mouseEvent) ->{
        lbX.setText("$" + mouseEvent.getX());
        lbY.setText("$" + mouseEvent.getY());
    };

    @FXML
    private void initialize() {
        pnArea.setOnMouseClicked(myClickHandler);
    }

//    public void handleMouseClick(MouseEvent mouseEvent) {
//        lbX.setText("!"+mouseEvent.getX());
//        lbY.setText("!"+mouseEvent.getY());
//    }

}