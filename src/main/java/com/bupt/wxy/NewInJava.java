package com.bupt.wxy;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by xiyuanbupt on 10/10/16.
 */
public class NewInJava {
    public static void main(String[] args){
        List<String> names = Arrays.asList("peter","anna","mike");

        Collections.sort(names,(String a,String b) -> {
            return a.compareTo(b);
        });
        System.out.println(names.toString());
    }
}
