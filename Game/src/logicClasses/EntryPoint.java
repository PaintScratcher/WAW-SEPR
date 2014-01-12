package logicClasses;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;


public class EntryPoint extends Point {
	
	Image entryPointTop, entryPointRight, entryPointLeft;

	public EntryPoint(double xcoord, double ycoord) {
	    super(xcoord, ycoord);
	    pointCount += 1; 

	}
	
	EntryPoint(double xcoord, double ycoord, String name){
	    super(xcoord, ycoord, name);
	    pointCount += 1;
	    System.out.println("EntryPoint " + pointRef + " set:(" + x + "," + y +").");
	}
	
    public void init(GameContainer gc) throws SlickException {
    	
    	this.entryPointTop = new Image("/res/graphics/graphics/entrypoint_top.png");
		this.entryPointRight = new Image("/res/graphics/graphics/entrypoint_right.png");
		this.entryPointLeft = new Image("/res/graphics/graphics/entrypoint_left.png");

    	
   

	}
	public void render(Graphics g) throws SlickException {
		
	    
		
		
		if(this.y == 0){
			this.entryPointTop.draw((int)this.x-20, (int) this.y);
		}
		
		else if(this.x == 150){
			this.entryPointLeft.draw((int)this.x, (int) this.y-20);
		}
		
		else if(this.x == 1200){
			this.entryPointRight.draw((int)this.x-40, (int) this.y-20);
		}
    }
	


}
