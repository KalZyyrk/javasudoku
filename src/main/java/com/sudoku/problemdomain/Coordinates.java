package com.sudoku.problemdomain;

import java.util.Objects;

/**
 * Class qui nous sert a stocker la location d'un case dans le sudoku dans la HashMap
 */
public class Coordinates {
  private final int x;
  private final int y;

  // Constructor de la classe 
  public Coordinates(int x, int y) {
    this.x = x;
    this.y = y;
  }

  /**
   * Getter de X
   * @return la position sur l'axe X
   */
  public int getX(){
    return x;
  }

  /**
   * Getter de Y
   * @return la position sur l'axe Y
   */
  public int getY() {
    return y;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
  }

  /**
   * Insertion des coordonnées dans l'objet
   * 
   * @return les coordonnées dans le hash de l'objet
   */
  @Override
  public int hashCode() {
    return Objects.hash(x,y);
  }
}
