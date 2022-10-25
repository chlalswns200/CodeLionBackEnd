package week6.week6_day2;

import java.util.HashSet;
import java.util.Set;

public class HashTable {

    private int size = 10000;
    private int[] table = new int[size];
    public HashTable() {
    }

    public HashTable(int size) {
        this.size = size;
        this.table = new int[size];
    }

    public int hash(String str) {
        int hashSum = 0;
        for (int i = 0; i < str.length(); i++) {
            hashSum += str.charAt(i);
        }
        return hashSum % size;
    }

    public void insert(String key,int value) {
        int hashCode = hash(key);
        this.table[hash(key)] = value;
        System.out.println(hashCode+" 저장 완료");
    }

    public int search(String str) {
        return this.table[hash(str)];
    }


    public static void main(String[] args) {
        String[] names = new String[]{"DongyeonKang",
                "SubinKang", "KwanwunKo", "HyunseokKo", "KyoungdukKoo", "YeonjiGu", "SoyeonKown", "OhsukKwon", "GunwooKim", "KiheonKim", "NayeongKim", "DohyeonKim", "MinkyoungKim", "MinjiKim", "SanghoKim", "SolbaeKim", "YejinKim", "EungjunKim", "JaegeunKim", "JeonghyeonKim", "JunhoKim", "JisuKim", "kimjinah", "HaneulKim", "HeejungKim", "KimoonPark", "EunbinPark", "JeongHoonPark", "JeminPark", "TaegeunPark", "JiwonBae", "SeunggeunBaek", "JihwanByeon", "HeungseopByeon", "JeongHeeSeo", "TaegeonSeo", "SeeYunSeok", "SuyeonSeong", "SeyoelSon", "MinjiSong", "JinwooSong", "hyunboSim", "SominAhn", "JiyoungAhn", "ChangbumAn", "SoonminEom",
                "HyeongsangOh", "SuinWoo", "JuwanWoo", "InkyuYoon", "GahyunLee", "DaonLee", "DohyunLee", "SanghunLee", "SujinLee", "AjinLee", "YeonJae", "HyeonjuLee", "HakjunYim", "SeoyunJang", "SeohyeonJang", "JinseonJang", "SujinJeon", "SeunghwanJeon", "DaehwanJung", "JaeHyunJeung", "HeejunJeong", "GukhyeonCho", "MunjuJo", "YejiJo", "ChanminJu", "MinjunChoi", "SujeongChoi", "SeunghoChoi", "AyeongChoi", "GeonjooHan", "JinhyuckHeo", "MinwooHwang", "SieunHwang",
                "JunhaHwang"};

        HashTable ht = new HashTable(200);
        for (int i = 0; i < names.length; i++) {
            ht.insert(names[i],ht.hash(names[i]));
        }
        System.out.println(ht.search("DongyeonKang"));
        System.out.println(ht.search("JiyoungAhn"));
    }
}
