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
    faction = setFaction();
    Class = new String();
  }//End constructor
  public void setType(int level){
    if(level < 15)
        Class = classes[faction.ordinal()][( (int) (Math.floor(x/5.0)) )];
  }//End getType
  private Faction setFaction(){
    Faction[] fact = Faction.values();
    Faction faction = fact[(choose.nextInt(3))];
    return faction;
  }//End setFaction
}//End class Type
