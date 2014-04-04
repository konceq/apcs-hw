public class MyStack {
    private Node top;
    //constructor
    public MyStack() {
	top = null;
    }

    //push
    public void push(String s) {
	Node tmp = new Node(s);
	tmp.setNext(top);
	top = tmp;
    }

    //pop
    public String pop() {
	String s = top.getData();
	top = top.getNext();
	return s;
    }

    public String peek() {
	return top.getData();
    }

    public boolean isEmpty() {
	return top == null;
    }

    public String toString() {
	String s = "";
	Node tmp = top;
	while (tmp != null) {
	    s += tmp.getData() + ", ";
	}
	return s;
    }

    /*
    public String toString() {
	String s = "";
	for(Node tmp = top; tmp != null; tmp = tmp.getNext()){
	    s += tmp.getData() + ", ";
	}
	return s;
    }
    */
     

    //peek

    //isEmpty

    //toString 3

}