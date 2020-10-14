import java.util.*;
class Powerset{
	public static void main(String[] args) {
		Scanner scan  =new Scanner(System.in);
		int len = scan.nextInt();
		
		Set<Integer> inputset = new HashSet<>();
		for(int i=0;i<len;i++)
		{
			inputset.add(scan.nextInt());
		}
		generatePowerset(inputset);

	}
	static void generatePowerset(Set originalSet)
	{
		List<Integer> list = new ArrayList<Integer>(originalSet);
		int n = list.size();

		Set<Set<Integer>> powerSet = new HashSet<Set<Integer>>();

		for( long i = 0; i < (1 << n); i++) {
			Set<Integer> element = new HashSet<Integer>();
			for( int j = 0; j < n; j++ )
				if( (i >> j) % 2 == 1 ) element.add(list.get(j));
			powerSet.add(element); 
		}
		for(Set s: powerSet)
		{

			System.out.println(s);
		}
	}
}