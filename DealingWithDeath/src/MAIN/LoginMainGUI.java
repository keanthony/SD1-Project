package MAIN;


import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.ArrayList;

public class LoginMainGUI extends Application {

	private TextField tfUserName;
	ArrayList<User> userList;

	//ObseravableList comes from an arrayList that we can add in another class
	public void start(ArrayList<User> userList2) throws Exception
	{
		userList = userList2;
	}

    //Handle method records information from text fields and adds to ObservableList

	@Override
	public void start(Stage primaryStage) throws Exception {
		//Stage primaryStage = new Stage();

		GridPane gp = new GridPane();
		gp.setStyle("-fx-background-color: WHITE");
		gp.setAlignment(Pos.CENTER);
		gp.setPadding(new Insets(15, 15, 15, 15));

		gp.add(new Label("User Name:"), 0, 4);
		//THIS WILL NOT WORK?!?!?!? WHY!!!!
		gp.add(tfUserName = new TextField(), 1, 4);

		Button newGame = new Button("New Game");
		Button loadGame = new Button("Load Game");
		Button cancel = new Button("Cancel");
		gp.add(newGame, 2, 10);
		gp.add(loadGame, 1, 10);
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

	public void newGame() {

    	User u = new User();
		u.userName = tfUserName.getText();
		//u.userList.add(userName);
		u.newGame(u.userName);
		System.out.println("User Name Stored. . . \n");
		if (u.passMainMenu) {
			this.startGame(u.userName);
		}

    }

	public void loadGame() {
		User userInput = new User();

		userInput.load();
		if (userInput.passMainMenu) {
			this.startGame(userInput.userName);
		}

    }

	private void startGame(String userName) {
		DWD content = new DWD();
		GameLogicService gls = new GameLogicService(content);
		gls.init(userName);
		//TODO: print out description
		//TODO: get user input.
// String result=  user.GetUserInput();
		while (!gls.isGameOver) if (gls.getContent().getCurrentNPC().isFriendly()) {
			//TODO: set the player action
			//gls.getPlayerAction(result);
			//TODO: print out description
		} else {
			//TODO: fight monster
			//TODO: press any key to start fighting the monster

		}

	}

	public void saveGame() {
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
