package exercise.service;

import exercise.model.Condition;
import exercise.model.ConditionResponse;
import java.util.List;

public interface ConditionSummarizer {

    /**
     * @param conditions A list of conditions
     * @return A summary of the conditions
     */
    ConditionResponse summarise(List<Condition> conditions);

}