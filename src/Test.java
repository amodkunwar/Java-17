
public class Test {
	public static void main(String[] args) {
		CarRecord carRecord = new CarRecord("KA02JM80404", "Amod Kunwar");
		CarRecord.location = "Bangalore";
		System.out.println(carRecord);
		System.out.println(carRecord.getLocation());
		System.out.println(carRecord.ownerName());
	}
}
