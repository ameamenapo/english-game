package englishGame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ColorPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	//コンポーネント
	JLabel colorLavel;
	
	//コンストラクタ;/
	ColorPanel(){
		//パネルサイズと貼り付け位置の設定は不要（CardLayoutが勝手に画面サイズに合わせてくれる）
		this.setLayout(null);//レイアウトの設定
		this.setBackground(new Color(255, 240, 245)); //背景の色
		//その他の追加設定をここに追加
		}	
		// コンストラクタが呼ばれた後手動で呼び出す
		public void prepareComponents() {
			//以降コンポーネントに関する命令
			//ラベル生成
			JLabel colorLavel = new JLabel();  //ラベル生成
			colorLavel.setText("カラー画面"); //ラベルに文字を記入
			colorLavel.setBounds(100,0,100,30); //位置とさいぞを指定
			this.add(colorLavel);              //ラベルをパネルに貼る
			
			 //コンポーネント(ボタンとか)作成
			JButton colorQuestionBtn = new JButton("あお");
		    colorQuestionBtn.setPreferredSize(new Dimension(300, 100));//ボタンの大きさ。
		    colorQuestionBtn.setAlignmentX(0.5f);
		    
		    JLabel colorQuestion = new JLabel();
		    colorQuestion.setText("えいご(English)ではなんていう？えらんでね！");
		    colorQuestion.setFont(new Font("Arial", Font.PLAIN, 24));
		    colorQuestion.setAlignmentX(0.5f);
		    
		    JButton colorOptionLeft = new JButton("Blue");
		    JButton colorOptionRight = new JButton("Red");
		    colorOptionLeft.setPreferredSize(new Dimension(300, 100));//ボタンの大きさ。
		    colorOptionRight.setPreferredSize(new Dimension(300, 100));//ボタンの大きさ。
		    
		    //card2に足したいコンポーネントを上から順に追加
		    this.add(colorQuestionBtn);
		    this.add(colorQuestion);
		    this.add(colorOptionLeft);
		    this.add(colorOptionRight);
		    
		}

}
