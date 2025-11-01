// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args) {
		double saving = Double.parseDouble(args[0]);
		int saving1 = (int)saving;
		double rate = Double.parseDouble(args[1]);
		int years = Integer.parseInt(args[2]);
		double FV = saving * Math.pow((1 + rate / 100), years);
		int FV1 = (int)FV;
		System.out.println("After " + years + " years, $" + saving1 + " saved at " + rate + "% will yield $" + FV1);
	}
}