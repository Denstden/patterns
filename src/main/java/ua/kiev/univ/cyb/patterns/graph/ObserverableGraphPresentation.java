package ua.kiev.univ.cyb.patterns.graph;

import java.util.ArrayList;
import java.util.List;

import ua.kiev.univ.cyb.patterns.observer.GraphObserver;

/**
 * @Author Denys Storozhenko.
 */
public abstract class ObserverableGraphPresentation {
	protected List<GraphObserver> observers = new ArrayList<GraphObserver>();

	public void addObserver(GraphObserver observer) {
		observers.add(observer);
	}

	public void notifyVertexWasAdded(Integer vertexIndex) {
		for (GraphObserver observer : observers) {
			observer.observeAddingVertex(vertexIndex);
		}
	}

	public void notifyEdgeWasAdded(Integer vertex1, Integer vertex2) {
		for (GraphObserver observer : observers) {
			observer.observeEdgeAdding(vertex1, vertex2);
		}
	}

	public abstract void addVertex(Integer vertexIndex);
	public abstract void addEdge(Integer vertex1Index, Integer vertex2Index);
}
