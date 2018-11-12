public class MyString {
	
	private char [] chars;
	
	public MyString(char [] chars) {
		this.chars = chars;
	}
	
	public int length() {
		return chars.length;
	}
	
	public MyString concat(MyString s) {...}
	
	public char charAt(int i) {
		return chars[i];
	}
	
	public void setCharAt(int i, char c) {
		chars[i] = c;
	}
	
	public int find(MyString s) {...}
	
	public boolean contains(MyString s) {
		return find(s) != -1;
	}
	
	public boolean check(MyString re) {...}
	
	public MyString [] split(MyString delimiter) {...}
	
	public static MyString join(MyString [] strs, MyString delimiter) {...}
	
	public boolean equals(MyString s) {...}
	
	
	
	
	
	
	
	
}

-=========
a b
c = a + b
c = a.concat(b)








