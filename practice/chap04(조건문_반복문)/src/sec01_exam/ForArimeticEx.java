package sec01_exam;

public class ForArimeticEx {

	public static void main(String[] args) {

    FourArimetic f = new FourArimetic();
    
    int result = f.add(10, 1000);

    System.out.println(result);
    
    result = f.sub(10,1000);
    
    System.out.println(result);
    
    result = f.muply(10, 1000);
    
    System.out.println(result);
    
    result = f.divice(10, 1000);
    
    System.out.println(result);
    
    result = f.Tavg(50,10,20);
    
    System.out.println(result);
     result = f.Max(6, 8);
     
     System.out.println(result);
     
result = f.Min(6, 8);
     
     System.out.println(result);
	}

}
