package Trees;

public class TreeCreation {

	public static void main(String[] args){
		
		Tree tree = new Tree();
		
		tree.setRoot(new Node(9));
		
		tree.getRoot().setLeftChild(new Node(5));
		tree.getRoot().setRightChild(new Node(10));
		
		tree.getRoot().getLeftChild().setLeftChild(new Node(2));
		tree.getRoot().getLeftChild().setRightChild(new Node(7));
		
		tree.getRoot().getRightChild().setRightChild(new Node(12));
		
		System.out.println(tree.getRoot());
		
		visit(tree.getRoot());
		
	}
	
	
	public static void visit(Node value){
		if(value != null){
			if(value.getLeftChild() != null){
				visit(value.getLeftChild());
			}
			
			System.out.println(value.getValue());
			
			if(value.getRightChild() != null){
				visit(value.getRightChild());
			}
		}
	}
}
