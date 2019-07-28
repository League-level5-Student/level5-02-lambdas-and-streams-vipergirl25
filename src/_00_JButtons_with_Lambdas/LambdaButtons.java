package _00_JButtons_with_Lambdas;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LambdaButtons implements ActionListener{
	private JFrame window = new JFrame();
	private JButton addNumbers = new JButton("ADD 2 Numbers");
	private JButton randNumber = new JButton("RANDOM NUMBER");
	private JButton tellAJoke = new JButton("TELL A JOKE");
	
	public LambdaButtons() {
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(new FlowLayout());
		window.add(addNumbers);
		window.add(randNumber);
		window.add(tellAJoke);
		
		//1. Call the addActionListener methods for each button. Use lambdas
		//   to define to functionality of the buttons.
		addNumbers.addActionListener((ActionEvent e) -> {
		String firstnumber = JOptionPane.showInputDialog("enter number ");
		String secondnumber = JOptionPane.showInputDialog("enter another number " );
		int firstInt = Integer.parseInt(firstnumber);
		int secondInt = Integer.parseInt(secondnumber);
		JOptionPane.showMessageDialog(null, firstInt + secondInt);});
		
		randNumber.addActionListener((ActionEvent e) -> {
			JOptionPane.showMessageDialog(null, new Random().nextInt(100));
		}); 
		
		tellAJoke.addActionListener((ActionEvent e) -> {
			JOptionPane.showMessageDialog(null, "hello");
		});
		
		window.setVisible(true);
		window.pack();
	}
	
	public static void main(String[] args) {
		new LambdaButtons();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}
