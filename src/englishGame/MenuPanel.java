package englishGame;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;

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
			//以降コンポーネントに関する命令
			//ラベル生成
			JLabel menuLavel = new JLabel();  //ラベル生成
			menuLavel.setText("タイトル画面"); //ラベルに文字を記入
			menuLavel.setBounds(100,0,100,30); //位置とさいぞを指定
			this.add(menuLavel);              //ラベルをパネルに貼る
			
			//ボタン作成
	        JButton fruitbtn = new JButton("くだもの");
	        fruitbtn.setPreferredSize(new Dimension(300, 100));//ボタンの大きさ。
	         
	        JButton colorbtn = new JButton("いろ");
	        colorbtn.setPreferredSize(new Dimension(300, 100));//ボタンの大きさ。
	        
	        JButton animalbtn = new JButton("どうぶつ");
	        animalbtn.setPreferredSize(new Dimension(300, 100));//ボタンの大きさ。
	        
	        //カードにコンポーネント追加
	    	this.add(fruitbtn);
	    	this.add(colorbtn);
	    	this.add(animalbtn);
	    	
		}
		
		

}
