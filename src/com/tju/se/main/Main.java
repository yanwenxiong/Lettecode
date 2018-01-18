package com.tju.se.main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import com.tju.se.leetcode.array.A;
import com.tju.se.leetcode.array.FindPivotIndex;
import com.tju.se.leetcode.array.MaximumLengthofRepeatedSubarray;
import com.tju.se.leetcode.array.MyCalendar;
import com.tju.se.leetcode.array.MyCalendarTwo;
import com.tju.se.leetcode.array.PourWater;
import com.tju.se.leetcode.math.ReachaNumber;

public class Main {

	public static void main(String[] args) {
		/*Battleships battleships = new Battleships();
		char[][] board = {
				{'.','X','.','.','X'},
				{'.','X','.','.','X'},
				{'.','.','.','.','X'},
				{'X','.','X','X','.'},
				{'X','.','.','.','X'}
			};
		{
				{'X','.','.','X'},
				{'.','.','.','X'},
				{'.','.','.','X'}
		};
		System.out.println(battleships.countBattleships(board));*/
		
		/*FindMedian findMedian = new FindMedian();
		findMedian.addNum(-1);
		findMedian.addNum(-2);
		System.out.println(findMedian.findMedian());*/
		
		/*int[] nums = {1,3,-1,-3,5,3,6,7};
		int k = 3;
		SlidingWindowMedian bean = new SlidingWindowMedian();
		double[] result = bean.medianSlidingWindow(nums, k);
		for(double d : result){
			System.out.print(d + " ");
		}*/
		
		/*int[] nums = {1,3,5,6};
		SearchInsertPosition bean = new SearchInsertPosition();
		System.out.println(bean.searchInsert(nums, 5));
		System.out.println(bean.searchInsert(nums, 2));
		System.out.println(bean.searchInsert(nums, 7));
		System.out.println(bean.searchInsert(nums, 0));*/
		
		/*int[] nums = {1,12,-5,-6,50,3};
		int[] nums1 = {0,4,0,3,2};
		MaximumAverageSubarrayI bean = new MaximumAverageSubarrayI();
		System.out.println(bean.findMaxAverage(nums1, 1));*/
		
		/*int[] nums = {1,0,0,0,1,0,0};
		int n = 2;
		CanPlaceFlowers bean = new CanPlaceFlowers();
		System.out.println(bean.canPlaceFlowers(nums, n));*/
		
		/*
		 * SlidingWindowMaximum
		SlidingWindowMaximum bean = new SlidingWindowMaximum();
		int[] nums = {1,3,-1,-3,5,3,6,7};
		int k = 3;
		int[] result = bean.maxSlidingWindow(nums, k);
		outputArray(result);*/
		
		/*
		 * MinimumWindowSubstring
		MinimumWindowSubstring bean = new MinimumWindowSubstring();
		String s = "bbaa";
		String t = "aba";
		System.out.println(bean.minWindow(s, t));*/
		
		/*
		 * MaximumAverageSubarrayII
		int[] nums = {1,12,-5,-6,50,3};
		int k = 4;
		MaximumAverageSubarrayII bean = new MaximumAverageSubarrayII();
		System.out.println(bean.findMaxAverage(nums, k));*/
		
		/*
		 * MaximumProductofThreeNumbers
		 * int[] nums = {-4,-2,3,4};
		MaximumProductofThreeNumbers bean = new MaximumProductofThreeNumbers();
		System.out.println(bean.maximumProduct(nums));*/
		
		/*char[] tasks = {'A','A','A','B','B','B','C','C','D'};
		int n = 1;
		TaskScheduler bean = new TaskScheduler();
		System.out.println(bean.leastInterval(tasks, n));*/
		
		/*ValidTriangleNumber bean = new ValidTriangleNumber();
		int[] nums = {2,2,3,4};
		System.out.println(bean.triangleNumber(nums));*/
		
		/*int[] nums = {2,1};
		ShortestUnsortedContinuousSubarray bean = new ShortestUnsortedContinuousSubarray();
		System.out.println(bean.findUnsortedSubarray(nums));*/
		
		/*ArrayNesting bean = new ArrayNesting();
		int[] nums = {1,2,0};
		System.out.println(bean.arrayNesting(nums));*/
		
		/*SubarraySumEqualsK bean = new SubarraySumEqualsK();
		int[] nums = {273,-380,-63,914,-348,23,-482,-938,776,810,879,266,394,-132,189,279,-705,137,443,-71,-199,-45,447,555,-949,904,302,476,339,-111,851,691,328,-564,583,426,521,584,-891,-497,-613,-392,148,-806,371,810,758,58,-358,-410,564,707,-726,325,-994,-572,-598,-126,733,488,-650,54,75,-781,649,-197,-483,-797,-190,187,491,501,20,178,905,-700,-680,783,747,863,305,959,-89,-383,316,-754,328,-354,-759,892,922,-73,944,439,712,486,-371,-229,-104,-421,372,797,-681,-547,921,298,197,-457,-598,-62,-997,205,290,928,784,229,281,992,701,676,-9,-499,429,-689,719,-436,-733,-974,777,857,-150,-615,702,442,-1000,-158,-78,159,-572,-948,508,559,-781,-581,718,-994,-27,-862,-273,-220,199,789,-680,-474,671,577,940,712,-379,-199,-574,607,849,-499,414,643,-900,-636,599,-233,745,571,349,-183,806,414,-156,-299,493,648,-508,-961,622,254,704,189,-197,-437,50,366,238,990,963,539,311,821,-172,154,-393,-433,-61,671,867,168,34,-750,723,548,-87,718,-575,809,-126,-640,516,-68,-708,-521,-814,935,445,-504,-430,-720,-120,355,-861,-503,-595,-779,492,69,482,-104,311,-745,-269,260,196,-833,-362,-516,813,-601,-443,-283,-673,312,-96,533,-554,-989,5,-801,573,-920,481,-81,-660,-73,-123,-526,-203,478,-567,-172,-851,34,171,-66,-106,247,383,-688,739,-830,324,-369,984,571,-590,899,-20,-477,-130,786,-425,-235,865,496,662,62,-120,-434,124,-230,-474,-409,83,-310,17,374,753,-609,-991,-103,51,-686,-576,-393,165,-802,830,-822,-29,-882,867,404,842,-825,977,-892,922,425,305,-400,364,-155,849,-163,-548,565,705,754,618,873,189,20,511,-870,198,267,-626,-562,-974,345,-599,-240,627,285,-993,574,-572,-168,462,979,-570,100,86,-450,606,-554,-758,303,164,618,-282,201,469,969,-414,-755,748,-499,-784,997,541,453,-422,275,-228,61,-836,-800,94,874,-396,734,-783,241,-686,-668,-315,824,-510,253,-246,385,-890,-244,937,944,995,-215,-302,-244,-946,626,840,-103,677,-275,-50,-58,863,-84,189,774,-641,-307,300,-131,-465,195,-862,-969,968,-893,-112,701,73,285,-839,-90,107,-656,876,-647,931,221,-551,29,-127,215,-311,-329,-583,-844,815,604,-624,-121,504,785,-199,349,-927,319,888,-876,900,166,-36,886,-416,-944,-627,353,927,-675,-727,-804,854,-306,-195,-339,-29,-426,425,112,512,279,260,237,-165,-431,777,-412,660,961,-350,-37,452,-370,978,731,228,-774,-906,-728,273,147,-485,-363,-891,852,644,354,345,-495,880,520,-437,-231,-663,-392,831,-237,307,-234,-123,-940,110,783,-140,614,657,-683,414,-983,373,-704,630,299,-746,76,993,-246,-729,442,138,438,576,669,-684,338,-667,-841,-560,468,28,636,-331,643,-148,-427,749,-988,421,691,730,101,-553,-276,596,-597,891,-299,-642,-327,-755,-429,-719,-783,840,-205,-94,914,-59,-652,930,-447,680,449,-416,240,49,-197,-158,694,-12,-941,-206,29,-749,-54,-302,109,-137,383,-615,-513,-965,19,715,687,-987,-917,-420,285,-448,-526,46,499,-421,349,599,39,411,970,755,-688,718,392,-617,-769,45,-323,810,473,-27,810,-571,-71,-369,-21,860,433,-111,-823,139,-781,183,-446,665,-737,79,-571,305,332,940,580,727,-232,-576,938,-797,507,-719,-377,-427,68,-717,-735,431,581,920,583,-570,813,624,472,-640,-883,-932,444,922,-943,583,864,935,665,71,-612,-194,-476,-708,956,-471,720,146,872,-748,-229,368,-160,252,527,660,-82,43,42,698,867,-84,433,-84,-907,385,808,666,-925,-72,737,-620,-793,649,-258,-809,-190,-310,-266,997,577,-401,-691,-847,427,562,704,908,538,-638,-942,33,815,-804,-549,997,-410,-492,-890,-592,921,8,209,222,-299,-585,556,170,-987,-509,-32,63,87,738,697,220,-668,-558,466,-90,898,316,-60,662,414,206,952,-595,-6,-593,476,360,544,-229,21,-719,165,-258,772,-162,-218,-118,-308,-892,36,941,-851,-339,943,809,614,685,-336,-107,469,-264,579,-971,-243,-811,566,-14,379,-731,331,866,971,-226,-729,763,-638,92,37,911,24,645,669,452,845,-257,598,-516,915,734,964,-114,228,-629,-828,-484,285,-887,-685,-943,-1,-990,932,514,955,485,388,276,-148,-996,505,-819,536,-334,-35,79,-732,128,-622,-960,-195,-58,463,-451,673,21,348,833,-97,-919,953,514,320,-154,372,969,345,887,-878,838,525,578,-977,115,-240,-403,-306,193,212,896,-50,-163,-314,633,-765,762,134,588,615,40,619,-849,993,-162,675,-348,809,721,673,555,67,62,-105,-697,-423,931,-495,-474,-756,338,-393,250,-39,-47,40,-149,656,299,315,-13,367,-272,659,759,-37,-928,753,833,900,-53,10,-766,-977,260,106,-667,-457,-458,-837,840,909,-500,324,345,-982,-1,797,-163,-369,32,-655,899,726,-176,178,-205,-319,-903,-988,-114,939,796,867,242,687,129,389,-617,-495,-790,-253,-460,-713,776,752,254,272,903,-27,781,435,-96,859,999,-389,262,225,8,848,685,-810,-912,-889};
		int k = -508;
		System.out.println(bean.subarraySum(nums, k));*/
		
		/*KdiffPairsinanArray bean = new KdiffPairsinanArray();
		int[] nums = {1, 3, 1, 5, 4};
		int k = 0;
		System.out.println(bean.findPairs(nums, k));*/
		
		/*int[] nums = {1,1,0,1,1,1};
		MaxConsecutiveOnes bean = new MaxConsecutiveOnes();
		System.out.println(bean.findMaxConsecutiveOnes(nums));*/
		
		/*int[] nums = {4,3,2,7,8,2,3,1};
		FindAllNumbersDisappearedinanArray bean = new FindAllNumbersDisappearedinanArray();
		System.out.println(bean.findDisappearedNumbers(nums));*/
		
		/*int[] nums = {4,3,2,7,8,2,3,1};
		FindAllDuplicatesinanArray bean = new FindAllDuplicatesinanArray();
		System.out.println(bean.findDuplicates(nums));*/
		
		/*int[] nums = {1,1,2};
		ThirdMaximumNumber bean = new ThirdMaximumNumber();
		System.out.println(bean.thirdMax(nums));*/
		
		/*InsertDeleteGetRandomO1 obj = new InsertDeleteGetRandomO1();
		System.out.println(obj.insert(1));
		System.out.println(obj.insert(10));
		System.out.println(obj.insert(20));
		System.out.println(obj.insert(30));
		System.out.println(obj.getRandom());
		System.out.println(obj.getRandom());
		System.out.println(obj.getRandom());
		System.out.println(obj.getRandom()); 
		System.out.println(obj.getRandom());*/
		
		/*int[] nums = {1,2,5,6,8};
		int duration = 2;
		TeemoAttacking bean = new TeemoAttacking();
		System.out.println(bean.findPoisonedDuration(nums, duration));*/
		
		/*int[] nums = {0,0,0,0,1,1,2,0,2,65,0};
		MoveZeroes bean = new MoveZeroes();
		bean.moveZeroes(nums);
		outputArray(nums);*/
		
		/*int[] nums = {2,1,3};
		MissingNumber bean = new MissingNumber();
		System.out.println(bean.missingNumber(nums));*/
//		String string = "hah";
//		System.out.println(string.split(",").length);
		
//		testReachaNumber();
//		testPourWater();
//		LargestNumberAtLeastTwiceofOthers();
//		MinCostClimbingStairs();
//		testMyCalendarTwo();
//		testMyCalendar();
//		testFindPivotIndex();
		testMaximumLengthofRepeatedSubarray();
	}
	
	public static void outputArray(int[] array){
		for(int temp : array){
			System.out.print(temp + " ");
		}
		System.out.println();
	}
	
	public static void testReachaNumber() {
		ReachaNumber reachaNumber = new ReachaNumber();
		System.out.println(reachaNumber.reachNumber(3));
	}
	
	public static void testPourWater() {
//		int[] heights1 = {2,1,1,2,1,2,2};
//		outputArray(new PourWater().pourWater(heights1, 4, 3));
//		
//		int[] heights2 = {1,2,3,4};
//		outputArray(new PourWater().pourWater(heights2, 2, 2));
		
		int[] heights3 = {1,2,3,4,3,2,1,2,3,4,3,2,1};
		outputArray(new PourWater().pourWater(heights3, 5, 2));
	}
	
	public static void LargestNumberAtLeastTwiceofOthers() {
		int[] nums = {0,0,2,3};
		System.out.println(new com.tju.se.leetcode.array.LargestNumberAtLeastTwiceofOthers().dominantIndex(nums));
	}
	
	public static void MinCostClimbingStairs() {
		int[] costs1 = {10, 15, 20};
		System.out.println(new com.tju.se.leetcode.array.MinCostClimbingStairs().minCostClimbingStairs(costs1));
		
		int[] costs2 = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
		System.out.println(new com.tju.se.leetcode.array.MinCostClimbingStairs().minCostClimbingStairs(costs2));
	}
	
	public static void testMyCalendarTwo() {
	    MyCalendarTwo myCalendar = new MyCalendarTwo();
	    System.out.println(myCalendar.book(10, 20)); // returns true
	    System.out.println(myCalendar.book(50, 60)); // returns true
	    System.out.println(myCalendar.book(10, 40)); // returns true
	    System.out.println(myCalendar.book(5, 15)); // returns false
	    System.out.println(myCalendar.book(5, 10)); // returns true
	    System.out.println(myCalendar.book(25, 55)); // returns true
	    System.out.println("---------------------------");
	    MyCalendarTwo myCalendar2 = new MyCalendarTwo();
	    System.out.println(myCalendar2.book(24, 40)); // returns true
	    System.out.println(myCalendar2.book(43, 50)); // returns true
	    System.out.println(myCalendar2.book(27, 43)); // returns true
	    System.out.println(myCalendar2.book(5, 21)); // returns false
	    System.out.println(myCalendar2.book(30, 40)); // returns true
	    System.out.println(myCalendar2.book(14, 29)); // returns true
	    System.out.println(myCalendar2.book(3, 19)); // returns true
	    System.out.println(myCalendar2.book(3, 14)); // returns true
	    System.out.println(myCalendar2.book(25, 39)); // returns true
	    System.out.println(myCalendar2.book(6, 19)); // returns true
	}
	
	public static void testMyCalendar() {
		MyCalendar myCalendar = new MyCalendar();
		System.out.println(myCalendar.book(10, 20));
		System.out.println(myCalendar.book(15, 25));
		System.out.println(myCalendar.book(20, 30));
	}
	
	public static void testFindPivotIndex() {
		int[] nums = {1, 7, 3, 6, 5, 6};
		FindPivotIndex findPivotIndex = new FindPivotIndex();
		System.out.println(findPivotIndex.pivotIndex(nums));
		
		int[] nums2 = {1, 2, 3};
		System.out.println(findPivotIndex.pivotIndex(nums2));
	}
	
	public static void testMaximumLengthofRepeatedSubarray() {
		int[] a = {1,2,3,2,1};
		int[] b = {3,2,1,4,7};
		System.out.println(new MaximumLengthofRepeatedSubarray().findLength(a, b));
		
		int[] a1 = {0,1,1,1,1};
		int[] b1 = {1,0,1,0,1};
		System.out.println(new MaximumLengthofRepeatedSubarray().findLength(a1, b1));
		
		int[] a2 = {0,0,0,0,0,0,1,0,0,0};
		int[] b2 = {0,0,0,0,0,0,0,1,0,0};
		System.out.println(new MaximumLengthofRepeatedSubarray().findLength(a2, b2));
	}
}
