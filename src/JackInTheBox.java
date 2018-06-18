import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JackInTheBox implements ActionListener{
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	
public static void main(String[] args) {
	JackInTheBox jack = new JackInTheBox();
	jack.showButton();
}


private void showButton() {
	// TODO Auto-generated method stub
	frame.setVisible(true);
	frame.add(panel);
	frame.add(button);
	panel.add(button);
	frame.pack();
	button.setText("Surprise");
	button.addActionListener(this);
	
}
public void actionPerformed(ActionEvent e) {
	if(button
	
	
	

}
}
