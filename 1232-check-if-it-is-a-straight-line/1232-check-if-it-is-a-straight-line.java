class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int x0 = coordinates[0][0];
        int y0 = coordinates[0][1];
        int x1 = coordinates[1][0];
        int y1 = coordinates[1][1];
        
        for (int i = 2; i < coordinates.length; i++) {
            int xi = coordinates[i][0];
            int yi = coordinates[i][1];
            
            if ((x1 - x0) * (yi - y0) != (xi - x0) * (y1 - y0))
                return false;
        }
        
        return true;
    }
}
