package ch04;

//그래프를 matrix로 표현하기

public class UndirectedGraph {
	
	private int count;
	private int[][] vertexMatrix;
	
	public UndirectedGraph(int count) {
		this.count= count;
		vertexMatrix =new int[count][count];
		
	}
	public void addEdges(int from, int to, int weight) {
		vertexMatrix [from][to]= weight;
		vertexMatrix [to][from]= weight;
	}
	
	public int[][] getMatrix(){
		return vertexMatrix;
		
	}
}
