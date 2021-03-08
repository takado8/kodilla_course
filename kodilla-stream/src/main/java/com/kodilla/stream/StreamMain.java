package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.stream.Collectors;


public class StreamMain {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        var forumUsersList = new ArrayList<ForumUser>();

        forumUsersList.add(new ForumUser(1, "aaa", 'M',
                LocalDate.of(1992,3,12), 344));
        forumUsersList.add(new ForumUser(2, "bbbb", 'M',
                LocalDate.of(2020,3,12), 344));
        forumUsersList.add(new ForumUser(3, "aaa", 'F',
                LocalDate.of(1992,3,12), 344));
        forumUsersList.add(new ForumUser(4, "aaa", 'M',
                LocalDate.of(1992,3,12), 0));
        forumUsersList.add(new ForumUser(5, "bfdgs", 'M',
                LocalDate.of(1923,6,1), 23));

        Forum forum = new Forum(forumUsersList);
        var usersMap = forum.getUserList().stream()
                .filter(u -> u.getGender() == 'M'
                        && Period.between(u.getBirthdate(), currentDate).getYears() >= 20
                        && u.getPosts_nb() > 0)
                .collect(Collectors.toMap(ForumUser::getId, u -> u));

        usersMap.entrySet().stream()  // Powinienem rozdzielić na .map().forEach() ??
                 .forEach(e -> System.out.println(e.getKey() + " : " + e.getValue()));
    }
}
