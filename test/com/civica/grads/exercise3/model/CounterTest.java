package com.civica.grads.exercise3.model;

import java.io.IOException;

import com.civica.grads.exercise3.enums.Colour;
import com.civica.grads.exercise3.enums.CounterType;
import com.civica.grads.exercise3.model.draughts.Counter;

public class CounterTest {

	public static void main(String[] args) {
		Counter counter = new Counter(Colour.BLACK, CounterType.KING) ;
		try {
			counter.describe(System.out);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} ; 
		
	}

}
