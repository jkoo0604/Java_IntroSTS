package com.codingdojo.projectone;
import java.util.HashMap;
import java.util.Set;
public class Tries {
    public Node root;
    
    public Tries() {
        this.root = new Node();
    }
    
    public void insertWord(String word) {
        // gets the root node;
        Node currentNode = this.root;
        
        // iterates over every character in the word
        for(int i = 0; i < word.length(); i++) {
            // currentLetter is just the character / letter at the iteration
            Character currentLetter = word.charAt(i);
            // ask if the current letter is in the map of the current node
            Node child = currentNode.children.get(currentLetter);
            if(child == null) {
                child = new Node();
                currentNode.children.put(currentLetter, child); 
            } 
            
            currentNode = child;
        }
        currentNode.isCompleteWord = true;
    }
    
    public boolean isPrefixValid(String prefix) {
    	// check if prefix is in the trie
    	Node currentNode = this.root;
    	
    	for (int i = 0; i < prefix.length(); i++) {
    		Character currentLetter = prefix.charAt(i);
    		Node child = currentNode.children.get(currentLetter);
    		if (child == null) {
    			return false;
    		}
    		currentNode = child;
    	}
    	return true;
    }
    
    public boolean isWordValid(String word) {
    	// check if word is in the trie
    	Node currentNode = this.root;
    	
    	for (int i = 0; i < word.length(); i++) {
    		Character currentLetter = word.charAt(i);
    		Node child = currentNode.children.get(currentLetter);
    		if (child == null) {
    			return false;
    		}
    		currentNode = child;
    	} 
    	if (currentNode.isCompleteWord) {
    		return true;
    	}
    	return false;
    }
    
    public void printAllKeys(Node node) {
    	// print all the characters in trie
    	
    	if (node.children.isEmpty()) return;
    	
    	HashMap<Character, Node> currentMap = node.children;    	
    	Set<Character> keys = currentMap.keySet();
    	for(char key : keys) {
    		if (currentMap.get(key).children.isEmpty()) {
    			System.out.println(key);
//    			System.out.println(key + "'s child's map is empty");
    			return;
    			
    		} else {
    			System.out.println(key);
//    			System.out.println(key + "'s child has a map, making recursive call");
    			node = currentMap.get(key);
    			printAllKeys(node);
    		}
//    		System.out.println(key + "'s end of for loop");
    	}
    	
    }
    
    public void printAllWords(Node node, String word, int level) {
    	// print all the words in trie
    	if (node.children.isEmpty()) return;
//    	level++;
    	HashMap<Character, Node> currentMap = node.children;    	
    	Set<Character> keys = currentMap.keySet();
    	for(char key : keys) {
    		level++;
    		if (currentMap.get(key).children.isEmpty()) {
    			word+=String.valueOf(key);
    			System.out.println(word);
    			return;
    			
    		} else {
//    			System.out.println(word);
    			word+=String.valueOf(key);
    			node = currentMap.get(key);
    			if (node.isCompleteWord) {
    				System.out.println(word);
    			}
    			printAllWords(node, word, level);
    		}
    		level--;
    		word = word.substring(0, level);
    	}
    	
    }
}