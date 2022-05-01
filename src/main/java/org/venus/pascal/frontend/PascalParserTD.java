package org.venus.pascal.frontend;

import org.venus.base.frontend.Parser;
import org.venus.base.frontend.Scanner;

public class PascalParserTD extends Parser {

    public PascalParserTD(Scanner scanner) {
        super(scanner);
    }

    @Override
    public void parse() {

    }

    @Override
    public int getErrorCount() {
        return 0;
    }
}
