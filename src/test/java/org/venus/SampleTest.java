package org.venus;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.venus.base.frontend.Source;
import org.venus.testutils.Utils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SampleTest {

    static String testFilesPath = new String();

   @BeforeAll
   static void  setup(){
   }


    @Test
    void sampleTest() throws Exception{
        Source src = Utils.getSource("first.p");

        assertEquals(2,2);
    }
}
