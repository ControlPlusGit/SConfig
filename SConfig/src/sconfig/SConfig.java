    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sconfig;

import javafx.application.Application;
import javafx.event.ActionEvent;    
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author Vitor
 */
public class SConfig extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        Dimension d= Toolkit.getDefaultToolkit().getScreenSize(); // get screen size       
        
        Main main = new Main();
        main.setLocation(d.width/2-(main.getWidth()/2),d.height/2-(main.getHeight()/2));        
        main.setVisible(true);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
