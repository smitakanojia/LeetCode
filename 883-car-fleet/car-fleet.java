class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n=position.length;
        Stack<Double> stack = new Stack<>();
        int[][] a=  new int[n][2];
        for(int i=0; i<n ;i++){
            a[i][0] = position[i];
            a[i][1] = speed[i];
        }
        Arrays.sort(a, (x,y)->x[0]-y[0]);
        for(int i=0; i<n; i++){
            double time = (double)(target - a[i][0])/a[i][1];
            while(!stack.isEmpty() && stack.peek()<=time) stack.pop();
            stack.push(time);
        }
        return stack.size();
    }
}