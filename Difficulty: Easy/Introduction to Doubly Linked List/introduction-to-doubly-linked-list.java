//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class Node {
    int data;
    Node next;
    Node prev;

    Node(int x) {
        data = x;
        next = null;
        prev = null;
    }
}

class GFG {
    public static void printList(Node node) {
        Node tmp = node;
        int c1 = 0, c2 = 0;
        if (tmp != null) {
            while (tmp.next != null) {
                c1++;
                tmp = tmp.next;
            }
            while (tmp.prev != null) {
                c2++;
                tmp = tmp.prev;
            }
            if (c1 != c2) {
                System.out.println("-1");
                return;
            }
        }
        while (tmp != null) {
            System.out.print(tmp.data + " ");
            tmp = tmp.next;
        }
        System.out.println();
    }

    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            Solution obj = new Solution();
            Node ans = obj.constructDLL(arr);
            printList(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    Node constructDLL(int arr[]) {
        Node head = new Node(arr[0]);
        Node Back = head;
        for(int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            temp.prev = Back;
            Back.next = temp;
            Back = temp;
        }
        return head;
    }
}