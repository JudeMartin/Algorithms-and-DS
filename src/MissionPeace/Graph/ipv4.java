package MissionPeace.Graph;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ipv4 {
	
	
	public static String[] printip(String[] args)
	{
		for (int i = 0;i<args.length; i++){
			String test = args[i]; 
			if(test.matches("([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\.([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\.([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\.([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])") == true){
				System.out.println("IPv4");
				args[i] = "IPv4";
			}
			else if(test.matches("([0-9a-f]+)\\:([0-9a-f]+)\\:([0-9a-f]+)\\:([0-9a-f]+)\\:([0-9a-f]+)\\:([0-9a-f]+)\\:([0-9a-f]+)\\:([0-9a-f]+)") == true){
				System.out.println("IPv6");
				args[i] = "IPv6";
			}
			else{
				System.out.println("Neither");
				args[i] = "Neither";
			}
		}
		
		return args;
	}
	

    public static void main(String[] args) {
    	
    	//String[] temp = {"aaaa","192.168.19.2","192.168.12"};
    	//printip(temp);
    	int a = 4;
    	int b = 5;
    	 a = a ^ b ^(b=a);
    	 System.out.println(a +" "+b);
    	 
    	 
    }
}