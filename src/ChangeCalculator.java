

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
String nickels=JOptionPane.showInputDialog("How many nickels do they have?");
		// Convert their answer to an int using Integer.parseInt()
int n=Integer.parseInt(nickels);
		// Ask the user how many dimes they have, and convert their answer
String dimes= JOptionPane.showInputDialog("How many dimes do they have?");
int d=Integer.parseInt(dimes);
		// Ask the user how many quarters they have, and convert their answer
String quarters=JOptionPane.showInputDialog("How many quarters do they have?");
int q=Integer.parseInt(quarters);
		// Calculate how much money the user has and save it idn a double variable 
double money=0.0;
money=money+n*.05;
money=money+d*.10;
money=money+q*.25;

		// Tell the user how much money they have
JOptionPane.showMessageDialog(null, "How much money do you have?");
	}
}

