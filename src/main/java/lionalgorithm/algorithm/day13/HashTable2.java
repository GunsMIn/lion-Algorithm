package lionalgorithm.algorithm.day13;

public class HashTable2 {

    int size = 10000;

    int[] table = new int[size];

    public HashTable2(int size) {
        this.size = size;
        table = new int[size];
    }

    //hash메소드 -> 방의 index를 만들어주는 용도의 메소드
    public int hash(String key) {
        int asciiSum = 0;
        for (int i = 0; i < key.length(); i++) {
            char c = key.charAt(i);
            asciiSum += c;
        }
        return asciiSum % size;
    }

    //add메소드
    public void add(String key,Integer value) {
        int hashNum = hash(key);
        table[hashNum] = value;
        System.out.println(key+"님은" + hashNum+"방의 저장 값은 " + table[hashNum] + "입니다");
    }

    public int search(String key) {
        return table[hash(key)];
    }


}
