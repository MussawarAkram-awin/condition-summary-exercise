package exercise.model;

public interface SummarisedConditions {

    ConditionSummary getFirstConditionSummary();
    ConditionSummary getSecondConditionSummary();
    Integer getExtraConditionsCount();

    /**
     *  To simplify the project structure this is a basic implementation that can be used for this exercise.
     */
    public class SummarisedConditionsImpl implements SummarisedConditions {

        @Override
        public ConditionSummary getFirstConditionSummary() {
            return null;
        }

        @Override
        public ConditionSummary getSecondConditionSummary() {
            return null;
        }

        @Override
        public Integer getExtraConditionsCount() {
            return null;
        }
    }
}
