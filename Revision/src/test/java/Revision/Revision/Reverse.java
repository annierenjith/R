package Revision.Revision;

public class Reverse {

	public static void main(String[] args) {
		String str ="Niranjan";
		char x[] = str.toCharArray();
		int size = x.length;
		char y[] = new char[size];
		int i=0;
		
		while(i!=size)
		{
			y[i] =x[size-1-i];
			i++;
		}
		System.out.println(x);
		System.out.println(y);
		
	}

}
