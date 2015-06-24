
import java.util.ArrayList;

public class LiniarAckermann {

    static ArrayList<Long> mList = new ArrayList<Long>();

    public static long ackermann(long m, long n) {
        while (true) {
            if (m == 0) {
                n += 1;
                if (mList.isEmpty()) {
                    return n;
                } else {
                    int index = mList.size() - 1;
                    m = mList.get(index);
                    mList.remove(index);
                }
            } else if (n == 0) {
                m -= 1;
                n = 1;
            } else {
                mList.add(m - 1);
                n -= 1;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(ackermann(4, 1));
    }
}
