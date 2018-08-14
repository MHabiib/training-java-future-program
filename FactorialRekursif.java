public class FactorialRekursif {
	
	public static int Faktorial(int inp){
		if(inp<=1){
			return inp;
		}
		else{
			return inp*Faktorial(inp-1);
		}
		
		
	}
	
    public static void main(String[] args){
		
		int inp=Integer.parseInt(args[0]);
		int faktorial=Faktorial(inp);
		System.out.println(faktorial);
}}
        
        
		