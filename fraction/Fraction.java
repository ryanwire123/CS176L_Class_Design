package labproject5.fraction;

public class Fraction{
	// data about a Fraction
	private int numerator;
	private int denominator;
	// constructor #1
	public Fraction(int n, int d)
	{
		// Set numerator and denominator instance variables from n and d
		// Call the reduce method below to reduce the fraction.
		this.numerator = n;
		this.denominator= d;
		
		reduce();
	}
	// constructor #2 (default constructor)
	public Fraction() // default constructor has no inputs
	{

	}

	// methods
	/**
	 * Reduce this Fraction
	 */
	private void reduce()
	{
		// Set the greatest common factor to the value of numerator.
		int gcf = Math.min(numerator, denominator);
		// While the greatest common factor is greater than 1:
		//      The greatest common factor is the number that divides evenly into
		//      both the numerator and denominator (use the % operator). Issue a
		//      break when the greatest common factor is found.
		//
		//      Reduce the value of greatest common factor by 1.
		// End While
		while(gcf > 1) {
			if(this.numerator % gcf == 0 && this.denominator % gcf == 0) {
				break;
			}
			gcf--;
		}
		// Divide both numerator and denominator by the greatest common factor to 
		// reduce the fraction.
		numerator = numerator/gcf;
		denominator = denominator/gcf;
	}
	public String toString()
	{
		// return a String representation of the fraction, i.e.,
		// numerator / denominator.
		// If numerator is 3 and denominator is 5, the returned String
		// will be "3/5".
		String frac = numerator + "/" + denominator;
		return frac;
	}


	/**
	 * Add Fractions and return the resulting sum Fraction
	 */
	public Fraction add(Fraction f1, Fraction f2)
	{
		// You will need to get the sum of Fractions f1 and f2, resulting
		// in a sumNumerator and sumDenominator that represents the sum.
		// To access f1's numerator, use f1.numerator. To access f1's denominator,
		// use f1.denominator, and so on.
		// Then you will need to construct a Fraction using the resulting
		// sumNumerator and sumDenominator and return that Fraction.
		int sumNumerator = f1.numerator + f2.numerator;
		int sumDenominator = f1.denominator + f2.denominator;
		Fraction newFraction = new Fraction(sumNumerator, sumDenominator);
		return newFraction;	
	}

	/**
	 * Subtract Fractions and return the resulting difference Fraction
	 */
	public Fraction subtract(Fraction f1, Fraction f2)
	{
		int sumNumerator = f1.numerator - f2.numerator;
		int sumDenominator = f1.denominator - f2.denominator;
		Fraction newFraction = new Fraction(sumNumerator, sumDenominator);
		return newFraction;

	}

	/**
	 * Multiply Fractions and return the resulting product Fraction
	 */
	public Fraction multiply(Fraction f1, Fraction f2)
	{
		int sumNumerator = f1.numerator * f2.numerator;
		int sumDenominator = f1.denominator * f2.denominator;
		Fraction newFraction = new Fraction(sumNumerator, sumDenominator);
		return newFraction;

	}

	/**
	 * Divide Fractions and return the resulting Fraction
	 */
	public Fraction divide(Fraction f1, Fraction f2)
	{
		int sumNumerator = f1.numerator * f2.denominator;
		int sumDenominator = f1.denominator * f2.numerator;
		Fraction newFraction = new Fraction(sumNumerator, sumDenominator);
		return newFraction;

	}

} // end of Fraction class
