package assignment;

import assignment.LecturerRecord.CustomLecturerRecord;

public class University {

	public static void main(String[] args) {
	    
		//LecturerRecord wheres the age is invalid
		//CustomLecturerRecord customLecturerRecordAge = new CustomLecturerRecord("John Doe", -30, null, null);
		
		//LecturerRecord wheres the age is invalid
		//CustomLecturerRecord customLecturerRecordName = new CustomLecturerRecord("", 30, null, null);
	    
		//System.out.println(customLecturerRecordAge);
		//System.out.println(customLecturerRecordName);
		
		//LecturerRecord wheres the actual Record is valid
		CustomLecturerRecord customLecturerRecordCorrect = new CustomLecturerRecord("Jane Bloggs", 24, new EngineeringFaculty(), new SoftwareEngineeringDept());
		System.out.println(customLecturerRecordCorrect.toString());
		
		System.out.println("Name is " + customLecturerRecordCorrect.name());
		System.out.println("Age is " + customLecturerRecordCorrect.age());
		System.out.println("Faculty is " + customLecturerRecordCorrect.faculty());
		System.out.println(customLecturerRecordCorrect.faculty());
		customLecturerRecordCorrect.faculty().whichFaculty(customLecturerRecordCorrect.faculty());
		System.out.println("Department is " + customLecturerRecordCorrect.dept());
		customLecturerRecordCorrect.dept().whichDept(customLecturerRecordCorrect.dept());
		System.out.println(customLecturerRecordCorrect.hasPhd());
		
		CustomLecturerRecord customLecturerRecordAnne = new CustomLecturerRecord("Dr. Anne Bloggs", 35, new BusinessFaculty(), new AccountingDept());
		System.out.println(customLecturerRecordAnne.toString());
		System.out.println(customLecturerRecordAnne.hasPhd());
		
		CustomLecturerRecord customLecturerRecordJoe = new CustomLecturerRecord("Joe Bloggs PhD", 54, new HumanitiesFaculty(), new SocialCareDept());
		System.out.println(customLecturerRecordJoe.toString());
		System.out.println(customLecturerRecordJoe.hasPhd());
	}
	
}
