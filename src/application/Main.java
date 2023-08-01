package application;
	
<<<<<<< HEAD
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
=======
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
>>>>>>> 2b7eaf77ee42c911e12ec84c56920e9067a097a1


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
<<<<<<< HEAD
		/*
		 * try { BorderPane root = new BorderPane(); Scene scene = new
		 * Scene(root,400,400);
		 * scene.getStylesheets().add(getClass().getResource("application.css").
		 * toExternalForm()); primaryStage.setScene(scene); primaryStage.show(); }
		 * catch(Exception e) { e.printStackTrace(); }
		 */
		
		try {
			Parent parent = FXMLLoader.load(getClass().getResource("/gui/View.fxml"));
			Scene scene = new Scene(parent);
			primaryStage.setScene(scene);
			primaryStage.show();
			}
			catch (IOException e) {
			e.printStackTrace();
			}
=======
		try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
>>>>>>> 2b7eaf77ee42c911e12ec84c56920e9067a097a1
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
