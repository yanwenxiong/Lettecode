package com.tju.se.leetcode.array;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/my-calendar-i/description/
 * @author YanWenXiong
 * create at 2018年1月15日 下午2:37:19
 */
public class MyCalendar {
	private List<Area> areas;
	public MyCalendar() {
        areas = new ArrayList<MyCalendar.Area>();
    }
    
    public boolean book(int start, int end) {
    	int oldStart = 0, oldEnd = 0;
    	for (Area area : areas) {
    		oldStart = area.start;
    		oldEnd = area.end;
    		if (end <= oldStart || start >= oldEnd) {
    			continue;
    		} else {
    			return false;
    		}
    	}
    	areas.add(new Area(start, end));
    	return true;
    }
    class Area {
    	public int start;
    	
    	public int end;
    	
    	public Area(int start, int end) {
    		this.start = start;
    		this.end = end;
    	}
    }
}
