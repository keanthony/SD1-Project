package MAIN;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.TilePane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class PlayerTable extends Application {
	
	 private TableView<String> table = new TableView<String>();
	    private ObservableList<String> cred;

	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		
		User userList = new User();
		//ArrayList<LoginMain> uList = userList.getPlayers();
		
		//cred = FXCollections.observableArrayList(uList);
		
		 Scene scene = new Scene(new Group());
	        stage.setTitle("Table of People");
	        stage.setWidth(470);
	        stage.setHeight(500);

	        final Label label = new Label("People List");
	        label.setFont(new Font("Times New Roman", 20));

	        table.setEditable(false);

	        // create three columns to hold some information about games
	        TableColumn<String, String> nameCol = new TableColumn<String, String>(
	                "UserName");
	        nameCol.setCellValueFactory(new PropertyValueFactory<String, String>(
	                "UserName"));
	        
	     // add the columns to the table
	        table.getColumns().addAll(nameCol);
	        
	        table.setMinSize(450, 300);
	        // add the list to the table
	        table.setItems(cred);

	        // add the table to a VBox

	        BorderPane mainPane = new BorderPane();

	        mainPane.setPadding(new Insets(10, 0, 10, 10));

	        mainPane.setTop(label);
	        mainPane.setCenter(table);
	        
	        Button btnTop = new Button("+ Player");
	        
	        btnTop.setOnAction(new EventHandler<ActionEvent>() {
				@Override // Override the handle method
				public void handle(ActionEvent e) {
				
					//LoginMainGUI newPersonForm = new LoginMainGUI(cred);
					//System.out.println("Table Data before" + newPersonForm.cred2);

				}
			});
	        
	        Button btnBottom = new Button("Exit");

	        btnBottom.setOnAction(new EventHandler<ActionEvent>() {
				@Override // Override the handle method
				public void handle(ActionEvent e) {
					
					System.out.println("Exiting Window");
					
					System.exit(0);
					
				}
			});
	        
	        // Add TileButtons to the bottom of the table horizontally
	        TilePane tileButtons = new TilePane(Orientation.HORIZONTAL);
	        tileButtons.setPadding(new Insets(450, 0, 0, 0));
	        tileButtons.setHgap(260.0);
	        tileButtons.setVgap(0.0);
	        tileButtons.getChildren().addAll(btnBottom, btnTop);

	        // add vBox to the scene, adding mainPane and tileButtons
	        // tileButtons before mainPaine because mainPane interface needs to be change
	        ((Group) scene.getRoot()).getChildren().addAll(tileButtons, mainPane );

	        // display the GUI
	        stage.setScene(scene);
	     
	        stage.show();
		
	}
	
	 /**
     * @param args
     */
    public static void main(String[] args)
    {
        launch(args);

    }


}
