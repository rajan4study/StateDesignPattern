/**
 * 
 */
package com.study.pattern.state;

/**
 * @author 
 *
 */
public class Ring implements AlertState {

	@Override
	public void alert() {
		System.out.println("Ringing");

	}

}
