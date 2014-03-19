public class MyLinkedList {

    private Node head;

    //you do not need the constructor
    //head will be null by default
    public MyLinkedList() {
	head = null;
    }

    public String toString() {
	return "" + head;
    }

    public void add(String d) {
	Node tmp = new Node(d);
	tmp.setNext(head); //you must do this first
	head = tmp; //you must do this second
    }

    public void add(int i, String s) {
	Node tmp = head;
	int x = 0;
	Node y = new Node(s);
	while (x != i) {
	    tmp = tmp.getNext();
	    x++;
	}
	y.setNext(tmp.getNext());
	tmp.setNext(y);
    }

    public String get(int i) {
	Node tmp = head;
	int x = 0;
	while (x != i) {
	    tmp = tmp.getNext();
	    x++;
	}
	return tmp.getData();        	
    }

    public String set(int i, String s) {
	Node tmp = head;
	int x = 0;
	while (x != i) {
	    tmp = tmp.getNext();
	    x++;
	}
	String y = tmp.getData();
	tmp.setData(s);
	return y;
    }

    public String remove(int i) {
	Node tmp = head;
	int x = 0;
	if (i == 0) {
	    head = head.getNext();
	}
	while (x != i-1) {
	    tmp = tmp.getNext();
	    x++;
	}
	String rtn = tmp.getNext().getData();
	tmp.setNext(tmp.getNext().getNext());
	return rtn;
    }

    public int find(String s) {
	Node tmp = head;
	int i = 0;
	String x = head.getData();
	boolean found = false;
	while (tmp != null && x != s) {
	    tmp = tmp.getNext();
	    x = tmp.getData();
	    i++;
	    if (x == s) {
		found = true;
		break;
	    }

	}
	return i;
    }

    public int length() {
	Node tmp = head;
	int i = 0;
	while (tmp != null) {
	    i++;
	    tmp = tmp.getNext();
	}
	return i;
    }

}


