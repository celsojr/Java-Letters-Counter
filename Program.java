/**
 * Java program to count the occurrences of each letter in a sentence.
 * 
 * @author Celso Jr
 * @version Imperative
 * Licence: Copy 'n paste freed! \o/
 *
 */

import java.io.*;

public class Program {
    public static void main(String[] args) throws IOException {
        System.out.println("+--------------------------------------+");
        System.out.println("|                                      |");
        System.out.println("|   SUPER HYPER LETTERS COUNTER 2017   |");
        System.out.println("|                                      |");
        System.out.println("+--------------------------------------+");
        System.out.println("Type in (or paste) any sentence:");

        int[] total = new int[26];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sentence = br.readLine().toUpperCase();

        int a = (int)'A';

        for (char c : sentence.toCharArray())
        {
            if (Character.isLetter(c))
            {
                int b = (int)c;
                total[b - a]++;
            }
        }

        for (int i = 0; i < 26; i++)
        {
            if (total[i] > 0)
            {
                System.out.printf("%c - %d\n", (char)(a + i), total[i]);
            }
        }

    }
}