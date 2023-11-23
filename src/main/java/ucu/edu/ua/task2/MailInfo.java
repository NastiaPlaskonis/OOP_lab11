package ucu.edu.ua.task2;


enum LetterType {
    BIRTHDAY_GREETINGS, GIFT_LETTER,
   
}


class MailInfo {
    private Client client;
    private LetterType letterTypes;

    public MailInfo(Client client, LetterType letterTypes) {
        this.client = client;
        this.letterTypes = letterTypes;
    }

    @Override
    public String toString() {
        return "MailInfo{" +
                "client=" + client +
                ", letterTypes=" + letterTypes +
                '}';
    }
}
