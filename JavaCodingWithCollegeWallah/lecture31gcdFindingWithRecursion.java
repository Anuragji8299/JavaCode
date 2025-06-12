package JavaCodingWithCollegeWallah;

public class lecture31gcdFindingWithRecursion {
public static int iGCD(int x,int y ){
    if(y==0){
        return x;
    }
    return iGCD(y,x%y);
}


    public static void main(String[] args) {

        System.out.println("Greatest common divisor of these two numbers is "+iGCD(30,12));
    }
}
