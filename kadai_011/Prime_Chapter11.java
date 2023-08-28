package kadai_011;

public class Prime_Chapter11 {
    public static void main(String[] args) {

        boolean[] numArray = new boolean[101];

//　iは配列の番号　中身の数字はi+1
        for (int i = 1; i < numArray.length; i++) {
            numArray[i] = true;
        }
//        割る数　num
        for (int num = 2; num < numArray.length; num++) {
            for (int i = num + 1; i < numArray.length; i++) {
                if (i % num == 0) {
                    numArray[i] = false;
                    continue;
                }
            }
            num += 1;

            for (int i = 2; i < numArray.length; i++) {
                if (numArray[i] == true) {
                    System.out.println(i);
                }
            }break;
        }
    }



}
