package org.example;
public class Main
{
    public static void main( String[] args )
    {
    int a = Integer.parseInt(args[0]);

        int b = Integer.parseInt(args[1]);

        if(args[2].equals("+")){
            System.out.println(a+b);
        } else if (args[2].equals("-")) {
            System.out.println(a-b);
        } else if (args[2].equals("*")) {
            System.out.println(a*b);
        } else if (args[2].equals("/")) {
            if (b == 0) {
                System.err.println(" Can't divide by zero");
            } else {
                System.out.println(a/b);
            }
        }

    }
}