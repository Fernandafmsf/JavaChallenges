# Challenges 
Description of [HackerRank Challenges](https://www.hackerrank.com/dashboard)

## Java Stdin and Stdout I

### Task 

In this challenge, you must read  integers from stdin and then print them to stdout. Each integer must be printed on a new line. To make the problem a little easier, a portion of the code is provided for you in the editor below.

Input Format:

There are  lines of input, and each line contains a single integer.

Sample Input: 
```` Java
42
100
125
````
Sample Output
```` Java
42
100 
125
````   
Solution: [ex00](HackerRank/src/Introduction/ex00.java)

## Java Stdin and Stdout II

### Task

In this challenge, you must read an integer, a double, and a String from stdin, then print the values according to the instructions in the Output Format section below.

**Input Format**

There are three lines of input:

The first line contains an integer.
The second line contains a double.
The third line contains a String.

**Output Format**

There are three lines of output:

On the first line, print String: followed by the unaltered String read from stdin.
On the second line, print Double: followed by the unaltered double read from stdin.
On the third line, print Int: followed by the unaltered integer read from stdin.

Solution: [ex01](HackerRank/src/Introduction/ex01.java)


## Java If-Else
### Task

Given an integer, perform the following conditional actions:

- If  is odd, print Weird
- If  is even and in the inclusive range of  to , print Not Weird
- If  is even and in the inclusive range of  to , print Weird
- If  is even and greater than , print Not Weird
Complete the stub code provided in your editor to print whether or not  is weird.

**Input Format**

A single line containing a positive integer.


**Output Format**

Print Weird if the number is weird; otherwise, print Not Weird.

Solution: [ex02](HackerRank/src/Introduction/ex02.java)

## Java Output Formatting

**Input Format**

Every line of input will contain a String followed by an integer.
Each String will have a maximum of  alphabetic characters, and each integer will be in the inclusive range from  to .

**Output Format**

In each line of output there should be two columns:
The first column contains the String and is left justified using exactly  characters.
The second column contains the integer, expressed in exactly  digits; if the original input has less than three digits, you must pad your output's leading digits with zeroes.

**Sample Input**

```Java
java 100
cpp 65
python 50
```

**Sample Output**
```
================================
java           100
cpp            065
python         050
================================
```

Solution: [ex03](HackerRank/src/Introduction/ex03.java)

## Java Datatypes

Java has 8 primitive data types; char, boolean, byte, short, int, long, float, and double. For this exercise, we'll work with the primitives used to hold integer values (byte, short, int, and long):

- A byte is an 8-bit signed integer.
- A short is a 16-bit signed integer.
- An int is a 32-bit signed integer.
- A long is a 64-bit signed integer.
Given an input integer, you must determine which primitive data types are capable of properly storing that input.

Reference:[Documentação](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html)

**Input Format**

The first line contains an integer,T, denoting the number of test cases.
Each test case, T, is comprised of a single line with an integer, n, which can be arbitrarily large or small.

**Output Format**

For each input variable  and appropriate primitive , you must determine if the given primitives are capable of storing it. If yes, then print:

``` java
n can be fitted in:
* dataType
```

If there is more than one appropriate data type, print each one on its own line and order them by size (i.e.: ).

If the number cannot be stored in one of the four aforementioned primitives, print the line:

```java
n can't be fitted anywhere.
```

Solution: [ex04](HackerRank/src/Introduction/ex04.java)






























