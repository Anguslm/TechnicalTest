How To Use

Auto-import as prompted by Maven pop-up.

Run tests from the runner class in test/java.

By default it will run the @FactorFinder tag, which will link to all tests in the feature file, but you can set your own tag instead and append it to the beginning of the subset of scenarios you want to run in the feature file.

The when and then steps are reusable with configurable input and expected output, so new tests can easily be added by copying an existing test and modifying the desired values in the feature file.




Application Notes

The hashmap looping method is designed to ensure ease of extensibility. If more factor-string combinations are desired, no additional if statements need be written, the extra pairs can simply be added to the hashmap.



Test Notes

In accordance with equivalence partitioning, one test has been written for each possible combination of 'Pling,' 'Plang' and 'Plong' and the case of no instances of the specified factors. In addition, a test case has been added for the special cases of a negative number with factors, a negative number without factors, and zero (all three are factors).

If this application was embedded into a user interface such as a webpage, some additional tests would be required to cover the cases of a user inputting a decimal or string. However, if the application was part of a backend process these would not be necessary as it is written in a strongly typed language so will not compile when called with a parameter other than an integer.




Tools Used

The application and tests are written in Java, using Maven as a build management tool. The tests are written with testNG and cucumber to utilise a behaviour driven development format which is readable, reusable and easy to understand and use.
