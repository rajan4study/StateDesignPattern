/**
 * 
 */
package com.study.pattern.state;

/**
 * @author
 *
 */
public class Vibrate implements AlertState {

	@Override
	public void alert() {
		System.out.println("vibrate");
	}

}
