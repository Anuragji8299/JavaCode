package OopsInJava;

public class Fraction {

    public static fraction add(fraction a,fraction b){
        int numerator=a.num*b.den+b.num*a.den;
        int denominator=a.den*b.den;
        fraction fr3=new fraction(numerator,denominator);
        fr3.simplify();
        return fr3;
    }
    public static int gcd(int num,int den){
        int min=Math.min(num,den);
        for(int i=min;i>=1;i--){
            if((num % i == 0 && ((den % i) == 0))){
                return i;
            }

        }
        return min;
    }

    public static class fraction{
        int num;
        int den;

        public fraction(int num,int den){
            this.num=num;
            this.den=den;
        }
        public void simplify(){
            System.out.println("Fraction after simplification");
            int hcf= gcd(num,den);
            num/=hcf;
            den/=hcf;
        }
    }

    public static void main(String[] args) {
        fraction fr1=new fraction(12,30);
        System.out.println(fr1.num+"/"+fr1.den);
//        fr1.simplify();

//        System.out.println(fr1.num+"/"+fr1.den);
        fraction fr2=new fraction(6,30);
        System.out.println(fr2.num+"/"+fr2.den);
        fraction fr3=add(fr1,fr2);
//        fr3.simplify();
        System.out.println(fr3.num+"/"+fr3.den);


    }

}
