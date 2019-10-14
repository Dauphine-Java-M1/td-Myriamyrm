package fr.dauphine.ja.azzazmyriam.td00;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/**
 * Hello world!
 *
 */
public class PrimeCollection 
{
	ArrayList<Integer> numbers;
	
	PrimeCollection(){
		this.numbers = new ArrayList<Integer>();
	}
	
	public ArrayList initRandom(int n, int m){
		Random r = new Random();
		int k = 0;
		while(k<n) {
			numbers.add(r.nextInt(m));
			k++;
		}
		return numbers;
	}
	
	private static boolean isPrime(int p) {
		boolean prime = false;
		int k;
		if(p==2) {
			prime = true;
			}
		else {
				
			for(k=2;k<p;k++) {
				
				if(p%k==0) {
				prime = false;
				break;
				}
				
				prime = true;
			}
		}
		
		return prime;
	}
	
	public void printPrimes() {
		this.numbers = numbers;
		for(int i = 0 ; i < numbers.size(); i++) {
			if(isPrime(numbers.get(i))) {
				System.out.println(numbers.get(i) + " est premier");
			}
		}
	}
	
    public static void main( String[] args )
    {
        System.out.println( "bonjour" );
        PrimeCollection pr = new PrimeCollection();
        System.out.println(pr.initRandom(100, 2000));
        pr.printPrimes();
        
    }
}
