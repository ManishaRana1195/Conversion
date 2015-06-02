/**
 * Created by manisharana on 5/27/15.
 */
public class Metric {



    public String metricConversion(Unit fromUnit, Unit toUnit,float value) throws InvalidConversionException {

        if(isSameMetricType(fromUnit,toUnit))
            throw new InvalidConversionException(fromUnit,toUnit);


        float valueInBaseUnit = fromUnit.convertToBaseUnit(value);
        float convertedValue = toUnit.convertFromBaseUnit(valueInBaseUnit);
        return  value+fromUnit.toString()+ " => "+convertedValue+toUnit.toString();

    }

    public boolean isSameMetricType(Unit fromUnit,Unit toUnit){
        return (fromUnit.getType() != toUnit.getType());
    }
}
