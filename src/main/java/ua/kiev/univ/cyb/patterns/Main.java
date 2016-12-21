package ua.kiev.univ.cyb.patterns;

import ua.kiev.univ.cyb.patterns.graph.AdjacencyMatrix;
import ua.kiev.univ.cyb.patterns.graph.ObserverableGraphPresentation;
import ua.kiev.univ.cyb.patterns.observer.GraphObserverImpl;

/**
 * @Author Denys Storozhenko.
 */
public class Main {
	public static void main(String[] args) {
		ObserverableGraphPresentation matrix = new AdjacencyMatrix();
		matrix.addObserver(new GraphObserverImpl());
//		matrix.addObserver(new GraphObserverImpl2());
		matrix.addVertex(1);
		matrix.addVertex(2);
		matrix.addEdge(1, 2);
	}
}
