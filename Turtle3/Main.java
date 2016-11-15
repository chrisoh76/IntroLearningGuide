import processing.core.PApplet;

public class Main extends PApplet { 
	public static Turtle yertle;
	
	public void setup() {
		size(900, 900);			// set the size of the window
		noLoop();				
        background( 255 );		// set the background color

        yertle = new Turtle(this);	// create a new turtle
        
        for (int c = 0; c < 4; c = c + 1) {
        
        yertle.forward(100); //square
        yertle.turnRight(90);
        }
        yertle.turnLeft(200);  //moving away
        yertle.forward(150);
    
        for (int c = 4; c<7; c=c+1){ //triangle	
        	yertle.forward(100);
        	yertle.turnRight(120);
        }
        yertle.turnRight(120); // moving away
        yertle.forward(150);   
        for (int c = 8; c<720; c=c+1){ //circle/cylinder thing
        	yertle.forward(5);
        	yertle.turnRight(2);
        }
        yertle.setDirection(180); // face left
 
        yertle.turnRight(90);

        for (int c = 0; c < 6; c = c + 1) { // repeat 8 times:

        yertle.penup(); // set turtle NOT to draw

        yertle.forward(20); // go forward

        yertle.pendown(); // set turtle to draw again

        yertle.forward(20); // go forward
        }
        
        for (int c = 0; c < 8; c = c+1){
        	yertle.turnRight(45);
        	yertle.forward(10);
        	yertle.penup();
        	yertle.forward(10);
        	yertle.pendown();
        	yertle.forward(10);
        }
	}
	
	public static void main(String[] args) {
		PApplet.main(new String[]{"Main"});
	}
}