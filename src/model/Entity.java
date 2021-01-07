package model;
import java.util.ArrayList;

public abstract class Entity{
  private int level;
  private int health;
  private int experience;
  private int mana;
  private int defense;
  private Class type;
  private Damage damage;
  private ArrayList<Skills> skills;

  public Entity(){
    level = 0;
    health = 0;
    experience = 0;
    mana = 0;
    defense = 0;
    type = new Class();
    damage = new Damage();
    habilities = new ArrayList<Skills>();
  }//End constructo
  public Entity(int level,int health,int experience,int mana,int defense){
    this.level = level;
    this.health = health;
    this.experience = experience;
    this.mana = mana;
    this.defense = defense;
    type = new Class();
    damage = new Damage();
    habilities = new ArrayList<Skills>();
  }//End constructo
  public void setLevel(int level){
    this.level = level;
  }//End setLevel
  public void setHealth(int health){
    this.health = health;
  }//End setHealth
  public void setExperience(int exp){
    experience = exp;
  }//End setExperience
  public void setMana(int mana){
    this.mana = mana;
  }//End setMana
  public void setDefense(int defense){
    this.defense = defense;
  }//End setDefense
  public void setDamage(int damage){
    this.damage = damage;
  }//End setDamage
  public int getLevel(){
    return level;
  }//End getLevel
  public int getHealth(){
    return health;
  }//End getHealth
  public int getExperience(){
    return experience;
  }//End getExperience
  public int getMana(){
    return mana;
  }//End getMana
  public int getDefense(){
    return defense;
  }//End getDefense
  public int getDamage(){
    return damage;
  }//End getDamage
  public abstract String attack(Entity enemy, String attack);
  public abstract String loseHealth(int damage);
}//End public Entity
