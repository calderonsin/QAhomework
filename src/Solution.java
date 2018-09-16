import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

//Complete the code
public class Solution
{
	static String   fileName = "C:\\Users\\Calde\\Desktop\\QAhomework\\src\\Test3.txt";
	public static   File file  = new File(fileName);
	

public static List<Student> CreateList( Scanner in, int testCases){
	List<Student> studentList = new ArrayList<Student>();
	while(testCases>0){
		int id = in.nextInt();
		String fname = in.next();
		double cgpa = in.nextDouble();		
		Student st = new Student(id, fname, cgpa);
		studentList.add(st);		
		testCases--;
	}
	
	
	return studentList;
	
}
public static List<String> printStudents(List<Student> studentList) {
	List<String> ordenado = new ArrayList<String>();
	Collections.sort(studentList);	
	for(Student st: studentList){		
		ordenado.add(st.getFname());
	System.out.println(st.getFname()+ " " + st.getId());
	
}	return ordenado;}

	
	public static void main(String[] args) throws FileNotFoundException{
		
		
		//Scanner in = new Scanner(System.in);
		
		Scanner in = new Scanner(file); 
		int testCases = Integer.parseInt(in.nextLine());		
		
		List<Student> studentList=CreateList(in,testCases);	 
		 printStudents(studentList);
      	
	}
}