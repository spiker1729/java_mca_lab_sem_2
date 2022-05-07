public class DirectedGraph {

    public static void main(String[] args) {
        Matrix newMatrix = new Matrix(5);

        newMatrix.AddEdge(0, 1);
        newMatrix.AddEdge(1, 2);
        newMatrix.AddEdge(1, 3);
        newMatrix.AddEdge(3, 4);
        System.out.println("The adjacency matrix representation of give graph is shown below ");
        newMatrix.printGraph();
        int max = newMatrix.MaxInDegree();
        System.out.println("The maximum in degree is equal to ");
        System.out.println(max);

        System.out.println();

        int min = newMatrix.MinOutDegree();
        System.out.println("The minimum out degree is equal to ");
        System.out.println(min);
        newMatrix.pathMatrix();
        System.out.println("The path matrix of given graph according to the warshall's algorithm is represented below");
        newMatrix.printGraph();
    }

}