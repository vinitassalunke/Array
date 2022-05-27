package com.arrya;

public class Program4 
{
 public static void main(String[] args)
 {
	 String [] ar= {"hello", "hi" ,"hey"};
	 System.out.println("ar.length=" + ar.length);
	 
	 for(int i=0; i<ar.length; i++)
	 {
		 System.out.println(ar[i]);
	 }
	 
      System.out.println("args.length=" + args.length);
	 
	 for(int i=0; i<args.length; i++)
	 {
		 System.out.println(args[i]);
	 }
}
}

