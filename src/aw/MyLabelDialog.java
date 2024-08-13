package aw;
import java.awt.*;
import java.awt.event.*;
public class MyLabelDialog extends Dialog implements ActionListener {
	Label x1,x2,x3;
	Button b1;
	public MyLabelDialog() {
		super(new Frame(),"Label Demo");
		setSize(350,200);
		setLayout(new FlowLayout());
		x1=new Label("Numer1");
		x2=new Label("Numer2");
		x3=new Label("result");
		b1=new Button("close");
		add(x1);add(x2);add(x3);add(b1);
		b1.addActionListener(this);
	}

	public static void main(String[] args) {
		MyLabelDialog vl=new MyLabelDialog();
		vl.setVisible(true);
		vl.setLocation(200,200);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {
			System.exit(0);
		}
		
	}

}
