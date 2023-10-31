// this template can be used for any Turtle questions in CS Awesome

import java.awt.*;

public class Main {
  
  public void start() {
    World world = new World(400,400);
    Turtle yertle = new Turtle(world);
    
    world.setVisible(true);
    
    yertle.setColor(Color.blue);
    yertle.setPenWidth(2);
    yertle.setPenColor(new Color(200, 100, 50));
    yertle.forward();
    yertle.turnRight();
    yertle.forward();
  }
  
  
  public static void main(String[] args) {  
   new Main().start();
  }
}
