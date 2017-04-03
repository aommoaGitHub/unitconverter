package unitconverter;

/**
 * define units of area type
 * 
 * @author Vittunyuta Maeprasart
 *
 */
public enum Area implements Unit{
	SQUAREMETER("Squaremeter",1.0),
	SQUARECENTIMETER("Squarecemtimeter",1000.0),
	SQUAREMILLIMETER("Squaremillimeter",100000.0),
	SQUAREFOOT("Squarefeet",10.7639),
	SQUAREINCH("Squareinches",0.0254),
	SQUAREVA("Squareva",400.0),
	RAI("Rai",1600.0);

	public final double value;
	public final String name;
	
	/**
	 * perform the unit
	 * @param name of the unit
	 * @param val is value of the unit
	 */
	Area( String name, double val ) { 
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
