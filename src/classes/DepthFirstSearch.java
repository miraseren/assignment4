package classes;

public class DepthFirstSearch<Vertex> extends Search<Vertex> {
    public DepthFirstSearch(WeightedGraph<Vertex> graph, Vertex source) {
        super(source);

        dfs(graph, source);
    }

    private void dfs(WeightedGraph<Vertex> graph, Vertex current) {
        marked.add(current);

        for (Vertex v : graph.getNeighbours(current)) {
            if (!marked.contains(v)) {
                edgeTo.put(v, current);
                dfs(graph, v);
            }
        }
    }
}