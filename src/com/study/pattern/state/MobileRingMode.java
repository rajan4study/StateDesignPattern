package com.study.pattern.state;

/**
 * @author 
 *
 */
public class MobileRingMode {
	private AlertState alertState;
	
	public MobileRingMode() {
		alertState= new Ring();
	}

	public void  setAlertState(AlertState alertState) {
		this.alertState=alertState;
	}
	
	public void showAlert() {
		alertState.alert();
	}
}
