// this template can be used for any Turtle questions in CS Awesome

import java.awt.*;

public class Main {
  public static void main(String[] args) {  
    World world = new World(400,400);

    Turtle yertle = new Turtle(world);
    Turtle myrtle = new Turtle(300, 300, world); 
    world.setVisible(true);

    yertle.setWaitTime(1000); // slow yertle down
    yertle.setColor(Color.red); //make him red
    
    yertle.forward();
    yertle.turnRight();
    yertle.forward();
   
    myrtle.forward();
    myrtle.turnLeft();
    myrtle.forward();

  }
}
