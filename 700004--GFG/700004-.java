/*
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
}*/

class Solution {

    ArrayList<Integer> printList(Node head) {

        ArrayList<Integer> list = new ArrayList<>();

        solve(head, list);

        return list;
    }

    void solve(Node head, ArrayList<Integer> list) {

        if (head == null)
            return;

        list.add(head.data);

        solve(head.next, list);
    }
}  

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna