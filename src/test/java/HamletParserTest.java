import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.*;

public class HamletParserTest {
    private String hamletText;
    private HamletParser hamletParser;

    @Before
    public void setUp() {
        this.hamletParser = new HamletParser();
        this.hamletText = hamletParser.getHamletData();
    }

    @Test
    public void testChangeHamletToLeon() {
        Pattern pattern = Pattern.compile("Hamlet", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(hamletText);
        String expected =matcher.replaceAll("Leon");
        String actual = hamletParser.changeHamletToLeon();

    }

    @Test
    public void testChangeHoratioToTariq() {
        Pattern pattern = Pattern.compile("Horatio", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(hamletText);
        String expected =matcher.replaceAll("Tariq");
        String actual = hamletParser.changeHoratioToTariq();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFindHoratio() {
        Pattern pattern = Pattern.compile("Horatio", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(hamletText);
        for (int i = 0; matcher.find(); i++) {
            System.out.println(new StringBuilder()
                    .append("\n-------------------")
                    .append("\nValue = " + matcher.group())
                    .append("\nMatch Number = " + i)
                    .append("\nStarting index = " + matcher.start())
                    .append("\nEnding index = " + matcher.end())
                    .toString());
        }

        String actual = hamletParser.changeHamletToLeon();

    }

    @Test
    public void testFindHamlet() {
        Pattern pattern = Pattern.compile("Hamlet", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(hamletText);
        for (int i = 0; matcher.find(); i++) {
            System.out.println(new StringBuilder()
                    .append("\n-------------------")
                    .append("\nValue = " + matcher.group())
                    .append("\nMatch Number = " + i)
                    .append("\nStarting index = " + matcher.start())
                    .append("\nEnding index = " + matcher.end())
                    .toString());
        }
    }
}