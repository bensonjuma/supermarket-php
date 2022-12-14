Project.java
package project;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Projekt {
    
    public static boolean sucheAmbigramm(ArrayList<String> wordList, String wort) {
        for (String line : wordList) {
            if (line.toLowerCase().equals(wort.toLowerCase())) {
                return true;
            }
        }
        
        return false;
    }
    
    public static ArrayList<String> einlesen(String dateiname) {
        ArrayList<String> e = new ArrayList<>();
        
        Scanner scanner;
        try {
            scanner = new Scanner(new File(dateiname));
        
            while (scanner.hasNextLine()) {
                e.add(scanner.nextLine());
            }
        
        } catch (FileNotFoundException ex) {
        }
           
        return e;
    }

    public static void main(String[] args) throws FileNotFoundException {
        /*String txt = JOptionPane.showInputDialog("Gib ein Wort ein");
        
        String newTxt = "";
        
        for (int i = txt.length() - 1; i >= 0; i--) {
            newTxt += txt.charAt(i);
        }
        
        if (newTxt.toLowerCase().equals(txt.toLowerCase())) {
            JOptionPane.showMessageDialog(null, "Das Wort ist ein Palindrom");
        } else {
            JOptionPane.showMessageDialog(null, "Das Wort ist kein Palindrom");            
        }*/
        
        
        ArrayList<String> wordList = new ArrayList<>();
     
        Scanner scanner = new Scanner(new File("wordlist.txt"));
        
        while (scanner.hasNextLine()) {
            
            String word = scanner.nextLine(); 
            String reverseWord = "";
            
            for (int i = word.length() - 1; i >= 0; i--) {
                reverseWord += word.charAt(i);
            }
            
            wordList.add(word);
            wordList.add(reverseWord);
        }
     
        ArrayList<String> eingabe = einlesen("NeuronaleNetze.txt");
        
        for (String line : eingabe) {

            String[] words = line.split("\\s+");

            for (int i = 0; i < words.length; i++) {
                words[i] = words[i].replaceAll("[^\\w]", "");
            }
            
            for (int i = 0; i < words.length; i++) {
                if (sucheAmbigramm(wordList, words[i])) {
                    System.out.println("Ambigramm gefunden: " + words[i]);
                }
            }
        }
        
        String in = JOptionPane.showInputDialog("Wort eingeben");
        
        if (sucheAmbigramm(wordList, in))
            JOptionPane.showMessageDialog(null, "Ambigramm gefunden");
        else        
            JOptionPane.showMessageDialog(null, "Kein Ambigramm gefunden");
    }
}
Raw
wordlist.txt
Aarhus
Aaron
Ababa
aback
abaft
abandon
abandoned
abandoning
abandonment
abandons
abase
abased
abasement
abasements
abases
abash
abashed
abashes
abashing
abasing
abate
abated
abatement
abatements
abater
abates
abating
Abba
abbe
abbey
abbeys
abbot
abbots
Abbott
abbreviate
abbreviated
abbreviates
abbreviating
abbreviation
abbreviations
Abby
abdomen
abdomens
abdominal
abduct
abducted
abduction
abductions
abductor
abductors
abducts
Abe
abed
Abel
Abelian
Abelson
Aberdeen
Abernathy
aberrant
aberration
aberrations
abet
abets
abetted
abetter
abetting
abeyance
abhor
abhorred
abhorrent
abhorrer
abhorring
abhors
abide
abided
abides
abiding
Abidjan
Abigail
Abilene
abilities
ability
abject
abjection
abjections
abjectly
abjectness
abjure
abjured
abjures
abjuring
ablate
ablated
ablates
ablating
ablation
ablative
ablaze
able
abler
ablest
ably
Abner
abnormal
abnormalities
abnormality
abnormally
Abo
aboard
abode
abodes
abolish
abolished
abolisher
abolishers
abolishes
abolishing
abolishment
abolishments
abolition
abolitionist
ab
