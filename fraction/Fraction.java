package fraction;

public class Fraction {
    int a,b;
    Fraction(){
        System.out.println("Nhap 2 so ");
    }
    public int getA() { return a; }
    public void setA(int a) { this.a = a; }
    public int getB() { return b; }
    public void setB(int b) { this.b = b; }
    boolean kiemtra(){
        if(getB()==0){
            return true;
        }
        return false;
    }
    void rutgon(){
        System.out.println("Hàm rút gọn phân số: ");
    }
    void nghichdao(){
        System.out.println("Hàm nghịch đảo phân số: ");
    }
    void add(){
        System.out.println("Hàm add phân số: ");
    }
    void sub(){
        System.out.println("Hàm sub phân số: ");
    }
    void mul(){
        System.out.println("Hàm mul phân số: ");
    }
    void div(){
        System.out.println("Hàm div phân số: ");
    }
}
