package pack1;

import java.util.LinkedHashMap;
import java.util.Map;

public class swap {
	public static void main(String[] args)
	{
	/*	String str="Happy Sad";
	String[] s=str.split(" ");
	String a=s[0];
	String b=s[1];
	System.out.println("before swap");
	System.out.println(a);
	System.out.println(b);
	a=a+b;
	b=a.substring(0, 5);
	a=a.substring(5, 8);
	System.out.println("after swap");
	System.out.println(a);
	System.out.println(b);*/
	/*	int ar[]= {1,2,4,5,3,2,5,8,0,1};
LinkedHashMap<Integer,Integer> a=new LinkedHashMap<Integer,Integer>();
	for(int i=0;i<ar.length;i++)
	{
		int c=ar[i];
		a.put(c,1);	
	}
	System.out.println(a);
*/
		String str="ramesh is a good man";
	
		Map<Character,Integer> s=new LinkedHashMap<Character,Integer>();
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(s.containsKey(ch))
			{
				int x=s.get(ch);
				s.put(ch,x+1);
				
			}
			else
			{
				
				s.put(ch, 1);
			}
		}
		int le=s.size();
		String[] res=new String[2*le];
		int k=0;
		
	//	String res="";
		for(Map.Entry<Character, Integer> entry:s.entrySet())
		{
			String text=entry.getKey().toString();
			res[k]=text;
			k++;
		//	System.out.print(res);
			String num=entry.getValue().toString();
			res[k]=num;
			k++;
			//System.out.print(res);
		}
		for(String te:res)
		{
	System.out.print(te);
		}
		
	}

}
