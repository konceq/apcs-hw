public class BST{

    private Node root;
    
    public BST(){
	root = null;
    }

    public void insert(Node n){
	Node pointer = root;
	Node piggyback = null;
	int d = n.getData();

	while (pointer != null){
	    if (d < pointer.getData()){
		piggyback = pointer;
		pointer = pointer.getLeft();
	    }
	    else{
		piggyback = pointer;
		pointer = pointer.getRight();
	    }
	}
	if (d < piggyback.getData())
	    piggyback.setLeft(n);
	else
	    piggyback.setRight(n);
    }
    
    public Node search(int x){
	Node temp = root;

	while (temp != null && temp.getData() != x){
	    if (x < temp.getData()){
		temp = temp.getLeft();
	    }
	    else{
		temp = temp.getRight();
	    }
	}

	return temp;
    }

    public Node search2(Node c, int x){
	if (c.getData() == 0)
	    return null;
	else if (c.getData() == x)
	    return c;
	else if(c.getData() < x)
	    c = c.getLeft();
	else
	    c = c.getRight();
       	return search2(c, x);

    }

}
