// Game Zone Exercise on Page 108

import javax.swing.JOptionPane;

public class MadLib 
{
    public static void main(String[] args) 
    {
        // Variable and constants 
        String noun1;
        String noun2;
        String adjective;
        String verb;

        // input phase
        noun1 = JOptionPane.showInputDialog(null, "Please enter a noun: ");
        noun2 = JOptionPane.showInputDialog(null, "Please enter another noun:");
        adjective = JOptionPane.showInputDialog(null, "Please enter an adjective:");
        verb = JOptionPane.showInputDialog(null, "Please enter a past-tense verb:");
        
        // output phase
        JOptionPane.showMessageDialog(null, "Thomas Shelby had a " + noun1 + "\nHis " + noun2 + " was " + adjective + " as snow\nAnd everywhere that Tommy " + verb + "\nThe " + noun1 + " was sure to go.");
    }
}
