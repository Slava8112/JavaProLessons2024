package com.telran.prof.lesson.lessonfourteenth.basicfuncint;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ExamplePredicate {

    public static void main(String[] args) {
        //Принимает аргумент и возвращает true/false
        //Predicate -> boolean test (T t)

        List<User> users = Arrays.asList(
                new User("Alex", "Admin"),
                new User("Oleg", "member"),
                new User("Egor", "Admin"));

        Predicate<User> rolePredicate = user -> user.getRole().equals("Admin");

//        Predicate<User> rolePredicateTwo = new Predicate<User>() {
//            @Override
//            public boolean test(User user) {
//                return user.getRole().equals("Admin");
//            }
//        };
        List<User> admins = process(users, user -> user.getRole().equals("Admin"));
        System.out.println(admins);
        List<User> members = process(users, user -> user.getRole().equals("member"));
        System.out.println(members);

    }

    private static List<User> process(List<User> users, Predicate<User> filter) {
        List<User> newUsers = new ArrayList<>();
        for (User user : users) {
            if (filter.test(user)) {
                newUsers.add(user);
            }
        }

        return newUsers;
    }
}
