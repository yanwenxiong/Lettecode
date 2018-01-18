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
		if (!checkData(doubleBooked, new Area(start, end))) {
			return false;
		} else {
			for (Area area : areas) {
				if (start < area.start) {
					if (end > area.start && end <= area.end) {
						doubleBooked.add(new Area(area.start, end));
					} else if (end > area.start && end > area.end) {
						doubleBooked.add(new Area(area.start, area.end));
					}
				} else if (start >= area.start && start < area.end) {
					if (end <= area.end) {
						doubleBooked.add(new Area(start, end));
					} else if (end > area.end) {
						doubleBooked.add(new Area(start, area.end));
					}
				}
			}
			areas.add(new Area(start, end));
		}
    	return true;
    }
    
    public boolean checkData(List<Area> doubleAreas, Area newArea) {
    	for (Area area : doubleAreas) {
    		if (newArea.end > area.start && newArea.start < area.end) {
    			return false;
    		} 
    	}
		return true;
    }
}

class Area {
	public int start;
	
	public int end;
	
	public Area(int start, int end) {
		this.start = start;
		this.end = end;
	}

	@Override
	public String toString() {
		return "Area [start=" + start + ", end=" + end + "]";
	}
	
}