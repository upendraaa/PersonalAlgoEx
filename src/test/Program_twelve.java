package test;

import java.util.*;

public class Program_twelve {
    // This is an input class. Do not edit.
    public static class LinkedList {
        public int value;
        public LinkedList next;

        public LinkedList(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public static LinkedList removeDuplicatesFromLinkedList(LinkedList linkedList) {
        // Write your code here.
        LinkedList temp = linkedList;
        while(temp!= null && temp.next != null){
            if(temp.value == temp.next.value)
            {
                temp.next = temp.next.next;
                continue;

            }
            temp = temp.next;
        }
            return linkedList;
    }
}

