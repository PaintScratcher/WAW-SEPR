import java.awt.Font;
import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.TrueTypeFont;
import org.newdawn.slick.gui.TextField;
import org.newdawn.slick.GameContainer;


public class Controls{
	
	private TrueTypeFont font;
	private TextField headingControlTB;
	private TextField altControlTB;
	private Boolean headingHasFocus;
	private Boolean altHasFocus;
	
	public Controls(GameContainer gc){	
		
	}
	public void init(GameContainer gc) {
		Font awtFont = new Font("Courier",Font.BOLD,15);
		font = new TrueTypeFont(awtFont, false);
		this.headingControlTB = new TextField(gc,font,0,30,100,25);
		this.altControlTB = new TextField(gc,font,0,85,100,25);	
		this.headingHasFocus = false;
		this.altHasFocus = false;
	}
	
	public void update(GameContainer gc){
		if(this.headingControlTB.hasFocus() == true){
			if(this.headingHasFocus == false){
				this.headingHasFocus = true;
			}
		}
		else{
			this.headingHasFocus = false;
		}
		if(this.headingHasFocus == true){
			this.headingControlTB.setText("");
		}
	}
	
	public TextField getHeadingControlTB() {
		return headingControlTB;
	}
	
	public TextField getAltControlTB() {
		return altControlTB;
	}
	
	public void render(GameContainer gc, Graphics g)throws SlickException {
		g.setColor(Color.white);
		g.drawString("Heading:", 0,10);
		this.headingControlTB.render(gc,g);
		g.drawString("Altitude:", 0, 60);
		this.altControlTB.render(gc,g);
	}
	public void clear_all() {
		this.headingControlTB.setAcceptingInput(false);
		this.altControlTB.setAcceptingInput(false);
	}
	public void allow_all() {
		this.headingControlTB.setAcceptingInput(true);
		this.altControlTB.setAcceptingInput(true);
	}

}
