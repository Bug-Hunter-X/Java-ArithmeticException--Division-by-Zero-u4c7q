# Java ArithmeticException: Division by Zero

This repository demonstrates a common yet often overlooked Java exception: ArithmeticException, specifically, division by zero. The code includes a simple example and a solution to mitigate the error.

## Bug Description

The `bug.java` file contains a simple program that attempts to divide an integer by zero, resulting in an `ArithmeticException`. While seemingly obvious, these kinds of errors can be insidious when embedded in larger and more complex logic.

## Solution

The `bugSolution.java` file provides a solution by adding a check to prevent division by zero. The updated code includes error handling to gracefully manage this situation.

## How to run the code

1. Clone the repository
2. Compile the files:
   ```bash
   javac bug.java bugSolution.java
   ```
3. Run the files:
   ```bash
   java bug
   java bugSolution
   ```

Observe the differences in output and behavior between the buggy and the fixed code examples.