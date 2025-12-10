public class Day1_Operators {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;

        // Arithmetic Operators

        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x*y);
        System.out.println(x/y);
        System.out.println(x%y);
        x++;
        System.out.println(x);
        x--;
        System.out.println(x);
        ++x;
        System.out.println(x);
        --x;
        System.out.println(x);

        //Assignment Operators

        y=6;
        y+=2;
        System.out.println(y);
        y-=4;
        System.out.println(y);
        y*=9;
        System.out.println(y);
        y/=7;
        System.out.println(y);
        y%=2;
        System.out.println(y);
        y&=1;
        System.out.println(y);
        y|=3;
        System.out.println(y);
        y^=3;
        System.out.println(y);
        y>>=2;
        System.out.println(y);
        y<<=4;
        System.out.println(y);


    }
}
