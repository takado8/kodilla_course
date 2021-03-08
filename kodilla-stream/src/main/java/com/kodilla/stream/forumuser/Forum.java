package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> forumUsers;

    public Forum(List<ForumUser> forumUsers) {
        this.forumUsers = forumUsers;
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(forumUsers);
    }
}
