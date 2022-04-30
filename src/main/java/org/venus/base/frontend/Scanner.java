package org.venus.base.frontend;

public abstract class Scanner {
    protected Source source;
    private Token currentToken;

    public Scanner(Source source){
        this.source = source;
    }

    public Token currentToken() {
        return currentToken;
    }
    public Token nextToken(){
        currentToken= extractToken();
        return currentToken;
    }

    public abstract Token extractToken();

    public char currentChar() throws Exception{
        return  source.currentChar();
    }

    public char nextChar() throws Exception{
        return source.nextChar();
    }

}
