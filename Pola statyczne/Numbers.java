public class Numbers {
    private static int l1 = 2;
    private int l2;

    public Numbers(int l2){
        this.l2 = l2;
    }

    public static int getL1() {
        return l1;
    }

    public static void setL1(int l1) {
        Numbers.l1 = l1;
    }

    public int getL2() {
        return l2;
    }

    public void setL2(int l2) {
        this.l2 = l2;
    }


    public int showMultiply(){
        return l1*l2;
    }

    @Override
    public String toString() {
        return l1*l2+"";
    }
}
