/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.Desktop;



/**
 *
 * @author Penny - Work
 */
public class Login extends Application {
    
    private Desktop desktop = Desktop.getDesktop();
    
    @Override
    public void start(Stage primaryStage) {
        
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25,25,25,25));
        
        Scene scene = new Scene(grid, 300, 275);
        
        Text scenetitle = new Text("Please DO NOT Login: ");
        scenetitle.setFont(Font.font("Tahoma",FontWeight.NORMAL,20));
        Label userName = new Label("User Name: ");
        TextField userTextField = new TextField();
        Label pw = new Label("Password: ");
        PasswordField pwBox = new PasswordField();
        
        grid.add(scenetitle,0,0,2,1);
        grid.add(userName,0,1);
        grid.add(userTextField,1,1);
        grid.add(pw,0,2);
        grid.add(pwBox,1,2);
        
        
        //---!REMOVE BEFORE FINAL RELEASE!----
        // enable gridlines for debugging visuals.
        grid.setGridLinesVisible(false);
        //---!---------------------------!----
        
        Button btn = new Button("Sing in");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn,1,4);
        
        final Text actiontarget = new Text();
        grid.add(actiontarget,1,6);
        
        //lambda expression
        btn.setOnAction(event->
        {
            actiontarget.setFill(Color.FIREBRICK);
            actiontarget.setText("Sign in Button Pressed");
            
        });
        
        Button btn2 = new Button ("Open File");
        HBox hbBtn2 = new HBox(10);
        hbBtn2.setAlignment(Pos.BOTTOM_LEFT);
        hbBtn2.getChildren().add(btn2);
        grid.add(hbBtn2,1,5);
        
        final FileChooser fileChooser = new FileChooser();
        //grid.add(fileChooser,1,7);
        
        btn2.setOnAction(event->
        {
        
        
        fileChooser.setTitle("Poo Bum");
        File file = fileChooser.showOpenDialog(primaryStage);
        if (file != null){
        openFile(file);
        }
        });
        
        
        primaryStage.setTitle("Java FX Login Form");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    private void openFile (File file) 
    {
        try 
        {
            desktop.open(file);    
        }
        catch (IOException ex)
        {
        
        }
         
        
    }
    
    
}
