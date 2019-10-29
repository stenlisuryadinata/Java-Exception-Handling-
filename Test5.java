package CS1103U8Quizz2;

public class Test5 {
	public static void main(String[] args) 
    { 
	
	
	int a[]= {1, 2, 3, 4}; 
	
	try { 
    for (int i = 1; i <= 4; i++) 
    { 
        System.out.println ("a[" + i + "]=" + a[i] + "\n"); 
    }
    
    
    }catch (ArrayIndexOutOfBoundsException e) 
    { 
        System.out.println ("ArrayIndexOutOfBoundsException"); 
    } 
    }
	

}
