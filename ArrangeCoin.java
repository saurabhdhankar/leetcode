class ArrangeCoin {
     //binary seach 
     //tc=O(logn), sc=O(1)
     public int arrangeCoins(int n) {
        //a(k) = 1+2+...k-1+k = k(k+1)/2; 
         long s = 0, e=n;
         while(s<=e) {
             long m = s + (e-s)/2;
             long a_m = m*(m+1)/2;
             if(a_m==n) return (int)m;
             else if (a_m<n) s = m+1;
             else e=m-1;
         }
         //the loop ends when s>e  i.e. f(e)<n<f(s), so we need to return e.
         return (int)e; 
     }
 
    //===========================================
    /*
	    math
      a(k) = 1+2+...k-1+k = k(k+1)/2; 
      Quadratic formula
      k(k+1)/2<=n   
      k^2+k-2n<=0 
      k = floor((-1+sqrt(1+8n)) /2)
	   tc=O(1), sc=O(1)
      */

     public int arrangeCoins(int n) {
         return (int)((-1+Math.sqrt(1+8*(long)n))/2);
     }
}
