package patterns;

import java.util.Scanner;

public class Pattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter a value : ");
		int val = sc.nextInt();
		
		pattern12(val);
		pattern13(val);
		pattern14(val);
		pattern15(val);
		pattern16(val);
		pattern17(val);
		pattern18(val);
		pattern19(val);
		pattern20(val);
		pattern21(val);
		
	}

	public static void pattern22(int val) {
		for(int i = 0;i<2*val-1;i++) {
			for(int j = 0;j<2*val-1;j++) {
				int top = i;
				int left = j;
				int right = (2*val-2)-j;
				int down = (2*val-2)-i;
				System.out.print(val-min(min(top,down),min(left,right)));
			}
			System.out.println();
		}
	}

	public static int min(int m, int n) {
		if(m>n) {
			return n;
		}
		else {
			return m;
		}
	}

	public static void pattern21(int val) {
		for(int i = 0;i<val;i++) {
			for(int j = 0;j<val;j++) {
				if(i==0||i==val-1||j==0||j==val-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void pattern20(int val) {
		for(int i = 0;i<val*2-1;i++) {
			if(i<=4) {
				for(int j = 0;j<=i;j++) {
					System.out.print("*");
				}
				for(int k = 8-2*i;k>0;k--) {
					System.out.print(" ");
				}
				for(int l = 0;l<=i;l++) {
					System.out.print("*");
				}
				System.out.println();
			}
			else {
				for(int j = i;j<val*2-1;j++) {
					System.out.print("*");
				}
				for(int k = 0;k<(i*2)-8;k++) {
					System.out.print(" ");
				}
				for(int j = i;j<val*2-1;j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}

	public static void pattern19(int val) {
		for(int i = 0;i<val*2;i++) {
			if(i<5) {
				for(int j = val;j>i;j--) {
					System.out.print("*");
				}
				for(int k = 1;k<=i*2;k++) {
					System.out.print(" ");
				}
				for(int l = val;l>i;l--) {
					System.out.print("*");
				}
				System.out.println();
			}
			else {
				for(int j = 1;j<=i-val+1;j++) {
					System.out.print("*");
				}
				for(int k = 18-2*i;k>=1;k--) {
					System.out.print(" ");
				}
				for(int l = 1;l<=i-val+1;l++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}

	public static void pattern18(int val) {
		for(int i = 0;i<val;i++) {
			for(char j = (char) ((64+val)-i);j<=(64+val);j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	public static void pattern17(int val) {
		for(int i = 1;i<=val;i++) {
			//space
			for(int j = val;j>i;j--) {
				System.out.print(" ");
			}
			//character
			char ch = 'A';
			for(int k = 0;k<=i-1;k++) {
				System.out.print(ch);
				ch++;
			}
			ch--;
			for(int l = 0;l<=i-2;l++) {
				ch--;
				System.out.print(ch);
			}
			System.out.println();
		}
	}

	public static void pattern16(int val) {
		char count = 'A';
		for(int i = 1;i<=val;i++) {
			for(int j = 1;j<=i;j++) {
				System.out.print(count+" ");
			}
			count++;
			System.out.println();
		}
	}

	public static void pattern15(int val) {
		for(int i = 1;i<=val;i++) {
			char count = 'A';
			for(int j = val;j>=i;j--) {
				System.out.print(count+" ");
				count++;
			}
			System.out.println();
		}
	}

	public static void pattern14(int val) {
		for(int i = 1;i<=val;i++) {
			char count = 'A';
			for(int j = 1;j<=i;j++) {
				System.out.print(count+" ");
				count++;
			}
			System.out.println();
		}
	}

	public static void pattern13(int val) {
		int count = 1;
		for(int i = 1;i<=val;i++) {
			for(int j = 1;j<=i;j++) {
				System.out.print(count+" ");
				count++;
			}
			System.out.println();
		}
	}

	public static void pattern12(int val) {
		for(int i = 1;i<=val;i++) {
			//number
			for(int j = 1;j<=i;j++) {
				System.out.print(j);
			}
			//space
			for(int k = 10-(2*i);k>=1;k--) {
				System.out.print(" ");
			}
			//number
			for(int l = i;l>=1;l--) {
				System.out.print(l);
			}
			System.out.println();
		}
	}

	public static void pattern11(int val) {
		int start = 1;
		for(int i = 0;i<val;i++) {
			if(i%2==0) 
				start = 1;
			else
				start = 0;
			for(int j = 0;j<=i;j++) {
				System.out.print(start+" ");
				start = 1-start;
			}
			System.out.println();
		}
	}

	public static void pattern10(int val) {
		for(int i = 1;i<val*2;i++) {
			if(i<=5) {
				for(int j = 1;j<=i;j++) {
					System.out.print("* ");
				}
				System.out.println();
			}
			else {
				for(int k = (val*2)-i;k>=1;k--) {
					System.out.print("* ");
				}
				System.out.println();
			}
		}
	}

	public static void pattern9(int val) {
		for(int i = 0;i<val*2-1;i++) {
			if(i<5) {
				//space
				for(int j=val;j>i+1;j--) {
					System.out.print(" ");
				}
				//Stars
				for(int k = 1;k<=(i*2)+1;k++) {
					System.out.print("*");
				}
				System.out.println();
			}
			else {
				//space
				for(int l=i-val;l>=0;l--) {
					System.out.print(" ");
				}
				//Stars
				for(int m = -2*(i-5)+7;m>=1;m--) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}

	public static void pattern8(int val) {
		for(int i = val;i>0;i--) {
			//space
			for(int j=val;j>i;j--) {
				System.out.print(" ");
			}
			//Stars
			for(int k = (i*2)-1;k>=1;k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void pattern7(int val) {
		for(int i = 0;i<val;i++) {
			//space
			for(int j=val;j>i+1;j--) {
				System.out.print(" ");
			}
			//Stars
			for(int k = 1;k<=(i*2)+1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

	public static void pattern6(int val) {
		for(int i = 1;i<=val;i++) {
			int count = 1;
			for(int j = val;j>=i;j--) {
				System.out.print(count+" ");
				count++;
			}
			System.out.println();
		}
	}

	public static void pattern5(int val) {
		for(int i = 1;i<=val;i++) {
			for(int j = val;j>=i;j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void pattern4(int val) {
		for(int i = 1;i<=val;i++) {
			for(int j = 1;j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
	
	public static void pattern3(int val) {
		for(int i = 1;i<=val;i++) {
			for(int j = 1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

	public static void pattern2(int val) {
		for(int i = 1;i<=val;i++) {
			for(int j = 1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void pattern1(int val) {
		for(int i = 1;i<=val;i++) {
			for(int j = 1;j<=val;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
