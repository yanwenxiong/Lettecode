package com.tju.se.leetcode.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Battleships {
	public int countBattleships(char[][] board) {
		int row = board.length, col = board[0].length;
		int count = 0;
		//Queue<Map<Integer, Integer>> already = new LinkedBlockingDeque<Map<Integer,Integer>>();
		Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if(map.size() > 0){
					if(find(i, j, map)){
						map.get(i).remove(new Integer(j));
						continue;
					}
				}
				if('.' == (board[i][j])){
					continue;
				}
				count++;
				if(i == row-1){
					if(j == col-1){
						break;
					}else{
						int tempi = i,tempj = j+1;
						while(tempj <= col-1 && 'X' == (board[tempi][tempj])){
							put(tempi, tempj, map);
							tempj++;
						}
					}
				}else{
					if(j == col-1){
						int tempi = i+1,tempj = j;
						while(tempi <= row-1  && 'X' == (board[tempi][tempj])){
							put(tempi, tempj, map);
							tempi++;
						}
					}else{
						int tempi,tempj;
						if('X' == (board[i][j+1])){
							tempi = i; tempj = j+1;
							while(tempj <= col-1 && 'X' == (board[tempi][tempj])){
								put(tempi, tempj, map);
								tempj++;
							}
						}else{
							tempi = i+1; tempj = j;
							while(tempi <= row-1  && 'X' == (board[tempi][tempj])){
								List<Integer> list = new ArrayList<Integer>();
								list.add(tempj);
								put(tempi, tempj, map);
								tempi++;
							}
						}
					}
				}
			}	
		}
		return count;
	}
	
	private boolean find(Integer x,Integer y,Map<Integer, List<Integer>> map){
		for(Entry<Integer, List<Integer>> entry : map.entrySet()){
			if(entry.getKey().equals(x)){
				for(int i = 0; i < entry.getValue().size();i++){
					if(y.equals(entry.getValue().get(i))){
						return true;
					}
				}
			}
		}
		return false;
	}
	
	private void put(Integer x,Integer y, Map<Integer, List<Integer>> map){
		if(map.get(x) != null){
			map.get(x).add(y);
		}else{
			List<Integer> list  = new ArrayList<Integer>();
			list.add(y);
			map.put(x, list);
		}
	}
	/*private void outputMap(Map<Integer, Integer> map){
		for(Map.Entry<Integer, Integer> entry : map.entrySet()){
			System.out.print("x:"+entry.getKey() + "y:" + entry.getValue() + " ");
		}
		System.out.println();
	}*/
}
