package PackTest_1;

public class MailMessage {
    private final String fieldFrom;
    private final String fieldTo;
    private final String fieldContent;

    public MailMessage(String fieldFrom, String fieldTo, String fieldMessage) {
        this.fieldFrom = fieldFrom;
        this.fieldTo = fieldTo;
        this.fieldContent = fieldMessage;
    }

    public String getFrom() {
        return fieldFrom;
    }
    public String getTo() {
        return fieldTo;
    }

    public String getContent() {
        return fieldContent;
    }

}
