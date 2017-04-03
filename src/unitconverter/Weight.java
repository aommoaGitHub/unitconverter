package unitconverter;

/**
 * define units of weight type
 * 
 * @author Vittunyuta Maeprasart
 *
 */
public enum Weight implements Unit{
	GRAM("Gram",1000.0),
	KILOGRAM("Kilogram",1.0),
	MILLIGRAM("Milligram",1000000.0),
	NEWTON("Newton",9.806),
	TON("Ton",0.001),
	POUND("Pound",2.20462),
	KEET("Keet",10.0);
	
	public final double value;
	public final String name;
	
	/**
	 * perform the unit
	 * @param name of the unit
	 * @param val is value of the unit
	 */
	Weight( String name, double val ) { 
		this.value = val; this.name = name; }

	/*
	 * @see unitconverter.Unit#getValue()
	 */
	@Override
	public double getValue() {
		return value;
	}
	
	/*
	 * @see java.lang.Enum#toString()
	 */
	@Override
	public String toString() {
		return name;
	}
}
