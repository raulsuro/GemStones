import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int N = scanner.nextInt();
        String az = "abcdefghijklmnopqrstuvwxyz";
        int[] letters = new int[26]; 
          for(int h = 0; h<26; h++){
               letters[h]=-1;
          }
       
            for(int i=0; i<N; i++){
                String rock = scanner.next();
                for (int k = 0; k < rock.length(); k++) {
                	char gem = rock.charAt(k);
                	if(letters[az.indexOf(gem)]==i-1)letters[az.indexOf(gem)]=i;
				}   
            }
            int gem_elements = 0;
            for(int k = 0; k<26; k++){
               if(letters[k]==N-1)gem_elements++;
            }
            System.out.println(gem_elements);
    }
}
