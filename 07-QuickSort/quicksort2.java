import java.io.*;
import java.util.*;

public class quicksort2 {

    private Random rnd = new Random();
    
    public int partition(int[] a, int l, int r){
	int tmp;
	int pivotIndex = l + rnd.nextInt(r - l);
	int pivot = a[pivotIndex];
	tmp = a[r];
	a[r] = a[pivotIndex];
	a[pivotIndex] = tmp;
	int wall = l;
	for (int i = l; i < r; i ++) {
	    if (a[i] < pivot) {
		tmp = a[i];
		a[i] = a[wall];
		a[wall] = tmp;
		wall ++;
	    }
	}
	tmp = a[wall];
	a[wall] = a[r];
	a[r] = tmp;
	return wall;
    }
    
    public int[] qsort(int[] a, int l, int r){
	if (r - l <= 1){
	    return a;
	}
	else{
	    int pi = partition(a, l, r);
	    if ((pi - 1) > l)
		return qsort(a, l, pi - 1);
	    else{
		return qsort(a, pi, r);
	    }
	}
    }

}
