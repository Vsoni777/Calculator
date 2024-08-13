package aw;
import java.awt.*;
import java.awt.event.*;
public class MyRadioButtonDemo extends Dialog implements ItemListener,ActionListener {
	Checkbox c1,c2,c3;
	CheckboxGroup cbg;
	TextArea result;
	Label lbl;
	Button b1;
	MyRadioButtonDemo(){
		super(new Frame(),"Radio Demo");
		setSize(450,300);
		setLayout(new FlowLayout());
		cbg=new CheckboxGroup();
		lbl=new Label("Select Area of Interest:");
		c1=new Checkbox("software",cbg,false);
		c2=new Checkbox("Hardware",cbg,true);
		c3=new Checkbox("Netwroking",cbg,true);
		result=new TextArea(10,50);
		b1=new Button("Close");
		add(lbl);add(c1);add(c2);add(c3);add(result);add(b1);
		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);
		b1.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {
			System.exit(0);
		}
		
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		String s="Area of Interest";
		if(c1.getState()==true) {
			s=s+"\n software="+c1.getState();
		}
		if(c2.getState()==true) {
			s=s+"\n Hardware="+c2.getState();
		}
		if(c3.getState()==true) {
			s=s+"\n Netwroking="+c3.getState();
		}
		result.setText(s);
	}
	public static void main(String[] args) {
		MyRadioButtonDemo dlg=new MyRadioButtonDemo();
		dlg.setVisible(true);
		dlg.setLocation(200,200);
	}
}
