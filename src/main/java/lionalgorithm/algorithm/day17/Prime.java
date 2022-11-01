package lionalgorithm.algorithm.day17;

public class Prime {
    //소수 알고리즘 원리 사이트
    //https://myjamong.tistory.com/139

    /*1.첫번째 풀이는 2부터 판별하는 수 전까지 나눠보고 나머지가 0이 안나온다면 소수로 정의한다.
    해당 수까지 모두 확인해야하므로 시간복잡도는 O(N)이 되고, 가장 원초적인 방법이다.
    소수 판별*/
    public boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if(num%i==0) return false;
        }
        //나머지가 0이 아니라는 얘기는 나누어 떨어지지 않는다는 말 -> 소수
        return true;
    }

    /*두번째는 해당숫자의 절반까지만 확인하는 방법이다.
    이 원리는 절반 이상의 숫자들은 확인이 필요 없는 숫자들이기 때문이다.
    예를들어 80이란 숫자에서 자기자신을 제외하고 절반을 초과하는 숫자에서 나눴을때 나머지가 0이되는 숫자는 나올수가 없다.
    해당 풀이를 사용하면 최대 N/2번 조회를 한다*/
    public boolean isprimeV2(int num) {
        for (int i = 2; i < num/2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // 3. 루트판별법 예를 들어서 1:80, 2:40, 4:20, 5:16, 8:10. √80의 값은 대략 8.xxx의 값이 나온다.
    // 즉 약수들의 곱으로 봤을때 루트를 씌운 값이 중간값이 된다.
    // 이 원리는 이용하여 2에서부터 √N의 값까지 검색을한다며 이후의 값은 확인할 필요가 없게 된
    public boolean isPrimeV3(int num) {
        for (int i = 2; i*i < num ; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Prime p = new Prime();
        System.out.println(p.isPrimeV3(80));
        System.out.println(p.isPrimeV3(79));
    }

}
