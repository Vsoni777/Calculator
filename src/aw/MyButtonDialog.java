package aw;
import java.awt.*;
import java.awt.event.*;
public class MyButtonDialog extends Dialog implements ItemListener {
			Label l1,l2,l3;
			TextField t1,t2,t3;
			
			Checkbox b1,b2,b3,b4,b5,b6;
	public MyButtonDialog() {
		super(new Frame(),"Button demo");
		setSize(200,200);
		setLayout(new FlowLayout());
		l1=new Label("Numer1:");
		l2=new Label("Number2:");
		l3=new Label("Reset:");
		t1=new TextField(10);
		t2=new TextField(10);
		t3=new TextField(10);
		b1=new Checkbox("Add");
		b2=new Checkbox("Multi");
		b3=new Checkbox("Div");
		b4=new Checkbox("Sub");
		b5=new Checkbox("Reset");
		b6=new Checkbox("Close");
		add(l1);add(t1);add(l2);add(t2);add(l3);add(t3);add(b1);
		add(b2);add(b3);add(b4);add(b5);add(b6);
		b1.addItemListener(this);
		b2.addItemListener(this);
		b3.addItemListener(this);
		b4.addItemListener(this);
		b5.addItemListener(this);
		b6.addItemListener(this);
	}
	public static void main(String[] args) {
		MyButtonDialog a=new MyButtonDialog();
		a.setVisible(true);
		a.setLocation(200,200);
	}
	public void itemStateChanged(ItemEvent ae) {
		int a,b,c;
		try {
			a=Integer.parseInt(t1.getText());
		}catch(NumberFormatException e) {
		    a=0;
			t1.setText("0");
		   
		}
		try {
			b=Integer.parseInt(t2.getText());
		}catch(NumberFormatException e) {
			b=0;
			t2.setText("0");
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
			c=a/b;
			t3.setText(String.valueOf(c));
		}
		if(ae.getSource()==b4) {
			c=a-b;
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

