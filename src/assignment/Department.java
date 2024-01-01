package assignment;

public abstract sealed class Department permits ComputerEnginneringDept, SoftwareEngineeringDept, SocialCareDept, AccountingDept {

	public abstract void compEng();

	public abstract void swEng();

	public abstract void socialCare();

	public abstract void accouting();

	@Override
	public String toString() {
		return "Department";
	}

	public void whichDept(Department department) {
		 String deptName = department.getClass().getSimpleName().toLowerCase();

	        switch (deptName) {
	            case "computerengineeringdept" -> {
	                ((ComputerEnginneringDept) department).compEng();
	                System.out.println("Dept of: " + department);
	            }
	            case "softwareengineeringdept" -> {
	                ((SoftwareEngineeringDept) department).swEng();
	                System.out.println("Dept of: " + department);
	            }
	            case "socialcaredept" -> {
	                ((SocialCareDept) department).socialCare();
	                System.out.println("Dept of: " + department);
	            }
	            case "accountingdept" -> {
	                ((AccountingDept) department).accouting();
	                System.out.println("Dept of: " + department);
	            }
	            default -> throw new IllegalArgumentException("Unknown department: " + deptName);
	        }
	}

}
