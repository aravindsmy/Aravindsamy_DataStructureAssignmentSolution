/**
 * 
 */
package com.greatleaning.conspro;

/**
 * @author aravi
 *
 */
public class ConsPro {

	public void constructionProcess(int size, int[] arr) {

		int j = size;
		boolean flag;

		System.out.println("\n The orderof the construction is  as follows ");

		// loop thru each day
		for (int i = 1; i <= size; i++) {

			flag = false;
			System.out.println("\n Day :" + i);

			// find the larger size floor and print remaining floors till day
			while (j >= 1 && arr[j] <= i) {

				flag = true;
				System.out.println(" " + j);
				j--;

			}
			if (flag == true) {
				System.out.print("");
			}
		}

	}
}
