package rong;

public class lucky_deling {

	
	
	public static void main(String[] args) {

	
		 boolean geschlecht  = true ;
		 int alter = 15;
		 String name = "Susanne" ;
		
		if(alter<18){
			System.out.println("Hallo "+name);
			System.out.println("Du hast "+wuerfeln()+"!");
		}
		else if(!geschlecht){
			System.out.println("Lieber Herr "+ name+"!");
			System.out.println("Du hast "+ wuerfeln() +"!");}
		
		}
	    else{
			System.out.println("Liebe Frau "+ name +"!");
			System.out.println("Du hast " +wuerfeln()+ "!");
	    }
	
		
		
	public static String wuerfeln(){
		if(Math.random()<=0.42){
			return("Verloren!");
		}
		else{return("Gewonnen!");}
		
	}
	
			
		
		
		
		
}


