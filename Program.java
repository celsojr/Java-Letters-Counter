/**
 * Java program to count the occurrences of each letter in a sentence.
 * 
 * @author Celso Jr
 * @version Functional
 * Licence: Copy 'n paste freed! \o/
 *
 */

import java.util.*;

public class Program {
    public static void main(String[] args) {

        Services services = new Services();
        
        List<Runnable> tasks = new ArrayList<>();
        tasks.add(() -> services.init());
        tasks.add(() -> services.read());
        tasks.add(() -> services.count());
        tasks.add(() -> services.printResults());
        
        execute(tasks);
    }

    public static void execute(List<Runnable> tasks) {
        tasks.forEach(Runnable::run);
    }

}