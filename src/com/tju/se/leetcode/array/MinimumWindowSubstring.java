package com.tju.se.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumWindowSubstring {
	public String minWindow(String s, String t) {
		int sl = s.length(), st = t.length();
		char[] chars = s.toCharArray(),chart = t.toCharArray();
		if(sl < st){
			return "";
		}
		
		int box = st;
		while(box <= sl) {
			for(int i = 0; i < sl-st+1; i++){
				String temp;
				if((temp = whetherWindow(chars, box, chart)) == null){
					continue;
				}else{
					return temp;
				}
			}
			box++;
		}
		return "";
    }
	
	private String whetherWindow(char[] s,int box, char[] chart){
		String res = null;
		for(int j = 0; j < s.length-box+1; j++) {
			List<Character> list = new ArrayList<Character>();
			for(int k = 0; k < box; k++){
				list.add(s[j+k]);
			}
			int i;
			for(i = 0; i < chart.length; i++){
				if(!contain(list,chart[i])){
					break;
				}else{
					list.remove(new Character(chart[i]));
				}
			}
			if(i == chart.length){
				res = String.valueOf(Arrays.copyOfRange(s, j, j+box));
				break;
			}
		}
		return res;
	}
	
	private boolean contain(List<Character> s, Character t){
		for(Character c : s){
			if(c.equals(t)){
				return true;
			}
		}
		return false;
	}
}