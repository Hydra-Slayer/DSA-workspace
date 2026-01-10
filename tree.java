import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class tree {
    public static void main(String[] args) {
        // Build the tree:
        // 1
        // / \
        // 2 3
        // / \ / \
        // 4 5 6 7
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        // bfs(root);
        System.out.println();
        dfs_pre(root);
        System.out.println();
        dfs_in(root);
        System.out.println();
        dfs_post(root);

    }

    public static void dfs_pre(TreeNode root) {
        Stack<TreeNode> st = new Stack<>();
        if (root == null)
            return;
        st.add(root);
        while (!st.isEmpty()) {
            TreeNode curr = st.pop();
            System.out.print(curr.val + " ");
            if (curr.right != null) {
                st.add(curr.right);
            }
            if (curr.left != null) {
                st.add(curr.left);

            }

        }
    }

    public static void dfs_in(TreeNode root) {
        Stack<TreeNode> st = new Stack<>();
        TreeNode curr = root;

        while (curr != null || !st.isEmpty()) {
            // Traverse to the leftmost node
            while (curr != null) {
                st.push(curr);
                curr = curr.left;
            }

            // Process the leftmost node
            curr = st.pop();
            System.out.print(curr.val + " ");

            // Move to the right subtree
            curr = curr.right;

        }
    }

    public static void dfs_post(TreeNode root) {
        Stack<TreeNode> st = new Stack<>();
        if (root == null)
            return;
        st.add(root);
        while (!st.isEmpty()) {
            TreeNode curr = st.pop();
            System.out.print(curr.val + " ");
            if (curr.left != null) {
                st.add(curr.left);

            }
            if (curr.right != null) {
                st.add(curr.right);
            }

        }
    }

    public static void bfs(TreeNode root) {
        if (root == null)
            return;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            TreeNode curr = q.poll();
            System.out.println(curr.val + " ");
            if (curr.left != null) {
                q.add(curr.left);
            }
            if (curr.right != null) {
                q.add(curr.right);
            }
            System.out.println();
        }
    }
}
