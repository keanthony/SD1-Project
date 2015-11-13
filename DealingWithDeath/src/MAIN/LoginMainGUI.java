package MAIN;

import java.awt.TextField;
import java.util.ArrayList;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public  class LoginMainGUI extends Application {
	
	private TextField tfUserName;
	
	//ObseravableList comes from an arrayList that we can add in another class 
	//once we figure out what comes
	//from the .dat file
	//
	@Override
	public void start(Stage primaryStage) throws Exception {
		//Stage stage = new Stage();
		
				GridPane gp = new GridPane();
				gp.setStyle("-fx-background-color: WHITE");
				gp.setAlignment(Pos.CENTER);
				gp.setPadding(new Insets(15, 15, 15, 15));
				
				gp.add(new Label("User Name:"), 0, 4);
				//THIS WILL NOT WORK?!?!?!? WHY!!!!
				//gp.add(tfUserName = new TextField(), 1, 4);
				
				Button newGame = new Button("New Game");
				Button loadGame = new Button("Load Game");
				Button cancel = new Button("Cancel");
				gp.add(newGame, 1, 10);
				gp.add(loadGame, 0, 10);
				gp.add(cancel, 0, 10);
				GridPane.setHalignment(newGame, HPos.RIGHT);
				newGame.setOnAction(e-> newGame());
				loadGame.setOnAction(e-> loadGame());
				cancel.setOnAction(e-> cancel());
				
				// Set a scene with a label in the stage
				Scene scene = new Scene(gp);
				primaryStage.setTitle("Dealing with Death Login"); // Title of the stage
				primaryStage.setScene(scene); // Place the scene in the stage
				primaryStage.show();
				System.out.println("Opening Login Window. . . . . \n");
				
		
	}

	
    //Handle method records information from text fields and adds to ObservableList
    public void newGame()
    {

		/*String userName = tfUserName.getText();
        LoginMain p = new LoginMain(userName);
        credentials.add(p);   
        System.out.println("User Name Stored. . . \n" + p);*/
        
        User userInput = new User();
        
        userInput.newGame("userName");
    }
    
    public void loadGame()
    {
    	User userInput = new User();
    	
    	userInput.load();
    	
    }
    
    public void saveGame()
    {
    	User userInput = new User();
    	
    	userInput.save();
    	
    }
    
    public void cancel() {
    	
    	System.out.println("Submission Canceled");
    	
		System.exit(0);
		
	}
    
    public static void main(String[] args) {
        launch(args);
      }





}
