// Operators.java - 2.2.5

import javax.swing.JOptionPane;

public class Operators {
    public static void main(String[] args) {
        String strNum1, strNum2;
        String strNotification = "";

        strNum1 = JOptionPane.showInputDialog(null, "Please input the first number:", "Input the first number", JOptionPane.INFORMATION_MESSAGE);
        strNum2 = JOptionPane.showInputDialog(null, "Please input the second number:", "Input the second number", JOptionPane.INFORMATION_MESSAGE);

        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);

        strNotification += "The sum of two numbers is " + (num1 + num2) + "\n";
        strNotification += "The difference of two numbers is " + (num1 - num2) + "\n";
        strNotification += "The product of two numbers is " + (num1 * num2) + "\n";
        strNotification += "The quotient of two numbers is " + (num1 / num2);

        JOptionPane.showMessageDialog(null, strNotification, "Operators between two numbers", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
