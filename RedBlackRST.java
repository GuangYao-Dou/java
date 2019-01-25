package search2;

import java.io.File;

public class RedBlackRST<Key extends Comparable<Key>,Value> {
	private static final boolean RED = true;
	private static final boolean BLACK = false;
	
	//����һ�����
	private class Node{
		Key key;
		Value value;
		Node left, right;
		int N;
		boolean color;
		
		Node(Key key, Value value, int N, boolean color){
			this.key = key;
			this.value = value;
			this.color = color;
		}
	}
		private boolean isRed(Node x) {
			if(x == null) {
				return false;
			}
			return x.color = RED;
		}
		//���ļ�����
		private int size(Node x) {
			if(x == null) {
				return 0;
			}else {
				return x.N;
			}
		}
		//����תһ��h����������
		Node rotateLeft(Node h) {
			Node x = h.left;
			h.right = x.left;
			x.color = h.color;
			h.color = RED;
			x.N = h.N;
			h.N = 1 + size(h.left) + size(h.right);
			return x;
		}
		//����תh��������
		Node rotateRight(Node h) {
			Node x = h.left;
			h.left = x.right;
			x.right = h;
			x.color = RED;
			x.N = h.N;
			h.N = 1 + size(h.left) + size(h.right);
			return x;
		}
		//�ֽ���ʱת��������ɫ
		void flipColors(Node h) {
			h.color = RED;
			h.left.color = BLACK;
			h.right.color = BLACK;
		}
		//���������
		private Node put(Node h, Key key, Value val) {
			if(h == null) {
				return new Node(key, val, 1, RED);
			}
			int cmp = key.compareTo(h.key);
			if(cmp < 0) {
				h.left = put(h.left,key,val);
			}else if(cmp > 0){
				h.right = put(h.right, key, val);
			}else {
				h.value = val;
			}
			if(isRed(h.right) && !isRed(h.left)) {
				h = rotateLeft(h);
			}
			if(isRed(h.left) && isRed(h.left.left)){
				h = rotateRight(h);
			}
			if(isRed(h.left) && isRed(h.right)) {
				flipColors(h);
			}
			h.N = size(h.left) + size(h.right) + 1;
			return h;
		}
		private Node root;
		public void put(Key key, Value val) {
			root = put(root, key, val);
			root.color = BLACK;
		}
}






















