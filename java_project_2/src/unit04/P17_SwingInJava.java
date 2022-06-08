package Unit04;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class P17_SwingInJava {

	public static void main(String agrs[]) {
		
		SwingInJava obj=new SwingInJava();
	}
}

class SwingInJava extends JFrame{
	
	JTextField t1;
	JTextField t2;
	
	JTextArea jt1; 
	JButton b1; 
	JButton b2; 
	JButton b3; 
	
	JRadioButton r1;
	JRadioButton r2;
	
	JCheckBox c1;
	JCheckBox c2;
	
	JList list; 
	
	JComboBox jb1; 
	JLabel l1; 
	JLabel l2; 
	JLabel l3; 
	JLabel l4; 
	
	JTable jtb1; 
	
	SwingInJava(){
		
		t1=new JTextField(30); 
		t2=new JTextField(30); 
		
		b1=new JButton("Sum"); 
		b2=new JButton("Multiply"); 
		b3=new JButton("Subtract"); 
		
		r1 = new JRadioButton("MALE");
		r2 = new JRadioButton("FEMALE");
		
		c1=new JCheckBox("Dancer!");
		c2=new JCheckBox("Singer!");
		
		jt1 =new JTextArea(10,20); 		
		
		
		String week[]= {"Monday","Tuesday","Wednesday","Thrusday","Friday","Saturday","Sunday"};
		
		list=new JList(week); 
		
		jb1=new JComboBox<>(week); 
		
		String data[][]= {{"101","Amit","670000"},{"102","Jai","780000"},{"101","Sachin","700000"}};
		String column[]= {"ID","NAME","SALARY"};
		
		jtb1=new JTable(data,column); 
		
		l1=new JLabel("Result"); 
		l2=new JLabel("Gender"); 
		l3=new JLabel("Activity"); 
		l4=new JLabel("Day"); 
				
		add(t1); 
		add(t2); 
		
		add(b1);
		add(b2);
		add(b3);
		
		add(r1);
		add(r2);
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		
		add(c1);
		add(c2);
		
		add(jt1);
		
		add(jb1);
		
		add(list);
		
		add(jtb1);
		
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		
		
		ActionListener al=new ActionListener() { 
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				int a1=Integer.parseInt(t1.getText()); 
				int a2=Integer.parseInt(t2.getText()); 
				
				if(e.getSource()==b1) { 
				Integer sum=a1+a2;
				l1.setText(sum.toString()); 
				}
				
				if(e.getSource()==b2) { 
					Integer multiply=a1*a2;
					l1.setText(multiply.toString()); 
				}
				
				if(e.getSource()==b3) { 
					Integer subtract=a1-a2;
					l1.setText(subtract.toString()); 
				}
				
				if(r1.isSelected()) {
					l2.setText("is a MALE");
				}
				
				if(r2.isSelected()) {
					l2.setText("is a FEMALE");
				}
				
				if(c1.isSelected()) {
					l3.setText("is a Dancer");
				}
				
				if(c2.isSelected()) {
					l3.setText("is a Singer");
				}
				
				if(list.getSelectedIndex()!=-1) {
					String data="Day Selected:"+list.getSelectedValue();
					l4.setText(data);
				}
				
				if(jb1.getSelectedIndex()!=-1) {
					String data="Day Selected:"+jb1.getSelectedItem();
					l4.setText(data);
				}
			}
		};
		
		b1.addActionListener(al);
		b2.addActionListener(al);
		b3.addActionListener(al);
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
