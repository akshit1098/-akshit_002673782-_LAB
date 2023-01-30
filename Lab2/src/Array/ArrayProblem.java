/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array;

import java.util.Arrays;

/**
 *
 * @author akshitsaxena
 */
public class ArrayProblem {
    
   
  int arr[] = {10, 12, 3, 5};
    
    public static void main(String[] args){
        
        ArrayProblem obj = new ArrayProblem();
        
        int n = obj.arr.length;
        for(int i=0; i<obj.arr.length; i++){
        if(n%2 == 0){
            
            obj.arr[i]=obj.arr[i]*2;
        }
        else{
            obj.arr[i] = obj.arr[i]*3;
        
        }
     
        }
        System.out.println(Arrays.toString(obj.arr)); 
    } 
}
