class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int[] stack= new int[asteroids.length];
        stack[0]=asteroids[0];
        int top=0;
        for(int i=1;i<asteroids.length;i++){
            while(top!=-1&&asteroids[i]<0&&stack[top]>0){
                if(asteroids[i]+stack[top]<0)
                    top--;
                else if(asteroids[i]+stack[top]>0)
                    asteroids[i]=0;
                else{
                    asteroids[i]=0;
                    top--;
                } 
                    
            }
            if(asteroids[i]!=0)
                stack[++top]=asteroids[i];
        }
        int finalstack[]= new int[top+1];
        int i=0;
        while(i<=top){
            finalstack[i]=stack[i];
            i++;
        }
        return finalstack;
    }
}