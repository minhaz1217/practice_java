package _02_ElementaryProgramming;

import javax.swing.JOptionPane;

public class _02_ComputeAreaInWindow {
	  public static void main(String[] args) {
	    double radius;
	    double area; 
	    radius = 20;  
	    area = radius * radius * 3.14159; 
	    
	    JOptionPane.showMessageDialog(null,"Radius: " + radius + "'s area is: " + area,"Circle Area with Window",JOptionPane.INFORMATION_MESSAGE);
	    
	    System.out.println("The area for the circle of radius " +  radius + " is " + area);   
	  } 

}
