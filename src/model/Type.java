package model;
import java.util.Random;
public class Type{
  private final String[][] classes = {{"","",""},
                                      {"","",""},
                                      {"","",""}};
  private String type;
  private Faction faction;
  private Random choose;
  private  String Class;
  public Type(){
    type = new String();
    choose = new Random();
    faction = setFaction();
    Class = new String();
  }//End constructor
  public void setType(int level){
    Class = classes[faction.ordinal()][];
  }//End getType
  private Faction setFaction(){
    Faction[] fact = Faction.values();
    Faction faction = fact[(choose.nextInt(3))];
    return faction;
  }//End setFaction
}//End class Type
