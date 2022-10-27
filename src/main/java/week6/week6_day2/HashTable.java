package week6.week6_day2;

import java.util.ArrayList;
import java.util.List;

public class HashTable {

    class Node{
        private String key;
        private Integer value;

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

    List<Node>[] table = new ArrayList[1000];

    public int hash(String str) {
        int hashSum = 0;
        for (int i = 0; i < str.length(); i++) {
            hashSum += str.charAt(i);
        }
        return hashSum % 1000;
    }

    public void insert(String key,int value) {
        //List
        int hashIdx = hash(key);
        if (this.table[hashIdx] == null) {
            this.table[hashIdx] = new ArrayList<>();
        }
        // Map, Object
        this.table[hashIdx].add(new Node(key,value));
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

    public static void main(String[] args) {

        HashTable ht = new HashTable();
        ht.insert("Yoonseo",1);
        ht.insert("Seoyoon",2);

        int result = ht.get("Seoyoon");

        if (result == 2) {
            System.out.println("테스트 성공");
        } else {
            System.out.println("테스트 실패 "+result);
        }

    }
}
