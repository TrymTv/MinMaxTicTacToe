package com.github.trymtv;

import java.io.IOException;
import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary", false);
    }

    @FXML
    private void  switchToAI() throws IOException{
        App.setRoot("secondary", true);
    }
}
