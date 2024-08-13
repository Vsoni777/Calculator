package aw;
import java.awt.*;
import java.awt.event.*;
public class Mylabel extends Frame implements ActionListener  {
	Label x1,x2;
	TextField v;
	TextArea c;
	Button b;
	public Mylabel() {
		x1=new Label("numo");
		x2=new Label("Memo");
		v=new TextField(10);
		c=new TextArea(10,50);
		b=new Button("Close");
		setTitle("Demo");
		setSize(250,200);
		setLayout(new FlowLayout());
		add(x1);add(x2);add(v);
		add(c);
		add(b);
		b.addActionListener(this);
		}

	

	public static void main(String[] args) {
		Mylabel as=new Mylabel();
		as.setVisible(true);
		as.setLocation(200,200);

	}



	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b) {
			System.exit(0);
		}
		
	}

}
