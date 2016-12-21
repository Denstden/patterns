package ua.kiev.univ.cyb.patterns.graph;

/**
 * @Author Denys Storozhenko.
 */
public class AdjacencyList extends ObserverableGraphPresentation {
	@Override
	public void addVertex(Integer vertexIndex) {
		System.out.println("Adjacency list, add vertex : " + vertexIndex);
		notifyVertexWasAdded(vertexIndex);
	}

	@Override
	public void addEdge(Integer vertex1Index, Integer vertex2Index) {
		System.out.println("Adjacency list, add edge : (" + vertex1Index + "; " + vertex2Index + ")");
		notifyEdgeWasAdded(vertex1Index, vertex2Index);
	}
}
