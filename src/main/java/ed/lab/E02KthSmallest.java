package ed.lab;
import java.util.Stack;

public class E02KthSmallest {

    public int kthSmallest(TreeNode<Integer> root, int k) {

        Stack<TreeNode<Integer>> stack = new Stack<>();
        TreeNode<Integer> current = root;
        int count = 0;

        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            current = stack.pop();
            count++;

            if (count == k) {
                return current.value;
            }

            current = current.right;
        }
        return -1; // Si k es inválido
    }

}