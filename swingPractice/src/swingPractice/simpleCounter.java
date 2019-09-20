package swingPractice;

import java.awt.*;
import java.awt.event.*;

public class simpleCounter extends Frame implements ActionListener
{
	   private Label lblInput;     // Declare input Label
	   private Label lblOutput;    // Declare output Label
	   private Label lblDivider;	//Declare visual divider between labels
	   private TextField tfInput;  // Declare input TextField
	   private TextField tfOutput; // Declare output TextField
	   private int sum = 0;        // Accumulated sum, init to 0
	   private int i = 0;         // Counter
	   private Button one;
	   private Button two;
	   private Button three;
	   private Button four;
	   private Button five;
	   private Button six;
	   
	simpleCounter()
	{
	lblInput = new Label("Input Two Numbers: ");
	add(lblInput);
	tfInput = new TextField(10);
	add(tfInput);
	
	tfInput.addActionListener(this);
	
	tfOutput = new TextField(12);
	lblDivider = new Label("The Sum is :");
	add(lblDivider);
	add(tfOutput);
	setLayout(new FlowLayout());
	setTitle("Add Em' Up");
	setSize(300, 200);
	setVisible(true);
	}

	public static void main(String[] args) 
	{
		new simpleCounter();

	}
	   @Override
	   public void actionPerformed(ActionEvent evt) {
	      // Get the String entered into the TextField tfInput, convert to int
		 while (i <= 1)
		   {
			 tfOutput.setText(" ");
		   	int numberIn = Integer.parseInt(tfInput.getText());
		      sum += numberIn;
		      tfInput.setText("");  // Clear input TextField
		      i++;
		     
		   }

			 tfOutput.setText(sum + " ");
			 sum = 0;
			 i = 0;
			 tfInput.setText("");  // Clear input TextField
	   }

}
