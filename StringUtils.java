/**
 * Java program to count the occurrences of each letter in a sentence.
 * 
 * @author Celso Jr
 * @version Functional
 * Licence: Copy 'n paste freed! \o/
 *
 */

import java.util.regex.*;
import java.text.Normalizer;

public class StringUtils
{
    public static long countMatches(String sentence, String letter)
    {
        Pattern pat = Pattern.compile(letter);
        Matcher matcher = pat.matcher(sentence);

        long count = 0;
        while (matcher.find())
            count++;

        return count;
    }

    public static String prepare(String sentence) {
        return Normalizer.normalize(sentence, Normalizer.Form.NFD)
            .replaceAll("[^\\p{ASCII}]", "").toUpperCase().replaceAll("[^A-Z]", "");
    }
}