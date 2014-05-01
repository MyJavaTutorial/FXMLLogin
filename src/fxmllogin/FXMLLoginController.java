/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fxmllogin;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;

/**
 *
 * @author Sandro
 */
public class FXMLLoginController {
    
    @FXML
    private Text actiontarget;
    
    @FXML
    private void handleSubmitButtonAction(ActionEvent event) {
        actiontarget.setText("Pulsante Login cliccato!");
    }
    
}
