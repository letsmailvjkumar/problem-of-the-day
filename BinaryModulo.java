package Problem_of_the_Day;

public class BinaryModulo {
	int modulo(String s, int m) {
		//Write your code here
		int ans=0;
        int base=1;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='1'){
                ans=(ans+base)%m;
            }
            base=(base*2)%m;
        }
        return ans;
	}
}
