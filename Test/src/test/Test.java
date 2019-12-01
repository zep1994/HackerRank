import java.util.*;
    public class Test <E> {
        Stack <E> stk = new Stack <E>();
    public void push(E obj) {
            stk.push(obj);
    }
    public E pop() {
            E obj = stk.pop();
        return obj;
    }
    }
    class Output {
        public static void main(String args[]) {
            Test <String> gs = new Test<String>();
            gs.push("Hello");
            System.out.print(gs.pop() + " ");
            Test <Integer> gs2 = new Test<Integer>();
            gs2.push(36);
            System.out.println(gs2.pop());
        }
    }