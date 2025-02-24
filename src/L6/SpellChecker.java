package L6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class SpellChecker
{
    private ArrayList<String> dictionary;

    // constructor; uses try-catch syntax which we haven't discussed!
    public SpellChecker()
    {
        importDictionary();
    }

    public ArrayList<String> getDictionary()
    {
        return dictionary;
    }

    /** This uses LINEAR search to find a word in the dictionary ArrayList and also
     * prints out the number of words checked.
     *
     * Instead of returning the index the word is found, it simply returns TRUE
     * if the word is found, and FALSE otherwise.
     */
    public boolean linearSpellCheck(String word)
    {
        int numChecks = 0;

        for(int i=0; i < dictionary.size(); i++)
        {
            numChecks++;

            if (word.equals(dictionary.get(i)))
            {
                System.out.println("-- LINEAR SEARCH: Number of words checked (loops/runtime): " + numChecks);
                return true;
            }
        }
        System.out.println("LINEAR SEARCH: Number of words checked (loops/runtime): " + numChecks);
        return false;
    }

    /** This uses BINARY search to find a word in the dictionary ArrayList and also
     * prints out the number of words checked.
     *
     * Instead of returning the index the word is found, it simply returns TRUE
     * if the word is found, and FALSE otherwise.
     */
    public boolean binarySpellCheck(String word)
    {
        int lower = 0;
        int upper = dictionary.size() - 1;

        System.out.println(lower + ((upper - lower) / 2));

        while (true) {
            int idx = lower + ((upper - lower) / 2);

//            System.out.println(idx);

            if (dictionary.get(idx).compareTo(word) > 0) {
                lower = idx;
            }

            else if (dictionary.get(idx).compareTo(word) < 0) {
                upper = idx;
            }

            else {
                return true;
            }

            if (upper == lower) {
                return false;
            }
        }
    }

    public void importDictionary()
    {
        String[] tmp = null;
        try
        {
            tmp = readLines("src/L6/dictionary.txt"); //readLines method is below
        }
        catch(IOException e)
        {
            // Print out the exception that occurred
            System.out.println("Unable to access "+e.getMessage());
        }
        dictionary = new ArrayList<String>(Arrays.asList(tmp));
    }

    public static String[] readLines(String filename) throws IOException
    {
        FileReader fileReader = new FileReader(filename);

        BufferedReader bufferedReader = new BufferedReader(fileReader);
        ArrayList<String> lines = new ArrayList<String>();
        String line = null;

        while ((line = bufferedReader.readLine()) != null)
        {
            lines.add(line);
        }

        bufferedReader.close();

        return lines.toArray(new String[lines.size()]);
    }
}
