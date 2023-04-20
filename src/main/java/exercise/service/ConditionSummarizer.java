package exercise.service;

import exercise.model.Condition;
import exercise.model.SummarisedConditions;
import java.util.List;

public interface ConditionSummarizer {

    /**
     * @param conditions A list of conditions
     * @return A summary of the conditions
     */
    SummarisedConditions summarise(List<Condition> conditions);

}