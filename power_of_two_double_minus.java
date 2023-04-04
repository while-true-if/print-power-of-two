public class power_of_two_double_minus {
    
    public static void main(String[] args){
        double n = 1;

        for (int i = 0; i >= -1073; i--){
            n *= 0.5;

            System.out.println("2の" + i + "乗は" + n);
        }
    }
}
