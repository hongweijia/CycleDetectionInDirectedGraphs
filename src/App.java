/**
 * @author Prithviraj Deshmane
 */

import java.util.ArrayList;
import java.util.List;

public class App {
	
	public static void main(String[] args) {
		
		//Create vertices
		Vertex vertex1 = new Vertex("1");
		Vertex vertex2 = new Vertex("2");
		Vertex vertex3 = new Vertex("3");
		Vertex vertex4 = new Vertex("4");
		Vertex vertex5 = new Vertex("5");
		Vertex vertex6 = new Vertex("6");
		
		//Create directed graph by setting adjacency for vertices
		vertex1.addAdjacentVertex(vertex2);
		vertex1.addAdjacentVertex(vertex3);
		
		vertex2.addAdjacentVertex(vertex3);
		
		vertex4.addAdjacentVertex(vertex1);
		vertex4.addAdjacentVertex(vertex5);
		
		vertex5.addAdjacentVertex(vertex6);
		
		vertex6.addAdjacentVertex(vertex4);
		
		//Add vertices to a list
		List<Vertex> vertexList = new ArrayList<Vertex>();
		vertexList.add(vertex1);
		vertexList.add(vertex2);
		vertexList.add(vertex3);
		vertexList.add(vertex4);
		vertexList.add(vertex5);
		vertexList.add(vertex6);
		
		//Run cycle detection on list using DFS
		CycleDetection cycleDetection = new CycleDetection();
		cycleDetection.detectCycle(vertexList);
		
	}
	
}
