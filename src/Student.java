class Student implements Comparable<Student>{
	private int id;
	private String fname;
	private double cgpa;
	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
	public int getId() {
		return id;
	}
	public String getFname() {
		return fname;
	}
	public double getCgpa() {
		return cgpa;
	}
	@Override
	public int compareTo(Student arg0) {
		int result = 0;
		if(this.cgpa == arg0.cgpa)
		{
			if(this.fname.equals(arg0.fname))
			{
				result = -1 * (this.id - arg0.id);
			}
			else
			{
				result = (this.fname).compareTo(arg0.fname);
			}
		}
		else
		{
			result = -1 * Double.compare(this.cgpa, arg0.cgpa);
		}
		return result;
	}
}