/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linter;

import org.junit.Test;

import java.io.File;

import static linter.App.fileScanner;
import static org.junit.Assert.*;

public class AppTest {

    @Test public void testNoErrors() {
        App file = new App();
        File newLocation = new File("src/main/resources/noErrors.js");
        System.out.println(fileScanner(newLocation));
        assertEquals("", fileScanner(newLocation));
    }

    @Test public void testOneError(){
        App file = new App();
        File newLocation = new File("src/main/resources/oneError.js");
        System.out.println(fileScanner(newLocation));
        assertEquals("Line 1 Missing semicolon\n", fileScanner(newLocation));
    }
    @Test public void testFewErrors(){
        App file = new App();
        File newLocation = new File("src/main/resources/fewErrors.js");
        System.out.println(fileScanner(newLocation));
        assertEquals("Line 1 Missing semicolon\n" +
                "Line 2 Missing semicolon\n" +
                "Line 5 Missing semicolon\n" +
                "Line 8 Missing semicolon\n", fileScanner(newLocation));
    }
    @Test public void testManyErrors(){
        App file = new App();
        File newLocation = new File("src/main/resources/manyErrors.js");
        System.out.println(fileScanner(newLocation));
        assertEquals("Line 1 Missing semicolon\n" +
                "Line 2 Missing semicolon\n" +
                "Line 5 Missing semicolon\n" +
                "Line 6 Missing semicolon\n" +
                "Line 7 Missing semicolon\n" +
                "Line 10 Missing semicolon\n" +
                "Line 11 Missing semicolon\n" +
                "Line 12 Missing semicolon\n" +
                "Line 15 Missing semicolon\n" +
                "Line 16 Missing semicolon\n" +
                "Line 17 Missing semicolon\n" +
                "Line 20 Missing semicolon\n" , fileScanner(newLocation));
    }

    @Test public void testOnEmptyFile() {
        App file = new App();
        File newLocation = new File("src/main/resources/emptyFile.js");
        System.out.println(fileScanner(newLocation));
        assertEquals("", fileScanner(newLocation));
    }

}



