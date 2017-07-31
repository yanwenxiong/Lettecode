package com.tju.se.leetcode;

public class FirstBadVersion {
	public int firstBadVersion(int n) {
		if(this.isBadVersion(n / 2) && this.isBadVersion(n/2 - 1)) {
			return firstBadVersion(n / 2 - 1);
		}else{
			return firstBadVersion(n)
		}
	}
	
	private boolean isBadVersion(int version) {
		return true;
	}
}
