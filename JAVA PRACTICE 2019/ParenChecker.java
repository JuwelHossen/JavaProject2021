
/*
 *  Java Program to Check for balanced parenthesis by using Stacks
 */

import java.util.Scanner;
import java.util.Stack;     

public class ParenChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /* Creating Stack */
        Stack<Character> stk = new Stack<Character>();

        /* Accepting expression */
        System.out.print("Enter expression: ");
        String exp = scan.nextLine();
        for (Character character : exp.toCharArray()) {

            if (character == '(' || character == '[' || character == '{')
                stk.push(character);
            if (character == ')' || character == ']' || character == '}') {
                if (stk.empty()) {
                    System.out.println("Opener/Closer Mismatch");
                    System.exit(0);
                }
                Character popCharacter = stk.pop();
                if ((character == ')' && popCharacter == '(') || (character == '}' && popCharacter == '{')
                        || (character == ']' && popCharacter == '[')) {
                } else {
                    break;
                }
            }
        }
        if (stk.empty()) {
            System.out.println("OK");
        } else {
            System.out.println("Opener/Closer Mismatch");
        }


    }
}