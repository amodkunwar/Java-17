
public record CarRecord(String regNumber, String ownerName) {

	static String location;

	/*
	 * // custome conanical constructor public CarRecord(String regNumber, String
	 * ownerName) { this.regNumber = regNumber; this.ownerName = ownerName; }
	 */

	// custom compact constructor

	public CarRecord {
		if (regNumber.length() < 4) {
			throw new IllegalArgumentException();
		}
	}

	public String getLocation() {
		return location;
	}

	/*
	 * Here I am overriding the owerName so that we can get the ownerName as per the
	 * requirement
	 */

	public String ownerName() {
		return this.ownerName.toUpperCase();
	}

}