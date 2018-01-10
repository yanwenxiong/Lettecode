package com.tju.se.leetcode.array;

public class TeemoAttacking {
	public int findPoisonedDuration(int[] timeSeries, int duration) {
		if(timeSeries.length == 0) 
			return 0;
		int poisonStart = timeSeries[0], poisonEnd = timeSeries[0]+duration, count = duration;
		for (int i = 1; i < timeSeries.length; i++) {
			if(timeSeries[i] >= poisonEnd){
				poisonStart = timeSeries[i];
				poisonEnd = timeSeries[i] + duration;
				count += duration;
			} else {
				if (timeSeries[i] + duration <= poisonEnd) {
					continue;
				} else {
					count += timeSeries[i] + duration - poisonEnd;
					poisonEnd  = timeSeries[i] + duration;;
				}
			}
		}
		return count;
	}
}
