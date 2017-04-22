package quickfind;

/**
 * Created by tim on 2017. 4. 22..
 */
public class QuickFindUF {
    private int[] id;

    public QuickFindUF(int N) { //O(N)
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    public boolean connected(int p, int q) { // O(1)
        return id[p] == id[q];
    }

    public void union(int p, int q) { //O(N)
        int pId = id[p];
        int qId = id[q];// 2번의 액세스

        for (int i = 0; i < id.length; i++) {
            if (id[i] == pId) { //2N번의 액세스 루프한번에 2번의 액세스가 있으니
                id[i] = qId;
            }

        }
    }
}
