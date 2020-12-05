package org.przybyl.recordsForIntrigued.s4_nesting;

/**
 * Created by Piotr Przybył (piotr@przybyl.org) on 2020-12-05.
 */
public class LocalEnumsAndInterfaces {

	public static void main(String[] args) {

// 	please don't forget we're inside a method!

		record LocalRecord() {
			public String introduce() {
				return "Local records work :-)";
			}
		}
//	these work in Java 16, but your IDE might complain ;-)

/*
		enum LocalEnum {
			SINGLE;

			public String introduce() {
				return "In Java 16 you can have local enums :-D";
			}
		}

		interface LocalInterface {
			static String introduce() {
				return "In Java 16 you can have local interfaces :-D";
			}
		}
*/

		class LocalClass {
			String introduce() {
				return "Local classes too, of course.";
			}
		}


		System.out.println(new LocalRecord().introduce());
//		System.out.println(LocalEnum.SINGLE.introduce());
//		System.out.println(LocalInterface.introduce());
		System.out.println(new LocalClass().introduce());
	}
}
