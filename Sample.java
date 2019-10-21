package ai.ponicode;
import java.util.Date;
import java.util.StringTokenizer;

public class Sample {
	private String test;
	public String Info;
	public String getFirstname(java.util.StringTokenizer strtok) {
		//        boolean bTokens = strtok.hasMoreTokens();
		//        if (strtok == null && strtok.length() != 0 || !strtok.isEmpty() || strtok.hasMoreTokens() && !bTokens && 0 <= strtok.getNumberOfTokens() || strtok.getA().getB() == null)
		//            doSomething();
		if (strtok == null)
			System.out.println("tokenizer is null");
		if (strtok == null || !strtok.hasMoreTokens())
			System.out.println("tokenzer null or empty");
		System.out.println("next token is " + strtok.nextToken());
		if (strtok.hasMoreTokens())
			return strtok.nextToken();
		return test;
	}

	public long customerSince(String customer, Date since, int age) throws IllegalArgumentException {
		if (customer == null)
			throw new IllegalArgumentException("Customer cannot be null");

		if (customer.length() == 0)
			return -1;
		if (since == null)
			return -1;

		System.out.println("Customer name length is " + customer.length());
		return new Date().getTime() - since.getTime();
	}

	public boolean isEmptyUser(String user) {
		if (user.length() == 0)
			return true;
		return false;
	}

	public boolean isCustomerValid(String customer) {
		if (customer == null) {
			customer = new String("test");
			System.out.println(customer.length());
		}
		return customer.length() != 0;
	}

	public int Sum(int i, int j) {
		return i+j;
	}

	public static void main(String[] args) {
		Sample sample = new Sample();
		System.out.println(sample.Info);
	}
}
