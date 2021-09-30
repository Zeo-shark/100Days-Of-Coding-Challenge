package JulyLongChallenge;

import java.util.*;
import java.io.*;
import java.lang.*;
public class KPATHQRY {

	public static void main(String[] args) throws java.lang.Exception {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int tc= sc.nextInt();
		
		while(tc-->0)
		{
			int n= sc.nextInt();
			Map<Integer, Set<Integer>> tree= new HashMap<>();
			for(int i=1;i<n;i++)
				addPaths(tree, sc.nextInt(), sc.nextInt());
			int[] lev= new int[n+1];
			int[] par= new int[n+1];
			preProcess(tree, lev, par);
			int Q1= sc.nextInt();
			int[] visited= new int[n+1];
			for(int i=1;i<=Q1;i++)
			{
				int k1= sc.nextInt();
				int[] query= new int[k1];
				int max_Depth=0;
				int nodeWithMax_Depth= -1;
				for(int j=0;j< k1;j++)
				{
					query[j] = sc.nextInt();
					if(lev[query[j]]> max_Depth)
					{
						max_Depth = lev[query[j]];
						nodeWithMax_Depth= query[j];
					}
				}
				boolean hasPath= process(nodeWithMax_Depth, par, lev, query, visited, i);
				System.out.println(hasPath? "YES": "NO");
				
				
			}
		}
		sc.close();
	}
	
	private static boolean process(int nodeWithMax_Depth, int[] parent, int[] level, int[] query, int[] visited, int marker) {
			visitTill_Parent(nodeWithMax_Depth, parent, visited, marker);
			int max_Depth=0;
			nodeWithMax_Depth =-1;
			for(int q: query) {
				if(visited[q] != marker && level[q]> max_Depth) {
					max_Depth = level[q];
					nodeWithMax_Depth= q;
				}
			}
			if(nodeWithMax_Depth == -1) return true;
			while(visited[nodeWithMax_Depth]!= marker)
			{
				visited[nodeWithMax_Depth]= marker;
				nodeWithMax_Depth= parent[nodeWithMax_Depth];
			}
			
			for(int q: query)
			{
				if(visited[q] != marker || level[q] < level[nodeWithMax_Depth]) return false;
				
				
			}
			return true;
	}
	
	private static void visitTill_Parent(int nodeWithMax_Depth, int[] parent, int[] visited, int marker)
	{
		visited[nodeWithMax_Depth]= marker;
		while(parent[nodeWithMax_Depth] != -1) {
			nodeWithMax_Depth= parent[nodeWithMax_Depth];
			visited[nodeWithMax_Depth]= marker;
		}
		
	}
	
	private static void preProcess(Map<Integer, Set<Integer>> tree, int[] lev, int[] par)
	{
		boolean[] visited = new boolean[lev.length];
		Queue<Integer> bfsQueue= new LinkedList<>();
		
		int u= 1;
		par[u]= -1;
		lev[u]= 0;
		bfsQueue.add(u);
		visited[u]= true;
		
		while(!bfsQueue.isEmpty()) {
			int n= bfsQueue.size();
			while(n-->0)
			{
				int parentNode= bfsQueue.poll();
				Set<Integer> children = tree.get(parentNode);
				for(Integer child: children) {
					if(!visited[child])
					{
						par[child]= parentNode;
						lev[child]= lev[parentNode]+1;
						visited[child]= true;
						bfsQueue.add(child);
					}
				}
			}
		}
	}
	
	private static void addPaths(Map<Integer, Set<Integer>> tree, Integer ul, Integer vl) {
		addEdges(tree, ul, vl);
		addEdges(tree, vl, ul);
	}
	
	private static void addEdges(Map<Integer, Set<Integer>> tree, Integer ul, Integer vl) {
		if(!tree.containsKey(ul)) tree.put(ul, new HashSet<>());
		tree.get(ul).add(vl);
	}
}
