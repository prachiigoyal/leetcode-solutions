class Solution {
    public int maxPoints(int[][] points) {
        int n = points.length;
        //If the number of points are less than 3, then they are all on the same line.
        if (n < 3) {
            return n;
        }
        
        //Maximum number of points that lie on the same straight line.
        int ans = 0;
        for (int i = 0; i < n; i++) {
            HashMap<String, Integer> hm = new HashMap<>();
			
            //If the points are same(duplicates present).
            int duplicate = 0;
            //Maximum number of points that lie on the same straight line starting from point i.
            int max = 0;
            
            for (int j = i + 1; j < n; j++) {
                int deltaX = points[j][0] - points[i][0];
                int deltaY = points[j][1] - points[i][1];
                
                //If the point j is same as point i, so increase duplicate and continue.
                if (deltaX == 0 && deltaY == 0) {
                    duplicate++;
                    continue;
                }
                
                //Find the gcd(Greatest Common Divisor) of deltaX & deltaY.
                int gcd = gcdFinder(deltaX, deltaY);
				
                //Find dX and dY. This is done to simplify the deltaX & deltaY.
                //Example : 1)deltaX = 4, deltaY = 32. Their gcd is 4. So dX = 1, dY = 8.
                //          2)deltaX = 8, deltaY = 64. Their gcd is 8. So dX = 1, dY = 8.
                //Therefore, they have the same slope and the slope has been calculated taking other point 
				//as i, meaning they lie on the same line.
                int dX = deltaX / gcd;
                int dY = deltaY / gcd;
				
                //Store it in the form of a String to avoid the precision issue with float/double numbers.
                String slope = dX + "," + dY;
                
                //Store it in the map.
                hm.put(slope, hm.getOrDefault(slope, 0) + 1);
                //Find the max till now.
                max = Math.max(max, hm.get(slope));
            }
            
            //After finding the maximum number of points that lie on the same straight line starting from point i, 
			//store the max between ans and (max + duplicate + 1) in ans. +1 is done for the point i itself.
            ans = Math.max(ans, max + duplicate + 1);
        }
        
        return ans;
    }
    
    //Function to find the gcd(Greatest Common Divisor) between 2 points.
    public int gcdFinder(int x, int y) {
        if (y == 0) {
            return x;
        }
        
        return gcdFinder(y, x % y);
    }
}