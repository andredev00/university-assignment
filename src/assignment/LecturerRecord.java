package assignment;

final class LecturerRecord {

	private String name;
	private Integer age;
	private Faculty faculty;
	private Department dept;
	// adicionar os restantes constructor e metodos a esta classe

	record CustomLecturerRecord(String name, Integer age, Faculty faculty, Department dept) {
		public CustomLecturerRecord {
			if (name.isBlank() || age < 0) {
				String errorMsg = """
				        Illegal argument passed: "name": %s, "age: " %s 
				        """.formatted(name, age);
				throw new IllegalArgumentException(errorMsg);
			}
		}
		
		public boolean hasPhd() {
			String prefix = name.length() >= 3 ? name.substring(0, 3) : "";
	        String suffix = name.length() >= 3 ? name.substring(name.length() - 3) : "";

	        return switch (prefix) {
	            case "Dr." -> true;
	            default -> suffix.equals("PhD");
	        };
	    }
	}
	
	public LecturerRecord() {
		super();
	}

	public LecturerRecord(String name, Integer age, Faculty faculty, Department dept) {
		super();
		this.name = name;
		this.age = age;
		this.faculty = faculty;
		this.dept = dept;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Faculty getFaculty() {
		return faculty;
	}

	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}
}
