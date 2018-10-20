public static int selection(int a[],int s,int e, int k){
    if (e-s+1<=5){
        Arrays.sort(a,s,e);
        return s+k-1;
    }
    for(int i = 0; i< (e+1)/5;i++){
        int left = 5*i;
        int right = left + 4;
        if (right>e) right = e;
        int med = selection(a,left,right,2);
        swap(a[med],a[i]);
    }
    return selection(a,0,(e+1)/5,((e+1)/10));
}
public static void main(String[] args){
    int array = {1,2,3,4,5,6};
    System.out.println("Median is: "+ selection(array,0,array.length()-1,array.length()/2));
}
/**
I did not understand the in class pseudocode so I looked up several outside algorithms
this is the one I liked the most.
*/
