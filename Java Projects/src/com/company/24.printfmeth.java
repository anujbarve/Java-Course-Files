package com.company;

class printfmeth {
    public static void main(String[] args) {
//        printf() = an optional method to control, format and display text to the console windows
//        two arguments = format string + object/variable/value
//        % [flags] [precision] [width] [conversion-character]

        boolean mybool = true;
        char mychar = 'A';
        String name = "Anuj";
        int Myint = 12;
        double mydo = 1000;
//         [conversion-character]
        System.out.printf("\n This is format string %d", Myint);
        System.out.printf("\n This is format string %b", mybool);
        System.out.printf("\n This is format string %c", mychar);
        System.out.printf("\n This is format string %s", name);
        System.out.printf("\n This is format string %f", mydo);

//        [width]
//        minimum number of characters to be written as output

        System.out.printf("Hello %10s", name);
//        precision
//        sets number of digits of precision when outputting floating point values

        System.out.printf("You have this much money %.1f",mydo);

//        [flags]
//        adds an effect to output based on flag added to format specifier
//        - : left justify
//        + : output a plus (+) or minus sign for a numeric value
//        0 : numeric values are zero padded
//        , : comma grouping separator if numbers > 1000


        System.out.printf("You have this much money %+20f",mydo);
    }
}
