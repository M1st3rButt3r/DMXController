package com.dmxcontroller.main;

import java.io.IOException;

import com.dmxcontroller.data.Channel;
import com.dmxcontroller.data.Interface;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.SubScene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application{
	
	public static Interface dmxInterface;
	public Stage stage;

	public static void main(String[] args) {
		//Create DMX Interface
		dmxInterface = new Interface("");
		dmxInterface.send(new Channel(0, 255, 0));
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		this.stage = stage;
		
		Parent parent = FXMLLoader.load(getClass().getResource("../scenes/main.fxml"));
		
		stage.setScene(new Scene(parent, 970, 540));
		stage.setTitle("DMX Controller");
		stage.show();
	}
}