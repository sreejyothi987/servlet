package strings;

public class StriBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder b=new StringBuilder();
		for(int i= 0;i<26;i++) {
			char ch=(char)('a'+i);
			b.append(ch);
			
		}System.out.println(b.toString());
		b.delete(1, 5);
		System.out.println(b.toString());

//System.out.println(b.lastIndexOf('a','z'));
		b.reverse();System.out.println(b.toString());

	}

}
