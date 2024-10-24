//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Node {

    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

public class LinkedList {

    /* Function to print linked list */
    public static void print(Node root) {
        Node temp = root;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    /* Driver program to test above functions */
    public static void main(String args[]) throws IOException {

        /* Constructed Linked List is 1.2.3.4.5.6.
         7.8.8.9.null */
        int value;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while (t > 0) {

            String s[] = in.readLine().trim().split(" ");
            Node head = new Node(Integer.parseInt(s[0]));
            Node copy = head;
            for (int i = 1; i < s.length; i++) {
                Node temp = new Node(Integer.parseInt(s[i]));
                copy.next = temp;
                copy = copy.next;
            }
            Solution ob = new Solution();
            Node result = ob.compute(head);
            print(result);
            System.out.println();
            System.out.println("~");
            t--;
        }
    }
}
// } Driver Code Ends


/*
class Node {
   int data;
   Node next;

  Node(int data) {
      this.data = data;
  }
}
*/
class Solution {
    Node compute(Node head) {
        head = reverse(head);
        Node maxNode = head;
        Node curr = head;
       while (curr != null && curr.next != null) {
            if (curr.next.data < maxNode.data) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
                maxNode = curr;
            }
        }
        head = reverse(head);
        return head;
    }
    Node reverse(Node head) {
        Node prev = null;
        Node curr = head;
        Node next = null;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
