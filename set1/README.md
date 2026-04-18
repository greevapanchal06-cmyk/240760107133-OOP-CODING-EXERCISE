## Practical 1: Distance Converter
**Problem Statement:**
Develop a Java program that prompts the user to enter a distance in meters. Your program should then convert this distance to feet
(1 meter = 3.28084 feet) and display the result formatted to two decimal places.
**output**
```text
Enter distance in meters: 10
Distance in feet: 32.81
```

## Practical 2: Crammers Rule
**Problem Statement:**
Write a Java program to solve a system of two linear equations with two variables (e.g., ax + by = e and cx + dy = f). Prompt the user to
 enter the coefficients a, b, c, d, e, f. Calculate and display the values of x and y using Cramer's rule. Include error handling for cases
 where the denominator is zero Cramer's rule : D=ad−bc, Dx=ed−bf, Dy=af−ce, x=Dx/D, y=Dy/D
**output**
```text
Enter values of a, b, c, d, e, f:
2 3 1 2 5 4
Value of x = -2.0
Value of y = 3.0

case with no solution
Enter values of a, b, c, d, e, f:
1 2 2 4 5 10
No unique solution (D = 0)
```

##Practical: 3 Vowel check
**Problem statement**
Write a Java program that prompts the user to enter a single letter (character). Determine whether the entered character is a vowel
(a, e, i, o, u, case-insensitive) or a consonant, and display the result.
**output**
```text
Enter a single character: a
It is a vowel

Enter a single character: b
It is a consonant

Enter a single character: 5
Invalid input
```
##Practical 4: BMI calculator
**Problem Statement**
Develop a Java application that calculates a person's Body Mass Index (BMI). The program should ask the user for their weight in pounds
 and height in inches. Convert these values to kilograms and meters respectively (1 pound = 0.45359237 kg, 1 inch = 0.0254 meters)
 and then calculate BMI (weight in kg / (height in meters)^2). Display the calculated BMI. 
**output**
```text
Enter weight in pounds: 150
Enter height in inches: 65
BMI = 24.96
```

##Practical 5: Area of Triangle
**Problem Statement**
Write a program that takes the lengths of three sides of a triangle as input. Calculate and print the area of the triangle. Ensure that
the program validates if the given side lengths can actually form a triangle (sum of any two sides must be greater than the third side)
 before calculating the area (use Heron's formula: Area = sqrt(s*(s-a)*(s-b)*(s-c)) where s = (a+b+c)/2). 
**output**
```text
Enter three sides of triangle: 3 4 5
Area of triangle = 6.0
```

































































