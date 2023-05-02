# Conditions Summary Exercise
This exercise represents a small piece of business logic. It contains an interface that needs an implementation.

And explanation of each of the provided classes/interfaces is as follows:

### ConditionSummarizer.java
The condition summarizer interface allows an implementation to accept a list of conditions, maps them into ConditionSummary objects, and returns a ConditionResponse.

### ConditionResponse.java
The condition response represents **up to** 2 of the ConditionSummary objects, and a count. These may or may not be null depending on the criteria described below.

### ConditionSummary.java
The condition summary represents a summary of a condition. The condition summary contains 3 fields that may or may not be null depending on criteria described below.

### Condition.java
The condition represents one of our domain objects. It contains 2 fields. A condition object **always** has a type and at least 1 value.

## Exercise
Implement the ConditionSummarizer interface with respect to the following business rules. Complete one at a time:

1. If the conditions list is null, or empty, return the response populated with null fields.

2. From the list of conditions passed in, only summarise the first condition and return it set in the response.

3.  From the list of conditions passed in, only summarise the first two condition and return them set in the response.

4. If there are more than two conditions then only summarize the first, and add the count of the remaining conditions to the response. Leave the secondConditionSummary as null.


### How to summarise a condition
Exercise 2, 3 and 4 will require you to summarise some/all the incoming conditions.

A condition is summarised in the following way:
- The 'Type' of a condition is copied across to the summary.
- If the condition has a single 'Value', this is copied across to the summary. The additionalCount is null.
- If the condition has more than one 'Value', then the 'Value' in the summary is null, but the count of the values is added to the count in  the summary.

### Testing
Two sample test class files (commented out) can optionally be used. One is for Junit, the other Spock.