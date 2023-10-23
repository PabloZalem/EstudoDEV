import java.util.Stack;

public class CriarUmaPilha {
    public static void main(String[] args) {
        // Criar uma nova pilha
        Stack<Integer> stack = new Stack<>();

        // Puxando o elemento do topo da pilha
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);


        while(!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }

    public boolean isEmpty() {
        return true;
    }
}
