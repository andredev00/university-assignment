package assignment;

final class EngineeringFaculty extends Faculty {

	@Override
	public void engineering() {
		System.out.println("We teach computer science, civil engineering etc...");
	}

	@Override
	public void humanities() {
		// TODO Auto-generated method stub

	}

	@Override
	public void business() {
		// TODO Auto-generated method stub

	}

	@Override
	public String toString() {
		return "Engineering";
	}

}
