package aw;
import java.awt.*;
import java.awt.event.*;
public class MyListBox extends Frame implements ActionListener  {
	List os,browser;
	TextArea result;
	Button b1;
	MyListBox(){
		super("List BoxDemo");
		setSize(400,320);
		setResizable(false);
		setLayout(new FlowLayout());
		os=new List(4);
		browser=new List(4,true);
		result=new TextArea(10,50);
		b1=new Button("close");
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
		os.addActionListener(this);
		browser.addActionListener(this);
		b1.addActionListener(this);
	}
	public static void main(String[] args) {
	 MyListBox dlg=new MyListBox();
	 dlg.setVisible(true);
	 dlg.setLocation(200,200);

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("inside Actionperformance");
		String x=os.getSelectedItem();
		String y[]=browser.getSelectedItems();
		String z="Selected os="+x;
		z=z+"\n Selected browser=";
		for(int i=0;i<y.length;i++) 
			z=z+","+y[i];
		
		result.setText(z);
		
		if(e.getSource()==b1) {
			setVisible(false);
			dispose();
		}
	}

}
