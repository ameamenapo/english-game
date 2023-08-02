package englishGame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FruitsPanel extends JPanel{
	private static final long serialVersionUID = 1L;
	
	//コンストラクタ;/
	FruitsPanel(){
		//パネルサイズと貼り付け位置の設定は不要（CardLayoutが勝手に画面サイズに合わせてくれる）
		this.setLayout(null);//レイアウトの設定
		this.setBackground(new Color(255, 240, 245)); //背景の色
		//その他の追加設定をここに追加
		}	
		// コンストラクタが呼ばれた後手動で呼び出す
		public void prepareComponents() {
			//パネル作成
		    JPanel card2 = new JPanel();
		    //コンポーネント(ボタンとか)作成
		    
		  //フルーツボタンの上に載せる空ラベル。これがないと他のコンポーネントとの位置調整できない
	        JLabel fruitsYohakuLabel = new JLabel();
	        fruitsYohakuLabel.setPreferredSize(new Dimension(800, 50));//横いっぱいにして他コンポーネントを下にさげる
	        
	        JLabel fruitQuestionLabel = new JLabel("りんご");
	        fruitQuestionLabel.setPreferredSize(new Dimension(800, 100));//ラベルの大きさ。
	        fruitQuestionLabel.setFont(new Font("Arial", Font.PLAIN, 30));
	        fruitQuestionLabel.setForeground(Color.RED);
	        fruitQuestionLabel.setHorizontalAlignment(JLabel.CENTER);
		    //fruitQuestionBtn.setAlignmentX(0.5f);これを入れても聞かない。文字を大きくして縦にする
		    
		    JLabel fruitQuestion = new JLabel();
		    fruitQuestion.setText("えいご(English)ではなんていう？えらんでね！");
		    fruitQuestion.setFont(new Font("Arial", Font.PLAIN, 24));
		    //fruitQuestion.setAlignmentX(0.5f);これを入れても聞かない。文字を大きくして縦にする
		    
		    JLabel fruitsYohakuLabel2 = new JLabel();
	        fruitsYohakuLabel2.setPreferredSize(new Dimension(800, 50));
	        
		    JButton fruitOptionLeft = new JButton("Apple");
		    fruitOptionLeft.setFont(new Font("Arial", Font.PLAIN, 28));
		    fruitOptionLeft.addActionListener(this);
		    fruitOptionLeft.setActionCommand("appleAtari");
		    JButton fruitOptionRight = new JButton("Strawberry");
		    fruitOptionRight.setFont(new Font("Arial", Font.PLAIN, 28));
		    fruitOptionRight.addActionListener(this);
		    fruitOptionRight.setActionCommand("strawberryHazure");
		    fruitOptionLeft.setPreferredSize(new Dimension(300, 100));//ボタンの大きさ。
		    fruitOptionRight.setPreferredSize(new Dimension(300, 100));//ボタンの大きさ。
		    
		    JLabel fruitsYohakuLabel3 = new JLabel();
	        fruitsYohakuLabel3.setPreferredSize(new Dimension(800, 100));
	        
	        JLabel backBtnYohakuLabel = new JLabel();
	        backBtnYohakuLabel.setPreferredSize(new Dimension(600, 100));
		    
		    
		    
		    //card2に足したいコンポーネントを上から順に追加
		    card2.add(fruitsYohakuLabel);
		    card2.add(fruitQuestionLabel);
		    card2.add(fruitQuestion);
		    card2.add(fruitsYohakuLabel2);
		    card2.add(fruitOptionLeft);
		    card2.add(fruitOptionRight);
		    card2.add(fruitsYohakuLabel3);
		    
		    card2.add(backBtnYohakuLabel);
		    //card2.add(backBtnPanel);
		    card2.setBackground(new Color(255, 240, 245));
	
		}	

		

}
