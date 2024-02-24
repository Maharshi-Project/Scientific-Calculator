	package com.example.calculator;

	import org.junit.Assert;
	import org.junit.Test;
	import org.springframework.boot.test.context.SpringBootTest;

	@SpringBootTest
	public class CalculatorApplicationTests {

		Calculator calcualtorOperaion = new Calculator();
		private final double approx = 0.000000000001;
		@Test
		public void testaddition(){
			Assert.assertEquals(20,calcualtorOperaion.addition(18,2),approx);
			Assert.assertEquals(26,calcualtorOperaion.addition(13,13),approx);
		}
		@Test
		public void additionFalsePositive(){
			Assert.assertNotEquals(15,calcualtorOperaion.addition(10,12),approx);
			Assert.assertNotEquals(5,calcualtorOperaion.addition(1,2),approx);
		}
		@Test
		public void testsubtraction(){
			Assert.assertEquals(5,calcualtorOperaion.subtraction(10,5),approx);
			Assert.assertEquals(0,calcualtorOperaion.subtraction(10,10),approx);
			Assert.assertEquals(-2,calcualtorOperaion.subtraction(10,12),approx);
		}
		@Test
		public void subtractionFalsePositive() {
			Assert.assertNotEquals(-10, calcualtorOperaion.subtraction(10, 12), approx);
			Assert.assertNotEquals(0, calcualtorOperaion.subtraction(24, 12), approx);
		}
		@Test
		public void testmultiplication(){
			Assert.assertEquals(50,calcualtorOperaion.multiplication(10,5),approx);
			Assert.assertEquals(0,calcualtorOperaion.multiplication(0,10),approx);
			Assert.assertEquals(-120,calcualtorOperaion.multiplication(-10,12),approx);
		}
		@Test
		public void multiplicationFalsePositive() {
			Assert.assertNotEquals(210, calcualtorOperaion.multiplication(10, 12), approx);
			Assert.assertNotEquals(0, calcualtorOperaion.multiplication(24, 12), approx);
		}
		@Test
		public void testdivision(){
			Assert.assertEquals(2,calcualtorOperaion.division(10,5),approx);
			Assert.assertEquals(0,calcualtorOperaion.division(0,10),approx);
			Assert.assertEquals(-2,calcualtorOperaion.division(-10,5),approx);
			Assert.assertEquals(Double.NEGATIVE_INFINITY,calcualtorOperaion.division(-1,0),approx);
			Assert.assertEquals(Double.POSITIVE_INFINITY,calcualtorOperaion.division(1,0),approx);
		}
		@Test
		public void divisionFalsePositive() {
			Assert.assertNotEquals(10, calcualtorOperaion.division(10, 12), approx);
			Assert.assertNotEquals(20, calcualtorOperaion.division(24, 12), approx);
		}
		@Test
		public void testsquareRoot(){
			Assert.assertEquals(9,calcualtorOperaion.squareRoot(81),approx);
			Assert.assertEquals(5,calcualtorOperaion.squareRoot(25),approx);
			Assert.assertEquals(Math.sqrt(122.5),calcualtorOperaion.squareRoot(122.5),approx);
			Assert.assertEquals(Double.NaN,calcualtorOperaion.squareRoot(-25),approx);
		}
		@Test
		public void squareRootFalsePositive() {
			Assert.assertNotEquals(20, calcualtorOperaion.squareRoot(100), approx);
			Assert.assertNotEquals(2, calcualtorOperaion.squareRoot(144), approx);
		}
		@Test
		public void testfactorial(){
			Assert.assertEquals(120,calcualtorOperaion.factorial(5),approx);
			Assert.assertEquals(40320,calcualtorOperaion.factorial(8),approx);
			Assert.assertEquals(1,calcualtorOperaion.factorial(0),approx);
			Assert.assertEquals(Double.NaN,calcualtorOperaion.factorial(-25),approx);
		}
		@Test
		public void factorialFalsePositive() {
			Assert.assertNotEquals(50, calcualtorOperaion.factorial(10), approx);
			Assert.assertNotEquals(4, calcualtorOperaion.factorial(2), approx);
		}
		@Test
		public void testnaturalLogarithm(){
			Assert.assertEquals(Math.log(10),calcualtorOperaion.naturalLogarithm(10),approx);
			Assert.assertEquals(Math.log(24),calcualtorOperaion.naturalLogarithm(24),approx);
		}
		@Test
		public void naturalLogarithmFalsePositive() {
			Assert.assertNotEquals(2, calcualtorOperaion.naturalLogarithm(3), approx);
			Assert.assertNotEquals(4, calcualtorOperaion.naturalLogarithm(5), approx);
		}
		@Test
		public void testpower(){
			Assert.assertEquals(100,calcualtorOperaion.power(10,2),approx);
			Assert.assertEquals(13824,calcualtorOperaion.power(24,3),approx);
			Assert.assertEquals(0.0625,calcualtorOperaion.power(-4,-2),approx);
			Assert.assertEquals(Double.NaN,calcualtorOperaion.power(-4,-1.99),approx);
		}
		@Test
		public void powerFalsePositive() {
			Assert.assertNotEquals(10, calcualtorOperaion.power(3,2), approx);
			Assert.assertNotEquals(120, calcualtorOperaion.power(5,3), approx);
		}

	}
