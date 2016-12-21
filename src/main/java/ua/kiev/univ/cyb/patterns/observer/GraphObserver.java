package ua.kiev.univ.cyb.patterns.observer;

/**
 * @Author Denys Storozhenko.
 */
public interface GraphObserver {
	void observeAddingVertex(Integer vertexIndex);
	void observeEdgeAdding(Integer vertex1, Integer vertex2);
}
