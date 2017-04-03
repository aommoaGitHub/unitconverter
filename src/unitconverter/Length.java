package unitconverter;

/**
 * define units of length type
 * 
 * @author Vittunyuta Maeprasart
 *
 */
public enum Length implements Unit{
	METER("Meter",1.0),
	KILOMETER("Kilometer",1000.0),
	CENTIMETER("Cemtimeter",0.01),
	FOOT("Feet",3.28084),
	INCH("Inches",39.3701),
	MILE("Mile",0.000621371),
	VA("Va",0.5);

	
	public final double value;
	public final String name;
	
	/**
	 * perform the unit
	 * @param name of the unit
	 * @param val is value of the unit
	 */
	Length( String name, double val ) { 
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
