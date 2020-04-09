/* *****************************************************************************
 *  Name:
 *  Date:
 *  Description:
 **************************************************************************** */

public class UnionFindMaxElement {
    private int[] id;
    private int[] sz;
    private int num;
    private int[] maxReturn;

    public UnionFindMaxElement(int n) {
        num = n;
        id = new int[n];
        sz = new int[n];
        maxReturn = new int[n];
        for (int i = 0; i < n; i++) {
            id[i] = i;
            maxReturn[i] = i;
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
        int max;
        if (maxReturn[i] < maxReturn[i]) {
            max = maxReturn[i];
        }
        else {
            max = maxReturn[j];
        }
        if (sz[i] < sz[j]) {

            id[i] = j;
            maxReturn[j] = max;
            sz[j] += sz[i];
        }
        else {
            id[j] = i;
            maxReturn[i] = max;
            sz[i] += j;
        }

    }

    public int find(int i) {
        return maxReturn[id[i]];
    }


    public static void main(String[] args) {

    }
}
