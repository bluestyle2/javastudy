package homework_p;

class Par {
		int a = 12;
		
	}
	class Child extends Par {
		
		
	public Child(int a)	{
		int b = a + 1;
		this.a = a;
		}
	}
	class ArrayEx1 {
		public static void main(String[] args) 	{
			int a = 13;
			new Child(a);
			System.out.println(Child(a));
		}
	}