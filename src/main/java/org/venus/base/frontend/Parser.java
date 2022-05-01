package org.venus.base.frontend;

import org.venus.base.intermediate.ICode;
import org.venus.base.intermediate.SymTab;

public abstract class Parser {
    protected ICode iCode;
    protected SymTab symTab;
    private Scanner scanner;

    public Parser(Scanner scanner) {
        this.scanner = scanner;
    }

    public abstract void parse();
    public abstract int getErrorCount();

    public Token nextToken(){
        return scanner.nextToken();
    }
    public Token currentToken(){
        return scanner.currentToken();
    }

}
