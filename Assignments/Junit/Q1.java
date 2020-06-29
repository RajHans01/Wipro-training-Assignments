package com.wipro.task;

import java.util.Arrays;

public class DailyTasks {
	public String doStringConcat(String s1, String s2) {
		return s1 + s2;
	}

	public int[] sortValue(int[] arr) {
		Arrays.sort(arr);
		return arr;
	}

	public boolean checkPresence(String s, String a) {
		return s.contains(a);
	}
}

package com.wipro.test;


import static org.junit.Assert.*;

import org.junit.Test;

import com.wipro.task.DailyTasks;

class TestCheckPresence {

	@Test
	void test() {
		DailyTasks st = new DailyTasks();
		assertTrue(st.checkPresence("Rajhans", "R"));
	}

}

package com.wipro.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.wipro.task.DailyTasks;

class TestSort {

	@Test
	void test() {
		DailyTasks st = new DailyTasks();
		int arr[] = new int[] { 3, 5, 2, 1, 4 };
		assertArrayEquals(new int[] { 1, 2, 3, 4, 5 }, st.sortValue(arr));
	}

}

package com.wipro.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.wipro.task.DailyTasks;

class TestStringConcate {

	@Test
	void test() {
		String s1 = "Raj";
		String s2 = "hans";
		DailyTasks st = new DailyTasks();
		assertEquals(s1 + s2, st.doStringConcat(s1, s2));
	}

}
package com.wipro.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestCheckPresence.class, TestSort.class, TestStringConcate.class })
public class AllTests {

}
