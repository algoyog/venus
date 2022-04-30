package org.venus.testutils;

import org.venus.frontend.Source;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Utils {
    public static Source getSource(String filename) throws FileNotFoundException {
        String path = "src/test/resources";
        File file = new File(path);
        String testFilesPath = file.getAbsolutePath();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(testFilesPath+"/first.p"));
        Source src = new Source(bufferedReader);
        return src;
    }
}
