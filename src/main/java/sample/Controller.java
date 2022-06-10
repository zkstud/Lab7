package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Controller {
    @FXML
    public Label lbX;
    @FXML
    public Label lbY;
    @FXML
    public Pane pnArea;
    private boolean dragged = false;
    private Rectangle rect;
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
        pnArea.setOnMouseDragged((MouseEvent mouseEvent) -> handleDrag(mouseEvent));
        pnArea.setOnMouseReleased((MouseEvent mouseEvent) -> dragged = false);

        double w = pnArea.getWidth();
        double h = pnArea.getHeight();
        rect = new Rectangle(10.0, 10.0, Color.ALICEBLUE);
        pnArea.getChildren().add(rect);
        rect.setRotate(45);
        rect.setWidth(50);
        rect.setHeight(50);
    }


    public void handleMouse(MouseEvent mouseEvent, boolean aClick) {
        System.out.println("dragged" + dragged);
        String prefix = dragged ? (aClick ? "" : "@") : (aClick ? "!" : "*");
        lbX.setText(prefix + mouseEvent.getX());
        lbY.setText(prefix + mouseEvent.getY());
    }

    public void handleDrag(MouseEvent mouseEvent){
        lbX.setText("@" + mouseEvent.getX());
        lbY.setText("@" + mouseEvent.getY());
        rect.setX(mouseEvent.getX());
        rect.setY(mouseEvent.getY());
    }

}