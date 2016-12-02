package com.chan.academy.game.test;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Fxex extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		
		Button button = new Button();
		button.setText("asdf");
		button.setStyle("-fx-font-size:50;");
		
		GridPane gridPane = new GridPane();
		gridPane.getChildren().add(button);
		
		Scene scene = new Scene(gridPane);
		
		
		stage.setScene(scene);
		stage.setTitle("asdf");
		stage.show();
	}

	
	public static void main(String[] args) {
		launch(args);
	}
}
