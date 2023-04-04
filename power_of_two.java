public class power_of_two {
    
    public static void main(String[] args){
        int n = 1;

        for (int i = 1; i <= 30; i++){
            n *= 2;

            System.out.println("2の" + i + "乗は" + n);
        }
    }
}
