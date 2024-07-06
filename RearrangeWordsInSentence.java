package dsa.practice.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class RearrangeWordsInSentence {
    public static void main(String[] args) {
        String text = "Leetcode is cool";
        String[] temp = text.split(" ");
        List<String> output = new ArrayList<>(Arrays.asList(temp));
        
//        for (int i = 0; i < temp.length; i++) {
//            int len = temp[i].length();
//            int j = 0;
//            // Find the correct position to insert the word
//            while (j < output.size() && output.get(j).length() <= len) {
//                j++;
//            }
//            output.add(j, temp[i]);
//        }
//        
//        // Convert the first word to start with a capital letter
//        String firstWord = output.get(0);
//        firstWord = firstWord.substring(0, 1).toUpperCase() + firstWord.substring(1).toLowerCase();
//        output.set(0, firstWord);
//        
//        // Convert the rest of the words to lowercase
//        for (int i = 1; i < output.size(); i++) {
//            output.set(i, output.get(i).toLowerCase());
//        }
//        
        Comparator<String> cc = (o1,o2)->Integer.compare(o1.length(), o2.length());
        Collections.sort(output,cc);
        String res = String.join(" ", output);
        
        System.out.println(res);
    }
}
