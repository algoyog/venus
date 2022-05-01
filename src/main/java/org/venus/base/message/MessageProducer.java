package org.venus.base.message;

public interface MessageProducer {
    public void addMessageListener();
    public void removeMessageListener();
    public void sendMessage(Message message);
}
