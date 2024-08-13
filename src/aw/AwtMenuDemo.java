package aw;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
class MyFrame4 extends Frame implements ActionListener{
	MenuBar mbar;
	Menu m1,m2;
	MenuItem i1,i2,i3,i4,i5,i6,i7;
	MyFrame4(){
		setTitle("Awt Demo");
		setSize(Toolkit.getDefaultToolkit().getScreenSize());
		System.out.println(Toolkit.getDefaultToolkit().getScreenSize());
		setLayout(new FlowLayout());
		mbar=new MenuBar();
		setMenuBar(mbar);
		m1=new Menu("Basic awt");
		i1=new MenuItem("Calculator");
		i2=new MenuItem("ChkBoxDemo");
		i3=new MenuItem("MyButtonDialog");
		i4=new MenuItem("ComboBoxDemo");
		i5=new MenuItem("MyLabel");
		m1.add(i1);m1.add(i2);m1.add(i3);m1.add(i4);m1.add(i5);
		mbar.add(m1);
		m2=new Menu("Advanced awt");
		i6=new MenuItem("MyListBox");
		i7=new MenuItem("SimpleInterest");
		m2.add(i6);m2.add(i7);
		mbar.add(m2);
		i1.addActionListener(this);
		i2.addActionListener(this);
		i3.addActionListener(this);
		i4.addActionListener(this);
		i5.addActionListener(this);
		i6.addActionListener(this);
		i7.addActionListener(this);	
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==i1) {
			Calculator dlg=new Calculator();
			dlg.setVisible(true);
			dlg.setLocation(200,200);
		}
		if(e.getSource()==i2) {
			ChkBoxDemo dlg=new ChkBoxDemo();
			dlg.setVisible(true);
			dlg.setLocation(200,200);
		}
		if(e.getSource()==i3) {
			MyButtonDialog a=new MyButtonDialog();
			a.setVisible(true);
			a.setLocation(200,200);
		}
		if(e.getSource()==i4) {
			ComboBoxDemo sl=new ComboBoxDemo();
			sl.setVisible(true);
			sl.setLocation(200,200);
		}
		if(e.getSource()==i5) {
			Mylabel as=new Mylabel();
			as.setVisible(true);
			as.setLocation(200,200);
		}
		if(e.getSource()==i6) {
			MyListBox dlg=new MyListBox();
			 dlg.setVisible(true);
			 dlg.setLocation(200,200);
		}
		if(e.getSource()==i7) {
			SimpleInterest si=new SimpleInterest();
			si.setVisible(true);
			si.setLocation(300,300);	
		}
	}
}
class MyWindowAdapter extends WindowAdapter{
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
}
public class AwtMenuDemo {
	public static void main(String[] args) {
		MyFrame4 mf=new MyFrame4();
		mf.addWindowListener(new MyWindowAdapter());
		mf.setVisible(true);
	}
}
