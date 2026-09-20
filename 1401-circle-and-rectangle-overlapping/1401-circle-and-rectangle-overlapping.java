class Solution {
    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {

        
        //
        int maxX=Math.max(x1,Math.min(xCenter,x2));
        int maxY=Math.max(y1,Math.min(yCenter,y2));

        int a=xCenter-maxX;
        int b=yCenter-maxY;

        return a*a+b*b<=radius*radius;
    }
}