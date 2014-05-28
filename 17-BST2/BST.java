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

    public void transverse(Node n) {
	if (n == null)
	    return;
	else{
	    System.out.println(n.getData());
	    transverse(n.getLeft());
	    transverse(n.getRight()); 
	}
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
 
    public void delete(Node c){
	Node pointer = root;
	Node piggyback = null;
	int d = c.getData();

	while (pointer.getData() != d){
	    if (d < pointer.getData()){
		piggyback = pointer;
		pointer = pointer.getLeft();
	    }
	    else{
		piggyback = pointer;
		pointer = pointer.getRight();
	    }
	}

	Node l = pointer.getLeft();
	Node r = pointer.getRight();
	if (l == null){
	    if (piggyback.getData() < r.getData())
		piggyback.setRight(r);
	    else{
		piggyback.setLeft(r);
	    }
	}
	else if (r == null){
	    if (piggyback.getData() < l.getData())
		piggyback.setRight(l);
	    else{
		piggyback.setLeft(l);
	    }
	}
	else{
	    Node big = piggyback;
	    Node front = piggyback.getLeft();
	    while (front != null){
		big = front;
		front = front.getRight();
	    }
	    int value = big.getData();
	    delete(big);

	}

    }

    public static void main(String[] args) {
	BST sappha = new BST();
	Node n = new Node(3);
	sappha.insert(n);
	sappha.insert(new Node(5));
	sappha.insert(new Node(13));
	sappha.insert(new Node(63));
	sappha.insert(new Node(43));
	sappha.insert(new Node(14));
	sappha.insert(new Node(8));
	sappha.insert(new Node(3));
	sappha.insert(new Node(1));
	sappha.insert(new Node(21));
	sappha.transverse(n);

    }

}
