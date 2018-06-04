
public class VirtualPet {

	private String petName;
	private String description;
	private int hunger;
	private int thirst;
	private int boredom;
	private int amount = 10;

	public String getPetName() {
		return petName;
	}

	public void setPetName(String petName) {
		this.petName = petName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getHunger() {
		return hunger;
	}

	public void setHunger(int hunger) {
		this.hunger = hunger;
	}

	public int getThirst() {
		return thirst;
	}

	public void setThirst(int thirst) {
		this.thirst = thirst;
	}

	public int getBoredom() {
		return boredom;
	}

	public void setBoredom(int boredom) {
		this.boredom = boredom;
	}

	public int feedPet() {
		hunger += amount;
		thirst -= amount / 2;
		return hunger;

	}

	public int waterPet() {
		thirst += amount;
		boredom += amount / 2;

		return thirst;
	}

	public int playPet() {
		boredom += amount;
		hunger -= amount / 3;
		thirst -= amount / 3;

		return boredom;
	}

	public void tick() {
		hunger -= 2;
		thirst -= 2;
		boredom -= 2;

	}

	public VirtualPet(String petName, String description, int hunger, int thirst, int boredom) {
		this.petName = petName;
		this.description = description;
		this.hunger = hunger;
		this.thirst = thirst;
		this.boredom = boredom;
	}

	public VirtualPet(String petName, String description) {
		this.petName = petName;
		this.description = description;
		this.hunger = 50;
		this.thirst = 50;
		this.boredom = 50;
	}

}
