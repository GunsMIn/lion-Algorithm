package lionalgorithm.algorithm.day14;

import java.util.ArrayList;
import java.util.List;

public class HashTable {




    private int size = 10000;

    List<Node>[] table = new ArrayList[1000];

    public HashTable() {;}

    public HashTable(int size) {
        this.size = size;
    }

    public int hash(String key) {
        int asciiSum = 0; // 이름의 아스키코드들의 합
        for (int i = 0; i < key.length(); i++) {
            asciiSum += key.charAt(i);
        }
        //나머지로 index를 만드는 이유 -> size로 정한 배열의 어딘가로 가도록하기 위함
        //ex) ascilSum % 1000을 하면 0~999의 값이 나와서
        return asciiSum % size;
    }


    public void insert(String key, Integer value) {//영문이름,asciiSum
        int hashIdx = hash(key);

        if (table[hashIdx] == null) {
            table[hashIdx] = new ArrayList<>();
        }
        table[hashIdx].add(new Node(key, value));
        System.out.println(key + " " + hashIdx + "방에 저장이 완료 되었습니다.");
    }

    public Integer get(String key) {
        List<Node> nodes = this.table[hash(key)];

        for (Node node : nodes) {
            if (key.equals(node.getKey())) {
                return node.getValue();
            }
        }
        return null;
    }




    class Node{
        String key;
        Integer value;

        public Node(String key, Integer value) {
            this.key = key;
            this.value = value;
        }

        public String getKey() {
            return key;
        }

        public Integer getValue() {
            return value;
        }
    }






    public static void main(String[] args) {
       //학생들의 영어 이름
        String[] names = new String[]{"DongyeonKang",
                "SubinKang", "KwanwunKo", "HyunseokKo", "KyoungdukKoo", "YeonjiGu", "SoyeonKown", "OhsukKwon", "GunwooKim", "KiheonKim",
                "NayeongKim", "DohyeonKim", "MinkyoungKim", "MinjiKim", "SanghoKim", "SolbaeKim", "YejinKim", "EungjunKim", "JaegeunKim",
                "JeonghyeonKim", "JunhoKim", "JisuKim", "kimjinah", "HaneulKim", "HeejungKim", "KimoonPark", "EunbinPark", "JeongHoonPark", "JeminPark", "TaegeunPark", "JiwonBae", "SeunggeunBaek", "JihwanByeon", "HeungseopByeon", "JeongHeeSeo", "TaegeonSeo", "SeeYunSeok", "SuyeonSeong", "SeyoelSon", "MinjiSong", "JinwooSong", "hyunboSim", "SominAhn", "JiyoungAhn", "ChangbumAn", "SoonminEom",
                "HyeongsangOh", "SuinWoo", "JuwanWoo", "InkyuYoon", "GahyunLee", "DaonLee", "DohyunLee", "SanghunLee", "SujinLee",
                "AjinLee", "YeonJae", "HyeonjuLee", "HakjunYim", "SeoyunJang", "SeohyeonJang", "JinseonJang", "SujinJeon",
                "SeunghwanJeon", "DaehwanJung", "JaeHyunJeung", "HeejunJeong", "GukhyeonCho", "MunjuJo", "YejiJo", "ChanminJu",
                "MinjunChoi", "SujeongChoi", "SeunghoChoi", "AyeongChoi", "GeonjooHan", "JinhyuckHeo", "MinwooHwang", "SieunHwang",
                "JunhaHwang"};


        HashTable ht = new HashTable(200);
        ht.insert("suk",1);
        ht.insert("kus",2);
        if (ht.get("suk") == 1) {
            System.out.println("테스트 성공");
        }else{
            System.out.println("테스트 실패");
        }





        //아스키코드의 총합의 중복을 제거하기위해서
      /*  Set<Integer> nameSet = new HashSet<>();

        for (int i = 0; i < names.length; i++) {
            nameSet.add(ht.hash(names[i]));
        }
                                  //총이름수,중복된것을 거른것의 size
        System.out.printf("%s %s",names.length,nameSet.size());*/




    }

}
