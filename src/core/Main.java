package core;


import questions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
       Student student = Student.autoGenerator();

        System.out.println(student.toString());
    }
}
