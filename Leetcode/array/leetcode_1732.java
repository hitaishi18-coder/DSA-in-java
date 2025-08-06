// There is a biker going on a road trip. The road trip consists of n + 1 points 
//at different altitudes. The biker starts his trip on point 0 with altitude equal 0.

// You are given an integer array gain of length n where gain[i] is 
//the net gain in altitude between points i​​​​​​ and i + 1 for all (0 <= i < n). 
//Return the highest altitude of a point.


//     public static void main(String[] args) 
//     {
//         int[] a = {-5,1,5,0,-7};
//         int sum = largestAltitude(a);
//         System.out.println( sum);
//     }
    
// //     public static int largestAltitude(int [] a)
// //     {  
// //      int sum=0;

// //     int b=0;

// //     for(int i=0;i<a.length;i++)
// //     {
// //         sum = sum+=a[i];
// //         if(sum>b)
// //         {
// //             b=sum;
// //         }
// //     }
// //     return b;
    
// // }

// // }





// optimised code 



public class leetcode_1732 
{

    public static void main(String[] args) 
    {
        int[] a = {-5,1,5,0,-7};
        int sum = largestAltitude(a);
        System.out.println(sum);
    }
    
    public static int largestAltitude(int [] a)
    {  
        int sum = 0;
        int b = 0;

        for(int i = 0; i < a.length; i++)
        {
            sum += a[i]; // Corrected assignment
            b = Math.max(b, sum); // Optimized max check
        }
        return b;
    }
}