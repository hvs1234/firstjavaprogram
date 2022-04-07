package unit01;

public class P6_StringBufferClassinJava {

	public static void main(String[] args) {
	   StringBuffer sb=new StringBuffer("Hello ");
 	   sb.append("Java");
 	   System.out.println(sb.charAt(0));
 	   //StringBuffer Class append() Method, now original is changed
 	   System.out.println(sb);
 	   //StringBuffer insert() Method
 	   StringBuffer sb2=new StringBuffer("Hello ");
 	   sb2.insert(1, "Java");//now original string is changed
 	   StringBuffer sb3=new StringBuffer("Hello");
 	   sb3.replace(1, 3, "Java");
 	   System.out.println(sb3);//prints HJavalo
 	    
 	   //StringBuffer delete() method
 	   StringBuffer sb4=new StringBuffer("Hello");
 	   sb4.delete(1, 3);
	}
}
