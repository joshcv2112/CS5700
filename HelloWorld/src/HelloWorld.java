public class HelloWorld {
	
	public class Pairs {
		Pairs(int _x, int _y) {
			this.x = _x;
			this.y = _y;
		}
		public int x;
		public int y;
	}
	
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5, 6};
		Pairs[] p = {};
		
		for (int i = 1; i < a.length; i++) {
			for (int j = (a.length-i); j > 0; j--) {
				System.out.println(i + " " + (a.length-(j-1)));
			}
		}
	}
}
