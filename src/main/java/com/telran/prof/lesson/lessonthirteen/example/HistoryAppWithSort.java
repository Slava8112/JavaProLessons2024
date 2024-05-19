package com.telran.prof.lesson.lessonthirteen.example;

import java.util.*;

public class HistoryAppWithSort {
    public static void main(String[] args) {
        User alex = new User("Alex");
        List<Request> requestsAlexOne = Arrays.asList(
                new Request("google.com", Status.APPROVED),
                new Request("amazon.com", Status.REJECTED),
                new Request("amazon.de", Status.APPROVED)
        );
        List<Request> requestsAlexTwo = Arrays.asList(
                new Request("google.com", Status.APPROVED)
        );

        User max = new User("Max");
        List<Request> requestsMaxOne = Arrays.asList(
                new Request("ebay.com", Status.REJECTED),
                new Request("amazon.com", Status.APPROVED),
                new Request("wallmart.com", Status.REJECTED)
        );
        List<Request> requestsMaxTwo = Arrays.asList(
                new Request("wallmart.com", Status.REJECTED)
        );

        Map<String, Map<User, List<Request>>> mapByDate = new TreeMap<>();
        mapByDate.put("20240325", Map.of(alex, requestsAlexOne));
        mapByDate.put("20240325", Map.of(max, requestsMaxOne));
        mapByDate.put("20240324", Map.of(alex, requestsAlexTwo));
        mapByDate.put("20240323", Map.of(max, requestsMaxTwo));

        Map<String, List<Map<User, List<Request>>>> historyMap = new TreeMap<>();
        List<Map<User, List<Request>>> list = List.of(Map.of(alex, requestsAlexOne), Map.of(max, requestsMaxOne));
        historyMap.put("20240325", list);
        historyMap.put("20240324", List.of(Map.of(alex, requestsAlexTwo)));
        historyMap.put("20240323", List.of(Map.of(max, requestsMaxTwo)));


        mapByDate.forEach(((date, userListMap) -> {
            userListMap.forEach(((user, requests) -> {
                requests.forEach(request ->
                        System.out.println("" + date + " " + user + " " + request));
            }));
        }));
    }
}
