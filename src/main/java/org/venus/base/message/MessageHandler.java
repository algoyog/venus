package org.venus.base.message;

import java.util.ArrayList;

public class MessageHandler {
    private Message message;
    private ArrayList<MessageListener> alMessageListener;

    public void MessageHandler(){
        this.alMessageListener = new ArrayList<MessageListener>();
    }

    public void addListener(MessageListener messageListener){
        alMessageListener.add(messageListener);
    }

    public void removeListener(MessageListener messageListener){
        alMessageListener.remove(messageListener);
    }

    public void sendMessage(Message message){
        this.message = message;
        notifyListeners(this.message);
    }
    public void notifyListeners(Message message){
        for (MessageListener listener:alMessageListener) {
            listener.messageReceived(message);

        }
    }
}
