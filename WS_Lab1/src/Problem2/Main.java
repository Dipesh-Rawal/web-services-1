package Problem2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Doctor aDoctor = new Doctor("a", 30);
		Nurse aNurse = new Nurse("b", 25);
		Administrator anAdmin = new Administrator("c", 27);

		aDoctor.diagnose();
		aNurse.conduct();
		anAdmin.organize();
	}

}
