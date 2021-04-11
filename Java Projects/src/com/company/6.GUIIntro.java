package com.company;
import javax.swing.JOptionPane;

class GUIIntro {
    public static void main(String[] args){
        // Graphical User Interface

        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Hello " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null, "Your age is" + age);

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your Height"));
        JOptionPane.showMessageDialog(null, "Your Height is" + height);
    }
}
