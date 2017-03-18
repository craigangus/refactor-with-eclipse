package com.witheclipse.refactor.examples.ifstatements;

public class If {
	private static final boolean TRUE_VALUE = false;
	private int x;

	/**
	 * Inverse if statement
	 * <ol>
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

	/**
	 * Convert to if-!-return
	 * <ol>
	 * <li>Place cursor on <b>if</b> statement</li>
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
	
	/**
	 * Inverse boolean expression
	 * <ol>
	 * <li>Place cursor on <b>&&</b> operand</li>
	 * <li>ctrl + 1</li>
	 * <li>select <i>Exchange left and right operands for infix expression</i></li>
	 * <li></li>
	 * <li></li>
	 * <li></li>
	 * <li></li>
	 * </ol>
	 */
	void InverseBooleanExpression(boolean a, boolean b) {
		if (a && !b) {
			methodCall();
		}
		
		
		otherMethodCall();
	}
	
	/**
	 * Invert local variable
	 * <ol>
	 * <li>Place cursor where variable <b>a</b> is declared</li>
	 * <li>ctrl + 1</li> 
	 * <li>Select <i>Invert Local Variable</i></li>
	 * <li>Hit enter to accept new name, or type new name and hit enter</li>
	 * </ol>
	 */
	void InvertLocalVariable() {
		boolean a = false;
		if (a) {}
	}
	
	/**
	 * <ol>
	 * <li></li>
	 * <li></li>
	 * <li></li>
	 * <li></li>
	 * <li></li>
	 * </ol>
	 */
	
	
	private void otherMethodCall() {
		
	}

	private void methodCall() {
		
	}
	
}
