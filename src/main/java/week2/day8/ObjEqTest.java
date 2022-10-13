package week2.day8;

class INum {

    private int num;

    public INum(int num) {

        this.num = num;

    }

    public int getNum() {
        return num;
    }


    @Override
    public boolean equals(Object obj) {

        if( obj instanceof INum) {
            INum inum1 = (INum) obj;
            if( this.num == inum1.getNum())
                return true;
        }

        return false;
    }

}
public class ObjEqTest {
    public static void main(String args[]) {

        INum num1 = new INum(10);
        INum num2 = new INum(12);
        INum num3 = new INum(10);

        if(num1.equals(num2))
            System.out.println("num1, num2 내용 동일하다.");
        else
            System.out.println("num1, num2 내용 다르다.");

        if(num1.equals(num3))
            System.out.println("num1, num3 내용 동일하다.");
        else
            System.out.println("num1, num3 내용 다르다.");
    }
}
