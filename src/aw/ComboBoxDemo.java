package aw;
import java.awt.*;
import java.awt.event.*;
public class ComboBoxDemo extends Dialog implements ItemListener,ActionListener{
	Choice os,browser;
	TextArea result;
	Button b1;
	ComboBoxDemo() {
		super(new Frame(),"ComboBox Demo");
		setSize(600,300);
		setLayout(new FlowLayout());
		os=new Choice();
		browser=new Choice();
		result=new TextArea(10,50);
		b1=new Button("Close");
		os.add("");
		os.add("Window 98");
		os.add("Window 2000");
		os.add("Window Xp");
		os.add("Window NT");
		os.add("Linux");
		os.add("Solaris");
		
		browser.add("Internet Explorer");
		browser.add("Netscape Navigator");
		browser.add("Mozila Fireefox");
		browser.add("Safari");
		browser.add("Lynx");
		
		add(os);
		add(browser);
		add(result);
		add(b1);
		os.addItemListener(this);
		browser.addItemListener(this);
		b1.addActionListener(this);
	}
	public static void main(String[] args) {
		ComboBoxDemo sl=new ComboBoxDemo();
		sl.setVisible(true);
		sl.setLocation(200,200);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {
			setVisible(false);
			dispose();
		}
		
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		String x=os.getSelectedItem();
		String y=browser.getSelectedItem();
		String z="Selected os="+x;
		z=z+"\nSelected browser="+y;
		result.setText(z);
	}

}
