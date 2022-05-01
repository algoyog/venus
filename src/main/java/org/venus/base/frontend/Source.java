package org.venus.base.frontend;

import java.io.BufferedReader;

public class Source {
    public static final char EOF = '\n';
    public static final char EOL = (char) 0;
    private final BufferedReader bufferedReader;
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
        if (line != null)
            lineNum++;
    }

    public char currentChar() throws Exception {
        if (currentPos == -2) {
            readLine();
            return nextChar();
        } else if (line == null) {
            return EOF;
        } else if (currentPos == line.length()) {
            return EOL;
        } else if (currentPos > line.length()) {
            readLine();
            return nextChar();
        } else {
            return line.charAt(currentPos);
        }
    }

    public char nextChar() throws Exception {
        currentPos++;
        return currentChar();
    }

    public void close() throws Exception{
        if(bufferedReader!=null) {
            bufferedReader.close();
        }
    }

    public int getLineNum() {
        return lineNum;
    }

    public int getCurrentPos() {
        return currentPos;
    }
}
