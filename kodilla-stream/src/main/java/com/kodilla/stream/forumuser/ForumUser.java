package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    private final int id;
    private final String name;
    private final char gender;
    private final LocalDate birthdate;
    private final int posts_nb;

    public ForumUser(int id, String name, char gender, LocalDate birthdate, int posts_nb) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.birthdate = birthdate;
        this.posts_nb = posts_nb;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public int getPosts_nb() {
        return posts_nb;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", birthdate=" + birthdate +
                ", posts_nb=" + posts_nb +
                '}';
    }
}
