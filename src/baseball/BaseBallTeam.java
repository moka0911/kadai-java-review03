package baseball;

public class BaseBallTeam {
    private String name;
    private int win;
    private int lose;
    private int draw;

 // コンストラクタ
    public BaseBallTeam(String name, int win, int lose, int draw) {
        this.name = name;
        this.win = win;
        this.lose = lose;
        this.draw = draw;
    }

 // 勝率を計算するメソッド
    public double getRate() {
        return (double) win / (win + lose);
    }

    // 成績を報告するメソッド
    public void report() {
        System.out.println(name + " の2022年の成績は " + win + "勝 " + lose + "敗 " + draw + "分、勝率は " + getRate() + "です。");
    }
    
}
