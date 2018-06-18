import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GraphicsEnvironment;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class GUI extends JFrame implements ActionListener, ItemListener, Runnable {
	private JButton button;
	private JComboBox fonts;
	private String message;

	public GUI(String title) {
		super(title);
		
		setLayout(new FlowLayout());
		
		add(button = new JButton("Click"));
		
		button.addActionListener(this);
		
		String[] fontNames = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		
		add(fonts = new JComboBox(fontNames));
		
		message = "Hello";
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		
		String name = fonts.getSelectedItem().toString();
		
		Font font = new Font(name,Font.BOLD,20);
		
		g.setFont(font);
		
		g.drawString(message,20,200);
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

	@Override
	public void itemStateChanged(ItemEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        GUI gui = new GUI("GUI");
        
        gui.setSize(500,500);
        gui.setLocationRelativeTo(null);
        gui.setVisible(true);
	}

}
