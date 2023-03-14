package lionalgorithm.algorithm.JAVA.domain;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void name() {
        List<Teacher> teachers = new ArrayList<>();
        Teacher kyeongrok = new Teacher("김경록", true, true);
        Teacher kyeonghwan = new Teacher("고경환", true, false);
        Teacher sugin = new Teacher("김수진", false, true);
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

    /**
     * 선생객체 -> 이름 문자 수
     */
    @Test
    void map2() {
        List<Teacher> teachers = new ArrayList<>();
        Teacher kyeongrok = new Teacher("김경록", true, true);
        Teacher kyeonghwan = new Teacher("고경환", true, false);
        Teacher sugin = new Teacher("김수진", false, true);
        Teacher sohyun = new Teacher("강소현", true, true);
        Teacher sohyunn = new Teacher("강소현현현", true, true);

        teachers.add(kyeongrok);
        teachers.add(kyeonghwan);
        teachers.add(sugin);
        teachers.add(sohyun);
        teachers.add(sohyunn);

        List<Integer> nameLength = teachers.stream()
                .filter(Teacher::isLikeSpringBoot)
                .map(Teacher::cntNameDigit) //
                .collect(Collectors.toList());

        /*.map(teacher -> teacher.getName().length())  // 1단계 map에서 처리
          .map(teacher -> teacher.cntNameDigit())  // 2단계 함수 내장
          .map(Teacher::cntNameDigit) // 3단계 ::문법 적용
*/
        System.out.print(nameLength);

    }

    @Test
    void predicateTest() {
        // 숫자 num을 넣으면 10보다 큰지 true, false로 리턴 해주는 내장 인터페이스
        Predicate<Integer> predicate = num -> num > 10;
        System.out.println(predicate.test(11));
    }


    @Test
    void reduce() {
        String[] list = {"1", "2", "3"};
        Integer reducesum = Arrays.stream(list)
                .map(a -> Integer.parseInt(a))
                .reduce((a, b) -> a + b).get();
        System.out.println("reducesum = " + reducesum);

    }

    @Test
    void reduce2() {
        List<Teacher> teachers = new ArrayList<>();
        Teacher kyeongrok = new Teacher("김경록", true, true);
        Teacher kyeonghwan = new Teacher("고경환", true, false);
        Teacher sugin = new Teacher("김수진", false, true);
        Teacher sohyun = new Teacher("강소현", true, true);
        Teacher sohyunn = new Teacher("강소현현현", true, false);

        teachers.add(kyeongrok);
        teachers.add(kyeonghwan);
        teachers.add(sugin);
        teachers.add(sohyun);
        teachers.add(sohyunn);

        Integer sum = teachers.stream().filter(Teacher::isLikeSpringBoot)
                .map(Teacher::getCountSpringBoot)
                .reduce(((a, b) -> a + b)).get();

        System.out.println("sum = " + sum);

    }

    @Test
    void optionalTest() {
        Teacher kyeongrok = new Teacher("김경록", true, true);
        //db에서 select된상태태
        Optional<Teacher> teacherOptional = Optional.of(kyeongrok);

        Teacher teacher = teacherOptional.orElseThrow(RuntimeException::new);

        //값이 있는경우 무언가 처리하고 싶을 때
        Teacher kyeongrok2 = new Teacher("김경록", true, true);
        Optional<Teacher> teacherOptional2 = Optional.of(kyeongrok);

    }

}