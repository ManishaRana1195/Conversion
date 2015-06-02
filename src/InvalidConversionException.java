/**
 * Created by manisharana on 5/27/15.
 */
public class InvalidConversionException extends Exception {
    private final Unit fromUnit;
    private final Unit toUnit;

    public InvalidConversionException(Unit fromUnit, Unit toUnit) {
        this.fromUnit=fromUnit;
        this.toUnit=toUnit;
    }

    @Override
    public String toString() {
        return fromUnit.toString()+" cannot be converted to "+toUnit.toString();
    }
}
