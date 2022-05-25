/**
 * Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.
 */
package com.company;

public class Main {

    public static String camelToSnake(String str)
    {

        // Empty String
        String result = "";

        // Append first character(in lower case)
        // to result string
        char c = str.charAt(0);
        result = result + Character.toLowerCase(c);

        // Traverse the string from
        // 1st index to last index
        for (int i = 1; i < str.length(); i++) {

            char ch = str.charAt(i);

            // Check if the character is upper case
            // then append '_' and such character
            // (in lower case) to result string
            if (Character.isUpperCase(ch)) {
                result = result + '_';
                result = result + Character.toLowerCase(ch);
            }

            // If the character is lower case then
            // add such character into result string
            else {
                result = result + ch;
            }
        }

        // return the result
        return result;
    }


    public static void main(String[] args) {

        String[] strings = {"GeekBrains","JetBrains","ExampleForStrings","TwoMenAndADog"};

        for (String str : strings){
            System.out.println(camelToSnake(str));
        }

    }
}
