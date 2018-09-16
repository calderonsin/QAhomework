import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AllTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	//Given a number of Data I want to put in my list
	//When I run the program
	//Then I expected the size of the list to be equal to the number of data that I want.
	@Test
	public void Ntest() throws FileNotFoundException {
		
		List<Student> studentList = new ArrayList<Student>();
		Scanner in = new Scanner(Solution.file);		
		int esperado = Integer.parseInt(in.nextLine());
		studentList= Solution.CreateList(in,esperado);
		int resultado=studentList.size();
		
		assertEquals(esperado, resultado);
	}
	
	@Test
	//Given a list of student which has two students with the same CGPA
	//When I run the program
	//Then I expected that my program sort the two same CGPA with their name in an alphabetical order.
	public void sameCGPA() throws FileNotFoundException {
		
		List<Student> studentList = new ArrayList<Student>();
		String   fileName = "C:\\Users\\Calde\\Desktop\\QAhomework\\src\\Test2.txt";
		File test2  = new File(fileName);		
		Scanner in2 = new Scanner(test2);		
		int testCases = Integer.parseInt(in2.nextLine());
		studentList= Solution.CreateList(in2,testCases);
		List<Student> ordenado= Solution.sortStudents(studentList);
		List<String> esperado= new ArrayList<String>();		
		esperado.add("Ashis");
		esperado.add("Samara");
		esperado.add("Samiha");
		esperado.add("Fahim");
		esperado.add("Rumpa");
		List<String> resultado=new ArrayList<String>() ;
		for(Student st: ordenado){		
			resultado.add(st.getFname());
		}		
		
		assertEquals(esperado, resultado);
	}
	//Given a list of student, which has two students with the same CGPA and the same name.
	//When I run the program
	//Then I expect that my program, sort the two data with the same CGPA and name with their ID number in decreasing order.
	@Test
	public void sameCGPAName() throws FileNotFoundException {
		
		List<Student> studentList = new ArrayList<Student>();
		String   fileName2 = "C:\\Users\\Calde\\Desktop\\QAhomework\\src\\Test3.txt";
		File test3  = new File(fileName2);		
		Scanner in3 = new Scanner(test3);		
		int testCases = Integer.parseInt(in3.nextLine());
		studentList= Solution.CreateList(in3,testCases);
		List<Student> ordenado= Solution.sortStudents(studentList);
		List<String> resultado= new ArrayList<String>();
		List<Integer> resultadon= new ArrayList<Integer>();
		for(Student st: ordenado){		
			resultado.add(st.getFname());
			resultadon.add(st.getId());}		
		List<String> esperado= new ArrayList<String>();
		esperado.add("Ashis");
		esperado.add("Samara");
		esperado.add("Samara");
		esperado.add("Fahim");
		esperado.add("Rumpa");
		List<Integer> esperadon= new ArrayList<Integer>();
		esperadon.add(85);
		esperadon.add(56);
		esperadon.add(19);
		esperadon.add(22);
		esperadon.add(33);
		
		assertEquals(esperado, resultado);
		assertEquals(esperadon, resultadon);
		
	}
	
	
	

}
