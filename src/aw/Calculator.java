package aw;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends Frame implements ActionListener {
	Label l1,l2,l3;
	TextField t1,t2,t3;
	Button b1,b2,b3,b4,b5,b6;
	public Calculator() {
		l1=new Label("Number1");
		l2=new Label("Number2");
		l3=new Label("Result");
		t1=new TextField(10);
		t2=new TextField(10);
		t3=new TextField(10);
		b1=new Button("Add");
		b2=new Button("Multi");
		b3=new Button("Sub");
		b4=new Button("Div");
		b5=new Button("Reset");
		b6=new Button("close");
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(t3);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		setSize(180,300);
		setTitle("Calculator");
		setLayout(new FlowLayout());
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
	}

	public static void main(String[] args) {
		Calculator clc=new Calculator();
		clc.setVisible(true);
		clc.setLocation(300,300);
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		System.out.println("Inside Perfromed");
		int a=0,b=0,c=0;
		try {
			a=Integer.parseInt(t1.getText());
		}catch(NumberFormatException e) {
			t1.setText("Invalid");
		}
		try {
			b=Integer.parseInt(t2.getText());
		}catch(NumberFormatException e) {
			t2.setText("Invalid");
		}
		if(ae.getSource()==b1) {
			c=a+b;
			t3.setText(String.valueOf(c));
		}
		if(ae.getSource()==b2) {
			c=a*b;
			t3.setText(String.valueOf(c));
		}
		if(ae.getSource()==b3) {
			c=a-b;
			t3.setText(String.valueOf(c));
		}
		if(ae.getSource()==b4) {
			c=a/b;
			t3.setText(String.valueOf(c));
		}
		if(ae.getSource()==b5) {
			t1.setText("");
			t2.setText("");
			t3.setText("");
		}
		if(ae.getSource()==b6) {
			System.exit(0);
		}
	}

}
