package hw;

/*
 * Date: 2016/12/12
import java.util.Scanner;
 */
import java.util.Scanner;

public class hw03 {
	private static BinTree bTree;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		char contChar = 'y';
		float v1 = 0;
		boolean flog = true;
		while (contChar == 'Y' || contChar == 'y') {
			flog = true;
			System.out.print("Number");
			v1 = scn.nextFloat();
			if (bTree == null) {
				bTree = new BinTree(v1);
			} else {
				bTree.addNode(v1);
				bTree.inOrder(bTree.root);

			}
			contChar = scn.next().charAt(0);
		}

	}

}

class BinTree {
	public Node root;

	public BinTree(float v1) {
		root = new Node(v1);
	}

	public void addNode(float v1) {
		Node tmpNode = root;
		while (true) {
			if (v1 < tmpNode.getval()) {
				if (tmpNode.getLeftNode() == null) {
					tmpNode.addLeftNode(v1);
					break;
				} else {
					tmpNode = tmpNode.getLeftNode();
					continue;
				}
			} else {
				if (tmpNode.getRightNode() == null) {
					tmpNode.addRightNode(v1);
					break;
				} else {
					tmpNode = tmpNode.getRightNode();
					continue;
				}
			}
		}
	}

	public void inOrder(Node node) {
		if (node.getLeftNode() != null) {
			inOrder(node.getLeftNode());
		}
		System.out.print(node.getval() + "\t");
		if (node.getRightNode() != null) {
			inOrder(node.getRightNode());
		}
	}
}

class Node {
	private Node left, right;
	private float data;

	public Node(float val) {
		this.data = val;
		this.left = null;
		this.right = null;
	}

	public float getval() {
		return this.data;
	}

	public Node getRightNode() {
		return this.right;

	}

	public Node getLeftNode() {
		return this.left;
	}

	public void addLeftNode(float v1) {
		this.left = new Node(v1);
	}

	public void addRightNode(float v1) {
		this.right = new Node(v1);
	}
}