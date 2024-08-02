class App {
    static void reverseString(char[] s) {
        int left = 0, right = s.length - 1;
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }

public static void main(String[] args) {



		System.out.println("Reverse String program:- ");
		
char[] name = {'A','M','M','A'};

System.out.println("Name before reversed: " + new String(name));
reverseString(name);
System.out.println("Name after reversed: " + new String(name));

	}
}
