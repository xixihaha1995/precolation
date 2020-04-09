/* *****************************************************************************
 *  Name:
 *  Date:
 *  Description:
 **************************************************************************** */

public class socialNetworkConnectivity {
    private int[] id;
    private int[] sz;
    private int num;
    private int timeReturn;

    public socialNetworkConnectivity(int n) {
        num = n;
        id = new int[n];
        sz = new int[n];
        for (int i = 0; i < n; i++) {
            id[i] = i;
            sz[i] = 1;
        }
    }

    public int root(int i) {
        while (i != id[i]) {
            id[i] = id[id[i]];
            i = id[i];
        }
        return i;
    }

    public void m(int p, int q, int timeStamp) {
        int i = root(p);
        int j = root(q);
        if (sz[i] < sz[j]) {
            id[i] = j;
            sz[j] += sz[i];
        }
        else {
            id[j] = i;
            sz[i] += j;
        }
        if (sz[i] == num || sz[j] == num) {
            timeReturn = timeStamp;
        }
    }

    public int time() {
        return timeReturn;
    }


    public static void main(String[] args) {

    }
}
