package unitconverter;

/**
 * perform the conversion of unit converter application
 * 
 * @author Vittunyuta Maeprasart
 *
 */
public class UnitConverter {
	/**
	 * define types of unit to be converted
	 * 
	 * @author Vittunyuta Maeprasart
	 *
	 */
	public enum UnitTypes{
		LENGTH("Length"), AREA("Area"), WEIGHT("Weight");
		
		private final String name;
		
		/**
		 * perform the unit
		 * @param name
		 */
		UnitTypes(String name) {
			this.name = name;
		}
		
		/*
		 * @see java.lang.Enum#toString()
		 */
		@Override
		public String toString() {
			return name;
		}
	}

	/**
	 * get all units of input unit type
	 * @param unitType is the type of unit to be converted
	 * @return an array of unit
	 */
	public Unit[] getUnits(UnitTypes unitType){
		switch (unitType) {
		case LENGTH:
			return Length.class.getEnumConstants();
		case AREA:
			return Area.class.getEnumConstants();
		case WEIGHT:
			return Weight.class.getEnumConstants();
		default:
			System.out.println("Invalid unit types.");
			return null;
		}
	}
	
	/**
	 * conversion method
	 * @param inputNumber number of <code>fromUnit</code>
	 * @param fromUnit is unit to be converted
	 * @param toUnit is unit to convert to
	 * @return number of conversion of <code>toUnit</code>
	 */
	public double convert(double inputNumber, Unit fromUnit, Unit toUnit) {
		System.out.println("innum"+inputNumber);
		System.out.println("from"+fromUnit.toString());
		System.out.println("to"+toUnit.toString());
		return inputNumber * fromUnit.getValue() / toUnit.getValue();
	}
}
