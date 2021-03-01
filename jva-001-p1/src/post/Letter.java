package post;

public class Letter {
    private String text;
    private boolean isSent = false;
    private Human sender;
    private Human receiver;
    public Letter() {

    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isSent() {
        return isSent;
    }

    public void setSent(boolean sent) {
        isSent = sent;
    }


    public Human getSender() {
        return sender;
    }

    public void setSender(Human sender) {
        this.sender = sender;
    }

    public Human getReceiver() {
        return receiver;
    }

    public void setReceiver(Human receiver) {
        this.receiver = receiver;
    }

    @Override
    public String toString() {
        return "Letter{ from: " + sender.getName() + " to: " + receiver.getName() +
                " text: " + text + " }";
    }
}
