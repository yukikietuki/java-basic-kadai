package kadai_014;

public class Car_Chapter14 {

    //    フィールド
    private int gear = 1;
    private int speed = 10;



    //    ギアの値により速度を変える
    public void gearChange(int afterGear){

        System.out.println("ギア" + this.gear + "から" + afterGear + "に切り替えました");

    }


    //    ギアチェンジ後の速度を表示する
    public void run() {
        switch (this.gear) {
            case 1, 2, 3, 4, 5 -> System.out.println("速度は時速" + (this.gear * this.speed) + "kmです");
            default -> System.out.println("速度は時速10kmです");
        }
    }

}
