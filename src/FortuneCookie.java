import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class FortuneCookie implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	Random rand = new Random();
	int num = rand.nextInt(5);
	
	public static void main(String[] args) {
		FortuneCookie fc = new FortuneCookie();
		fc.showButton();
		
	}

void showButton(){
	System.out.println("Button clicked");
	frame.setVisible(true);
	frame.add(button);
	frame.add(panel);
	panel.add(button);
	frame.pack();
	button.addActionListener(this);
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JOptionPane.showMessageDialog(null, "Woohoo");
	if(num == 0) {
		JOptionPane.showMessageDialog(null, "You will have a good day");
	}
	else if(num == 1) {
		JOptionPane.showMessageDialog(null, "You will go to a cool place");
	}
	else if(num == 2) {
		JOptionPane.showMessageDialog(null, "You will recieve a gift");
	}
	else if(num == 3) {
		JOptionPane.showMessageDialog(null, "You will have a bad day");
	}
	else {
		JOptionPane.showMessageDialog(null, "You will make a new friend");
	}
	
	
}
}
