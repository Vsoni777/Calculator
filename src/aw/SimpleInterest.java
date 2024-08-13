package aw;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.Exception;
public class SimpleInterest extends Frame implements ActionListener{
	Label l1,l2,l3,l4;
	TextField t1,t2,t3,t4;
	Button b1,b2,b3;
	SimpleInterest(){
		l1=new Label("Principle");
		l2=new Label("Rate");
		l3=new Label("Time");
		l4=new Label("Simple Interest");
		t1=new TextField(10);
		t2=new TextField(10);
		t3=new TextField(10);
		t4=new TextField(10);
		b1=new Button("calculate");
		b2=new Button("Reset");
		b3=new Button("close");
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(t3);
		add(l4);
		add(t4);
		add(b1);
		add(b2);
		add(b3);
		setSize(200,220);
		setTitle("SimpleInterest");
		setLayout(new FlowLayout());
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
	}
	public static void main(String[] args) {
		SimpleInterest si=new SimpleInterest();
		si.setVisible(true);
		si.setLocation(300,300);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Inside ActionPerfromed");
		int p=0,t=0;
		float r=0.0f;
		double si=0;
		try {
			p=Integer.parseInt(t1.getText());
		}catch(NumberFormatException ae) {
			t1.setText("Invalid");
		}
		try {
			r=Float.parseFloat(t2.getText());
		}catch(NumberFormatException ae) {
			t2.setText("Invalid");
		}
		try {
			t=Integer.parseInt(t3.getText());
		}catch(NumberFormatException ae) {
			t3.setText("Invalid");
		}
		if(e.getSource()==b1) {
			si=(p*r*t)/100;
			t4.setText(String.valueOf(si));
		}
		if(e.getSource()==b2) {
			t1.setText("");
			t2.setText("");
			t3.setText("");
			t4.setText("");
		}
		if(e.getSource()==b3) {
			System.exit(0);
		}
	}

}
