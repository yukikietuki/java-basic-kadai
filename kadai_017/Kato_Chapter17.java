package kadai_017;

public abstract class Kato_Chapter17 {
    //　フィールド
    String familyName = "加藤";
    String givenName;
    String address = "東京都中野区〇×";

    //   共通の紹介を出力する
    public void commonInteoduce(){
        System.out.println("名前は"+this.familyName +this.givenName +"です");
        System.out.println("住所は"+this.address +"です");
    }
    //    個別の紹介を出力する 抽象メソッド
    public abstract void eachIntroduce();

//    紹介を実行する
    public void execIntroduce(){
       this.commonInteoduce();
       this.eachIntroduce();
    }

}
