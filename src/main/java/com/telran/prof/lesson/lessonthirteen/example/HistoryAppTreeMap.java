package com.telran.prof.lesson.lessonthirteen.example;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class HistoryAppTreeMap {
    public static void main(String[] args) {
        User alex = new User("Alex");
        List<Request> requestsAlexOne = Arrays.asList(
                new Request("google.com", Status.APPROVED),
                new Request("amazon.com", Status.REJECTED),
                new Request("amazon.de", Status.APPROVED)
        );


        User max = new User("Max");
        List<Request> requestsMaxOne = Arrays.asList(
                new Request("ebay.com", Status.REJECTED),
                new Request("amazon.com", Status.APPROVED),
                new Request("wallmart.com", Status.REJECTED)
        );

        Map<User, List<Request>> userRequestMap = new TreeMap<>(new UserNameComparator());
        userRequestMap.put(max, requestsMaxOne);
        userRequestMap.put(alex, requestsAlexOne);

        userRequestMap.forEach((user, requests) -> {
            requests.forEach(request -> System.out.println(" " + user + " " + request));
        });
    }
}
