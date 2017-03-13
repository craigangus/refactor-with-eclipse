package com.refactorwitheclipse.examples.ifstatements;

public class If {


	private static final boolean TRUE_VALUE = false;
	private int x;

	/**<ol>
	 * <li>Place cursor: 
	 * 	<ul>
	 * 		<li>on <b>if</b> statement</li>
	 *  	<li>on <b>else</b> statement</li>
	 *  </ul>
	 * </li>
	 * <li>ctrl + 1</li>
	 * <li>Select Inverse 'if' statement</li>
	 * </ol>
	 * Hovering on option will display preview
	 */
	void InverseIfStatement() {
	
		if (TRUE_VALUE) {
			methodCall();
		} else {
			otherMethodCall();
		}
	}

	/**<ol>
	 * <li>Place cursor 
	 * 		on <b>if</b> statement
	 * </li>
	 * <li>ctrl + 1</li>
	 * <li>Select <i>Convert to if-!-return</li></li>
	 * </ol>
	 * Hovering on option will display preview
	 */
	void ConvertToIfNotReturn() {
		if (x == 1) {
			methodCall();
		}
	}
	
	private void otherMethodCall() {
		
	}

	private void methodCall() {
		
	}
	
}
