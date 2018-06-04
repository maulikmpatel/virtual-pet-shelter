import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class VirtualPetShelterApp {

	public static void main(String[] args) {

		VirtualPetShelter virtualPetShelter = new VirtualPetShelter();
		Scanner input = new Scanner(System.in);
		boolean gameOn = true;
		Map<String, VirtualPet> pets = new HashMap<>();

		VirtualPet pet1 = new VirtualPet("Tom", "Tons of energy, Loves to play fetch", 60, 60, 60);
		VirtualPet pet2 = new VirtualPet("Dick", "Is a lazy puppy, great to cuddle with", 50, 50, 50);
		VirtualPet pet3 = new VirtualPet("Harry", "Like to name says, NOT REALLY A CAT", 40, 40, 40);

		virtualPetShelter.addPet(pet1);
		virtualPetShelter.addPet(pet2);
		virtualPetShelter.addPet(pet3);

		System.out.println("Welcome to Patel's Pet Shoppe");
		System.out.println("Currently we have the following pets available for adoption.");
		System.out.println("Name \t| Type 	\t| 	Hunger \t| Thirst \t| Boredom \t");
		System.out.println("Tom \t| Dog 	\t| 	60 \t| 60 	\t| 60 \t");
		System.out.println("Dick \t| Dog 	\t| 	50 \t| 50 	\t| 50 \t");
		System.out.println("Harry \t|NOT CAT\t| 	40 \t| 40	 \t| 40 \t");
		System.out.println(virtualPetShelter.petOptions());

		while (gameOn == true) {
			String userAction = input.nextLine();

			if (userAction.equals("1")) {
				System.out.println("Please type pet name");
				String userActionpet = input.nextLine();
				virtualPetShelter.feedOnePet(userActionpet);
				System.out.println("you have feed " + userActionpet + ".");
				System.out.println(virtualPetShelter.petOptions());
			}
			if (userAction.equals("2")) {
				System.out.println("please type in pet name");
				String userActionpet = input.nextLine();
				virtualPetShelter.waterOnePet(userActionpet);
				System.out.println("you have watered " + userActionpet + ".");
				System.out.println(virtualPetShelter.petOptions());
			}
			if (userAction.equals("3")) {
				System.out.println(virtualPetShelter.shortDescription());
				System.out.println("please type in pet name");
				String userActionpet = input.nextLine();
				virtualPetShelter.playOnePet(userActionpet);
				System.out.println("you have played with " + userActionpet + ".");
				System.out.println(virtualPetShelter.petOptions());
			}
			if (userAction.equals("5")) {
				virtualPetShelter.feedAllPets();
				System.out.println("you have feed all the pets.");
				System.out.println(virtualPetShelter.petOptions());
			}
			if (userAction.equals("6")) {
				virtualPetShelter.waterAllPets();
				System.out.println("you have wated all the pets.");
				System.out.println(virtualPetShelter.petOptions());
			}
			if (userAction.equals("7")) {
				virtualPetShelter.playAllPets();
				System.out.println("you have played with all the pets.");
				System.out.println(virtualPetShelter.petOptions());
			}
			if (userAction.equals("4")) {
				System.out.println("Please type the name of pet you wish to adopt.");
				String userActionpet = input.nextLine();
				virtualPetShelter.adoptPet(userActionpet);
				System.out.println("Congratulations!!! you are not the proud parent of " + userActionpet + ".");
				System.out.println(virtualPetShelter.petOptions());
			}
			if (userAction.equals("8")) {
				System.out.println("please type name of pet.");
				String userActionPet = input.nextLine();
				System.out.println("please describe this pet.");
				String userDescription = input.nextLine();
				VirtualPet newPet = new VirtualPet(userActionPet, userDescription);
				virtualPetShelter.addPet(newPet);
				System.out.println(virtualPetShelter.petOptions());
			}
			if (userAction.equals("9")) {
				System.out.println(virtualPetShelter.petStatus());
				System.out.println(virtualPetShelter.petOptions());
				continue;
			}
			if (userAction.equals("0")) {
				System.out.println("Thank you for visiting Patel's WE DONT HAVE ANY CATS Shoppe");
				System.out.println("Please come again");
				System.exit(0);
			}
			virtualPetShelter.allPetTick();

		}
	}
}