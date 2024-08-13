package aw;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ChkBoxDemo extends Dialog implements ItemListener,ActionListener{
	Label l1;
	TextArea aera;
	Checkbox b1,b2,b3;
	Button c1;
	public ChkBoxDemo() {
		super(new Frame(),"CheckBox Demo");
		l1=new Label("Select aera of interest:");
		aera=new TextArea(10,50);
		b1=new Checkbox("Hardware");
		b2=new Checkbox("Software");
		b3=new Checkbox("Networking");
		c1=new Button("close");
		add(l1);add(b1);add(b2);add(b3);add(aera);add(c1);
		setLayout(new FlowLayout());
		setSize(450,300);
		b1.addItemListener(this);
		b2.addItemListener(this);
		b3.addItemListener(this);
		c1.addActionListener(this);
	}

	public static void main(String[] args) {
		ChkBoxDemo cl=new ChkBoxDemo();
		cl.setVisible(true);
		cl.setLocation(500,500);
	}

	

	@Override
	public void itemStateChanged(ItemEvent ie) {
		String s="Aera of interest:";
		s=s+"\nHardware:"+b1.getState();//give boolean value
		s=s+"\nSoftware:"+b2.getState();
		s=s+"\nNetworking:"+b3.getState();
		aera.setText(s);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		setVisible(false);
		dispose();
		
	}

}
