package marksheet;


public class a {
	
	int ma,eng,ur,com,phy;
	int obt;
	void getdata(int a,int b,int c,int d,int e)
	{
		ma=a;
		eng=b;
		ur=c;
		com=d;
		phy=e;
		
	}
	void obtain()
	{
		
		obt=ma+eng+ur+com+phy;
		System.out.println("Obtain marks is   "+obt);
	}
	
}
