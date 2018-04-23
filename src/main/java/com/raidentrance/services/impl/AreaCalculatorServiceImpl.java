/**
 * 
 */
package com.raidentrance.services.impl;

import com.raidentrance.services.AreaCalculatorService;
import com.raidentrance.services.DataService;

/**
 * @author maagapi
 *
 */
public class AreaCalculatorServiceImpl implements AreaCalculatorService {
	private DataService dataService;

	@Override
	public double calculateAverage() {
		int[] numbers = dataService.getListOfNumbers();
		double avg = 0;
		for (int i : numbers) {
			avg += i;
		}
		return (numbers.length > 0) ? avg / numbers.length : 0;
	}

	public void setDataService(DataService dataService) {
		this.dataService = dataService;
	}

}
