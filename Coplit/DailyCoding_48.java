import java.util.*;

public class Solution { 
	public int subsetSum(int[] set, int bound) {
		int max = 0;

		boolean[] cached = new boolean[301];
		for(int member : set) {

			ArrayList<Integer> reachables = new ArrayList<>();

			for(int wanted = 1; wanted <= bound - member; wanted++) {
				if(cached[wanted]) {
					int reached = wanted + member;
					reachables.add(reached);
					if(reached > max) max = reached;
				}
			}

			for(int data : reachables) cached[data] = true;

			if (member <= bound) {
				cached[member] = true;
				if (member > max) max = member;
			}
		}
		return max;
	}
}
