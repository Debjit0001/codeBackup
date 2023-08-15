import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Main extends Applet implements ActionListener 
{
	Label l1, l2, l3;
	TextField t1, t2;
	Button b;

	public void init() {
		l1 = new Label("Enter first number: ");
		l2 = new Label("Enter second number: ");
		l3 = new Label();
		t1 = new TextField();
		t2 = new TextField();
		b = new Button("Calculate");

		setLayout(null);

		add(l1);
		add(l2);
		add(l3);
		add(t1);
		add(t2);
		add(b);

		l1.setBounds(20, 20, 150, 20);
		l2.setBounds(20, 50, 150, 20);
		l3.setBounds(80, 110, 150, 20);
		t1.setBounds(180, 20, 70, 20);
		t2.setBounds(180, 50, 70, 20);
		b.setBounds(100, 80, 50, 20);
	
		b.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int m = Integer.parseInt(t1.getText());
		int n = Integer.parseInt(t2.getText());

		l3.setText("Largest is " + ((m>n) ? m : n));
	}
}

// <applet code="Main.java" width="600" height="600"> </applet>
