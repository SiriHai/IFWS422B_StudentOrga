package demo;
public class PerformanceTest {
	private static final int MAX = 500000;	

	public static void main(String[] args) {

		int testNr = 1;
		
		switch(testNr){
		case 1: System.out.println("Test String:");
			testString();
			break;
		
		case 2: System.out.println("Test StringBuffer:");
			testStringBuffer();
			break;
		
		default: break;
		}
	}

	private static void testString() {
		String s = "";
		long begin = System.currentTimeMillis();
		for (int i = 0; i < MAX; i++) {
			s = s + ("x");
		}
		long end = System.currentTimeMillis();
		System.out.println("String: " + (end - begin) + " ms");
	}

	private static void testStringBuffer() {
		StringBuffer sb = new StringBuffer();
		long begin = System.currentTimeMillis();
		for (int i = 0; i < MAX; i++) {
			sb.append("x");
		}
		long end = System.currentTimeMillis();
		System.out.println("StringBuffer: " + 
			(end - begin) + " ms");
	}
}
