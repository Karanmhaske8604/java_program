package java_home.String;

public class Strinnninterning {

	public static void main(String[] args) {

		String str="lmn";//stored in SCP
		
		String str2=new String("lmn");//string value also stored in SCP because of unique literal value
		
		String str3=str2.intern();//intern() method help to retrive ref.from SCP of uniqur literal
		
		String str4=new String("pqr");
		
		System.out.println(str==str2);
		System.out.println(str==str3);
		System.out.println(str2==(str4));//
				
	}

}
