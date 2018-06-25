import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SoundEffectMachine implements ActionListener{
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	
public static void main(String[] args) {
		SoundEffectMachine hi = new SoundEffectMachine();
		hi.showButton();
	}
void showButton() {
	frame.setVisible(true);
	frame.add(panel);
	panel.add(button1);
	panel.add(button2);
	panel.add(button3);
	frame.pack();
	button1.addActionListener(this);
	button2.addActionListener(this);
	button3.addActionListener(this);
}
public void actionPerformed(ActionEvent e) {
	JButton buttonpressed = (JButton) e.getSource();
	if(buttonpressed.equals(button1)) {
	playSound("labrador-barking-daniel_simon.wav");
	}
	else if(buttonpressed.equals(button2)) {
		playSound("old-car-engine_daniel_simion.wav");
	}
	else {
		playSound("alien-spaceship_daniel_simion.wav");
	}
}
private void playSound(String fileName) {
    AudioClip sound = JApplet.newAudioClip(getClass().getResource("labrador-barking-daniel_simon.wav")); 
    sound.play();
    AudioClip sound2 = JApplet.newAudioClip(getClass().getResource("old-car-engine_daniel_simion.wav")); 
    sound2.play();
    AudioClip sound3 = JApplet.newAudioClip(getClass().getResource("alien-spaceship_daniel_simion.wav")); 
    sound3.play();
}
}
