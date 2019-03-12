package Adibideak;

public class Nagusia {

	public static void main(String[] args) {
		int datu=20;
		try {
			//datu=datu/0;
			datuaBalidatu(10);
			// el catch tiene que ir de mas concreto a mas generico
			//Unreachable catch block for AdibideSalbuespenak. It is already handled by the catch block for Exception	
		}catch (AdibideSalbuespenak e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			//Hace esto si o si
		}
		
	}
	public static void datuaBalidatu (int adina) throws AdibideSalbuespenak {
		if(adina<18) {
			throw new AdibideSalbuespenak();
		}
	}
}
