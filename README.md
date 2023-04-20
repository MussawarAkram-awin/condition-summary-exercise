# Conditions Summary Exercise
This exercise represents a small piece of business logic. It contains a group of interfaces that need implementations.

And explanation of each interface is as follows:

### Condition.java
The condition interface represents one of our domain objects. It contains 3 fields. The specific values of these fields are not important for this exercise.

### ConditionSummary.java
The condition summary interface represents a summary of the objects that implement the condition interface. The condition summary also contains 3 fields that may or may not be set depending on criteria described below.

### SummarisedConditions.java
The summarised conditions interface represents up to 2 of the above ConditionSummary objects, and an integer count. As above, these may or may not be set depending on the criteria described below.

### ConditionSummarizer.java
The condition summarizer interface allows an implementation to accept a list of conditions, changes them into ConditionSummary objects, and return a SummarisedConditions implementation.


## Exercise
Some basic implementations of the interface can be found in the interface class files. For simplicity, you can enhance these implementations as needed to complete the exercises.

Implement the ConditionSummarizer interface with respect to the following business rules. These can be completed one at a time:

1. If the conditions list is null, or empty, return null.

2. From the list of conditions passed in, always summarise the first condition.

3.  If there are exactly 2 conditions then summarise the second condition as well.

4. If there are more than two conditions then only summarize the first, and add the count of the unsummarised conditions to the 'SummarisedConditions'.


### How to summarise a condition
A condition is summarised in the following way:
- The 'Type' of a condition is copied across to the summary.
- If the condition has a single 'Value', this is copied across to the summary.
- If the condition has more than one 'Value', then the 'Value' string itself is not used, but the count of the values is added to the count in the summary.