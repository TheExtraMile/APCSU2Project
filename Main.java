import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String inputString;
    
    int segmentStart = 0;
    
    int segmentA = 100; 
    int segmentA1 = 110;
    int segmentA2 = 120;
    int segmentA3 = 130;

    int segmentB = 200;
    int segmentB1 = 210;
    int segmentB2 = 220;
    int segmentB3 = 230;

    int counter = 0;
    int time = 5000;
  
    //Start

    counter += segmentStart + 1;
    System.out.println(CurrentMessage(counter));
    counter += 1;
    Wait(time);

    System.out.println(CurrentMessage(counter));
    
    inputString = input.next();
    if(inputString.equals("LEFT")){
      //A
      
      counter = 0;
      counter += segmentA + 1;
      System.out.println(CurrentMessage(counter));
      Wait(time);

      counter += 1;
      System.out.println(CurrentMessage(counter));
      Wait(time);

      counter += 1;
      System.out.println(CurrentMessage(counter));

      inputString = input.next();
      if(inputString.equals("ATTACK")) {
        //A1

        counter = 0;
        counter += segmentA1 + 1;
        System.out.println(CurrentMessage(counter));
        Wait(time);

        counter += 1;
        System.out.println(CurrentMessage(counter));
        Wait(time);

        counter += 1;
        System.out.println(CurrentMessage(counter));
      }
      else if(inputString.equals("RUN")) {
        //A2

        counter = 0;
        counter += segmentA2 + 1;
        System.out.println(CurrentMessage(counter));
        Wait(time);

        counter += 1;
        System.out.println(CurrentMessage(counter));
        Wait(time);

        counter += 1;
        System.out.println(CurrentMessage(counter));
        Wait(time);

        counter += 1;
        System.out.println(CurrentMessage(counter));
      }
      else if(inputString.equals("BEG")) {
        //A3

        counter = 0;
        counter += segmentA3 + 1;
        System.out.println(CurrentMessage(counter));
        Wait(time);

        counter += 1;
        System.out.println(CurrentMessage(counter));
        Wait(time);

        counter += 1;
        System.out.println(CurrentMessage(counter));
        Wait(time);

        counter += 1;
        System.out.println(CurrentMessage(counter));
      }
    }
    else if (inputString.equals("RIGHT")) {
      //B

      counter = 0;
      counter += segmentB + 1;
      System.out.println(CurrentMessage(counter));
      Wait(time);

      counter += 1;
      System.out.println(CurrentMessage(counter));
      Wait(time);

      counter += 1;
      System.out.println(CurrentMessage(counter));

      inputString = input.next();
      if(inputString.equals("INTERACT")) {
        //B1

        counter = 0;
        counter += segmentB1 + 1;
        System.out.println(CurrentMessage(counter));
        Wait(time);

        counter += 1;
        System.out.println(CurrentMessage(counter));
        Wait(time);

        counter += 1;
        System.out.println(CurrentMessage(counter));
        Wait(time);

        counter += 1;
        System.out.println(CurrentMessage(counter));
        Wait(time);

        counter += 1;
        System.out.println(CurrentMessage(counter));
      }
      else if(inputString.equals("IGNORE")) {
        //B2

        counter = 0;
        counter += segmentB2 + 1;
        System.out.println(CurrentMessage(counter));
        Wait(time);

        counter += 1;
        System.out.println(CurrentMessage(counter));
        Wait(time);

        counter += 1;
        System.out.println(CurrentMessage(counter));
      }
      else if(inputString.equals("BURN")) {
        //B3

        counter = 0;
        counter += segmentB3 + 1;
        System.out.println(CurrentMessage(counter));
        Wait(time);

        counter += 1;
        System.out.println(CurrentMessage(counter));
        Wait(time);

        counter += 1;
        System.out.println(CurrentMessage(counter));
        Wait(time);

        counter += 1;
        System.out.println(CurrentMessage(counter));
        Wait(time);

        counter += 1;
        System.out.println(CurrentMessage(counter));
      }
    }
    
    
  }
  public static String CurrentMessage(int x){
    String message;
    if (x == 1){
      message = "You are walking down a path when you suddenly see a fork in the road.";
    }
    else if (x == 2) {
      message = "Do you go LEFT or RIGHT?";
    }
    else if (x == 101) {
      message = "You turn left and continue travelling for some time.";
    }
    else if (x == 102) {
      message = "The environment begins to fog-up and drizzle, causing your vision to grow hindered.";
    }
    else if (x == 103) {
      message = "You then hear a loud growl and see the outline of a giant ogre, shall you ATTACK, RUN, or BEG for your life?";
    }
    else if (x == 111) {
      message = "You reveal an axe under your garmets and strike the foul beast with a swift swing.";
    }
    else if (x == 112) {
      message = "The monster collapses to the muddy floor as you triumph.";
    }
    else if (x == 113) {
      message = "The end.";
    }
    else if (x ==121) {
      message = "Intensely trembling, you turn around and attempt to run away.";
    }
    else if (x == 122) {
      message = "Not four paces in, you slip on the muddy ground and your head collides with a rock.";
    }
    else if (x == 123) {
      message = "You die a dumb, stupid, foolish, idiotic, feeble-minded, coward.";
    }
    else if (x == 124) {
      message = "The end.";
    }
    else if (x == 131) {
      message = "You approach the beast and drop to your knees without a care in the world for your now soiled leggings.";
    }
    else if (x == 132) {
      message = "Determined to live, your plead for your survival before the mighty ogre, but it only recieves your cry as pure amusement and replies with roaring laughter, a result of your foolish actions.";
    }
    else if (x == 133) {
      message = "The beast then lifts its stone club, and with one swing downward, you are utterly defeated.";
    }
    else if (x == 134) {
      message = "The end.";
    }
    else if (x == 201) {
      message = "You turn right and continue travelling for some time.";
    }
    else if (x == 202) {
      message = "After said time passes, you find yourself approaching a small town.";
    }
    else if (x == 203) {
      message = "What will you do once you have reach your destination: INTERACT with the people, IGNORE them, or perhaps BURN the whole place to the ground?";
    }
    else if (x == 211) {
      message = "You enter the town's vicinity and begin speaking to the locals.";
    }
    else if (x == 212) {
      message = "You find a tavern where you purchase beer and a meal.";
    }
    else if (x == 213) {
      message = "A few drinks in and you start conversing with a fellow drunken character.";
    }
    else if (x == 214) {
      message = "Around seven minutes later, you are beaten to a bloody pulp by that man due to different political views.";
    }
    else if (x == 215) {
      message = "The end.";
    }
    else if (x == 221) {
      message = "You decide to pass through a wilderness and avoid the town all together.";
    }
    else if (x == 222) {
      message = "You are eaten by wild boars.";
    }
    else if (x == 223) {
      message = "The end.";
    }
    else if (x == 231) {
      message = "You walk into the town with a hooded cloak and a sinister smile.";
    }
    else if (x == 232) {
      message = "You pull out a torch and ignite it using a tinder box, then you kick down the door to a home and toss the flame inside it.";
    }
    else if (x == 233) {
      message = "Building after building, the entire town goes up in smoke with screams and cries running in the background, all done while you're laughing maniacally.";
    }
    else if (x == 234) {
      message = "During the mass panic of the blazing town, your discretely remove yourself from the chaos and continue on with your venture.";
    }
    else if (x == 235) {
      message = "The end.";
    }
    else {
      message = null;
    }
    return message;
  }
  public static void Wait(int ms){
    try
    {
        Thread.sleep(ms);
    }
    catch(InterruptedException ex)
    {
        Thread.currentThread().interrupt();
    }
  }
}
