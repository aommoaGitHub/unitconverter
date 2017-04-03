package unitconverter;

/**
 * define units of area type
 * 
 * @author Vittunyuta Maeprasart
 *
 */
public enum Volume implements Unit{
	CUBICMETER("Cubicmeter",0.001),
	CUBICCENTIMETER("Cubiccemtimeter",1000.0),
	LITRES("Litres",1.0),
	TABLESPOON("Tablespoon",67.628),
	TEASPOON("Teaspoon",202.884),
	GALLON("Gallon",0.264172);

	public final double value;
	public final String name;
	
	/**
	 * perform the unit
	 * @param name of the unit
	 * @param val is value of the unit
	 */
	Volume( String name, double val ) { 
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
