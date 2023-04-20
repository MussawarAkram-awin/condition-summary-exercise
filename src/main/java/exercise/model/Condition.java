package exercise.model;

import java.util.List;

public interface Condition {

    String getType();
    String getOperator();
    List<String> getValues();

    /**
     *  To simplify the project structure this is a basic implementation that can be used for this exercise.
     */
    public class ConditionA implements Condition {

        @Override
        public String getType() {
            return null;
        }

        @Override
        public String getOperator() {
            return null;
        }

        @Override
        public List<String> getValues() {
            return null;
        }
    }

}
