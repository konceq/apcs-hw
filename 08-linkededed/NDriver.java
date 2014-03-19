public class NDriver {

    public static void main (String[] args) {
	Node n1;
	n1 = new Node("Sully");
	Node n2;
	n2 = new Node("Mike");
	n1.setNext(n2);
	System.out.println(n2.getData());
	System.out.println(n1.getNext());
	/*
	System.out.println(n1);
	System.out.println(n1.getNext());

	Node n2 = new Node("Mike");
	System.out.println(n2);
	System.out.println(n2.getNext());

	n1.setNext(n2);
	System.out.println();
	System.out.println(n1);
	System.out.println(n1.getNext());
	System.out.println(n1.getNext().getNext());

	n1.getNext().setNext( new Node("Randall"));
	System.out.println();
	System.out.println(n1);
	System.out.println(n1.getNext());
	System.out.println(n1.getNext().getNext());
	System.out.println(n1.getNext().getNext().getNext());

	n1.setNext(n1.getNext().getNext());
	System.out.println();
	System.out.println(n1);
	System.out.println(n1.getNext());
	System.out.println(n1.getNext().getNext());

	n1.getNext().getNext().setNext(n1);
	System.out.println();
	System.out.println(n1);
	System.out.println(n1.getNext());
	System.out.println(n1.getNext().getNext());
	System.out.println(n1.getNext().getNext().getNext());
	*/
    }

}