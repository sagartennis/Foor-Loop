//Write a code that prints the numbers between 2,000 and 3,000 i.e (2000<=number<3000)
// which are divisible by 8 but not by 6. (Hint: apply Boolean condition - number%8==0 && number%6!=0)

public class forl {
    public static void main(String[] args) {

        for (int i = 2000; i<=3000;i++){
            if (i % 8 == 0 && i % 6 !=0){
                System.out.print(i +" ");
            }
        }
        
    }
}
