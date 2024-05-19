package com.telran.prof.lesson.lessonthirteen.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HistoryApp {

        public static void main(String[] args) {
            Map<User, List<Request>> historyMap = new HashMap<>();
            List<Request> requestsAlexOne = Arrays.asList(
                    new Request("google.com", Status.APPROVED),
                    new Request("amazon.com", Status.REJECTED),
                    new Request("amazon.de", Status.APPROVED)
            );

            User alex = new User("Alex");
            historyMap.put(alex, requestsAlexOne);

            List<Request> requestsMaxOne = Arrays.asList(
                    new Request("ebay.com", Status.REJECTED),
                    new Request("amazon.com", Status.APPROVED),
                    new Request("wallmart.com", Status.REJECTED)
            );

            User max = new User("Max");
            historyMap.put(max, requestsMaxOne);

            List<Request> requestsAlexTwo = Arrays.asList(
                    new Request("google.com", Status.APPROVED)
            );
            List<Request> requestsMaxTwo = Arrays.asList(
                    new Request("wallmart.com", Status.REJECTED)
            );

            Map<User, Map<String, List<Request>>> historyWithDate = new HashMap<>();

            Map<String, List<Request>> alexDateRequestMap = new HashMap<>();
            alexDateRequestMap.put("20240325", requestsAlexOne);
            alexDateRequestMap.put("20240324", requestsAlexTwo);
            historyWithDate.put(alex, alexDateRequestMap);

            Map<String, List<Request>> maxDateRequestMap = new HashMap<>();
            maxDateRequestMap.put("20240323", requestsMaxTwo);
            maxDateRequestMap.put("20240320", requestsMaxOne);
            historyWithDate.put(max, maxDateRequestMap);

            for (Map.Entry<User, Map<String, List<Request>>> pair : historyWithDate.entrySet()) {
                User user = pair.getKey();
                Map<String, List<Request>> map = pair.getValue();
                for (Map.Entry<String, List<Request>> innerPair : map.entrySet()) {
                    String date = innerPair.getKey();
                    for (Request request : innerPair.getValue()) {
                        System.out.println("" + user.getName() + " " +
                                date + " " + request);
                    }
                }
            }

            System.out.println();

            historyWithDate.forEach(((user, mapByDate) ->
                    mapByDate.forEach((date, requests) ->
                            requests.forEach(request ->
                                    System.out.println("" + user.getName() + " " + date + " " + request)))));
        }
}
