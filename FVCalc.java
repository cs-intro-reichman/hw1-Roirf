// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args) {
		double saving = Double.parseDouble(args[0]);
		double rate = Double.parseDouble(args[1]);
		int years = Integer.parseInt(args[2]);
		double FV = saving * Math.pow((1 + rate / 100), years);
		double FV1 = Math.round(FV);
		System.out.println("After " + years + " years, your saving will grow to " + FV1 + " Shekels.");
	}
}