package com.ab.random;


public class Solution {
	
	int k;
    public int findKthNumber(int n, int k) {
    	this.k = k;
        Node root = new Node(0);
        
        for(int i = 1; i < n; i++){
            addToNTree(root, reverse(i));
//            if(--k == 0)
//                return i;
        }
        
        
        
        return -1;
    }
    
    public void addToNTree(Node root, int t){
        
        while(t > 0){
            
            int i = t % 10;
            Node child = findChild(root, i);
            if(child == null){
                root.left = new Node(i);
                root = root.left;
            }else{
                root = child;
            }
            
            t /= 10;
        }
        
        
        
    }
    
    public Node findChild(Node n, int t){
        Node childRoot = n.left;
        if(childRoot == null){
            n.left = new Node(t);
            childRoot = n.left;
        }
        while(childRoot != null){
            if(childRoot.val == t){
            	childRoot.count++;
                return childRoot;
            }
            if(childRoot.right == null){
                childRoot.right = new Node(t);
            }
            childRoot = childRoot.right;
        }
        
        return childRoot;
    }

    
    public int reverse(int k){
        if(k < 10)
            return k;
        
        int ret = 0;
        
        while(k > 0){
            ret = ret * 10 + (k%10);
            k = k / 10;
        }
        return ret;
    }
    public static void main(String[] args) {
    	Solution s = new Solution();
    	System.out.println(s.findKthNumber(13,2));
	}
}


class Node{
    public Node(int val){
        this.val = val;
    }
    int val;
    int count;
    boolean isUnits;
    Node left;//children
    Node right;//sibling
    
    public void setCount(){
    	count++;
    }
    
    @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	return "Val: " + Integer.toString(val) + " || Count : " + count + " <<  ";
    }
}