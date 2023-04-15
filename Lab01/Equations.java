// Equations.java - 2.2.6

import javax.swing.JOptionPane;

public class Equations {
    public static void firstOrderEquation() {
        String strA, strB;
        String strNotification = "";

        strA = JOptionPane.showInputDialog(null, "Please input a: ", "First order equation", JOptionPane.INFORMATION_MESSAGE);
        strB = JOptionPane.showInputDialog(null, "Please input b: ", "First order equation", JOptionPane.INFORMATION_MESSAGE);

        strNotification += strA + "x + " + strB + " = 0\n";
        if (Double.parseDouble(strA) != 0) {
            double solution = -Double.parseDouble(strB) / Double.parseDouble(strA);
            strNotification += "The solution of the equation is x = " + solution;
            JOptionPane.showMessageDialog(null, strNotification, "First order equation", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "This equation has no solution!", "First order equation", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static void firstOrderSystem() {
        String strA11, strA12, strB1, strA21, strA22, strB2;
        String strNotification = "";

        strA11 = JOptionPane.showInputDialog(null, "Please input a11: ", "First order system", JOptionPane.INFORMATION_MESSAGE);
        strA12 = JOptionPane.showInputDialog(null, "Please input a12: ", "First order system", JOptionPane.INFORMATION_MESSAGE);
        strB1 = JOptionPane.showInputDialog(null, "Please input b1: ", "First order system", JOptionPane.INFORMATION_MESSAGE);
        strA21 = JOptionPane.showInputDialog(null, "Please input a21: ", "First order system", JOptionPane.INFORMATION_MESSAGE);
        strA22 = JOptionPane.showInputDialog(null, "Please input a22: ", "First order system", JOptionPane.INFORMATION_MESSAGE);
        strB2 = JOptionPane.showInputDialog(null, "Please input b2: ", "First order system", JOptionPane.INFORMATION_MESSAGE);

        strNotification += strA11 + "x1 + " + strA12 + "x2 = " + strB1 + "\n";
        strNotification += strA21 + "x1 + " + strA22 + "x2 = " + strB2 + "\n";

        double D = Double.parseDouble(strA11) * Double.parseDouble(strA22) - Double.parseDouble(strA12) * Double.parseDouble(strA21);
        double D1 = Double.parseDouble(strB1) * Double.parseDouble(strA22) - Double.parseDouble(strA12) * Double.parseDouble(strB2);
        double D2 = Double.parseDouble(strA11) * Double.parseDouble(strB2) - Double.parseDouble(strB1) * Double.parseDouble(strA21);

        if (D != 0) {
            if (Double.parseDouble(strB1) == 0 && Double.parseDouble(strB2) == 0) {
                System.out.println("The system has trivial solution!");
            } else {
                double x1 = D1 / D, x2 = D2 / D;
                strNotification += "The first component of the solution is x1 = " + x1 + "\n";
                strNotification += "The second component of the solution is x2 = " + x2;
                JOptionPane.showMessageDialog(null, strNotification, "First order system", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            if (D1 == 0 && D2 == 0) {
                strNotification += "The system has infinitely many solutions!";
                JOptionPane.showMessageDialog(null, strNotification, "First order system", JOptionPane.INFORMATION_MESSAGE);
            } else {
                strNotification += "The system has no solution!";
                JOptionPane.showMessageDialog(null, strNotification, "First order system", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    public static void secondOrderEquation() {
        String strA, strB, strC;
        String strNotification = "";

        strA = JOptionPane.showInputDialog(null, "Please input a: ", "Second order equation", JOptionPane.INFORMATION_MESSAGE);
        strB = JOptionPane.showInputDialog(null, "Please input b: ", "Second order equation", JOptionPane.INFORMATION_MESSAGE);
        strC = JOptionPane.showInputDialog(null, "Please input c: ", "Second order equation", JOptionPane.INFORMATION_MESSAGE);

        strNotification += strA + "x + " + strB + "x + " + strC + " = 0\n";
        if (Double.parseDouble(strA) != 0) {
            double delta = Math.pow(Double.parseDouble(strB), 2) - 4 * Double.parseDouble(strA) * Double.parseDouble(strC);
            if (delta > 0) {
                double solution1 = (-Double.parseDouble(strB) + Math.sqrt(delta)) / (2 * Double.parseDouble(strA));
                double solution2 = (-Double.parseDouble(strB) - Math.sqrt(delta)) / (2 * Double.parseDouble(strA));
                strNotification += "The first solution of the equation is x1 = " + solution1 + "\n";
                strNotification += "The second solution of the equation is x2 = " + solution2;
                JOptionPane.showMessageDialog(null, strNotification, "Second order equation", JOptionPane.INFORMATION_MESSAGE);
            } else if (delta == 0) {
                double solution = -Double.parseDouble(strB) / (2 * Double.parseDouble(strA));
                strNotification += "The solution of the equation is x = " + solution;
                JOptionPane.showMessageDialog(null, strNotification, "Second order equation", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "The equation has no solution!", "Second order equation", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            if (Double.parseDouble(strB) != 0) {
                double solution = -Double.parseDouble(strC) / Double.parseDouble(strB);
                strNotification += "The solution of the equation is x = " + solution;
                JOptionPane.showMessageDialog(null, strNotification, "Second order equation", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "The equation has no solution!", "Second order equation", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        firstOrderEquation();
        firstOrderSystem();
        secondOrderEquation();
    }
}
