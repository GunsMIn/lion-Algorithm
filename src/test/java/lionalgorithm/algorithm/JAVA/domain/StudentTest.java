package lionalgorithm.algorithm.JAVA.domain;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void name() {
        List<Teacher> teachers = new ArrayList<>();
        Teacher kyeongrok = new Teacher("김경록", true, true);
        Teacher kyeonghwan = new Teacher("고경환", true, false);
        Teacher sugin = new Teacher("김수진",  false, true);
        Teacher sohyun = new Teacher("강소현", true, true);

        teachers.add(kyeongrok);
        teachers.add(kyeonghwan);
        teachers.add(sugin);
        teachers.add(sohyun);

        List<Teacher> algorithm = teachers.stream()
                .filter(t -> t.isLikeAlgorithm() == true)
                .collect(Collectors.toList());

        for (Teacher teacher : algorithm) {
            System.out.println(teacher.getName());

        }

        System.out.println("==============위는 알고리즘 아래는 스프링 선호==============");


        List<String> springBoot = teachers.stream()
                .filter(t -> t.isLikeSpringBoot() == true)
                .map(t -> t.getName())
                .collect(Collectors.toList());

        for (String teacherName : springBoot) {
            System.out.println(teacherName);
        }
    }

    @Test
    void map() {
        String[] list = {"1", "2", "3"};
        List<Integer> intNums = Arrays.stream(list)
                .map(a -> Integer.parseInt(a))
                .collect(Collectors.toList());
        System.out.println(intNums);
    }

    @Test
    void map2() {
        List<Teacher> teachers = new ArrayList<>();
        Teacher kyeongrok = new Teacher("김경록", true, true);
        Teacher kyeonghwan = new Teacher("고경환", true, false);
        Teacher sugin = new Teacher("김수진",  false, true);
        Teacher sohyun = new Teacher("강소현", true, true);
        Teacher sohyunn = new Teacher("강소현현현", true, true);

        teachers.add(kyeongrok);
        teachers.add(kyeonghwan);
        teachers.add(sugin);
        teachers.add(sohyun);
        teachers.add(sohyunn);

        List<Integer> nameLength = teachers.stream().filter(t -> t.isLikeSpringBoot())
                .map(t -> t.getName().length())
                .collect(Collectors.toList());

        System.out.print(nameLength);

    }

}