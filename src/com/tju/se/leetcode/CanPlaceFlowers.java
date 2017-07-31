package com.tju.se.leetcode;

public class CanPlaceFlowers {
	public boolean canPlaceFlowers(int[] flowerbed, int n) {
		if(n == 0) {
			return true;
		}
		
		int length = flowerbed.length;
		int i = 0;
		while (i < length) {
			if (flowerbed[i] == 0){
				if (i+1 < length) {
					if (flowerbed[i+1] == 0) {
						i += 2;
						n--;
					} else {
						i += 3;
					}
				} else {
					i += 2;
					n--;
				}
			} else {
				i += 2;
			}
			if(n == 0){
				return true;
			}
		}
		return false;
	}
}
