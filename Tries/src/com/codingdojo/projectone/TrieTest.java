package com.codingdojo.projectone;

public class TrieTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tries trie = new Tries();
        trie.insertWord("car");
        trie.insertWord("card");
        trie.insertWord("chip");
        trie.insertWord("trie");
        trie.insertWord("try");
        System.out.println(trie.isPrefixValid("ry"));
        System.out.println("--------");
        System.out.println(trie.isWordValid("car"));
        System.out.println("--------");
        trie.printAllKeys(trie.root);
        System.out.println("--------");
        trie.printAllWords(trie.root, "", 0);

	}

}
