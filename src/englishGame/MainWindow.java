package englishGame;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

public class MainWindow extends JFrame {
	private static final long serialVersionUID = 1L;
	
	//定数
	final int WIDTH = 800; //フレームの幅
	final int HEIGHT = 600; //フレームの高さ
	//レイアウト（紙芝居のような設定用）
	CardLayout layout = new CardLayout();
	//コンポーネント
	MenuPanel menuPanel;
	FruitsPanel fruitsPanel;
	
	
	//コンストラクタ
		MainWindow(){
			//ウインドウのタイトル
			this.setTitle("English Game");
			this.setDefaultCloseOperation(EXIT_ON_CLOSE);  //窓の右上の罰ボタンを押すと窓が閉じる
			this.setResizable(false);
			this.getContentPane().setBackground(new Color(255, 240, 245));
			this.setLayout(layout);   //紙芝居のように設定
			this.setPreferredSize(new Dimension(WIDTH,HEIGHT));  //サイズ設定
			this.pack();  //自動サイズ調整（kこれがないと変なサイズになる）
			this.setLocationRelativeTo(null);
		}
		
		//コンストラクタが呼ばれた後メインメソッドから最初に手動で呼び出す
		public void preparePanels() {
			//パネルの準備
			menuPanel = new MenuPanel();
			this.add(menuPanel, "メニュー画面");
			fruitsPanel = new FruitsPanel();
			this.add(fruitsPanel, "フルーツ画面");
			
			this.pack();
		}
		
		//preparePanels()が呼ばれた後メインメソッドからさらに手動で呼び出す
		public void prepareComponents() {
			menuPanel.prepareComponents();
			fruitsPanel.prepareComponents();
			
		}
		
        Container contentPane = getContentPane();
       
        contentPane.add(menuPanel, "card1");//第二引数はcard1じゃなくてもいいっぽい？
        contentPane.add(fruitsPanel, "card2");
        contentPane.add(card3, "card3");
        contentPane.add(card4, "card4");
    	//ボタンをクリックしたらshowメソッドの第二引数のcard2とかが表示される
        fruitbtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                layout.show(getContentPane(), "card2");
            }
        });
	    colorbtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                layout.show(getContentPane(), "card3");
            }
        });
	    animalbtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                layout.show(getContentPane(), "card4");
            }
        });

		

}
