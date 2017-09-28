package application;


/**
 * el main de la aplicacion, aqui inicia todo  
 */
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class MyFirstDB extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage PrimaryStage) throws Exception {
	    Parent gui = FXMLLoader.load(getClass().getResource("/myFirstDB/guis/fxml/pagPrincipal.fxml"));
		Scene scene = new Scene(gui);
		
		PrimaryStage.setScene(scene);
		PrimaryStage.setTitle("MyFirstDB!!");
		PrimaryStage.show();
	}

}
