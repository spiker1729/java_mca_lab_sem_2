import java.util.*;
import java.util.Scanner;


public  class Stack{
    List<Character> stack = new ArrayList<>();

    void push(char c) {
        stack.add(c);
    }

    boolean checkStack(){
        return stack.isEmpty();
    }

    char pop(){
        char temp = stack.get(stack.size() - 1);
        stack.remove(stack.size() - 1);
        return temp;
    }

    char peek(){
        return stack.get(stack.size()-1);
    }
}
