/**
 * 
 */
package com.raidentrance.test.spying;

import static org.mockito.Mockito.mock;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

/**
 * @author raidentrance
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class SpyingSampleTest {

	@Test
	public void mockTest() {
		ArrayList arrayList = mock(ArrayList.class);
		arrayList.add("Object 1");
		arrayList.add("Object 2");
		arrayList.add("Object 3");
		System.out.println(arrayList.size());
		

	}
}
