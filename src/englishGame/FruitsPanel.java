package englishGame;

import java.awt.Color;

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
			
	
		}	

		

}
