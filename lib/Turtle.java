/**
 * Class that represents a turtle which is similar to a Logo turtle.
 * This class inherts from SimpleTurtle and is for students
 * to add methods to.
 *
 * Copyright Georgia Institute of Technology 2004
 * @author Barb Ericson ericson@cc.gatech.edu
 */
public class Turtle extends SimpleTurtle
{
  ////////////////// constructors ///////////////////////
  
  /** Constructor that takes the x and y and a picture to
   * draw on
   * @param x the starting x position
   * @param y the starting y position
   * @param picture the picture to draw on
   */
  public Turtle (double x, double y, Picture picture) 
  {
    // let the parent constructor handle it
    super(x,y,picture);
  }
  
  /** Constructor that takes the x and y and a world to draw it on
   * @param x the starting x position
   * @param y the starting y position
   * @param modelDisplayer the "world" the turtle lives in
   */
  public Turtle (double x, double y, 
                 World world) 
  {
    // let the parent constructor handle it
    super(x,y,world);
  }
  
  /** Constructor that takes the model display
   * @param world the World the turtle lives in
   */
  public Turtle (World world) 
  {
    // let the parent constructor handle it
    super(world);
  }
  
  /**
   * Constructor that takes a picture to draw on
   * @param p the picture to draw on
   */
  public Turtle (Picture p)
  {
    // let the parent constructor handle it
    super(p);
  }  
  
  /////////////////// methods ///////////////////////


} // this } is the end of class Turtle, put all new methods before this