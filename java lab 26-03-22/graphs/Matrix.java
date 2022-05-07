
public class Matrix {

    int vertices;
    int mat[][];
    int PathMatrix[][];
    int in[];
    int out[];

    Matrix(int vertices) {
        this.vertices = vertices;
        mat = new int[vertices][vertices];
        PathMatrix = new int[vertices][vertices];

    }

    void AddEdge(int source, int destination) {

        mat[source][destination] = 1;

    }

    void printGraph() {
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

    }

    int MaxInDegree() {

        out = new int[vertices * vertices];
        in = new int[vertices * vertices];
        int count1;

        int max = 0;
        for (int i = 0; i < vertices; i++) {
            count1 = 0;

            for (int j = 0; j < vertices; j++) {
                if (mat[i][j] == 1) {

                    in[j] = 1 + count1;

                }
            }

        }
        for (int i = 0; i < vertices; i++) {
            if (in[i] > in[i + 1]) {
                max = in[i];
            }

        }

        return max;
    }

    int MinOutDegree() {

        out = new int[vertices * vertices];
        in = new int[vertices * vertices];

        int count2;
        int min = 0;
        for (int i = 0; i < vertices; i++) {

            count2 = 0;
            for (int j = 0; j < vertices; j++) {
                if (mat[i][j] == 1) {
                    out[i] = 1 + count2++;
                }
            }

        }
        for (int i = 0; i < vertices; i++) {
            if (in[i] < in[i + 1]) {
                min = in[i];
            }

        }

        return min;
    }

    void pathMatrix() {

        for (int i = 0; i < vertices; i++) {

            for (int j = 0; j < vertices; j++) {
                
                for (int k = 0; k < vertices; k++) {
                    mat[i][j] = mat[i][j] + mat[i][k] * mat[k][j];
                    if (mat[i][j] != 0)
                        mat[i][j] = 1;
                }
            }
        }

    }

}
