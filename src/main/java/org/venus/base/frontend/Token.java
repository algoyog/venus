package org.venus.base.frontend;

public class Token {
    protected TokenType tokenType;
    protected String text;
    protected Object value;
    protected Source source;
    protected int lineNum;
    protected int position;

    public Token(Source source){
        this.source = source;
        lineNum = source.getLineNum();
        position = source.getCurrentPos();
        extract();
    }

    private void extract() {
    }


}
