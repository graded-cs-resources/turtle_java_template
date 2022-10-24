// this template can be used for any Turtle questions in CS Awesome

import java.awt.*;

public class Main {
  public static void main(String[] args) {  
    World world = new World(640,400);
    Turtle yertle = new Turtle(world);
    // Add your own code in here 
    yertle.setColor(Color.green);
    yertle.forward();
    yertle.turnRight();
    yertle.forward();
    
    world.setVisible(true);
  }
}
