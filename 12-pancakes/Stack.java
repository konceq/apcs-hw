public class Stack{
    
    private int top;
    private String[] foo;

    //constructor
    public Stack(){
	foo = new String[10];
	top = -1;
    }

    //push
    public void push(String s){
	if (foo.length-1 <= top ){
	    String[]temp = new String[foo.length+10];
	    for(int x = 0; x < foo.length; x++){
		temp[x]=foo[x];
	    }
	    foo = temp;
	}
        foo[top+1] = s;
	top++;
    }


    //pop
    public String pop(){
	String s = foo[top];
	foo[top]="";
	top--;
	return s;
    }
 
    //peek
    public String peek(){
	return foo[top];
    }
    //isEmpty
    public boolean isEmpty(){
	return top == -1;
    }

    //toString
    public String toString(){
	String tmp="";
	for(int x=top;x>-1;x--){
	    tmp += foo[x]+", ";
	}
	return tmp;
    }


}
