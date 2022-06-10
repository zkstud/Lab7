package sample;

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
//    private EventHandler<MouseEvent> myClickHandler = (MouseEvent mouseEvent) ->{
//        lbX.setText("$" + mouseEvent.getX());
//        lbY.setText("$" + mouseEvent.getY());
//    };
//    private EventHandler<MouseEvent> myClickHandler = (MouseEvent mouseEvent) -> handleMouseClick(mouseEvent);

    @FXML
    private void initialize() {
//        pnArea.setOnMouseClicked(myClickHandler);
//        pnArea.setOnMouseClicked((MouseEvent mouseEvent) -> handleMouseClick(mouseEvent));
        pnArea.setOnMouseClicked((MouseEvent mouseEvent) -> handleMouse(mouseEvent, true));
        pnArea.setOnMouseMoved((MouseEvent mouseEvent) -> handleMouse(mouseEvent, false));
    }


    public void handleMouse(MouseEvent mouseEvent, boolean aClick) {
        String prefix = aClick ? "!" : "";
        lbX.setText(prefix + mouseEvent.getX());
        lbY.setText(prefix + mouseEvent.getY());
    }

}