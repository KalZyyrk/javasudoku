package com.sudoku;

import java.io.IOException;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import com.sudoku.userinterface.UserInterfaceImpl;

public class SudokuApplication extends Application {
  private UserInterfaceImpl uiImpl; // On initilise Le type pour uiImpl

  @Override
  public void start(Stage primaryStage) throws IOException {
    uiImpl = new UserInterfaceImpl(primaryStage); // on Initialize l'Ui 

  }
  public static void main(String[] args) {
    launch(args); // launch() appel la fonction start()
  }
}
