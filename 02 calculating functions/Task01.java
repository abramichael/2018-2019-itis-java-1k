public class Task01 {
	
	public static void main(String [] args) {
		
		double x = 0.5;
		double y;
		long c1, c2;
		
		c1 = System.nanoTime();
		y = Math.exp(x);
		c2 = System.nanoTime();
		System.out.println("Result 1: " + y);
		System.out.println("Time:" + (c2 - c1));
		final double EPS = 1e-17;
		double s, a;
		int i;
		c1 = System.nanoTime();
		a = 1;
		s = a;
		i = 1;
		while ((a > 0 ? a : -a) > EPS) {
			a = a * x / i;
			s += a;
			i += 1;
		}
		c2 = System.nanoTime();
		System.out.println("Result 2: " + s);
		System.out.println("Time 2: " + (c2 - c1));
	







	
		
		
		
		
		
		
	}
	
	
}