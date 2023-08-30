package kadai_017;

public class KatoExec_Chapter17 {
    public static void main(String[] args) {
//        子クラス　インスタンス
        KatoTaro_Chapter17 taro = new KatoTaro_Chapter17();
        KatoIchiro_Chapter17 ichiro = new KatoIchiro_Chapter17();
        KatoHanako_Chapter17 hanako =new KatoHanako_Chapter17();

//        setGivenName
        taro.setGivenName("太郎");
        ichiro.setGivenName("一郎");
        hanako.setGivenName("花子");

//        execIntroduce
        taro.execIntroduce();
        ichiro.execIntroduce();
        hanako.execIntroduce();
    }
}
