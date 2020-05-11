public class SortingStrategyTest {
    public void testStrategy(SortingStategy sortingStrategy, Integer[] list){
        sortingStrategy.sort(list);
    }
    public static void main(String[] args) {
    Integer[] nr={1,7,10,2,3,6,7,9,8};
    SortingStrategyTest test= new SortingStrategyTest();
    System.out.println("Testing the BubbleSort");
    test.testStrategy(new BubbleSort(),nr);
    for(int i:nr){
        System.out.println(i);
    }
    }
}
