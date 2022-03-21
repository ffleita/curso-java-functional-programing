package com.platzi.functional._15_streams_intro;

import com.platzi.functional._06_reference_operator.NombresUtils;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
        List<String> courseList = NombresUtils.getList(
                "Java",
                "FrontEnd",
                "Backend",
                "FullStack"
        );
        
        for (String course : courseList) {
            String newCourseName = course.toLowerCase().replace("!", course);
            System.out.println("Curso: " + newCourseName);
        }
        
        Stream<String> coursesStream = Stream.of("Java",
                "FrontEnd",
                "Backend",
                "FullStack");
        
        Stream<Integer> courseLengthString = coursesStream.map(course -> course.length());
        
        Optional<Integer> longest = courseLengthString.max((x, y) -> y - x);
        
        Stream<String> emphasisCourses = coursesStream.map(course -> course + "!");
        Stream<String> justJavaCourses = coursesStream.filter(course -> course.contains("Java"));
        
        emphasisCourses.forEach(System.out::println);
    }
}
