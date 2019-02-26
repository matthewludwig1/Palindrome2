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
        String word, backwardsWord;
        int pos;      
        //get the word from the user
        word = JOptionPane.showInputDialog(
                "Words that are the same forwards and backwards are called palindromes.\n"
                + "This program determines if a word, or sentence is a palindrome.\n\n"
                + "Enter a sentence (do not include a punctuation mark):");
        word.split(" ");
        String [] words = word.split(" "); // Splits the words in the sentence
        int num = 0;
        //Reverses word 
        for (int i = 0; i < words.length; i++) 
        {
            backwardsWord = ""; 
            for (pos = words[i].length() - 1; pos >= 0; pos--) {
                backwardsWord += words[i].charAt(pos); //reverses word
            }
            if (words[i].equalsIgnoreCase(backwardsWord)) {
               num ++;
            }
        }    
         JOptionPane.showMessageDialog(null, "There are " + num + " palindromes in this sentence" );
    }
}
