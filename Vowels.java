package JavaExam;

public class Vowels {
public static void main(String[] args[]) {
	//1000 Auto generated method stub
	String str = "ones";
	int vcount = 0 , ccount = 0;
	str = str.toLowerCase();
	for(int i = 0 ; i < str.length(); i++ ){char ch = str. charAt(i); if(ch == 'a' || ch == 'i' || ch =='o' || ch == 'u')
	{
		vcount++;
	}
	else if((ch >= 'a'&& ch <= 'z')) {
		ccount++;
	}
}
System.out.println ("Number of Vowels: "+ vcount);
System.out.println("Number of Consonants" + ccount);

}
}