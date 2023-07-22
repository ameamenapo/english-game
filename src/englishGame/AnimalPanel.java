package englishGame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AnimalPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	//コンポーネント
	JLabel animalLavel;
	
	//コンストラクタ;/
	AnimalPanel(){
		//パネルサイズと貼り付け位置の設定は不要（CardLayoutが勝手に画面サイズに合わせてくれる）
		this.setLayout(null);//レイアウトの設定
		this.setBackground(new Color(255, 240, 245)); //背景の色
		//その他の追加設定をここに追加
		}	
		// コンストラクタが呼ばれた後手動で呼び出す
		public void prepareComponents() {
			//以降コンポーネントに関する命令
			//ラベル生成
			JLabel animalLavel = new JLabel();  //ラベル生成
			animalLavel.setText("アニマル画面"); //ラベルに文字を記入
			animalLavel.setBounds(100,0,100,30); //位置とさいぞを指定
			this.add(animalLavel);              //ラベルをパネルに貼る
			
		    //コンポーネント(ボタンとか)作成
		    JButton animalQuestionBtn = new JButton("うさぎ");
		    animalQuestionBtn.setPreferredSize(new Dimension(300, 100));//ボタンの大きさ。
		    animalQuestionBtn.setAlignmentX(0.5f);
		    
		    JLabel animalQuestion = new JLabel();
		    animalQuestion.setText("えいご(English)ではなんていう？えらんでね！");
		    animalQuestion.setFont(new Font("Arial", Font.PLAIN, 24));
		    animalQuestion.setAlignmentX(0.5f);
		    
		    JButton animalOptionLeft = new JButton("Rabbit");
		    JButton animalOptionRight = new JButton("Cat");
		    animalOptionLeft.setPreferredSize(new Dimension(300, 100));//ボタンの大きさ。
		    animalOptionRight.setPreferredSize(new Dimension(300, 100));//ボタンの大きさ。
		    
		    //card2に足したいコンポーネントを上から順に追加
		    this.add(animalQuestionBtn);
		    this.add(animalQuestion);
		    this.add(animalOptionLeft);
		    this.add(animalOptionRight);
		    this.setBackground(new Color(255, 240, 245));
		    
		}
}
