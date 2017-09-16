package test2;

import java.util.Scanner;

/**
 * Created by zncu on 2017-03-16.
 */
public class changeString {
    public static void main(String[] args) {

        Scanner keyin = new Scanner(System.in);
        System.out.print("Enter some words: ");
        String word = keyin.nextLine();
        String nWord = "";
        int count = 0;


//        for (int i = 0; i < word.length(); i++) {
//            char ch = word.charAt(i);
//
//            switch (ch) {
//
//                case 'a':
//                case 'e':
//                case 'i':
//                case 'o':
//                case 'u':
//                    count++;
//
//                    nWord += word.substring(0, i) + count;
//                    word = word.substring(i + 1);
//            }
//        }
//                    System.out.println(nWord);
        for (int i = 0; i < word.length(); i++) {
            char c1 = word.charAt(i);
            if(c1 == 'a' || c1 == 'e' || c1 == 'i' || c1 == 'o' || c1 == 'u'){
                count++;
                nWord += count;

            }
            else {
                nWord += word.substring(i, i+1);
            }
        }
        System.out.println(nWord);

    }
}