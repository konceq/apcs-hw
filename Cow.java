import java.util.Scanner;
import java.lang.Math;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Cow {

    //instance vars
    private int current;
    private int size;
    private int x; 

    public int findsize(int a) {
	size = (int)Math.floor(Math.log10(a) + 1);
	return size;
    }

    public int playCow() {
	System.out.println("First number?");
	Scanner k = new Scanner(System.in);
        int temp = k.nextInt();

	while (temp > 10) {
	    current = 1;
	    while (findsize(temp) > 0) {
		x = (temp % 10);
		current *= x;
		temp = temp/10;
	    }
	    temp = current;
	    System.out.println(current);
	}
	return current;
    }

    public static void main( String[] args ) {

	try {
	    Cow g = new Cow();
	    int content = g.playCow();
	    File file = new File("filename.txt");
	    if (!file.exists()) {
		file.createNewFile();
	    }
	    FileWriter fw = new FileWriter(file.getAbsoluteFile());
	    BufferedWriter bw = new BufferedWriter(fw);
	    bw.write(content);
	    bw.close();
 
	    System.out.println("Done");
 
	}
	catch (IOException e) {
	    e.printStackTrace();
	}
    }

}