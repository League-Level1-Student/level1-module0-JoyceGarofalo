import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTV implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
public static void main(String[] args) {
	CutenessTV ctv = new CutenessTV();
	ctv.showButton();
}
void showButton() {
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
		
	}

	
	
}
	
	
	
	
}
