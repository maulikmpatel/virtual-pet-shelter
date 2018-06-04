import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class VirtualPetShelter {

	Map<String, VirtualPet> pets = new HashMap<>();

	public Collection<VirtualPet> getPets() {
		return pets.values();

	}

	public VirtualPet getOnePet(String petName) {
		return pets.get(petName);

	}

	public void addPet(VirtualPet pet) {
		pets.put(pet.getPetName(), pet);

	}

	public void adoptPet(String petName) {
		pets.remove(petName);

	}

	public void feedAllPets() {
		for (VirtualPet pet : pets.values()) {
			pet.feedPet();

		}
	}

	public void feedOnePet(String petName) {
		getOnePet(petName).feedPet();

	}

	public void waterAllPets() {
		for (VirtualPet pet : pets.values()) {
			pet.waterPet();

		}
	}

	public void waterOnePet(String petName) {
		getOnePet(petName).waterPet();

	}

	public void playAllPets() {
		for (VirtualPet pet : pets.values()) {
			pet.playPet();
		}
	}

	public void playOnePet(String petName) {
		getOnePet(petName).playPet();

	}

	public void allPetTick() {
		for (VirtualPet pet : pets.values()) {
			pet.tick();
		}
	}

	public String petStatus() {
		String petStatus = "";
		for (VirtualPet pet : pets.values()) {
			petStatus += pet.getPetName() + "\t|	" + pet.getDescription() + "		\t|		" + pet.getHunger()
					+ "\t|	" + pet.getThirst() + "	\t|	" + pet.getBoredom() + "	\t|	\n";

		}
		return ("Name \t|	Description					\t|		Hunger\t|	Thirst	\t|	Boredom	\t|	\n" + petStatus);
	}

	public String shortDescription() {
		String shortDescription = "";
		for (VirtualPet pet : pets.values()) {
			shortDescription += pet.getPetName() + "\t|	" + pet.getDescription() + "\n";
		}
		return shortDescription;
	}

	public String petOptions() {
		return ("what would you like to do?\npress 1 to feed a pet. 	\t\tpress 5 to feed all pets. \npress 2 to water a pet.	 \t\tpress 6 to water all pet \npress 3 to play with a pet. \t\tpress 7 to play with all pets. \npress 4 to Adopt a pet. \t\tpress 8 to place a pet for adoption.\npress 9 for status of all pets. \tpress 0 to Exit.");

	}

}
