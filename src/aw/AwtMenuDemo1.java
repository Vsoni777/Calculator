package aw;
import java.awt.*;
import java.awt.event.*;

class MyFrame3 extends Frame implements ActionListener {

	Label x1, x2, x3;

	TextField t1, t2, t3;
	

	MenuBar mbar;

	Menu m1, m2;

	MenuItem item1, item2, item3, item4, item5, item6;

	MyFrame3() {
		setTitle("AwtDemo1");
		setSize(200, 200);
		setLayout(new FlowLayout());
		mbar = new MenuBar();
		setMenuBar(mbar);          //To set the menubar on Frame
		setBackground(Color.cyan);
		setForeground(Color.blue);
		
		m1 = new Menu("Operations");
		
		item1 = new MenuItem("Add");
		item2 = new MenuItem("Sub");
		item3 = new MenuItem("Mul");
		item4 = new MenuItem("Div");

		m1.add(item1);
		m1.add(item2);
		m1.addSeparator();
		m1.add(item3);
		m1.add(item4);

		mbar.add(m1);

		m2 = new Menu("Options");
		item5 = new MenuItem("Reset");
		item6 = new MenuItem("Exit");

		m2.add(item5);		
		m2.add(item6);

		mbar.add(m2);

		x1 = new Label("Number1");
		x2 = new Label("Number2");
		x3 = new Label("Result ");
		x3.setForeground(Color.black);
		x3.setBackground(Color.white);
		
		t1 = new TextField(10);
		t2 = new TextField(10);
		t3 = new TextField(10);
		t3.setBackground(Color.gray);
		t3.setForeground(Color.black);
		//Font f = new Font("BOLD",20,);
		Font plainFont = new Font("Serif", Font.PLAIN, 20); 
		x1.setFont(plainFont);
		t3.setFont(plainFont);
		add(x1);
		add(t1);
		add(x2);
		add(t2);
		add(x3);
		add(t3);
		//x1.setBounds(50, 50, 50, 25);
		//t1.setBounds(100, 50, 50, 25);
		item1.addActionListener(this);
		item2.addActionListener(this);
		item3.addActionListener(this);
		item4.addActionListener(this);
		item5.addActionListener(this);
		item6.addActionListener(this);
		//setResizable(false);
		
	}

	public void actionPerformed(ActionEvent ae) {
		int a, b, c;

		try {
			a = Integer.parseInt(t1.getText());
		} catch (NumberFormatException ne) {
			a = 0;
			t1.setText("0");
		}

		try {
			b = Integer.parseInt(t2.getText());
		} catch (NumberFormatException ne) {
			b = 0;
			t2.setText("0");
		}

		if (ae.getSource() == item1) {
			c = a + b;
			t3.setText(String.valueOf(c));
		}

		if (ae.getSource() == item2) {
			c = a - b;
			t3.setText(String.valueOf(c));
		}

		if (ae.getSource() == item3) {
			c = a * b;
			t3.setText(String.valueOf(c));
		}

		if (ae.getSource() == item4) {
			c = a / b;
			t3.setText(String.valueOf(c));
		}

		if (ae.getSource() == item5) {
			t1.setText("");
			t2.setText("");
			t3.setText("");
		}

		if (ae.getSource() == item6) {
			System.exit(0);

		}

	}
}




public class AwtMenuDemo1 {
	public static void main(String args[]) {

		MyFrame3 mf = new MyFrame3();
		mf.setVisible(true);
	}

}
