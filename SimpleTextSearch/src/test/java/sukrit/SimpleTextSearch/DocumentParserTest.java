package sukrit.SimpleTextSearch;

import com.sukrit.SimpleTextSearch.Document;
import com.sukrit.SimpleTextSearch.engine.DocumentParser;
import com.sukrit.SimpleTextSearch.engine.ParsedDocument;

import org.junit.Test;

/**
 * Created by sukrit
 */
public class DocumentParserTest {

    @Test
    public void testParseHtml() {
        String raw = "Body=\"<p><img src=\"http://i.stack.imgur.com/M64qK.png\" alt=\"animal king takeover\"></p>\n" +
                "\n" +
                "<p>In this image we see six flags behind the animal king.\n" +
                "I think I recognize some of them:\n" +
                "First - Argentina;\n" +
                "Third - Bulgaria;\n" +
                "Fifth - Sweden;\n" +
                "Sixth - Austria;</p>\n" +
                "\n" +
                "<p>Am I correct, and which countries' flags are the second and fourth?</p>\n" +
                "\"";

        DocumentParser parser = new DocumentParser(true, true);

        ParsedDocument pd = parser.parseDocument(new Document(raw, 1));

        boolean foundPunctuation = false;
        for (String term : pd.getUniqueWords()) {
            if (term.equals(";")) {
                foundPunctuation = true;
                break;
            }
        }

        assert (foundPunctuation == false);
    }


}
