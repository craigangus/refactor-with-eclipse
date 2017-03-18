package com.witheclipse.testing.examples.ifstatements;

public class IfStatementCodeCoverage {

	/**
	 * <ol>
	 * <li>Run code coverage</li>
	 * <li>see that 1 of 6 branches missed</li>
	 * <li>place cursor on first &&</li>
	 * <li>ctrl + 1</li>
	 * <li><i>Split and condition</i></li>
	 * <li>place cursor on first &&</li>
	 * <li>ctrl + 1</li>
	 * <li>Re-run code coverage</li>
	 * <li>notice branch not covered is positive case <code>c = true</li>
	 * <li>write test to cover</li>
	 * <li>run code coverage</li>
	 * <li>Notice all branches now covered</li>
	 * <li>place cursor on <i>if</i></li>
	 * <li>Join 'if' statement with inner 'if' statement</li>
	 * 
	 * </ol>
	 * 
	 * 
	 */
	boolean partialCoverage(boolean a, boolean b, boolean c){
		if (a && b && c) {
			return true;
		}
		return false;
	}
	
}
