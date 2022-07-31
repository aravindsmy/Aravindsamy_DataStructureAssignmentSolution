/**
 * 
 */
package com.greatleaning.conspro;

import java.util.Scanner;

/**
 * @author aravi
 *
 */
public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		// get the size of the array from the user
		System.out.println("\n Enther the total no of floors in the building : ");

		int size = sc.nextInt();
		int arr[] = new int[size + 1];

		// get the elements of the array from user
		for (int i = 1; i < size + 1; i++) {
			System.out.println("\n Enthe the floor size given on the day:" + i);
			int n = sc.nextInt();
			arr[n] = i;

		}

		ConsPro consPro = new ConsPro();
		consPro.constructionProcess(size, arr);

	}
}
