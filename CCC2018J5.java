import java.util.*;

class Pair {
    public int pageNum;
    public int pathLength;

    public Pair(int currentVertex, int currentPath){
        this.pathLength = currentPath;
        this.pageNum = currentVertex;
    }
}

public class CCC2018J5 {

    public static ArrayList<Integer> getNeighbour(Integer value, HashMap<Integer, ArrayList<Integer>> pageOptions){
        if (pageOptions.containsKey(value)) {
            return pageOptions.get(value);
        }
        return null;
    }
    public static void bfs(HashMap<Integer, ArrayList<Integer>> pageOptions){
        Queue<Pair> bfsQueue = new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();
        bfsQueue.add(new Pair(1,1));
        //System.out.println(bfsQueue.peek());
        ArrayList<Integer> path = new ArrayList<>();
        int bfsMapLevel = 0;
        HashSet<Integer> pagesCovered = new HashSet<>();
        ArrayList<Integer> pathLengths = new ArrayList<>();
        while(!bfsQueue.isEmpty()){
            Pair curVertex = bfsQueue.remove();
            path.add(curVertex.pageNum);
            pagesCovered.add(curVertex.pageNum);
            if (!visited.contains(curVertex.pageNum)){
                //System.out.print(curVertex.pageNum + ", ");
                visited.add(curVertex.pageNum);
                ArrayList<Integer> neighbours = getNeighbour(curVertex.pageNum, pageOptions);
                if (neighbours.size() == 0){
                    pathLengths.add(curVertex.pathLength);
                    //System.out.println(bfsMapLevel);
                }
                for (int i = 0; i < neighbours.size(); i++) {
                    if (!visited.contains(neighbours.get(i))) {
                        bfsQueue.add(new Pair(neighbours.get(i), curVertex.pathLength + 1));
                        //System.out.println(bfsMapLevel + " " + curVertex.pageNum);
                    }
                }
            }
        }
        if (pagesCovered.size() == pageOptions.size()){
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }
        Collections.sort(pathLengths);
        System.out.println(pathLengths.get(0));
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numOfPages = scan.nextInt();
        HashMap<Integer, ArrayList<Integer>> pageOptions = new HashMap<>();
        HashMap<Integer, Boolean> lastPage = new HashMap<>();
        for (int i = 0; i < numOfPages; i++) {
            pageOptions.put(i + 1, new ArrayList<Integer>());
        }
        for (int i = 1; i <= numOfPages; i++) {
            int n = scan.nextInt();
            for (int j = 0; j < n; j++) {
                pageOptions.get(i).add(scan.nextInt());
            }
        }
        bfs(pageOptions);
    }
}