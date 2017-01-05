/**
 * author: Prithviraj Deshmane
 * 
 * Description: This is a solution for determining if there are any loops or cycles 
 * in a directed graph.
 * 
 * Here we are using the Depth First Search method to work out a solution.
 */


import java.util.List;

public class CycleDetection {
	
	private boolean cycleExists = false;
	
	public void detectCycle(List<Vertex> vertexList) {
		
		for (Vertex v : vertexList) {
			if(!v.isVisited()) {
				dfs(v);
			}
		}
		
		if(cycleExists) {
			System.out.println("Cycle exists. Exiting.");
		} else { 
			System.out.println("No cycles! All good!");
		}
	}

	private void dfs(Vertex vertex) {
		
		vertex.setBeingExamined(true);
		
		for (Vertex v : vertex.getAdjacencylist()) {

			if(v.isBeingExamined()) {
				cycleExists = true;
				return;
			}
			
			if(!v.isVisited()) {
				v.setVisited(true);
				dfs(v);
			}
		}
		
		vertex.setBeingExamined(false);
		vertex.setVisited(true);
		
	}
	
}
