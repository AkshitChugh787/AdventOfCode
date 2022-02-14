import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner scn = new Scanner(System.in);
	    int[] arr = new int[2000];
	    for(int i = 0 ; i < 2000; i++){
	        arr[i] = scn.nextInt();
	    }
	    int ctr = 0;
		for(int i = 1; i < 2000; i++){
		    if(arr[i] > arr[i-1]){
		        ctr++;
		    }
		}
		System.out.println(ctr);
	}
}
