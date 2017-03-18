package com.witheclipse.refactor.examples.ifstatements;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

import com.witheclipse.refactor.examples.ifstatements.IfStatementCodeCoverage;

public class IfStatementCodeCoverageTest {

	@Test
	public void testpartialCoverage_withAEqualsFalseAndBEqualsFalseAndCEqualsFalse_returnsFalse() throws Exception {
		IfStatementCodeCoverage ifStatementCodeCoverage = new IfStatementCodeCoverage();
		boolean a = false;
		boolean b = false;
		boolean c = false;
		boolean partialCoverageResult = ifStatementCodeCoverage.partialCoverage(a, b, c);

		assertFalse(partialCoverageResult);
	}

	@Test
	public void testpartialCoverage_withAEqualsTrueAndBEqualsFalseAndCEqualsFalse_returnsFalse() throws Exception {
		IfStatementCodeCoverage ifStatementCodeCoverage = new IfStatementCodeCoverage();
		boolean a = true;
		boolean b = false;
		boolean c = false;
		boolean partialCoverageResult = ifStatementCodeCoverage.partialCoverage(a, b, c);

		assertFalse(partialCoverageResult);
	}

	@Test
	public void testpartialCoverage_withAEqualsTrueAndBEqualsTrueAndCEqualsFalse_returnsFalse() throws Exception {
		IfStatementCodeCoverage ifStatementCodeCoverage = new IfStatementCodeCoverage();
		boolean a = true;
		boolean b = true;
		boolean c = false;
		boolean partialCoverageResult = ifStatementCodeCoverage.partialCoverage(a, b, c);

		assertFalse(partialCoverageResult);
	}

	
	@Test
	public void testpartialCoverage_withAEqualsTrueAndBEqualsFalseAndCEqualsTrue_returnsFalse() throws Exception {
		IfStatementCodeCoverage ifStatementCodeCoverage = new IfStatementCodeCoverage();
		boolean a = true;
		boolean b = false;
		boolean c = true;
		boolean partialCoverageResult = ifStatementCodeCoverage.partialCoverage(a, b, c);

		assertFalse(partialCoverageResult);
	}

	
	@Test
	public void testpartialCoverage_withAEqualsFalseAndBEqualsFalseAndCEqualsTrue_returnsFalse() throws Exception {
		IfStatementCodeCoverage ifStatementCodeCoverage = new IfStatementCodeCoverage();
		boolean a = false;
		boolean b = true;
		boolean c = true;
		boolean partialCoverageResult = ifStatementCodeCoverage.partialCoverage(a, b, c);

		assertFalse(partialCoverageResult);
	}
	
	@Ignore
	@Test
	public void testpartialCoverage_withAEqualsTrueAndBEqualsTrueAndCEqualsTrue_returnsFalse() throws Exception {
		IfStatementCodeCoverage ifStatementCodeCoverage = new IfStatementCodeCoverage();
		boolean a = true;
		boolean b = true;
		boolean c = true;
		boolean partialCoverageResult = ifStatementCodeCoverage.partialCoverage(a, b, c);

		assertTrue(partialCoverageResult);
	}
}
