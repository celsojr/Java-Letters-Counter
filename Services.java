/**
 * Java program to count the occurrences of each letter in a sentence.
 * 
 * @author Celso Jr
 * @version Functional
 * Licence: Copy 'n paste freed! \o/
 *
 */

import java.util.Map;
import java.io.Console;
import java.util.HashMap;

public class Services implements IServices {
    
    private static String userInput;
    private static Map<String, Long> items;

    public Services() {
    }

    @Override
    public void init() {
        System.out.println("+--------------------------------------+");
        System.out.println("|                                      |");
        System.out.println("|   SUPER HYPER LETTERS COUNTER 2017   |");
        System.out.println("|                                      |");
        System.out.println("+--------------------------------------+");
    }

    @Override
    public void read() {
        Console console = System.console();
        if (console != null) {
            userInput = console.readLine("Type in (or paste) any sentence:\n");
        } else {
            System.out.println("Oh no... We don't have a Console here to play with :(");
            System.exit(1);
        }
    }

    @Override
    public void count() {
        items = new HashMap<>();
        String text = StringUtils.prepare(userInput);

        text.chars()
            .mapToObj(o -> (char)o)
            .map(String::valueOf)
            .forEach(letter -> {
                long total = StringUtils.countMatches(text, letter);
                items.put(letter, total);
            });
    }

    @Override
    public void printResults() {
        items.forEach((k,v) -> print(k,v));
    }

    public static void print(String letter, Long total) {
        System.out.printf("%s - %d\n", letter, total);
    }

}