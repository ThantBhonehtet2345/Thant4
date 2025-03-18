package JWD;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;




class StudentBean{
	String id;
	String name;
	int Age;
	
	
	

	StudentBean(String id,String name,int Age){
		
		this.id=id;
		this.name=name;
		this.Age=Age;
	}
	
	
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return Age;
	}


	public void setAge(int age) {
		Age = age;
	}
	public String toString() {
        return  
                "pdCode='" + id + '\'' +
                ", pdName='" + name + '\'' +
                ", pdPrice=" + Age +
                '}';
    }
	
}



class StudentBean2{
	String id1;
	String name1;
	int Age1;
	
	
	StudentBean2(String id1,String name1,int Age1){
		
		this.id1=id1;
		this.name1=name1;
		this.Age1=Age1;
	}
	
	

	public String getId1() {
		return id1;
	}



	public void setId1(String id1) {
		this.id1 = id1;
	}


	public String getName1() {
		return name1;
	}


	public void setName1(String name1) {
		this.name1 = name1;
	}


	public int getAge1() {
		return Age1;
	}


	public void setAge1(int age1) {
		Age1 = age1;
	}
	public String toString() {
        return  
                "pdCode='" + id1 + '\'' +
                ", pdName='" + name1 + '\'' +
                ", pdPrice=" + Age1 +
                '}';
    }
}





public class Chapter5Hw1 {
	public static void main(String [] args ) {
		StudentBean S1=new StudentBean("1","A",10);
		StudentBean S2=new StudentBean("2","B",11);
		StudentBean S3=new StudentBean("3","C",12);
		StudentBean S4=new StudentBean("4","D",13);
		StudentBean S5=new StudentBean("5","E",14);
		
		
		Map<String, StudentBean> studentMap = new HashMap<>();
		studentMap.put(S1.getId(), S1);
		studentMap.put(S2.getId(), S2);
		studentMap.put(S3.getId(), S3);
		studentMap.put(S4.getId(), S4);
		studentMap.put(S5.getId(), S5);
        System.out.println("All Students of under age 20");
        for(StudentBean p : studentMap.values()) {
            System.out.println(p);
        }
     ;
        Scanner s=new Scanner(System.in);
        String searchCode = s.next();
        
       
        StudentBean foundStudent = studentMap.get(searchCode);
        
        System.out.println("Found product code "+searchCode);
        if(foundStudent!=null) {
        	System.out.println(foundStudent);
        
        }
        else {System.out.println("Not Found");}
		
		
		StudentBean2 St1=new StudentBean2("6","F",10);
		StudentBean2 St2=new StudentBean2("7","G",11);   
		StudentBean2 St3=new StudentBean2("8","H",12);
		StudentBean2 St4=new StudentBean2("9","I",13);
		StudentBean2 St5=new StudentBean2("10","J",14);
		
		
		Map<String, StudentBean2> studentMap1 = new HashMap<>();
		studentMap1.put(St1.getId1(), St1);
		studentMap1.put(St2.getId1(), St1);
		studentMap1.put(St3.getId1(), St1);
		studentMap1.put(St4.getId1(), St1);
		studentMap1.put(St5.getId1(), St1);
		
		   System.out.println("Enter number for over age 20 ");
		   for(StudentBean2 t:studentMap1.values()) {
			   System.out.println(t);
		   }
		   Scanner y=new Scanner(System.in);
	        String under20searchCode = s.next();
	        
	       
	        StudentBean Under20foundStudent = studentMap.get(under20searchCode);
	        
	        System.out.println("Found product code "+under20searchCode);
	        if(Under20foundStudent!=null) {
	        	System.out.println(Under20foundStudent);
	        
	        }
	        else {System.out.println("Not Found");}
			
	}
	}
	
    

