public class power_of_two_double_plus {
    
    public static void main(String[] args){
        double n = 1;

        for (int i = 1; i <= 1023; i++){
            n *= 2;

            System.out.println("2の" + i + "乗は" + n);
        }
    }
}
