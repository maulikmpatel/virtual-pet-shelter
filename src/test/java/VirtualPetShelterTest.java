import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class VirtualPetShelterTest {

	VirtualPetShelter virtualPetShelter = new VirtualPetShelter();

	@Test
	public void shouldGetPets() {
		// Arrange
		virtualPetShelter.getPets();
		// Act

		// Assert

	}

	@Test
	public void shoulFeedOnePet() {
		VirtualPetShelter virtualPetShelter = new VirtualPetShelter();

		VirtualPet testPet = new VirtualPet("bob", "Smith");
		VirtualPet testPet2 = new VirtualPet("Jon", "Doe");

		virtualPetShelter.addPet(testPet);
		virtualPetShelter.addPet(testPet2);
		int preTest = testPet.getHunger();
		int preTest2 = testPet2.getHunger();

		virtualPetShelter.feedOnePet("bob");
		int underTest = testPet.getHunger();
		int underTest2 = testPet2.getHunger();

		assertTrue(underTest > preTest && underTest2 == preTest2);
	}

	@Test
	public void shouldWaterOnePet() {
		VirtualPetShelter virtualPetShelter = new VirtualPetShelter();
		VirtualPet testPet = new VirtualPet("bob", "Smith");
		VirtualPet testPet2 = new VirtualPet("Jon", "Doe");
		virtualPetShelter.addPet(testPet);
		virtualPetShelter.addPet(testPet2);

		int preTest = testPet.getThirst();
		int preTest2 = testPet2.getThirst();
		virtualPetShelter.waterOnePet("bob");
		int underTest = testPet.getThirst();
		int underTest2 = testPet2.getThirst();

		assertTrue(underTest > preTest && preTest2 == underTest2);

	}

	@Test
	public void shoulPlayWithOnePet() {
		VirtualPetShelter virtualPetShelter = new VirtualPetShelter();

		VirtualPet testPet = new VirtualPet("bob", "Smith");
		VirtualPet testPet2 = new VirtualPet("Jon", "Doe");

		virtualPetShelter.addPet(testPet);
		virtualPetShelter.addPet(testPet2);
		int preTest = testPet.getBoredom();
		int preTest2 = testPet2.getBoredom();

		virtualPetShelter.playOnePet("bob");
		int underTest = testPet.getBoredom();
		int underTest2 = testPet2.getBoredom();

		assertTrue(underTest > preTest && underTest2 == preTest2);
	}

	@Test // JP's Test
	public void shouldFeedAllPets() {
		VirtualPet petTestAll = new VirtualPet("Test Pet, Shelter", "Test Description,Shelter");
		virtualPetShelter.addPet(petTestAll);
		int preTest = petTestAll.getHunger();
		virtualPetShelter.feedAllPets();
		int underTest = petTestAll.getHunger();
		assertTrue(underTest > preTest);
	}

	@Test
	public void shouldWaterAllPets() {
		VirtualPet petTestAll = new VirtualPet("Test Pet, Shelter", "Test Description,Shelter");
		virtualPetShelter.addPet(petTestAll);
		int preTest = petTestAll.getThirst();
		virtualPetShelter.waterAllPets();
		int underTest = petTestAll.getThirst();
		assertTrue(underTest > preTest);
	}

	@Test
	public void shouldPlayAllPets() {
		VirtualPet petTestAll = new VirtualPet("Test Pet, Shelter", "Test Description,Shelter");
		virtualPetShelter.addPet(petTestAll);
		int preTest = petTestAll.getBoredom();
		virtualPetShelter.playAllPets();
		int underTest = petTestAll.getBoredom();
		assertTrue(underTest > preTest);
	}

	@Test
	public void shouldRemovePet() {
		VirtualPetShelter virtualPetShelter = new VirtualPetShelter();

		VirtualPet testPet = new VirtualPet("bob", "Smith");
		VirtualPet testPet2 = new VirtualPet("Jon", "Doe");

		virtualPetShelter.addPet(testPet);
		virtualPetShelter.addPet(testPet2);
		int preTest = virtualPetShelter.getPets().size();
		virtualPetShelter.adoptPet("bob");

		int underTest = virtualPetShelter.getPets().size();

		assertTrue(underTest < preTest);
	}

	@Test
	public void shouldAddPet() {

		VirtualPetShelter virtualPetShelter = new VirtualPetShelter();

		VirtualPet testPet = new VirtualPet("bob", "Smith");
		virtualPetShelter.addPet(testPet);
		int preTest = virtualPetShelter.getPets().size();

		VirtualPet testPet2 = new VirtualPet("Jon", "Doe");
		virtualPetShelter.addPet(testPet2);
		int underTest = virtualPetShelter.getPets().size();

		assertTrue(underTest > preTest);
	}

}