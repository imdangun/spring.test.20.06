package spring.test.ch01.home;

import java.util.Collections;
import java.util.List;

public class Nums {
	private List<Integer> nums;
	
	public Nums(List<Integer> nums) {
		this.nums = nums;
	}
	
	public int getMax() {
		return Collections.max(nums);
	}
}
