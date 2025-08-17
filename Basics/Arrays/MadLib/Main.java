

public class Main {
  /*
  This program is a mad libbed story. (Edited: I am playing with the code to use arrays and variables.)
  Author: Shaina
  Date: 08/17/25
  */
  	public static void main(String[] args){

      String[] adjective = {"groggy", "good", "wary"};
      String[] noun = {"protester", "salad", "beepers", "authorities", "strawberries", "Childish Gambinos"};
      String verb1 = "run";
      String[] name = {"Dijon", "Frank"};
      String place1 = "Chicago";
      int number = 3005;

      // String adjective1 = "groggy";
      // String adjective2 = "good";
      // String noun1 = "protester";
      // String noun2 = "salad";
      // String verb1 = "run";
      // String noun3 = "beepers";
      // String noun4 = "authorities";
      // String adjective3 = "wary";
      // String name2 = "Frank";
      // String place1 = "Chicago";
      // String noun5 = "strawberries";
      // int number = 3005;
      // String noun6 = "Childish Gambino";

      //The template for the story
      String story = "This morning " + name[0] + " woke up feeling " + adjective[0] + ".'It is going to be a " + adjective[1] + " day!'. " +
      "Outside, a bunch of "+ noun[0] + "s were protesting to keep "+ noun[1] + 
      " in stores. They began to " + verb1 + " to the rhythm of the " + noun[2] + 
      ", which made all the "+ noun[3] + "s very " + adjective[2] + 
      ". Concerned, "+ name[0] + " texted " + name[1] +", who flew " 
      + name[0]+" to "+ place1 +" and dropped "+ name[0] +" in a puddle of frozen "+noun[4]+
      ". "+name[0]+" woke up in the year "+number+", in a world where "+noun[5]+"s ruled the world.";

      System.out.println(story);
    }       
}
