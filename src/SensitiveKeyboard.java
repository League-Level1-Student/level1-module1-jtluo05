import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class SensitiveKeyboard implements KeyListener{
JFrame frame=new JFrame();
	public static void main(String[] args) {
	SensitiveKeyboard sk=new SensitiveKeyboard();
	sk.createUI();
}
void createUI(){
		frame.setVisible(true);
		frame.setSize(200, 200);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.addKeyListener(this);
		}
static void speak(String words) {
    try {
         Runtime.getRuntime().exec("say " + words).waitFor();
    } catch (Exception e) {
         e.printStackTrace();
         }
    }

@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	speak("ouch");

}

@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
}
