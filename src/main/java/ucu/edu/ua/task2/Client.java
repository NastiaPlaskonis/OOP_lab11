package ucu.edu.ua.task2;

import lombok.Getter;
import lombok.Setter;

enum Gender {
    FEMALE, MALE
}

@Getter
@Setter

public class Client {
    private int clientId;
    private String clientName;
    private int clientAge;
    private Gender clientSex;
    private String clientEmail;

    public static int counterClientId = 0;


    public Client(String clientName, int clientAge, Gender clientSex, String clientEmail) {
        this.clientName = clientName;
        this.clientAge = clientAge;
        this.clientSex = clientSex;
        this.clientEmail = clientEmail;

        clientId = ++ counterClientId; 
    }
}