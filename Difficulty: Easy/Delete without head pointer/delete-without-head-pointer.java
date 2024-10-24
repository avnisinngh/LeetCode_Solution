//{ Driver Code Starts
import java.io.*;
import java.util.*;

// Node class definition
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

// GFG class containing methods for linked list operations
public class GFG {
    // Function to print the linked list
    static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    // Function to find a node in the list
    static Node findNode(Node head, int searchFor) {
        Node current = head;
        while (current != null) {
            if (current.data == searchFor) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        Solution ob = new Solution(); // Create an instance of Solution class
        while (t-- > 0) {
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input);
            ArrayList<Integer> arr = new ArrayList<>();
            while (st.hasMoreTokens()) {
                arr.add(Integer.parseInt(st.nextToken()));
            }

            Node head = new Node(arr.get(0));
            Node tail = head;
            for (int i = 1; i < arr.size(); ++i) {
                tail.next = new Node(arr.get(i));
                tail = tail.next;
            }
            int k = Integer.parseInt(br.readLine());
            Node del = findNode(head, k); // Find the node to be deleted

            if (del != null) {
                ob.deleteNode(del); // Delete the node
                printList(head);    // Print the updated list
            } else {
                System.out.println("Node with value " + k + " not found.");
            }
        }
    }
}

// } Driver Code Ends


/*
class Node
{
    int data ;
    Node next;
    Node(int d)
    {
        data = d;
        next = null;
    }
}
*/

// Function to delete a node without any reference to head pointer.
class Solution {
    Node head;
    void deleteNode(Node node) {
        node.data = node.next.data;
        node.next = node.next.next;
    }
}
