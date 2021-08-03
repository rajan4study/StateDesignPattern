/**
 * 
 */
package com.study.pattern.state;

/**
 * @author 
 *
 */
public class Mobile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MobileRingMode mode= new MobileRingMode();
		mode.showAlert();
		mode.setAlertState(new Silent());
		mode.showAlert();
		mode.setAlertState(new Vibrate());
		mode.showAlert();
	}

}
