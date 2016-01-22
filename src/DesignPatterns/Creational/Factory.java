/* http://www.programcreek.com/2013/02/java-design-pattern-factory/ */
package DesignPatterns.Creational;

public class Factory {
	public static interface FourWheeler {
		void installBrakes();

		void installSeatCovers();
	}

	public class Toyota implements FourWheeler {

		@Override
		public void installBrakes() {
			System.out.println("Installing the breaks for Toyota :-) ");
		}

		@Override
		public void installSeatCovers() {
			System.out.println("Installing the seat covers for Toyota :-) ");
		}

	}

	public class Audi implements FourWheeler {
		@Override
		public void installBrakes() {
			System.out.println("Installing the breaks for Audi :-) ");
		}

		@Override
		public void installSeatCovers() {
			System.out.println("Installing the seat covers for Audi :-) ");
		}

	}

}
/* one factory interface and override the same in the other classes */
/* and each of the classes have their own implementation w.r.t the interface */
/*
 * Hence we can install seat covers for any type of car irrespective of the
 * underlying implementation
 */