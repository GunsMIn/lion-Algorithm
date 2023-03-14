package lionalgorithm.algorithm.day28;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class QuickSort {
    //리스트의 정 가운데 있는 값을 pivot 값을 선택합니다.
    //시작 인덱스(low)는 계속 증가 시키고, 끝 인덱스(high)는 계속 감소 시키기위한 while 루프를 두 인덱스가 서로 교차해서 지나칠 때까지 반복시킵니다.
    //시작 인덱스(low)가 가리키는 값과 pivot 값을 비교해서 더 작은 경우 반복해서 시작 인덱스 값을 증가시킵니다. (pivot 값보다 큰데 좌측에 있는 값을 찾기 위해)
    //끝 인덱스(high)가 가리키는 값과 pivot 값을 비교해서 더 작은 경우 반복해서 끝 인덱스 값을 감소시킵니다. (pivot 값보다 작은데 우측에 있는 값을 찾기 위해)
    //두 인덱스가 아직 서로 교차해서 지나치치 않았다면 시작 인덱스(low)가 가리키는 값과 끝 인덱스(high)가 가리키는 값을 상호 교대(swap) 시킵니다. (잘못된 위치에 있는 두 값의 위치를 바꾸기 위해)
    //상호 교대 후, 다음 값을 가리키기 위해 두 인덱스를 각자 진행 방향으로 한 칸씩 이동 시킵니다.
    //두 인덱스가 서로 교차해서 지나치게 되어 while 루프를 빠져나왔다면 다음 재귀 호출의 분할 기준점이될 시작 인덱스를 리턴합니다.

    public List<Integer> merge(List<Integer> left, List<Integer> mid, List<Integer> right) {
        //answer로 하나로 합쳐주자
        List<Integer> answer = new ArrayList<>();
        answer.addAll(left);
        answer.addAll(mid);
        answer.addAll(right);
        return answer;
    }

    public List<Integer> sort(List<Integer> arr) {
        // 1. 기준값을 뽑는 로직 구현
        if (arr.size() <= 1) return arr;

        int pivot = arr.get(arr.size() / 2);
        System.out.println("pivot = " + pivot);
        List<Integer> left = new ArrayList<>();
        List<Integer> mid = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        for (int i = 0; i < arr.size(); i++) {
            if (pivot > arr.get(i)) left.add(arr.get(i));
            else if (pivot < arr.get(i)) right.add(arr.get(i));
            else mid.add(arr.get(i));
        }
        //list를 합치는 연산
        return merge(sort(left), mid, sort(right));
    }


    public static void main(String[] args) {
        int[] arr = new int[]{20, 18, 5, 19, 5, 25, 40, 50};

        List<Integer> arrList = Arrays.stream(arr).boxed().collect(Collectors.toList());

        QuickSort q = new QuickSort();
        q.sort(arrList);

    }


}
