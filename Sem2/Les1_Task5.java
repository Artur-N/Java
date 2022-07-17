package Sem2;

public class Les1_Task5 {
    public static void main(String[] args) {

    }

    public static void combiWithRep(int[] combi, int index, int K) {
        if (index == combi.length){
            return;
        }
        for (int i = 0; i < K; i++) {
            combi[index] = i;
            combiWithRep(combi, index + 1, K);
        }
    }
}
