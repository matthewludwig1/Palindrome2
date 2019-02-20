/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package palindrome;

/**
 *
 * @author rkaune
 */
import javax.swing.*;

public class Palindrome {

    public static void main(String[] args) {
        String word, backwardsWord;
        int pos;
        

        //get the word from the user
        word = JOptionPane.showInputDialog(
                "Words that are the same forwards and backwards are called palindromes.\n"
                + "This program determines if a words is a palindrome.\n\n"
                + "Enter a sentence (do not include a punctuation mark):");
        word.split(" ");
        String [] words = word.split(" "); // Splits the words in the sentence
        
        //Reverses word
     for (int i = 0; i < words.length; i++) {
          backwardsWord = ""; 
         for (pos = word.length() - 1; pos >= 0; pos--) {
          backwardsWord += words[i];
         // if
        }
     }
        
        //Compare the words
          if (word.equalsIgnoreCase(backwardsWord)) {
            JOptionPane.showMessageDialog(null, word + " in reverse is " + backwardsWord
                    + ".\nIt IS a palindrome.");
        } else {
            JOptionPane.showMessageDialog(null, word + " in reverse is " + backwardsWord
                    + ".\nIt IS NOT a palindrome.");
        }
    }
}
