package com.ab.karumanchi;

public class KMP {

	int []F;
	private void prefix(char P[], int m){
		
		int i=1, j=0; 
		F[0] = 0;
		while(i<m){
			if(P[i] == P[j]){
				F[i] = j+1;
				i++;
				j++;
			}else if(j>0){
				j=F[j-1];
			}else{
				F[i]=0;
				i++;
			}
		}
	}
}
