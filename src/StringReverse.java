
public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "My Name is Sarath", nstr ="";
		char ch;
		
		for(int i=0;i<str.length();i++) {
			ch = str.charAt(i);
			nstr = ch+nstr;
		}
		System.out.println("Reversed String :" +nstr);
	}

}
