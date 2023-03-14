package lionalgorithm.algorithm.day13;

import java.util.HashSet;
import java.util.Set;

public class HashTable {
    private int size = 10000;

    private int[] table = new int[size];

    public HashTable() {
        ;
    }

    public HashTable(int size) {
        this.size = size;
        table = new int[size];
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
        int hashCode = hash(key);
        table[hashCode] = value;
        System.out.println(key + " " + hashCode + "방에 저장이 완료 되었습니다.");
    }

    public int search(String key) {
        return this.table[hash(key)];
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


        for (int i = 0; i < names.length; i++) {
            //영문이름,asciiSum
            ht.insert(names[i], ht.hash(names[i]));
        }

        System.out.println(ht.search("DongyeonKang"));
        System.out.println(ht.search("JiyoungAhn"));


        //아스키코드의 총합의 중복을 제거하기위해서
      /*  Set<Integer> nameSet = new HashSet<>();

        for (int i = 0; i < names.length; i++) {
            nameSet.add(ht.hash(names[i]));
        }
                                  //총이름수,중복된것을 거른것의 size
        System.out.printf("%s %s",names.length,nameSet.size());*/


    }

}
