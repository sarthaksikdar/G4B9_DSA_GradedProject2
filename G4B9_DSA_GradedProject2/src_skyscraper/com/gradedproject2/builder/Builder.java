package com.gradedproject2.builder;

import java.util.PriorityQueue;

public class Builder {
	
	public void structure(int floor[], int noOffloor) {
		
		System.out.println("The order of construction is as follows");

				PriorityQueue<Integer> queue = new PriorityQueue<>(java.util.Collections.reverseOrder());

		int[] tempfloor = new int[noOffloor];
		int max = noOffloor;
		System.out.println();
		for (int i = 0; i < noOffloor; i++) {
			
			System.out.println("Day: " + (i + 1));
			
			tempfloor[i] = floor[i];

					queue.add(tempfloor[i]);

				while (!queue.isEmpty() && queue.peek() == max) {

						System.out.print(queue.poll() + " ");

				max--;
			}
			System.out.println();
		}
	}
}