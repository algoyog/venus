package org.venus.base.frontend;

public abstract class Token {
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

    public abstract void  extract();
    public char currentChar() throws Exception{
        return source.currentChar();
    }
    public char nextChar() throws Exception{
        return source.nextChar();
    }

}
