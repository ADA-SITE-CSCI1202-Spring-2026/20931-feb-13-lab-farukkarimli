public class polarityofnumber {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        
        if (num > 0){
            System.out.println("positive");
        } else if(num < 0){
            System.out.println("negative");
        } else {
            System.out.println("neutral");
        }

    }
}
