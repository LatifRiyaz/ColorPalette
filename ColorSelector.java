import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ColorSelector implements ActionListener{

	JFrame frame;
	JTextField textfield;
	JButton[] functionButtons = new JButton[26];
	JButton b1, b2, b3, b4, b5;	
	JButton b6, b7, b8, b9, b10;
	JButton b11, b12, b13, b14, b15;
	JButton b16, b17, b18, b19, b20;
	JButton b21, b22, b23, b24, b25;
	JButton clrButton;
	JPanel p1;
	JRadioButton fg;
	JRadioButton bg;
	
	Font myFont = new Font("Arial",Font.BOLD,23);

	ColorSelector(){
	
		frame = new JFrame("Color Applier");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400,550);
		frame.setLayout(null);

		textfield = new JTextField();
		textfield.setBounds(50,25,300,50);
		textfield.setFont(myFont);
		textfield.setEditable(true);

		b1 = new JButton();
		b2 = new JButton();
		b3 = new JButton();	
		b4 = new JButton();		
		b5 = new JButton();
		b6 = new JButton();
		b7 = new JButton();
		b8 = new JButton();
		b9 = new JButton();
		b10 = new JButton();
		b11 = new JButton();
		b12 = new JButton();
		b13 = new JButton();
		b14 = new JButton();
		b15 = new JButton();
		b16 = new JButton();
		b17 = new JButton();
		b18 = new JButton();
		b19 = new JButton();
		b20 = new JButton();
		b21 = new JButton();
		b22 = new JButton();
		b23 = new JButton();
		b24 = new JButton();
		b25 = new JButton();
		clrButton = new JButton("Clear");		

 		fg = new JRadioButton("Foreground");
		bg = new JRadioButton("Background");
		fg.setBounds(50,430,100,50);
		bg.setBounds(150,430,100,50);

		ButtonGroup group = new ButtonGroup();
		group.add(fg);
		group.add(bg);
		fg.addActionListener(this);		
		bg.addActionListener(this);

		frame.add(fg);
		frame.add(bg);
		frame.setLayout(null);
		frame.setVisible(true);

		functionButtons[0] = b1;
		functionButtons[1] = b2;
		functionButtons[2] = b3;
		functionButtons[3] = b4;
		functionButtons[4] = b5;
		functionButtons[5] = b6;
		functionButtons[6] = b7;
		functionButtons[7] = b8;
		functionButtons[8] = b9;
		functionButtons[9] = b10;
		functionButtons[10] = b11;
		functionButtons[11] = b12;
		functionButtons[12] = b13;
		functionButtons[13] = b14;
		functionButtons[14] = b15;
		functionButtons[15] = b16;
		functionButtons[16] = b17;
		functionButtons[17] = b18;
		functionButtons[18] = b19;
		functionButtons[19] = b20;
		functionButtons[20] = b21;
		functionButtons[21] = b22;
		functionButtons[22] = b23;
		functionButtons[23] = b24;
		functionButtons[24] = b25;
		functionButtons[25] = clrButton;	


		for(int i=0; i<26; i++){

			functionButtons[i].addActionListener(this);
			functionButtons[i].setFont(myFont);
			functionButtons[i].setFocusable(true);

		}

		clrButton.setBounds(250,430,100,50);

		p1 = new JPanel();
		p1.setBounds(50,100,300,300);
		p1.setLayout(new GridLayout(5,5));
		p1.setBackground(Color.WHITE);

		p1.add(b1);
		b1.setBackground(Color.GRAY);

		p1.add(b2);
		b2.setBackground(Color.PINK);

		p1.add(b3);
		b3.setBackground(Color.BLUE);

		p1.add(b4);
		b4.setBackground(Color.MAGENTA);

		p1.add(b5);
		b5.setBackground(Color.ORANGE);

		p1.add(b6);
		b6.setBackground(Color.YELLOW);

		p1.add(b7);
		b7.setBackground(Color.CYAN);

		p1.add(b8);
		b8.setBackground(Color.GREEN);

		p1.add(b9);
		b9.setBackground(Color.RED);

		p1.add(b10);
		b10.setBackground(Color.DARK_GRAY);

		p1.add(b11);
		b11.setBackground(Color.MAGENTA);

		p1.add(b12);
		b12.setBackground(Color.BLUE);

		p1.add(b13);
		b13.setBackground(Color.ORANGE);

		p1.add(b14);
		b14.setBackground(Color.PINK);

		p1.add(b15);
		b15.setBackground(Color.LIGHT_GRAY);

		p1.add(b16);
		b16.setBackground(Color.CYAN);

		p1.add(b17);
		b17.setBackground(Color.RED);

		p1.add(b18);
		b18.setBackground(Color.YELLOW);

		p1.add(b19);
		b19.setBackground(Color.GREEN);

		p1.add(b20);
		b20.setBackground(Color.MAGENTA);

		p1.add(b21);
		b21.setBackground(Color.PINK);

		p1.add(b22);
		b22.setBackground(Color.BLUE);

		p1.add(b23);
		b23.setBackground(Color.ORANGE);

		p1.add(b24);
		b24.setBackground(Color.GRAY);

		p1.add(b25);		
		b25.setBackground(Color.RED);

		frame.add(p1);
		frame.add(clrButton);
		frame.add(textfield);
		frame.setVisible(true);

	}

	public static void main(String args[]){

		ColorSelector cs = new ColorSelector();		

	}


	public void actionPerformed(ActionEvent e){
						
		if(bg.isSelected()){					
		
			if(e.getSource() == b1){			
			
				textfield.setBackground(Color.GRAY);

			} 
			
			if(e.getSource() == b2){
			
				textfield.setBackground(Color.PINK);

			} 		

			if(e.getSource() == b3){
		
				textfield.setBackground(Color.BLUE);

			} 
		
			if(e.getSource() == b4){
		
				textfield.setBackground(Color.MAGENTA);

			} 	

			if(e.getSource() == b5){
		
				textfield.setBackground(Color.ORANGE);

			} 
		
			if(e.getSource() == b6){
		
				textfield.setBackground(Color.YELLOW);

			} 		

			if(e.getSource() == b7){
		
				textfield.setBackground(Color.CYAN);

			} 
		
			if(e.getSource() == b8){
		
				textfield.setBackground(Color.GREEN);

			} 

			if(e.getSource() == b9){
		
				textfield.setBackground(Color.RED);
	
			} 
		
			if(e.getSource() == b10){
			
				textfield.setBackground(Color.DARK_GRAY);

			} 		
	
			if(e.getSource() == b11){
		
				textfield.setBackground(Color.MAGENTA);

			} 
		
			if(e.getSource() == b12){
		
				textfield.setBackground(Color.BLUE);

			} 	

			if(e.getSource() == b13){
		
				textfield.setBackground(Color.ORANGE);

			} 
		
			if(e.getSource() == b14){
		
				textfield.setBackground(Color.PINK);

			} 		

			if(e.getSource() == b15){
			
				textfield.setBackground(Color.LIGHT_GRAY);

			} 
		
			if(e.getSource() == b16){
			
				textfield.setBackground(Color.CYAN);

			} 

			if(e.getSource() == b17){
		
				textfield.setBackground(Color.RED);

			} 
		
			if(e.getSource() == b18){
		
				textfield.setBackground(Color.YELLOW);

			} 

			if(e.getSource() == b19){
		
				textfield.setBackground(Color.GREEN);

			} 
		
			if(e.getSource() == b20){
	
				textfield.setBackground(Color.MAGENTA);

			} 		

			if(e.getSource() == b21){
		
				textfield.setBackground(Color.PINK);

			} 
		
			if(e.getSource() == b22){
		
				textfield.setBackground(Color.BLUE);

			} 	

			if(e.getSource() == b23){
		
				textfield.setBackground(Color.ORANGE);

			} 
		
			if(e.getSource() == b24){
		
				textfield.setBackground(Color.GRAY);

			} 		

			if(e.getSource() == b25){
		
				textfield.setBackground(Color.RED);

			} 	
		
			if(e.getSource() == clrButton){

		                textfield.setText("");
				textfield.setBackground(Color.WHITE);
				

	                }

		}		
	

                else{

			if(fg.isSelected()){					
		
				if(e.getSource() == b1){			
				
					textfield.setForeground(Color.GRAY);

				} 
		
				if(e.getSource() == b2){
			
					textfield.setForeground(Color.PINK);

				} 		

				if(e.getSource() == b3){
		
					textfield.setForeground(Color.BLUE);

				} 
		
				if(e.getSource() == b4){
		
					textfield.setForeground(Color.MAGENTA);

				} 	

				if(e.getSource() == b5){
		
					textfield.setForeground(Color.ORANGE);

				} 
		
				if(e.getSource() == b6){
		
					textfield.setForeground(Color.YELLOW);

				} 		

				if(e.getSource() == b7){
		
					textfield.setForeground(Color.CYAN);
		
				}	 
			
				if(e.getSource() == b8){
		
					textfield.setForeground(Color.GREEN);

				} 

				if(e.getSource() == b9){
		
					textfield.setForeground(Color.RED);

				} 
		
				if(e.getSource() == b10){
		
					textfield.setForeground(Color.DARK_GRAY);

				} 		

				if(e.getSource() == b11){
		
					textfield.setForeground(Color.MAGENTA);

				} 
		
				if(e.getSource() == b12){
		
					textfield.setForeground(Color.BLUE);

				} 	

				if(e.getSource() == b13){
		
					textfield.setForeground(Color.ORANGE);

				} 
		
				if(e.getSource() == b14){
		
					textfield.setForeground(Color.PINK);

				} 		

				if(e.getSource() == b15){
				
					textfield.setForeground(Color.LIGHT_GRAY);

				} 
		
				if(e.getSource() == b16){
		
					textfield.setForeground(Color.CYAN);

				} 

				if(e.getSource() == b17){
		
					textfield.setForeground(Color.RED);

				} 
		
				if(e.getSource() == b18){
		
					textfield.setForeground(Color.YELLOW);

				} 

				if(e.getSource() == b19){
		
					textfield.setForeground(Color.GREEN);

				} 
		
				if(e.getSource() == b20){
	
					textfield.setForeground(Color.MAGENTA);

				} 		

				if(e.getSource() == b21){
		
					textfield.setForeground(Color.PINK);
	
				} 
		
				if(e.getSource() == b22){
		
					textfield.setForeground(Color.BLUE);

				} 	

				if(e.getSource() == b23){
		
					textfield.setForeground(Color.ORANGE);

				} 
		
				if(e.getSource() == b24){
		
					textfield.setForeground(Color.GRAY);

				} 		

				if(e.getSource() == b25){
		
					textfield.setForeground(Color.RED);

				} 	
		
				if(e.getSource() == clrButton){

			                textfield.setText("");
					textfield.setBackground(Color.WHITE);
				

		                }
				
			
			}


		}	

	
	}		


}