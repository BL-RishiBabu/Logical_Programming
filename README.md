# Logical_Programming

This project contains a collection of Java programs addressing mathematical logic, number theory, and practical simulations like a stopwatch and a coupon generator.

### 1. Fibonacci SeriesGenerates 
a sequence where each number is the sum of the two preceding ones, starting from 0 and 1.Formula: $F(n) = F(n-1) + F(n-2)$
Example: 0, 1, 1, 2, 3, 5, 8, 13...

### 2. Perfect Number

A utility to check if a positive integer is equal to the sum of its proper divisors (excluding the number itself).

Example: 28 (Divisors: 1, 2, 4, 7, 14 $\rightarrow$ $1+2+4+7+14 = 28$).

### 3. Prime Number

A program to determine if a number is prime. It identifies numbers greater than 1 that have no positive divisors other than 1 and themselves.

Note: 2 is the only even prime number.

### 4. Reverse a Number

Implements logic to reverse an integer using a loop (while or for) and arithmetic operators.

Process:
Find remainder: num % 10
Build reverse: reverse * 10 + remainder
Reduce number: num / 10

### 5. Coupon Numbers

A simulation to determine how many random numbers must be generated to obtain $N$ distinct coupon numbers.

Input: $N$ distinct coupons.
Logic: Uses a random number generator and tracks unique values to count the total iterations required to find all distinct coupons.
Structure: Utilizes static functions for generation and distinct processing.

### 6. Stopwatch Simulation

A functional stopwatch tool to measure execution time.
Functionality: Captures the system time at "Start" and "End" clicks.
Output: Calculates and prints the elapsed time in milliseconds or seconds.

## How to Run

Compile the Java files: javac ProgramName.java
Run the application: java ProgramName

## Technical Requirements

Language: Java 8 or higher
Concepts Used: Loops (For/While), Static Methods, Random Class, System Time Management.
