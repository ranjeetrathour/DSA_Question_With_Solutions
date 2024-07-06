package dsa.practice.kunal;

public class Armstrong {

	public static void main(String[] args) {
		int n = 8208;
	    String s = String.valueOf(n);
	    int digLen = s.length();
	    int res =0;
	    int temp = n;
	    
	    while(temp>0) {
	    	int num=temp%10;
	    	int getValue = (int) Math.pow(num, digLen);
	    	res = res+getValue;
	    	temp = temp/10;
	    }
	   
		
		if(res==n) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
	}
}
