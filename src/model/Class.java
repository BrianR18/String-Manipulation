package model;
import java.util.Random;
public class Class{
  private final String[][] classes = {{"","",""},
                                      {"","",""},
                                      {"","",""}};
  private Faction faction;
  private Random choose;
  private  String Class;
  public Class(){
    choose = new Random();
    faction = choooseFaction();
    Class = new String();
  }//End constructor
  public void setType(int level){
    if(level < 15)
        Class = classes[faction.ordinal()][( (int) (Math.floor(x/5.0)) )];
  }//End getType
  public boolean setFaction(String faction){
    boolean set = false;
    faction = faction.toUpperCase();
    Faction[] fact = Faction.values();
    for(Faction f: fact){
      if(faction.equals(f.toString())){
        this.faction = Faction.valueOf(faction);
        set = true;
      }//End if
    }//End for each
  }//End setFaction
  public String getFaction(){
    return faction.toString();
  }//End getFaction
  public String getClass(){
    return Class;
  }//End getClass
  private Faction choooseFaction(){
    Faction[] fact = Faction.values();
    Faction faction = fact[(choose.nextInt(3))];
    return faction;
  }//End setFaction
}//End class Type
