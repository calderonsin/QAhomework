import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

//Complete the code
public class Solution
{
	public static void main(String[] args) throws FileNotFoundException{
		
		String fileName = "C:\\Users\\Calde\\Desktop\\java\\src\\input00.txt";
		//Scanner in = new Scanner(System.in);
		File file = new File(fileName);
		Scanner in = new Scanner(file); 
		int testCases = Integer.parseInt(in.nextLine());
		
		List<Student> studentList = new ArrayList<Student>();
		while(testCases>0){
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();
			
			Student st = new Student(id, fname, cgpa);
			studentList.add(st);
			
			testCases--;
		}
		
		 Collections.sort(studentList);
		
      	for(Student st: studentList){
      		
			System.out.println(st.getFname());
		}
	}
}