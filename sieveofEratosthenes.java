import java.util.*;
class SieveOfEratosthenes
{
	private static void countPrime(int n)
	{
		int primeCtr=n-1;
		boolean [] prime = new boolean[n+1];
		prime[0]=true;
		prime[1]=true;
		for(int p=2;p*p<=n;p++){
			if(prime[p] == false){
				for(int i=p*p ; i<=n ; i+=p){
					if(prime[i] == false){ 
						prime[i] = true;
						primeCtr--;
					}
				}
			}
		}
		System.out.println(primeCtr);
	}
	public static void main(String[] args){
		Scanner kbd = new Scanner(System.in);
		System.out.println("Enter a number for finding all prime numbers up to n");
		int num = kbd.nextInt();
		SieveOfEratosthenes g = new SieveOfEratosthenes();
		g.countPrime(num);
	}
}