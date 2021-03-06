package com.chotoxautinh.controller;

import java.io.IOException;

import com.chotoxautinh.App;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;

public class MainController {
	private App mainApp;

	public App getMainApp() {
		return mainApp;
	}

	public void setMainApp(App mainApp) {
		this.mainApp = mainApp;
		mainApp.playSong("MainMenuThemeSong");
	}

	@FXML
	private void handleMultiPlayerButton() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/chotoxautinh/view/MultiPlayerLayout.fxml"));
		BorderPane layout = (BorderPane) loader.load();
		((StackPane) mainApp.getRootLayout().getCenter()).getChildren().add(layout);

		// Give the controller access to the main app
		MultiPlayerGameController controller = loader.getController();
		controller.setMainApp(mainApp);
	}
	
	@FXML
	private void handleClassicModeButton() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/chotoxautinh/view/ClassicGameLayout.fxml"));
		BorderPane layout = (BorderPane) loader.load();
		((StackPane) mainApp.getRootLayout().getCenter()).getChildren().add(layout);

		// Give the controller access to the main app
		ClassicGameController controller = loader.getController();
		controller.setMainApp(mainApp);
	}
	
	@FXML
	private void handleEndlessModeButton() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/chotoxautinh/view/EndlessGameLayout.fxml"));
		BorderPane layout = (BorderPane) loader.load();
		((StackPane) mainApp.getRootLayout().getCenter()).getChildren().add(layout);

		// Give the controller access to the main app
		EndlessGameController controller = loader.getController();
		controller.setMainApp(mainApp);
	}
	
	@FXML
	private void handleIntro(){
		mainApp.showIntro();
	}
}
