class Solution {
    public double gainy(int pass, int total){
        double gainForClass = (double)(pass + 1) / (total + 1) - (double)pass / total;
        return gainForClass;
    }
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        int n = classes.length;
        double maxRatio = 0.0;

        PriorityQueue<double[]> maxHeap = new PriorityQueue<>((a,b) -> Double.compare(b[0],a[0]));

        for(int i = 0; i < n;i++){
            int pass = classes[i][0];
            int total = classes[i][1];
            double gain = gainy(pass,total);
            maxHeap.add(new double[]{gain,pass,total});
        }

        while(extraStudents > 0){
            extraStudents--;
            double[] top = maxHeap.poll();
            int pass = (int) top[1]+1;
            int total = (int) top[2]+1;
            double gain = gainy(pass,total);
            maxHeap.add(new double[]{gain,pass,total});
        }

        while(!maxHeap.isEmpty()){
           double[] top = maxHeap.poll();
           maxRatio += (double)(top[1]/top[2]);
        }

        return maxRatio/n;
        
    }
}
