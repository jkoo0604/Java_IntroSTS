package com.codingdojo.projectone;

public class DLL {
	public Node head;
    public Node tail;
    
    public DLL() {
        this.head = null;
        this.tail = null;
    }
    
    // the push method will add a new node to the end of the list
    public void push(Node newNode) {
        // if there is no head in the list, aka, an empty list, we set the newNode to be the head and tail of the list
        if(this.head == null) {
            this.head = newNode;
            this.tail = newNode;
            return;
        }
        
        // first find the lastNode in the list
        // then, set the lastNode's next to be the newNode;
        // then, we have to set the previous of the lastNode to the lastNode that we found previously.
        // finally, set the list's tail to be the node that we have added
        Node lastNode = this.tail;
        lastNode.next = newNode;
        newNode.previous = lastNode;
        this.tail = newNode;
    }
    
    public void printValuesForward() {
        // find the first node, aka head.
        Node current = this.head;
        
        // while the current node exists...
        while(current != null) {
            // print it's value
            System.out.println(current.value);
            // and move on to it's next node.
            current = current.next;
        }
    }
    
    public void printValuesBackward() {
    	// print values of nodes from tail to head
    	if (this.head == null) return;
    	Node current = this.tail;
    	
    	while(current != this.head) {
    		System.out.println(current.value);
    		current = current.previous;
    	}
    	System.out.println(this.head.value);
    }
    
    public Node pop() {
    	// remove last node of DLL and return the node
    	if (this.head == null) return null;
    	Node currenttail = this.tail;
    	Node newtail = this.tail.previous;
    	this.tail = newtail;
    	newtail.next = null;
    	currenttail.previous = null;
    	return currenttail;
    }
    
    public boolean contains(Integer val) {
    	// check if val is in the list or not
    	if (this.head == null) return false;
    	Node current = this.head;
    	while (current != null) {
    		if (current.value == val) return true;
    		current = current.next;
    	}
    	return false;
    }
    
    public int size() {
    	// number of nodes in the list
    	int counter = 0;
    	Node current = this.head;
    	if (this.head == null) return 0;
    	while (current != null) {
    		counter++;
    		current = current.next;
    	}
    	return counter;
    }
    
    
    
    
    
    public void insertAt(Node newNode, int index) {
    	// insert newNode at index (0-based index)
    	// if index > size of list, insert at end
    	Node current = this.head;
    	int counter = 0;
    	if (this.head == null) {
    		this.head = newNode;
    		this.tail = newNode;
    		return;
    	}
    	while (counter < index) {
    		if (counter+1 == index) {
    			newNode.next = current.next;
    			current.next.previous = newNode;
    			current.next = newNode;
    			newNode.previous = current;
    			return;
    		} else if (current == this.tail) {
    			current.next = newNode;
    			newNode.previous = current;
    			this.tail = newNode;
    			return;
    		} else {
    			current = current.next;
    			counter++;
    		}
    	}
    	
    	
    }
    
    public void removeAt(int index) {
    	// remove node at index (0-based index)
    	// if index > size of list, do nothing
    	Node current = this.head;
    	int counter = 0;
    	if (this.head == null) {
    		return;
    	}
    	while (counter < index) {
    		if (current == this.tail) {
    			return;
    		}
    		    		
    		if (counter+1 == index) {
    			Node removed = current.next;
    			current.next = removed.next;
    			removed.next.previous = current;
    			removed.previous = null;
    			removed.next = null;
    			return;
    		} else {
    			current = current.next;
    			counter++;
    		}
    	}
    	
    }
    
    public boolean isPalindrome() {
    	//check if list is a palindrome
    	Node checkfront = this.head;
    	Node checkback = this.tail;
    	if (this.head == null) return false;
    	while (checkfront != checkback && checkfront.previous != checkback) {
    		if (checkfront.value == checkback.value) {
    			checkfront = checkfront.next;
    			checkback = checkback.previous;
    		} else return false;
    	}
    	return true;
    }
}
