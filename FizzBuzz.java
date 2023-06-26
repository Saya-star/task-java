class FizzBuzz {
    public static void main (String args[]){

        if (args.length != 1) {
            System.out.println("数字を１つ入力してください");
        }

        if (args.length == 1) {
            
            int number = Integer.parseInt(args[0]);
        
            for (int i = 1; i <= number; i++) {
                if (i % 3 == 0 && i % 5 == 0){
                    System.out.println("FizzBuzz");
                }else if (i % 3 == 0) {
                    System.out.println("Fizz");
                }else if (i % 5 == 0) {
                    System.out.println("Buzz");
                }else {
                    System.out.println(i);
                }
            }
        }
    }
}
