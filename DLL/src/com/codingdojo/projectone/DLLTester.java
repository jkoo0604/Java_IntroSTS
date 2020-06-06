package com.codingdojo.projectone;

public class DLLTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DLL dll = new DLL();
        Node n1 = new Node(120);
        Node n2 = new Node(100);
        Node n3 = new Node(80);
        Node n4 = new Node(60);
        Node n5 = new Node(80);
        Node n6 = new Node(100);
        Node n7 = new Node(120);
        
        dll.push(n1);
        dll.push(n2);
        dll.push(n3);
        dll.push(n4);
        dll.push(n5);
        dll.push(n6);
        
        dll.printValuesForward();
        System.out.println("----------");
        dll.printValuesBackward();
        System.out.println("----------");
        dll.push(n7);
        dll.printValuesForward();
//        System.out.println("----------");
//        dll.pop();
//        dll.printValuesForward();
//        System.out.println("----------");
//        dll.insertAt(n7, 8);
//        dll.printValuesForward();
//        System.out.println("----------");
//        dll.removeAt(3);
//        dll.printValuesForward();
//        System.out.println("----------");
//        System.out.println(dll.contains(80));
        System.out.println(dll.size());
        System.out.println(dll.isPalindrome());
        
        
	}

}
