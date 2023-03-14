package lionalgorithm.algorithm.day13.binarySearch;

import java.util.*;
import java.util.stream.Collectors;


class Mydata implements Comparable<Mydata> {
    int v;

    public Mydata() {
        ;
    }

    public Mydata(int v) {
        this.v = v;
    }

    @Override
    public String toString() {
        return "" + v;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mydata mydata = (Mydata) o;
        return v == mydata.v;
    }

    @Override
    public int hashCode() {
        return Objects.hash(v);
    }

    @Override
    public int compareTo(Mydata o) {
        //내꺼 남의꺼를 뺀값이 양수가 나오면 큰거고 음수가 나오면 작은것이다. 0이면 같은 수 이다.
        return v - o.v;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Mydata> list = new ArrayList<>();

        Random r = new Random();
        for (int i = 1; i <= 100; i++) {
            list.add(new Mydata(r.nextInt(i)));
        }

        int value = list.indexOf(new Mydata(63));

        list.sort(Comparator.naturalOrder());
        //바이너리 search는 index를 리턴해준다.
        int index = Collections.binarySearch(list, new Mydata(63));

        System.out.println(index);

    }
}
