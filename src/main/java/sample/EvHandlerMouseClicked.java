package sample;

import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

public class EvHandlerMouseClicked implements EventHandler<MouseEvent>{
    private Controller controller;

    public EvHandlerMouseClicked(Controller controller){
        super();
        this.controller = controller;
    }

    @Override
    public void handle(MouseEvent mouseEvent) {
        controller.lbX.setText("#" + mouseEvent.getX());
        controller.lbY.setText("#" + mouseEvent.getY());
    }
}
