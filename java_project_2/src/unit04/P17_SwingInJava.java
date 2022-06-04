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
	
	JTextArea jt1; //Text area on the screen
	
	JButton b1; //creating a Button for sum
	JButton b2; //creating a Button for multiply
	JButton b3; //creating a Button for subtract
	
	JRadioButton r1;
	JRadioButton r2;
	
	JCheckBox c1;
	JCheckBox c2;
	
	JList list; //Creating a list whose whole content is visible in once on screen
	
	JComboBox jb1; //creating a box consists of data whose a single chosen data is visible in the box, content present in box can be chosen in random depend upon user choice
	
	JLabel l1; //to perform a specific task for which a button is created for sum, multiply, subtract 
	JLabel l2; //to perform a specific task for which a button is created for gender knowing
	JLabel l3; //to perform a specific task for which a button is created for Activity
	JLabel l4; //to perform a specific task for which a button is created for Day Selection
	
	JTable jtb1; //creating table for information collection
	
	SwingInJava(){
		
		t1=new JTextField(30); //refer to the input area for the screen
		t2=new JTextField(30); //refer to the input area for the screen
		
		b1=new JButton("Sum"); //Button created for calculating sum 
		b2=new JButton("Multiply"); //Button created for calculating multiply 
		b3=new JButton("Subtract"); //Button created for calculating subtract
		
		r1 = new JRadioButton("MALE");
		r2 = new JRadioButton("FEMALE");
		
		c1=new JCheckBox("Dancer!");
		c2=new JCheckBox("Singer!");
		
		jt1 =new JTextArea(10,20); // allocating area for a text box whose dimension are present in bracket		
		
		//String array to store weekdays
		String week[]= {"Monday","Tuesday","Wednesday","Thrusday","Friday","Saturday","Sunday"};
		
		list=new JList(week); //creating a list of days of a week displaying all days in once in the form of a list 
		
		jb1=new JComboBox<>(week); //creating a box consists of days displaying a single selected day in the box having movable content of days
		
		String data[][]= {{"101","Amit","670000"},{"102","Jai","780000"},{"101","Sachin","700000"}};
		String column[]= {"ID","NAME","SALARY"};
		
		jtb1=new JTable(data,column); //consisting data of above string in table form
		
		l1=new JLabel("Result"); //Storing the result for display
		l2=new JLabel("Gender"); //Storing the result for display
		l3=new JLabel("Activity"); //Storing the result for display
		l4=new JLabel("Day"); //Storing the result for display
				
		add(t1); //whenever we create a field whether it is area, button or anything it's being necessary to add it 
		add(t2); // if not added then creating that particular field have no use 
		
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
		
		
		ActionListener al=new ActionListener() { // for performing a specific task ActionListener is used
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				int a1=Integer.parseInt(t1.getText()); //taking input
				int a2=Integer.parseInt(t2.getText()); //taking input
				
				if(e.getSource()==b1) { //checking for the particular button pressed for the task asked to be performed 
				Integer sum=a1+a2;
				l1.setText(sum.toString()); //Storing result in l1 label
				}
				
				if(e.getSource()==b2) { //checking for the particular button pressed for the task asked to be performed
					Integer multiply=a1*a2;
					l1.setText(multiply.toString()); //Storing result in l1 label
				}
				
				if(e.getSource()==b3) { //checking for the particular button pressed for the task asked to be performed
					Integer subtract=a1-a2;
					l1.setText(subtract.toString()); //Storing result in l1 label
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
		/*
		 * below four steps are to be performed in every swing as they refer to the size, format, visibility and closing of the box.
		*/
		 
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
