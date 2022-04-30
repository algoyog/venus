package org.venus.base.frontend;

import org.junit.jupiter.api.Test;
import org.venus.base.frontend.Source;
import org.venus.testutils.Utils;
import static org.junit.jupiter.api.Assertions.*;

public class SourceTest {

    @Test
    void readAllChars() throws Exception{
        Source src = Utils.getSource("first.p");
        char ch = src.currentChar();
        while (ch!=Source.EOF) {
            System.out.println(ch);
            ch = src.nextChar();
        }
        assertEquals(ch,Source.EOF);
    }

}
