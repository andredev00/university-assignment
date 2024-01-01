package assignment;

public abstract sealed class Faculty
		implements Educational permits EngineeringFaculty, HumanitiesFaculty, BusinessFaculty {

	public abstract void engineering();

	public abstract void humanities();

	public abstract void business();

	@Override
	public String toString() {
		return "Faculty";
	}

	public void whichFaculty(Faculty faculty) {
		 String className = faculty.getClass().getSimpleName().toLowerCase();
	        switch (className) {
	            case "engineeringfaculty" -> {
	                ((EngineeringFaculty) faculty).engineering();
	                System.out.println("Faculty of: " + faculty);
	            }
	            case "humanitiesfaculty" -> {
	                ((HumanitiesFaculty) faculty).humanities();
	                System.out.println("Faculty of: " + faculty);
	            }
	            case "businessfaculty" -> {
	                ((BusinessFaculty) faculty).business();
	                System.out.println("Faculty of: " + faculty);
	            }
	            default -> throw new IllegalArgumentException("Unknown faculty: " + faculty);
	        }
	}

}
