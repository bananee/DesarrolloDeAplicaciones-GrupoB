package ar.edu.unq.desapp.grupob.model;

/**
 * @author damian
 */
public enum Shift {

    Beforenoon {
        public String getTimeOfDay() {
            return "Mañana";
        }
    },
    Afternoon {
        public String getTimeOfDay() {
            return "Tarde";
        }
    };

    public abstract String getTimeOfDay();
}
