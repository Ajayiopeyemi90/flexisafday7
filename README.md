# flexisafday7


##Discription

This Java program demonstrates my basic knowledge of string and number manipulation by converting strings to numeric values, performing arithmetic operations, and converting numbers back to strings. It also includes to reverse a string.

## Table of Contents

- [Overview](#overview)
- [Classes](#classes)
- [Installation](#installation)
- [Usage](#usage)
- [Example](#example)
- [License](#license)

## Overview

The program consists of three main classes:

1. `toNumber`: Converts strings to numbers and calculates their total.
2. `valueToString`: Converts the numbers back to a concatenated string format.
3. `reverseString`: Reverses a given string.

The `Main` class brings these classes together, demonstrating the conversions and manipulations.

## Classes

### `toNumber`

- **Purpose**: Converts three strings to numeric values (two integers and one double) and calculates their total.
- **Constructor**: `toNumber(String firstValue, String secondValue, String thirdValue)`
- **Methods**:
  - `getTotal()`: Returns the total of all converted values.
  - `geta()`, `getb()`, `getc()`: Return each converted value.

### `valueToString`

- **Purpose**: Converts numeric values from the `toNumber` class back to strings and concatenates them.
- **Constructor**: `valueToString(toNumber number)`
- **Methods**:
  - `getResult()`: Returns the concatenated string of all numeric values.

### `reverseString`

- **Purpose**: Reverses a given string.
- **Constructor**: `reverseString(String word)`
- **Methods**:
  - `getReversed()`: Returns the reversed string.

## Installation

1. Clone the repository or download the code files.
2. Compile and run the `Main.java` file in a Java environment.

## Usage

1. Open `Main.java`.
2. Pass the values to be manipulated directly in the `toNumber`, `valueToString`, and `reverseString` instances.
3. Run the program to see the results of each operation.

## Example

```java
public static void main(String[] args) {
   toNumber toNumbers = new toNumber("2720", "18429.2459", "4258");
   System.out.printf("The total value = %,.2f \n", toNumbers.getTotal());
   
   valueToString valueToString = new valueToString(toNumbers);
   System.out.println("The conversion of number to string brings " + valueToString.getResult());

   reverseString reverseString = new reverseString("Hello World");
   System.out.println("The reversed string is " + reverseString.getReversed());
}
```

### Output

```
The total value = 25,407.25
The conversion of number to string brings 272018429.24594258
The reversed string is dlroW olleH
```
