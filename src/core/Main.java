package core;


import questions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        NewDynamic<String> test = new NewDynamic<>();

        test.put("123123");
        System.out.println(test.get(0));
    }
}
