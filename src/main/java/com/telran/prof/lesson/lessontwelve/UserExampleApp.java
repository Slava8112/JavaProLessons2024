package com.telran.prof.lesson.lessontwelve;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class UserExampleApp {
    public static void main(String[] args) {
        List<UserAction> listOne = Arrays.asList(
                new UserAction(),
                new UserAction()
        );

        Map<User, List<UserAction>> userListMap = new HashMap<>();

        Map<String, List<UserAction>> userDataList = new HashMap<>();
        userDataList.put("20240320", listOne);

        Map<User, Map<String, List<UserAction>>> userLog = new HashMap<>();

        // user 1 : - 20 - list(log1,log2,log2)
        //          - 21 - list
        // user 2  : 19 - list
        //          15 - list


    }
}
