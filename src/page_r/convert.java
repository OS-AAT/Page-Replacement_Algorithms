/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package page_r;

/**
 *
 * @author shreehari
 */
public class convert{
	int n;
	int[] h;
public convert(String s){
	String[] ele = s.split("\\s+");
	n= ele.length;
	h=new int[n];
	 for(int i=0;i<n;i++)
	 {
		 h[i]= Integer.parseInt(ele[i].trim());
	 }
}
public int[] method1(){
	return h;
}
}
