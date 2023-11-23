package ucu.edu.ua.task1;

import lombok.experimental.SuperBuilder;

import lombok.Getter;
import lombok.ToString;
import lombok.Singular;


import java.util.List;

enum Gender {
    FEMALE, MALE
}

@SuperBuilder
@ToString
@Getter

public class User extends OnePerson {

    private String name;
    private int age;
    private Gender gender;
    private double weight;
    private double height;

    @Singular(value = "job")
    private List<String> jobs;

    public User(String name, int age, Gender gender, double weight, double height, List<String> jobs) {
        super(name);
        this.age = age;
        this.gender = gender;
        this.weight = weight;
        this.height = height;
        this.jobs = jobs;
    }

    public User(String name, int age, Gender gender, List<String> jobs) {
        super(name);
        this.age = age;
        this.gender = gender;
        this.jobs = jobs;
    }

    public User(String name, Gender gender, List<String> jobs) {
        super(name);
        this.gender = gender;
        this.jobs = jobs;
    }

    public User(String name, List<String> jobs) {
        super(name);
        this.jobs = jobs;
    }

    public static void main(String[] args) {
        User theUser = User.builder()
                            .name("Nastia")
                            .age(18)
                            .gender(Gender.FEMALE)
                            .weight(60.0)
                            .height(160.0)
                            .job("UCU")
                            .build();
        System.out.println(theUser);
    }
}