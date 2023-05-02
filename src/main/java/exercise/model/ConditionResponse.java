package exercise.model;

import java.util.Objects;

/**
 *  The condition response is used by the frontend to display details to the user.
 */
public class ConditionResponse {

    private final ConditionSummary firstConditionSummary;
    private final ConditionSummary secondConditionSummary;
    private final Integer extraConditionsCount;

    public ConditionResponse(
            final ConditionSummary firstConditionSummary, final ConditionSummary secondConditionSummary,
            final Integer extraConditionsCount
    ) {
        this.firstConditionSummary = firstConditionSummary;
        this.secondConditionSummary = secondConditionSummary;
        this.extraConditionsCount = extraConditionsCount;
    }

    public ConditionSummary getFirstConditionSummary() {
        return firstConditionSummary;
    }

    public ConditionSummary getSecondConditionSummary() {
        return secondConditionSummary;
    }

    public Integer getExtraConditionsCount() {
        return extraConditionsCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ConditionResponse that = (ConditionResponse) o;
        return Objects.equals(firstConditionSummary, that.firstConditionSummary) && Objects.equals(secondConditionSummary, that.secondConditionSummary) && Objects.equals(extraConditionsCount, that.extraConditionsCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstConditionSummary, secondConditionSummary, extraConditionsCount);
    }

}
