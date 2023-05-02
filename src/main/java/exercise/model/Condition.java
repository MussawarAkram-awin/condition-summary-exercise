package exercise.model;

import java.util.List;
import java.util.Objects;

/**
 *  The condition is a domain object.
 */
public class Condition {

    final private String type;
    final private List<String> values;

    public Condition(final String type, final List<String> values) {
        this.type = type;
        this.values = values;
    }

    public String getType() {
        return type;
    }

    public List<String> getValues() {
        return values;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Condition condition = (Condition) o;
        return Objects.equals(type, condition.type) && Objects.equals(values, condition.values);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, values);
    }

}
