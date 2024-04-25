public class PowerXY {
    public static double power(double x , long n) {
        if(n==0||x==1)return 1;
        double ans = 1.0;
        long  nn=n;
        if(n<0){
            nn = -1*n;
        }
        while(nn>0){
            if(nn%2==1){// odd power
                ans = ans*x;
                nn--;
            }
            else {// even power
                x = x * x;
                nn = nn / 2;
            }
        }
        if (n < 0) ans = (1.0) / (ans);
        return ans;
    }
        public static void main (String[]args){
            System.out.println(power(2,-6));
        }
    }

