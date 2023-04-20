package exercise.model;

public interface ConditionSummary {

    String getType();
    String getValue();
    Integer getCount();

    /**
     *  To simplify the project structure this is a basic implementation that can be used for this exercise.
     */
    public class ConditionSummaryImpl implements ConditionSummary {

        @Override
        public String getType() {
            return null;
        }

        @Override
        public String getValue() {
            return null;
        }

        @Override
        public Integer getCount() {
            return null;
        }
    }

}
