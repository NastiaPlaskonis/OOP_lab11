package ucu.edu.ua.task1;

import lombok.experimental.SuperBuilder;

@SuperBuilder
public class OnePerson {

    protected String personName;
    
    public OnePerson(String personName) {
        this.personName = personName;
    }

    @Override
    public String toString() {
        return "OnePerson{" +
                "clientName=" + personName;
    }
}