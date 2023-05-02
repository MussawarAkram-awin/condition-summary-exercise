package exercise.model;

import java.util.Objects;

/**
 *   This represents a summary of a single condition.
 */
public class ConditionSummary {

        private final String type;
        private final String value;
        private final Integer additionalCount;

    public ConditionSummary(final String type, final String value, final Integer additionalCount) {
            this.type = type;
            this.value = value;
            this.additionalCount = additionalCount;
        }

        public String getType() {
            return type;
        }

        public String getValue() {
            return value;
        }

        public Integer getAdditionalCount() {
            return additionalCount;
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ConditionSummary that = (ConditionSummary) o;
        return Objects.equals(type, that.type) && Objects.equals(value, that.value) && Objects.equals(additionalCount, that.additionalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, value, additionalCount);
    }

}
