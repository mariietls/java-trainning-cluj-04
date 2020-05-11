public class BubbleSort implements SortingStategy {
    @Override
    public void sort(Integer[] list){
        int i, j=0;
        boolean ok=true;

        while (ok==true)
        {
            ok=false;
            j++;
            for(i=0;i<list.length-j;i++){
                if(list[i]>list[i+1]){
                    ok=true;
                    int k=list[i];
                    list[i]=list[i+1];
                    list[i+1]=k;
                }
            }
        }
    }
}
