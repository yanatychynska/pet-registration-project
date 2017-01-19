/**
 * File Name: PetRegistration.java<br>
 * Tychynska, Yana<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Jan 18, 2017
 */
package com.sqa.yt;

/**
 * PetRegistration //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Tychynska, Yana
 * @version 1.0.0
 * @since 1.0
 */
public class PetRegistration {

	static String name;

	static String address;

	static String age;

	static int numberOfPets;

	static int numberOfYears;

	static final double PET_REG_FEE = 45;

	public static void main(String[] args) {
		String appName = "Pet Registration";
		String name = AppBasics.greetUserAndGetName(appName);
		registerPets();
		AppBasics.farewellUser(name, appName);
	}

	public static void registerPets() {
		double totalRegistrationCost;
		numberOfPets = AppBasics.requestIntFromUser("How many pets would you like to register?", 1, 5);
		numberOfYears = AppBasics.requestIntFromUser("How many years do you want to register your pet?", 1, 100);
		totalRegistrationCost = PET_REG_FEE * numberOfYears;
		System.out.printf("Than you for registering your %d pets, it will cost you $%.2f.\n", numberOfPets,
				totalRegistrationCost);
	}
}
