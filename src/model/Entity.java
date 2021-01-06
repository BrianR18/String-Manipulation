package model;
import java.util.ArrayList;

public abstract class Entity{
  private int level;
  private int health;
  private int experience;
  private int mana;
  private int defense;
  private Type type;
  private Damage damage;
  private ArrayList<Skills> skills;

  public Entity(){
    level = 0;
    health = 0;
    experience = 0;
    mana = 0;
    defense = 0;
    type = new Type();
    damage = new Damage();
    habilities = new ArrayList<Skills>();
  }//End constructo

  public abstract String attack(Entity enemy, String attack);
  public abstract String loseHealth(int damage);
}//End public Entity
