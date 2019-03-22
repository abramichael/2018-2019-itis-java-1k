import java.util.*;

public class Tree {
	Node root;
	
	public static void createTree(Node p, int n) {
		p.value = n;
		int nl = n / 2;
		int nr = n - 1 - nl;
		if (nl > 0) {
			p.left = new Node();
			createTree(p.left, nl);
		}
		if (nr > 0) {
			p.right = new Node();
			createTree(p.right, nr);
		}
				
	}
	
	public static void printTree(Node p, int h) {
		if (p != null ){
			printTree(p.right, h + 1);
			for (int i = 0; i < h; i++) {
				System.out.print("  ");
			}
			System.out.println(p.value);
			printTree(p.left, h + 1);	
		}
	}
	
	public static void parseBFsearchLR(Node root) {
		Queue<Node> q = new LinkedList<>();
		q.offer(root);
		int counter = 0;
		while (!q.isEmpty()) {
			Node p = q.poll();
			p.value = counter++;
			if (p.left != null) {
				q.offer(p.left);
			}
			if (p.right != null) {
				q.offer(p.right);
			}
		}
	}
	static int static_counter = 0;
	public static void parseDFsearchLRoRi(Node p) {
		if (p != null) {
			parseDFsearchLRoRi(p.left);
			p.value = static_counter++;
			parseDFsearchLRoRi(p.right);
		}
	}

	public static void main(String [] args) {
		Node root = new Node();
		createTree(root, 15);
		printTree(root, 0);
		parseBFsearchLR(root);
		printTree(root, 0);
		parseDFsearchLRoRi(root);
		printTree(root, 0);
		
		
	}
	
}