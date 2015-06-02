import static junit.framework.Assert.assertFalse;

/**
 * Created by manisharana on 6/2/15.
 */
public class UnitConversion {

    public static void main (String args[]){
        try {
            new Metric().metricConversion(Unit.KELVIN, Unit.METRE, 50);

        } catch (InvalidConversionException invalidConversionException) {
            invalidConversionException.printStackTrace();
        }

    }
}
