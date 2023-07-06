package com.sudoku.userinterface;

import java.util.HashMap;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import com.sudoku.problemdomain.Coordinates;

public class UserInterfaceImpl {
  private final Stage stage;
  private final Group root;
  /**
   * 
   * @see java.util.HashMap (<Key, value> -> <Coordinates, Interger>)
   * @param <Coordinates,Integer> Coordinates(int x, int y), 
   */
  private HashMap<Coordinates> textFieldCoordinates;

  // Dimensions de la fenetre de jeu et couleur (Dimensions -> Double car Scene(root, double width, double height))
  private static final double WINDOW_X = 668;
  private static final double WINDOW_Y = 732;
  private static final Color WINDOW_BACKGROUND_COLOR = Color.rgb(0, 150, 136);

  // Titre 
  private static final String TITLE = "Sudoku";

  private static final double BOARD_PADDING = 50; // Padding entre la grille et la fenetre
  private static final double BOARD_X_AND_Y = 576; // Dimensions de grille
  private static final Color BOARD_BACKGROUND_COLOR = Color.rgb(224, 242, 241);

  public UserInterfaceImpl(Stage stage) {
    this.stage = stage; // le param stage -> la constante stage
    this.root = new Group(); // creation d'un groupe qui va englober tous les elements javafx
    IntializeUserInterface(); // appel de la function pour initialiser le visuel de l'app
  }

  /** 
   *  Initialisation du visuel de l'app
   */ 
  private void IntializeUserInterface() {
    drawBackground(root); // Appel de la func pour le bg
    drawTitle(root); // Appel de la func pour le titre
    drawSudokuBoard(root); // Appel de la func pour la grille
    drawTextField(root); // Appel de la func pour les cases
    stage.show(); // On affiche le stage
  }

  /**
   * Creation de la scene et du background
   * 
   * @param root le group qui sert de noeud specifie pour notre scene
   */ 
  private void drawBackground(Group root) {
    Scene scene = new Scene(root, WINDOW_X, WINDOW_Y); // Creation d'une scene avec le root (Group) et les dimensions souhaitée
    scene.setFill(WINDOW_BACKGROUND_COLOR); // Remplisage du fond avec la couleur souhaitée
    stage.setScene(scene); // On attribute la scene au stage
  }

  /**
   * Creation et ajout du titre dans l'ui
   * 
   * @param root noeud dans lequel on veut ajouter le titre
   */
  private void drawTitle(Group root) {
    Text title = new Text(235, 690, TITLE); // Creation du texte Text(double posX, double posY, String content)
    title.setFill(Color.WHITE); // attribut la couleur au titre
    Font titleFont = new Font(43); // Initialisation de la Font, Font(String nomDeLaFont, double size)
    title.setFont(titleFont); // Attribution de la Font au titre
    root.getChildren().add(title); // Ajout du titre dans le groupe
  }

  /**
   * Creation et ajout de la Grille de Sudoku dans l'ui
   * 
   * @param root noeud dans lequel on veut ajouter la grille
   */
  private void drawSudokuBoard(Group root) {
    Rectangle boardBackground = new Rectangle(); // Creation du fond pour la grille
    boardBackground.setX(BOARD_PADDING); // Attribution de la position X 
    boardBackground.setY(BOARD_PADDING); // Attribution de la position Y
    boardBackground.setWidth(BOARD_X_AND_Y); // Attribution de la largeur
    boardBackground.setHeight(BOARD_X_AND_Y); // Attribution de la hauteur
    boardBackground.setFill(BOARD_BACKGROUND_COLOR); // Attribution de la couleur de fond
    root.getChildren().add(boardBackground); // Ajout de la grille a groupe
  }

  /**
   * Creation des cases qui compose la grille
   * 1- On dessine chaque case de texte basé sur la valeur de x et y.
   * 2- Pour chaque case de text on ajoute les coordonnées (x,y) basé sur leur valeur Hash de la HashMap.
   * 
   * @param root noeud dans lequel on veut ajouter les case
   */
  private void drawTextField(Group root){
    
  }
}
