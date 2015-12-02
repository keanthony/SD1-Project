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
import java.util.Scanner;

import static java.lang.System.in;

public class LoginMainGUI extends Application {

	private TextField tfUserName;
	ArrayList<User> userList;
	private Scanner scanner;
	private DWD content = new DWD();
	private GameLogicService gls;

	public LoginMainGUI() {

	}

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
		
		gp.add(tfUserName = new TextField(), 1, 4);

		Button saveGame = new Button("Save Game");
		Button newGame = new Button("New Game");
		Button loadGame = new Button("Load Game");
		Button cancel = new Button("Cancel");
		gp.add(saveGame, 3, 10);
		gp.add(newGame, 2, 10);
		gp.add(loadGame, 1, 10);
		gp.add(cancel, 0, 10);
		
		saveGame.setOnAction(e-> saveGame());
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

		u.newGame(u.userName);
		System.out.println("User Name Stored. . . \n");
		if (u.passMainMenu) {
			System.out.println("Game Starting...");
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
	
	public void saveGame() {
		User userInput = new User();
		userInput.save();
	}

	private void startGame(String userName) {
		scanner = new Scanner(in);
		gls = new GameLogicService(content, scanner);
		gls.init(userName);
		Boolean isValidAction = false;
		//TODO: this should loop until game is over.
			//System.out.println("This is a friendly room");
			while (!isValidAction) {
				gls.getContent().displayEntryRoomInfo();
				String input = GetUserInput();
				String playerAction = PlayerActionEnum.values()[Integer.parseInt(input) - 1].name();
				if (!gls.setPlayerAction(playerAction)) {
					System.out.println("Invalid action passed in. " + input + " is not a valid input");
				}
			}
	}

	private String GetUserInput() {
		boolean shouldShowRiddles = this.gls.getContent().isCurrentRoomADevilRoom();
		System.out.println("Please enter a number corresponding with your action type");
		System.out.println("1. Get an Item");
		System.out.println("2. Sell an Item");
		System.out.println("3. Fight");
		System.out.println("4. Move to the next Room");
		if (shouldShowRiddles) {
			System.out.println("5. Solve Riddle");
		}
		System.out.println("\n");

		// create a scanner so we can read the command-line input
		String inputString = scanner.next();

		while (!isValidInput(inputString)) {
			System.out.println("Sorry, please input a valid number");
			inputString = scanner.next();
		}

		return inputString;
	}

	private boolean isValidInput(String inputString) {
		Boolean isValid = false;
		switch (inputString) {
			case "1":
			case "2":
			case "3":
			case "4":
			case "5":
				return true;
			default:
				return false;
		}
	}


	public void cancel() {

		System.out.println("Submission Canceled");

		System.exit(0);

	}

	public static void main(String[] args) {
		launch(args);
	}


}
