package assignment;

final class BusinessFaculty extends Faculty{

	@Override
	public void business() {
		System.out.println("We teach accountancy, law, economics, etc...");
	}
	
	@Override
	public void engineering() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void humanities() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public String toString() {
		return "Business";
	}	
	
}
