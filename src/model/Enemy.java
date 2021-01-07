package model;
import java.util.Random;

public class Enemy extends Entity{

  private String species;

  public Enemy(){
    super();
    species = new String();
  }//End constructor

  public String attack(Entity enemy, String attack){
    
  }//End attack
  public String loseHealth(int damage);
}//End Enemy
