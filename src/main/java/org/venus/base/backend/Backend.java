package org.venus.base.backend;

import org.venus.base.intermediate.ICode;
import org.venus.base.intermediate.SymTab;
import org.venus.base.message.MessageHandler;
import org.venus.base.message.MessageProducer;

public abstract class Backend implements MessageProducer {
    protected SymTab symTab;
    protected ICode iCode;
    protected static MessageHandler messageHandler;
    static {
        messageHandler = new MessageHandler();
    }

    public abstract void process(ICode iCode,SymTab symTab) throws Exception;
}
