package Solutions;

class Main {
    public static boolean isPalindrome(int x) {
            if(x<0 || (x % 10 == 0 && x != 0)){
                return false;
            }
            int original = x;
            int reversed = 0;
            while(x>0){
                int digit = x % 10;  // 121%10=1 //12%10=2 /1%10=1
                reversed=reversed*10 + digit;// 1 // 1*10+2=12 / 12*10+1=121
                x /= 10; //121/10=12 12/10=1
    
            }
            return reversed==original;
        }
        public static void main(String[] args){
            System.out.println("The given Number is :"+isPalindrome(121));
    }
}