public class DummyList {

    private Node head;

    public DummyList() {
	head = null;
    }

    public String toString() {
	String s = "";
	Node tmp = head.getNext();
	while(tmp != null) {
	    s += tmp + " --> ";
	    tmp = tmp.getNext();
	}
	s += tmp;
	return s;
    }

    public void add(String d) {
	Node tmp = new Node(d);
	tmp.setNext(head.getNext());
	head.setNext(tmp);
    }

    public void add(int i, String s) {
	Node tmp = head.getNext();
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
	Node tmp = head.getNext();
	int x = 0;
	while (x != i) {
	    tmp = tmp.getNext();
	    x++;
	}
	return tmp.getData();        	
    }

    public String set(int i, String s) {
	Node tmp = head.getNext();
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
	Node tmp = head.getNext();
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
	int i = 0;
	Node tmp = head.getNext();
	while(i < this.size()) {
	    if(tmp.getData().equals(s)) {
		return i;
	    }
	    i++;
	    tmp = tmp.getNext();
	}
	return -1;
    }

    public int size() {
	Node tmp = head.getNext();
	int i = 0;
	while (tmp != null) {
	    i++;
	    tmp = tmp.getNext();
	}
	return i;
    }

}

