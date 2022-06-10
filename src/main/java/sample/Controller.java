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
    private boolean dragged = false;
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
        pnArea.setOnDragDetected((MouseEvent mouseEvent) -> dragged = true);
        pnArea.setOnMouseDragged((MouseEvent mouseEvent) -> handleMouse(mouseEvent, false));
        pnArea.setOnMouseReleased((MouseEvent mouseEvent) -> dragged = false);
    }


    public void handleMouse(MouseEvent mouseEvent, boolean aClick) {
        System.out.println("dragged" + dragged);
        String prefix = dragged ? (aClick ? "" : "@") : (aClick ? "!" : "*");
        lbX.setText(prefix + mouseEvent.getX());
        lbY.setText(prefix + mouseEvent.getY());
    }

}