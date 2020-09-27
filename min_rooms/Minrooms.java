/*
Given an array of time intervals (start, end) for classroom lectures (possibly overlapping), find the minimum number of rooms required.

For example, given [(30, 75), (0, 50), (60, 150)], you should return 2.
*/
import java.util.Collections;

import java.util.*;
public class Minrooms {
    public static void main(String[] args) {
        int[][] arr={{5,7},{0,9},{5,9}};
        int[][] rooms=new int[arr.length][arr[0].length];
        //sorting the time schedule
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length-i-1;j++)
            {
                if((arr[j][0]>arr[j+1][0])||(arr[j][0]==arr[j+1][0]&&arr[j][1]>arr[j+1][1]))
                {
                    int value1 = arr[j][0];
                    int value2 = arr[j][1];
                    arr[j][0]=arr[j+1][0];
                    arr[j][1]=arr[j+1][1];
                    arr[j+1][0]=value1;arr[j+1][1]=value2;
                }
            }
        }
        rooms[0][0]=arr[0][0];
        rooms[0][1]=arr[0][1];
        
        int c=1;
        //finding the min rooms required
        for(int i=1;i<arr.length;i++)
        {
            int j=0;
            while(j<c && j<rooms.length && arr[i][0]<rooms[j][1])
            {
                j++;
            }
            rooms[j][0]=arr[i][0];
            rooms[j][1]=arr[i][1];
            if(j>=c)
                c++;
            
        }
        for(int i=0;i<rooms.length;i++)
            System.out.println(rooms[i][0]+" "+rooms[i][1]);
        System.out.println(c);
    }   
}
