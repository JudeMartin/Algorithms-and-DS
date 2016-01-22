/* http://www.programcreek.com/2011/07/java-design-pattern-singleton/ */
package DesignPatterns.Creational;

public class Singleton {
	public class AmericanPresident {
		/*
		 * Here the same reference of the object is returned , Since the final
		 * Keyword is used
		 */
		private final AmericanPresident americanPresident = new AmericanPresident();

		/* Default constructor is private */
		/* not open for instantiation */
		private AmericanPresident() {
		}

		/* public getter method to access the member variable */
		public AmericanPresident getAmericanPresident() {
			return americanPresident;
		}
	}

}
/*
 * There can be only one american president, Hence the singleton pattern is the
 * best suited
 */