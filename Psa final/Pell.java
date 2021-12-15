
public class Pell {
    public Pell() {
    }

    public long get(int n) {
        if (n < 0) throw new UnsupportedOperationException("Pell.get is not supported for negative n");

        if (n<=2)
        {
            return n;
        }
        return 2*get(n-1)+get(n-2);
    }

    public static void main(String args[])
    {
        int n = 5;
        Pell pell = new Pell();
        System.out.println(pell.get(n));
    }
}
