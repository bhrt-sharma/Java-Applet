import java.applet.Applet;
import java.awt.*;
import java.lang.*;
import java.awt.event.*; 
/* <applet code="Addition" width="300" height="300"> </applet> */
// thus class name and applet name should be same.

public class Addition extends Applet
{
Label l1,l2,l3;
TextField t1,t2;   //ye refrence variable create kar liye
Button b1;


public void init()  // we have to override init func of Applet class
{
l1=new Label("First Number");
l2=new Label("Second Number");
l3=new Label();       
t1=new TextField();  //initializing Componets
t2=new TextField();
b1=new Button("Add Numbers");


add(l1);
add(l2);          
add(l3);            //Adding Components
add(t1);
add(t2);
add(b1);


setLayout(null);     // Setting Layout

l1.setBounds(50,70,100,20);
l2.setBounds(50,120,100,20);
l3.setBounds(175,170,100,20);   //Setting Position
t1.setBounds(150,70,100,20);
t2.setBounds(150,120,100,20);
b1.setBounds(50,170,100,20);
b1.addActionListener(new MyHandler());
}

 						/*Actionlistner ek Interface hai
						 ..isliye iska object nhi ho sakta
		                   isliye hum issai Implement kar rahe hai apni ek class mai
 		         	taki hum iska ek method-- actionPerformed ko override kar sakai.*/


public class MyHandler implements ActionListener // ye inner class hai Addition Class ki
{
   
	public void actionPerformed(ActionEvent e)
	{
	int a,b,s;
	a=Integer.parseInt(t1.getText());
	b=Integer.parseInt(t2.getText());
	s=a+b;
	l3.setText("Sum is "+s); 
	}

}

}








