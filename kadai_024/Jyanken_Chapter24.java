package kadai_024;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter24 {

    String[] choice = {"グー", "チョキ", "パー"};

//    じゃんけんの自分の手を入力
    public String getMyChoice() {
        System.out.println("自分のじゃんけんの手を入力しましょう\r\n" +
                "グーはrockのrを入力しましょう\r\n" +
                "チョキはscissorsのsを入力しましょう\r\n" +
                "パーはpaperのpを入力しましょう");
        Scanner scanner = new Scanner(System.in);
        String myChoice = scanner.next();

        if (!(myChoice.equals("r") || myChoice.equals("s") || myChoice.equals("p"))) {
            System.out.println("無効な選択です");
            return getMyChoice();
        }else {
            return myChoice;
        }

    }

//    対戦相手のじゃんけんの手を乱数で選ぶ
    public String getRandom(){

        int num =(int) (Math.random() * choice.length);

        String[] choice = {"r", "s", "p"};
        return choice[num];

    }

//    じゃんけんを行う
    public void playGame(){
        String myChoice = getMyChoice();
        String rivalChoice = getRandom();

        HashMap<String, String> jyankenHashMap = new HashMap<String, String>();
        jyankenHashMap.put("r", "グー");
        jyankenHashMap.put("s", "チョキ");
        jyankenHashMap.put("p", "パー");

        System.out.println("自分の手は" + jyankenHashMap.get(myChoice));
        System.out.println("対戦相手の手は" + jyankenHashMap.get(rivalChoice));

        if(myChoice.equals(rivalChoice)){
          System.out.println("あいこです");
        }else if((myChoice.equals("r")&&rivalChoice.equals("s"))||(myChoice.equals("s")&&rivalChoice.equals("p"))||(myChoice.equals("p")&&rivalChoice.equals("r"))){
            System.out.println("自分の勝ちです");
        }else{
            System.out.println("自分の負けです");
        }
    }


}
