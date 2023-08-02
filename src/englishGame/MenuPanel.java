package englishGame;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MenuPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	//コンポーネント
	JLabel menuLavel;
	CardLayout layout;
	JButton fruitbtn;
	JButton colorbtn;
	JButton animalbtn;
	
	//コンストラクタ;/
	MenuPanel(){
		//パネルサイズと貼り付け位置の設定は不要（CardLayoutが勝手に画面サイズに合わせてくれる）
		this.setLayout(null);//レイアウトの設定
		this.setBackground(new Color(255, 240, 245)); //背景の色
		//その他の追加設定をここに追加
		}	
		// コンストラクタが呼ばれた後手動で呼び出す
		public void prepareComponents() {
			//パネル作成
	        JPanel card1 = new JPanel();
	        //コンポーネント(ボタンとか)作成
	        
	        JLabel menutext = new JLabel();
	        menutext.setText("どれで遊ぶ？メニューからえらんでね！");
	        menutext.setFont(new Font("Arial", Font.PLAIN, 28));
	        menutext.setPreferredSize(new Dimension(800, 200));//画面縦サイズ半分を指定することで位置調整
	        menutext.setHorizontalAlignment(JLabel.CENTER);
	        
	        //フルーツボタンの上に載せる空ラベル。これがないと他のコンポーネントとの位置調整できない
	        JLabel fruitbtnLabel = new JLabel();
	        fruitbtnLabel.setPreferredSize(new Dimension(800, 30));//横いっぱいにして残りボタン２つを下にさげる
	        //フルーツボタン
	        JButton fruitbtn = new JButton("くだもの");
	        fruitbtn.setPreferredSize(new Dimension(250, 100));//ボタンの大きさ。
	        fruitbtn.addActionListener(this);
	        fruitbtn.setActionCommand("fruitbtn");
	        fruitbtn.setFont(new Font("Arial", Font.PLAIN, 28));
	        //fruitbtn.setBorderPainted(false);//元々設定されてた色をオフ？
	        //fruitbtn.setBackground(null);//背景をデフォルトに？
	        //fruitbtn.setContentAreaFilled(false);
	        fruitbtn.setBackground(new Color(240, 95, 141));//色変更したいが利かない
	        
	        fruitbtnLabel.add(fruitbtn);//いらないかも
	        
	        JButton colorbtn = new JButton("いろ");
	        colorbtn.setPreferredSize(new Dimension(250, 100));//ボタンの大きさ。
	        colorbtn.addActionListener(this);
	        colorbtn.setActionCommand("colorbtn");
	        colorbtn.setFont(new Font("Arial", Font.PLAIN, 28));
	        
	        JButton animalbtn = new JButton("どうぶつ");
	        animalbtn.setPreferredSize(new Dimension(250, 100));//ボタンの大きさ。
	        animalbtn.addActionListener(this);
	        animalbtn.setActionCommand("animalbtn");
	        animalbtn.setFont(new Font("Arial", Font.PLAIN, 28));
	        
	        
		    
	        //カードにコンポーネント追加
	        card1.add(menutext);
	        card1.add(fruitbtn);//①ボタン
	    	card1.add(fruitbtnLabel);//②ラベル。も下のボタンも両方載せないとだめ。
	    	card1.add(colorbtn);
	    	card1.add(animalbtn);
	    	
	    	//card1.setLayout(new BoxLayout(card1, BoxLayout.Y_AXIS));
	    	//カードのデザイン
	    	
	    	card1.setBackground(new Color(255, 240, 245));
	    	
		}
		
		

}
