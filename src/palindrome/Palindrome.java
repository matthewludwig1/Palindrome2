/*
  Matthew Ludwig
  20 February 2019
  This is a modified program which counts the number of palindromes in a sentence
 */

package palindrome;

/**
 *
 * @author @malud0519
 */
import javax.swing.*;

public class Palindrome {

    public static void main(String[] args) {
        String word, backwardsWord, x;
        int pos;
        char ch;
        x = "";
        //get the word from the user
        word = JOptionPane.showInputDialog(
                "Words that are the same forwards and backwards are called palindromes.\n"
                + "This program determines if a word, or sentence is a palindrome.\n\n"
                + "Enter a sentence (do not include a punctuation mark):");
         word.split(" ");
         String [] words = word.split(" "); // Splits the words in the sentence
          backwardsWord = ""; 
        //Reverses word
        // backwardsWord += words[i];
            
        for (int i = 0; i < words.length; i++) 
        {
           ch = word.charAt(i);
           if (ch != ' ') 
           {
               backwardsWord += ch;
               x += ch;
           }
                else {
                    if (backwardsWord.equalsIgnoreCase(x))
                    {
                        JOptionPane.showMessageDialog(null, "The words " + backwardsWord);
                    }
                    backwardsWord = ""; //clears
                    x = ""; 
                }   
        //Compare the words
         /* if (word.equalsIgnoreCase(backwardsWord)) {
            JOptionPane.showMessageDialog(null, word + " in reverse is " + backwardsWord
                    + ".\nIt IS a palindrome.");
        }  
        else {
            JOptionPane.showMessageDialog(null, word + " in reverse is " + backwardsWord
                    + ".\nIt IS NOT a palindrome.");
        } */
    }
}

