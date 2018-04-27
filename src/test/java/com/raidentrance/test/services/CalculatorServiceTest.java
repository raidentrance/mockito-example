/**
 * 
 */
package com.raidentrance.test.services;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.raidentrance.services.DataService;
import com.raidentrance.services.impl.CalculatorServiceImpl;

/**
 * @author raidentrance
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class CalculatorServiceTest {
	@InjectMocks
	private CalculatorServiceImpl calculatorService;

	@Mock
	private DataService dataService;

	@Test
	public void testCalculateAvg_simpleInput() {
		when(dataService.getListOfNumbers()).thenReturn(new int[] { 1, 2, 3, 4, 5 });
		assertEquals(3.0, calculatorService.calculateAverage(), .01);
	}

	@Test
	public void testCalculateAvg_emptyInput() {
		when(dataService.getListOfNumbers()).thenReturn(new int[] {});
		assertEquals(0.0, calculatorService.calculateAverage(), .01);
	}

	@Test
	public void testCalculateAvg_singleInput() {
		when(dataService.getListOfNumbers()).thenReturn(new int[] { 1 });
		assertEquals(1.0, calculatorService.calculateAverage(), .01);
	}
}
