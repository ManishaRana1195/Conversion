/**
 * Created by manisharana on 5/27/15.
 */
public enum Unit {

    MILLIMETRE(MetricType.LENGTH) {


        @Override
        public float convertFromBaseUnit(float value) {
            return value * 10;
        }

        @Override
        public float convertToBaseUnit(float value) {
            return value / 10;
        }

        @Override
        public String toString() {
            return " MM";
        }
    },
    CENTIMETRE(MetricType.LENGTH){
        @Override
        public float convertFromBaseUnit(float value) {
            return value;
        }

        @Override
        public float convertToBaseUnit(float value) {
            return value;
        }

        @Override
        public String toString() {
            return " CM";
        }
    },
    METRE(MetricType.LENGTH){
        @Override
        public float convertFromBaseUnit(float value) {
            return value/100;
        }

        @Override
        public float convertToBaseUnit(float value) {
            return value*100;
        }

        @Override
        public String toString() {
            return " M";
        }
    },
    INCH(MetricType.LENGTH){
        @Override
        public float convertFromBaseUnit(float value) {
            return value/2.54f;
        }

        @Override
        public float convertToBaseUnit(float value) {
            return value* 2.54f;
        }
        @Override
        public String toString() {
            return " Inch";
        }
    },
    CELSIUS(MetricType.TEMPERATURE){
        @Override
        public float convertFromBaseUnit(float value) {
            return value;
        }

        @Override
        public float convertToBaseUnit(float value) {
            return value;
        }
        @Override
        public String toString() {
            return " C";
        }
    },
    KELVIN(MetricType.TEMPERATURE){
        @Override
        public float convertFromBaseUnit(float value) {
            return value+273;
        }

        @Override
        public float convertToBaseUnit(float value) {
            return value-273;
        }

        @Override
        public String toString() {
            return " K";
        }
    },
    FAHRENHEIT(MetricType.TEMPERATURE){
        @Override
        public float convertFromBaseUnit(float value) {
            return (value-32)* 5/9;        }

        @Override
        public float convertToBaseUnit(float value) {
            return (9/5 *value)+32 ;        }
        @Override
        public String toString() {
            return " F";
        }
    };
    private MetricType type;

    Unit(MetricType type) {
        this.type=type;
    }

    MetricType getType(){
        return this.type;
    }


    public abstract float convertFromBaseUnit(float value);
    public abstract float convertToBaseUnit(float value);

}
