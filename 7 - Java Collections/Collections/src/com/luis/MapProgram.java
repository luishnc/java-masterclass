package com.luis;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {
    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();

        if(languages.containsKey("Java")){
            System.out.println("Java is already in the map");
        } else {
            languages.put("Java", "a compiled high level, object-oriented, platform independent language");
            System.out.println("Java added");
        }


        languages.put("Python", "an interpreted, objected-oriented, high-level programing language with dynamic semantics");
        languages.put("Algol", "an algorithmic language");
        System.out.println(languages.put("Basic", "Beginners All Purposes Symbolic Instruction Code"));
        System.out.println(languages.put("Lisp", "Therein lies madness"));



        if(languages.containsKey("Java")){
            System.out.println("Java is already in the map");
        } else {
            System.out.println(languages.put("Java", "this course is about java"));
        }

        //languages.remove("Lisp");
        if(languages.remove("Algol", "an algorithmic language")){
            System.out.println("Algol removed");
        } else {
            System.out.println("Algol not removed, key/value pair not found");
        }
        System.out.println("============================================================================================");

        System.out.println(languages.replace("Lisp", "Another description"));
        System.out.println(languages.replace("Scala", "Another description"));

        for (String key : languages.keySet()
             ) {
            System.out.println(key + " : " + languages.get(key));
        }




    }
}
