package basics.classprogram;

class Classprog 
 {
	  void sample(String bank,int accountno,byte pannumber,long no_of_holders,short no_of_ATM,double balance,float debit,char credit) {
		 {
			System.out.println("bank name is:"+bank);
			System.out.println("bank name is:"+accountno);
			System.out.println(pannumber);
			 System.out.println( no_of_holders);
			 System.out.println( no_of_ATM);
			 System.out.println(balance);
			 System.out.println(debit);
			 System.out.println(credit);
		 }

}
	
	 public static void main(String[] args) {
		String a="HDFC"; 
		int b=1234567;
	 byte c= 8;
	 long d=10;
	 short e=5;
	 double f=20000;
	 float g=10000;
	 char h='k';
		Classprog s=new Classprog();
		s.sample(a,b,c, d,e, f, g,h);
		  
	}
 }