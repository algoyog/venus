package org.venus.frontend;

import java.io.BufferedReader;
import java.rmi.server.ExportException;

public class Source {
    public static final char EOF = '\n';
    public static final char EOL = (char) 0;
    private BufferedReader bufferedReader;
    private Token currentToken;
    private String line;
    private int lineNum;
    private int currentPos;


    public Source(BufferedReader bufferedReader) {
        this.lineNum = 0;
        this.currentPos = -2;//NEED TO THNK
        this.bufferedReader = bufferedReader;
    }

    public void readLine() throws Exception {
        line = bufferedReader.readLine();
        currentPos = -1;
        if(line!=null)
            lineNum++;
    }
    public char currentChar(){
       return line.charAt(currentPos);
    }
    public char nextChar(){
        currentPos++;
        return currentChar();
    }
}
