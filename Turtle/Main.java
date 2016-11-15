import processing.core.PApplet;

public class Main extends PApplet { 
	public static Turtle yertle;
	
	public void setup() {
		size(900, 900);			// set the size of the window
		noLoop();				
        background( 255 );		// set the background color

        yertle = new Turtle(this);	// create a new turtle
        yertle.drawSquare(50);
    
	}
	
	public static void main(String[] args) {
		PApplet.main(new String[]{"Main"});
	}
}