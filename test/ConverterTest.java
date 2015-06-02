import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;

public class ConverterTest {

    @Rule
    public ExpectedException exception = ExpectedException.none();
    private Metric metric;

    @Before
    public void setUp(){
        metric = new Metric();
    }
    @Test
    public void shouldConvertCelsiusTo()
    {
        try {
            assertEquals("10.0 C => 283.0 K", metric.metricConversion(Unit.CELSIUS, Unit.KELVIN, 10));
            assertEquals("30.0 C => -1.1111112 F", metric.metricConversion(Unit.CELSIUS, Unit.FAHRENHEIT, 30));
        } catch (InvalidConversionException invalidConversionException) {
            invalidConversionException.toString();
        }
    }

    @Test
    public void shouldConvertKelvinTo(){
        try {
            assertEquals("10.0 K => -263.0 C", metric.metricConversion(Unit.KELVIN, Unit.CELSIUS, 10));
            assertEquals("30.0 K => -152.77777 F", metric.metricConversion(Unit.KELVIN, Unit.FAHRENHEIT, 30));
        } catch (InvalidConversionException invalidConversionException) {
            invalidConversionException.toString();
        }
    }

    @Test
    public void shouldConvertFahrenheitTo(){
        try {
            assertEquals("10.0 F => 42.0 C", metric.metricConversion(Unit.FAHRENHEIT, Unit.CELSIUS, 10));
            assertEquals("30.0 F => 335.0 K", metric.metricConversion(Unit.FAHRENHEIT, Unit.KELVIN, 30));
        } catch (InvalidConversionException invalidConversionException) {
            invalidConversionException.toString();
        }
    }

    @Test
    public void shouldConvertMetreTo(){
        try {
            assertEquals("10.0 M => 1000.0 CM", metric.metricConversion(Unit.METRE, Unit.CENTIMETRE, 10));
            assertEquals("30.0 M => 1181.1024 Inch", metric.metricConversion(Unit.METRE, Unit.INCH, 30));
            assertEquals("30.0 M => 30000.0 MM", metric.metricConversion(Unit.METRE, Unit.MILLIMETRE, 30));
        } catch (InvalidConversionException invalidConversionException) {
            invalidConversionException.toString();
        }
    }

    @Test
    public void shouldConvertCentimetreTo(){
        try {
            assertEquals("10.0 CM => 0.1 M", metric.metricConversion(Unit.CENTIMETRE, Unit.METRE, 10));
            assertEquals("30.0 CM => 11.811024 Inch", metric.metricConversion(Unit.CENTIMETRE, Unit.INCH, 30));
            assertEquals("30.0 CM => 300.0 MM", metric.metricConversion(Unit.CENTIMETRE, Unit.MILLIMETRE, 30));
        } catch (InvalidConversionException invalidConversionException) {
            invalidConversionException.toString();
        }
    }

    @Test
    public void shouldConvertMillimetreTo(){
        try {
            assertEquals("10.0 MM => 0.01 M", metric.metricConversion(Unit.MILLIMETRE, Unit.METRE, 10));
            assertEquals("30.0 MM => 1.1811024 Inch", metric.metricConversion(Unit.MILLIMETRE, Unit.INCH, 30));
            assertEquals("30.0 MM => 3.0 CM", metric.metricConversion(Unit.MILLIMETRE, Unit.CENTIMETRE, 30));
        } catch (InvalidConversionException invalidConversionException) {
            invalidConversionException.toString();
        }
    }

}
