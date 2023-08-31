/* Write a program to create and display unique three-digit number using 1, 2,
3, 4. Also count how many three-digit numbers are there.
Sample Output:
The three-digit numbers are:
123 124 132 134 142 143 213 214 231 234 241 243 312 314 321 324 341 342
412 413 421 423 431 432
Total number of the three-digit-number is: 24*/

public class for87 {
    
 public static void main(String[] args) {
		int amount = 0;
		for(int i = 1; i <= 4; i++){
			for(int j = 1; j <= 4; j++){
				for(int k = 1; k <= 4; k++){
					if(k != i && k != j && i != j){
						amount++;
						System.out.print(i + "" + j + "" + k+" ");
					}
				}
			}
		}
		System.out.println("Total number of the three-digit-number is " + amount);
	}
}