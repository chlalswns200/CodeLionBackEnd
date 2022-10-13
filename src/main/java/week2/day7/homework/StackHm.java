package week2.day7.homework;

import java.util.Scanner;

class Stack {
    private int top;
    private int stackSize;
    private char stackArr[];

    public Stack(int stackSize) {
        this.stackSize = stackSize;
        top = -1;
        stackArr = new char[this.stackSize];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == stackSize;
    }

    public void push(char item) {
        if (isFull()) {
            System.out.println("스택이 가득차있습니다.");
        } else {
            stackArr[++top] = item;
            System.out.println("입력된 문자" + item);
        }
    }

    public char pop() {
        if (isEmpty()) {
            System.out.println("스택이 비어있습니다");
            return 0;
        } else {
            System.out.println("삭제된 문자 = " + stackArr[top]);
            return stackArr[top--];
        }
    }

    public char peek() {
        if (isEmpty()) {
            System.out.println("스택이 가득차있습니다.");
            return 0;
        } else {
            System.out.println("엿볼려는 문자" + stackArr[top]);
            return stackArr[top];
        }
    }

    public void clear() {
        if (isEmpty()) {
            System.out.println("스택이 비어있습니다");
        } else {
            top = -1;
            System.out.println("스택이 초기화 되었습니다");
            stackArr = new char[this.stackSize];
        }
    }

    public void printStack() {
        if (isEmpty()) {
            System.out.println("스택이 비어 있습니다");
        } else {
            for (char c : stackArr) {
                System.out.print (" " + c);
            }
            System.out.println();
        }
    }

}
public class StackHm {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int stackSize = sc.nextInt();

        Stack stack = new Stack(stackSize);

    }

}
