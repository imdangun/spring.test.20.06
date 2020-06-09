package spring.test.ch01;

import java.util.Collections;
import java.util.List;

public class Nums2 {
	private List<Integer> nums;
	
	public Nums2(List<Integer> nums) {
		this.nums = nums;
	}
	
	public int getMax() {
		int max = 0;
		
		if(nums.size() != 0) max = Collections.max(nums);
		else throw new RuntimeException("원소값이 없습니다.");
		
		return max;
	}
}