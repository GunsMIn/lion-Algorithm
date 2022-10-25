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
        System.out.println(key+"님은" + hashNum+" 방의 저장된 값은 " + table[hashNum] + "입니다");
    }

    public int search(String key) {
        return table[hash(key)];
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


        HashTable2 ht = new HashTable2(200);


        for (int i = 0; i < names.length; i++) {
            //영문이름,asciiSum
            ht.add(names[i], ht.hash(names[i]));
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
