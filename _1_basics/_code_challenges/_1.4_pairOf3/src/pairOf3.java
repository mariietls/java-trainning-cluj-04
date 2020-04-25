public class pairOf3 {
    public static void main(String[] args) {
        System.out.println(findPair(new int[]{-1,-1,-1,2}));
    }

    public static int findPair(int[] intArray) {
        int Pairs=0;
        for (int i=0;i<intArray.length;i++) {
            for (int j = i + 1; j < intArray.length; j++) {
                for (int k = j + 1; k < intArray.length; k++) {
                    if ((intArray[i] == 0 || (intArray[j] == 0) || (intArray[k] == 0))) {
                        continue;
                    }
                    if (intArray[i] + intArray[j] +intArray[k]== 0) {
                        Pairs++;
                        intArray[i] = 0;
                        intArray[j] = 0;
                        intArray[k] = 0;
                        break;
                    }
                }
            }
        }
        return Pairs;
    }
}