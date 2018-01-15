package com.tju.se.leetcode.array;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/my-calendar-ii/description/
 * @author YanWenXiong
 * create at 2018年1月11日 下午1:50:10
 */
public class MyCalendarTwo {
	List<Area> areas;
	List<Area> doubleBooked;
	public MyCalendarTwo() {
		areas = new ArrayList<Area>();
		doubleBooked = new ArrayList<Area>();
    }
    
    public boolean book(int start, int end) {
    	for (Area area : doubleBooked) {
    		if (!checkData(doubleBooked, new Area(start, end))) {
    			return false;
    		}
    	}
    	for (Area area : areas) {
    		boolean add = false;
    		int a, b;
    		if (start < area.start) {
    			if (end > area.start && end <= area.end) {
    				a = area.start;
    				b = end;
    				add = true;
    			} else if (end >= area.end) {
    				a = area.start;
    				b = area.end;
    				add = true;
    			}
    		} else if (start >= area.start) {
    			if (end <= area.end) {
    				a = start;
    				b = end;
    				add = true;
    			} else if (end >= area.end) {
    				a = start;
    				b = area.end;
    				add = true;
    			}
    		}
    		if (add) {
    			
    		}
    	}
    	return true;
    }
    
    public boolean checkData(List<Area> doubleAreas, Area newArea) {
    	for (Area area : doubleAreas) {
    		if (newArea.end <= area.start) {
    			return true;
    		} else if (newArea.start >= newArea.end) {
    			return true;
    		}
    	}
		return false;
    }
}

class Area {
	public int start;
	
	public int end;
	
	public Area(int start, int end) {
		this.start = start;
		this.end = end;
	}
}