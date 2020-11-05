

public class Key_index{
    public static void main(String[] args){
        int r = 6;
        
        //Can only contain elements 0<=i<=5 as r = 6
        int a[] = {2,3,1,1,1,0,5,1,1,2,3,0};
        int N = a.length;

        int[] aux = new int[N];
        //Count array to keep track of the number of type of 
        //different elements
        int count[] = new int[r+1];

        //compute frequency counts.
        
        for(int i=0;i<N;++i){
            count[a[i]+1]++;
        }

        //transfrom count to indices.
        
        for(int i=0;i<r;++i){
            count[i+1] += count[i];
        }

        //Distribution the records.

        for(int i=0; i<N; i++){
        	aux[count[a[i]]++] = a[i];
        }

        //copy back.
        
        for(int i=0; i<N; i++){
        	a[i]= aux[i];
        }
       	show(a);        
        
        
    }
    public static void show(int a[]){
    	for(int i: a){
    		System.out.print(i+" ");
    	}
    	System.out.print("\n");
    }
}

