package servlet;

public class Test {
	public static void main(String[] args) {
		int num = 4567;
		int count = 15;
		StringBuffer result = new StringBuffer("");
		while (num != 0) {
			int temp = num & count;
			if (temp > 10) {
				char tchar = (char) (97 + (temp - 10));
				result.append(tchar);
			} else {
				result.append(temp);
			}	
			num = num >>> 4;
		}
		result = result.reverse();
		System.out.println(result.toString());
		int test1 = 256;
		System.out.println(test1>>2);
		System.out.println(test1>>>2);
		int test2 = -256;
		System.out.println(test2>>2);
		System.out.println(test2>>>2);
	}
}