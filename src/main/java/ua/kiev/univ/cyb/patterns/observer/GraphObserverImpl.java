package ua.kiev.univ.cyb.patterns.observer;

/**
 * @Author Denys Storozhenko.
 */
public class GraphObserverImpl implements GraphObserver {
	public void observeAddingVertex(Integer vertexIndex) {
		System.out.println("Added new vertex " + vertexIndex + ", repaint all presentations");
	}

	public void observeEdgeAdding(Integer vertex1, Integer vertex2) {
		System.out.println("Added new edge (" + vertex1 + "; " + vertex2 + "), repaint all presentations");
	}
}
