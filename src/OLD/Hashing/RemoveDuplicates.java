package Hashing;
//n^2 complexity
public class RemoveDuplicates {
	public static void main(String[] args) {
		char[] a  = {'a','b','d','e','a','a','z','r','e','y','i'};
		removeDups(a);
	}
	public static void removeDups(char[] a){
			int n = a.length;
				for (int i = 0; i < n; i++) {
					for (int j = i+1; j < n;) {
						if(a[i] == a[j]){
							a[j] = a[n--];
						}else{
							j++;
						}
					}
					a[i]='\0';
				}
	}
}

