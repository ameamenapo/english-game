package englishGame;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

public class MainWindow extends JFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
	
	
	//レイアウト（紙芝居のような設定用）
	CardLayout layout = new CardLayout();
	//コンポーネント
	MenuPanel menuPanel = new MenuPanel();
	CorrectPanel correctPanel = new CorrectPanel();
	FruitsPanel fruitsPanel = new FruitsPanel();;
	ColorPanel colorPanel;
	AnimalPanel animalPanel;
	
	
	//コンストラクタ
		MainWindow(){
			//ウインドウのタイトル
			this.setTitle("English Game");
			this.setDefaultCloseOperation(EXIT_ON_CLOSE);  //窓の右上の罰ボタンを押すと窓が閉じる
			this.setResizable(false);
			this.getContentPane().setBackground(new Color(255, 240, 245));
			this.setLayout(layout);   //紙芝居のように設定
			this.setSize( 800, 620 );  //サイズ設定
			this.pack();  //自動サイズ調整（kこれがないと変なサイズになる）
			this.setLocationRelativeTo(null);
			
		}
		
		//コンストラクタが呼ばれた後メインメソッドから最初に手動で呼び出す
		public void preparePanels() {
			//パネルの準備
			menuPanel = new MenuPanel();
			menuPanel.fruitbtn.addActionListener(this);
			this.add(menuPanel, "フルーツ画面");

			menuPanel.colorbtn.addActionListener(this);
			this.add(menuPanel, "カラー画面");
			
			menuPanel.animalbtn.addActionListener(this);
			this.add(menuPanel, "アニマル画面");
			
			fruitsPanel = new FruitsPanel();
			fruitsPanel.fruitOptionLeft.addActionListener(this);
			this.add(fruitsPanel, "コレクト画面");
			
			
			/*animalPanel = new AnimalPanel();
			this.add(animalPanel, "アニマル画面");*/
			
			this.pack();
			
			Container contentPane = getContentPane();
		       
	        contentPane.add(menuPanel, "メニュー画面");//第二引数はcard1じゃなくてもいいっぽい？
	        contentPane.add(fruitsPanel, "フルーツ画面");
	        contentPane.add(colorPanel, "コレクト画面");
	        //contentPane.add(animalPanel, "アニマル画面");   
	     
		}
		//preparePanels()が呼ばれた後メインメソッドからさらに手動で呼び出す
		public void prepareComponents() {
			fruitsPanel.prepareComponents();
			colorPanel.prepareComponents();
			animalPanel.prepareComponents();
		}
		
        
		public void menuCommand() {
			//ボタンをクリックしたらshowメソッドの第二引数のcard2とかが表示される
			menuPanel.fruitbtn.addMouseListener(new MouseAdapter() {
	            @Override
	            public void mouseClicked(MouseEvent e) {
	                layout.show(getContentPane(), "フルーツ画面");
	            }
	        });
			menuPanel.colorbtn.addMouseListener(new MouseAdapter() {
	            @Override
	            public void mouseClicked(MouseEvent e) {
	                layout.show(getContentPane(), "カラー画面");
	            }
	        });
			menuPanel.animalbtn.addMouseListener(new MouseAdapter() {
	            @Override
	            public void mouseClicked(MouseEvent e) {
	                layout.show(getContentPane(), "アニマル画面");
	            }
	        });
		}
    	

		

}
