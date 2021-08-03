/**
 * 
 */
package com.study.pattern.state;

/**
 * @author 
 *
 */
public class Silent implements AlertState{

	@Override
	public void alert() {
		System.out.println("silent");
		
	}

}
