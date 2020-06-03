package com.company;

/*

2204 line formatting

Correct the getFormattedString method so that it returns a string with parameters for formatting.
Do not use n to translate a carriage.
There should be a conclusion:
20/7 = 2.86
Exp = 3.33e + 00

Requirements:
1. The expression \ n must not be used to break the line.
2. The getFormattedString method must be static.
3. The output to the screen should correspond to the condition of the task.
4. The getFormattedString method should return a string with the parameters
for formatting according to the condition of the task.
*/


public class Solution {
    public static void main(String[] args) {
        System.out.println(String.format(getFormattedString(), 20.0 / 7.0, 10.0 / 3.0));
        //должен быть вывод
        //20 / 7 = 2,86
        //Exp = 3,33e+00
    }

    public static String getFormattedString() {
        return "20 / 7 = %.2f%nExp = %.2e";
    }
    }

