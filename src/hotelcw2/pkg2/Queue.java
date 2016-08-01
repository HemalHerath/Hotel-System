/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelcw2.pkg2;

import java.util.Scanner;

/**
 *
 * @author win 8
 */
public class Queue {
     
 static String arr[] = new String[7];
 int size = 0;
 int top = -1;
 int rear = 0;
 
public static void queue() {
		for (int i = 0; i < 3; i++) {
			if (arr[i] != null) {
				System.out.print("\n" + arr[i].toUpperCase());
			}else{
				System.out.print("\n" +null);
			}
		}
		System.out.println("");
	}
 public void push(String pushedElement) {
  if (top < 7 - 1) {
   top++;
   arr[top] = pushedElement;
   System.out.println("\nElement " + pushedElement
     + " is pushed to Queue !");
   display();
  } else {
   System.out.println("Overflow !");
  }

 }

 public void pop() {
  if (top >= rear) {
   rear++;
   System.out.println("Pop operation done !");
   display();
  } else {
   System.out.println("Underflow !");
  }
 }

 public void display() {
  if (top >= rear) {
   System.out.print("\nElements in Queue : ");
   for (int i = rear; i <= top; i++) {
    System.out.println(arr[i]);
   }
  }
 }
}
