package englishGame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FruitsPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	//コンポーネント
	JLabel fruitsLavel;
	
	//コンストラクタ;/
	FruitsPanel(){
		//パネルサイズと貼り付け位置の設定は不要（CardLayoutが勝手に画面サイズに合わせてくれる）
		this.setLayout(null);//レイアウトの設定
		this.setBackground(new Color(255, 240, 245)); //背景の色
		//その他の追加設定をここに追加
		}	
		// コンストラクタが呼ばれた後手動で呼び出す
		public void prepareComponents() {
			//以降コンポーネントに関する命令
			//ラベル生成
			JLabel fruitsLavel = new JLabel();  //ラベル生成
			fruitsLavel.setText("フルーツ画面"); //ラベルに文字を記入
			fruitsLavel.setBounds(100,0,100,30); //位置とさいぞを指定
			this.add(fruitsLavel);              //ラベルをパネルに貼る
			
			 //コンポーネント(ボタンとか)作成
		    JButton fruitQuestionBtn = new JButton("りんご");
		    fruitQuestionBtn.setPreferredSize(new Dimension(300, 100));//ボタンの大きさ。
		    fruitQuestionBtn.setAlignmentX(0.5f);
		    
		    JLabel fruitQuestion = new JLabel();
		    fruitQuestion.setText("えいご(English)ではなんていう？えらんでね！");
		    fruitQuestion.setFont(new Font("Arial", Font.PLAIN, 24));
		    fruitQuestion.setAlignmentX(0.5f);
		    
		    JButton fruitOptionLeft = new JButton("Apple");
		    JButton fruitOptionRight = new JButton("Strawberry");
		    fruitOptionLeft.setPreferredSize(new Dimension(300, 100));//ボタンの大きさ。
		    fruitOptionRight.setPreferredSize(new Dimension(300, 100));//ボタンの大きさ。
		    
		    //card2に足したいコンポーネントを上から順に追加
		    this.add(fruitQuestionBtn);
		    this.add(fruitQuestion);
		    this.add(fruitOptionLeft);
		    this.add(fruitOptionRight);
	
		}	


}
