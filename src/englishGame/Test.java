package englishGame;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Test extends JFrame implements ActionListener {

	public static void main(String[] args) {
		new Test();

	}

	public Test() {
		setTitle("EnglishGame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setSize(600, 620);
		setLocation(300, 300);

		getContentPane().add(getDefPanel());
		setVisible(true);
		}

		private JPanel getDefPanel(){
			//ベースパネル
			JPanel panel = new JPanel();
			// ボタンを直接貼るパネル
			JPanel menuPanel = new JPanel();
			// menuPanelを[GridBagLayout]として作成
			GridBagLayout menuLayout = new GridBagLayout();
			menuPanel.setLayout(menuLayout);
			
			JButton fruitsbutton = new JButton("くだもの");
			fruitsbutton.setPreferredSize(new Dimension(250, 100));
			fruitsbutton.setFont(new Font("Arial", Font.PLAIN, 24));
			fruitsbutton.setActionCommand("2");
			fruitsbutton.addActionListener(this);
			
			JButton animalbutton = new JButton("どうぶつ");
			animalbutton.setPreferredSize(new Dimension(250, 100));
			animalbutton.setFont(new Font("Arial", Font.PLAIN, 24));
			animalbutton.setActionCommand("3");
			animalbutton.addActionListener(this);
			
			JButton colorbutton = new JButton("いろ");
			colorbutton.setPreferredSize(new Dimension(250, 100));
			colorbutton.setFont(new Font("Arial", Font.PLAIN, 24));
			colorbutton.setActionCommand("4");
			colorbutton.addActionListener(this);
			
			//以下、かくパーツの細かい設定
			GridBagConstraints menuGbc = new GridBagConstraints();
			menuGbc.gridx = 0;
			menuGbc.gridy = 0;
			menuGbc.gridwidth = 2;// 横２つ分
			menuGbc.gridheight = 1;	
			menuGbc.insets = new Insets(15, 15, 15, 15);
			menuGbc.ipady = 0;
			menuLayout.setConstraints(fruitsbutton, menuGbc);
					
			menuGbc.gridx = 0;
			menuGbc.gridy = 1;
			menuGbc.gridwidth = 1;// 横２つ分
			menuGbc.gridheight = 1;	
			menuGbc.insets = new Insets(15, 15, 15, 15);
			menuGbc.ipady = 0;
			menuLayout.setConstraints(animalbutton, menuGbc);
			
			menuGbc.gridx = 1;
			menuGbc.gridy = 1;
			menuGbc.gridwidth = 1;// 横２つ分
			menuGbc.gridheight = 1;	
			menuGbc.insets = new Insets(15, 15, 15, 15);
			menuGbc.ipady = 0;
			menuLayout.setConstraints(colorbutton, menuGbc);
			//パネルに各パーツを登録
			menuPanel.add(fruitsbutton);
			menuPanel.add(animalbutton);
			menuPanel.add(colorbutton);
			// ベースのパネルの設定
			// レイアウトをBorderLayoutに
			panel.setLayout(new BorderLayout());
			// ベースのパネルに各パーツが乗ったkeyPanelをのせる
			panel.add(menuPanel, BorderLayout.CENTER);
			//パネルの一番上に問題のタイトルみたいなの(Fruits Question)書いとく
			JLabel menutitle = new JLabel("Menu");
			menutitle.setHorizontalAlignment(JLabel.CENTER);
			menutitle.setFont(new Font("Arial", Font.PLAIN, 20));
			panel.add(menutitle, BorderLayout.NORTH);
			//パネルの一番下にOffボタン
			OffButton offbutton = new OffButton();
			offbutton.setHorizontalAlignment(JLabel.CENTER);
			offbutton.setFont(new Font("Arial", Font.PLAIN, 20));
			offbutton.setMargin(new Insets(10, 0, 10, 0));
			panel.add(offbutton, BorderLayout.SOUTH);
		
		return panel;
		}

		@Override
		public void actionPerformed(ActionEvent e) {

		int command = Integer.parseInt(e.getActionCommand());
		JPanel panel = new JPanel();
		
		JButton menubutton;
		JButton fruitsbutton;
		JButton animalbutton;
		JButton colorbutton;
		JButton ataributton;
		JButton hazurebutton;

		switch (command) {
		case 1:
		// ボタンを直接貼るパネル
		JPanel menuPanel = new JPanel();
		// menuPanelを[GridBagLayout]として作成
		GridBagLayout menuLayout = new GridBagLayout();
		menuPanel.setLayout(menuLayout);
		
		//panel.add(new JLabel("メニューパネル"));
		
		fruitsbutton = new JButton("くだもの");
		fruitsbutton.setPreferredSize(new Dimension(250, 100));
		fruitsbutton.setFont(new Font("Arial", Font.PLAIN, 24));
		fruitsbutton.setActionCommand("2");
		fruitsbutton.addActionListener(this);
		//panel.add(fruitsbutton);
		
		animalbutton = new JButton("どうぶつ");
		animalbutton.setPreferredSize(new Dimension(250, 100));
		animalbutton.setFont(new Font("Arial", Font.PLAIN, 24));
		animalbutton.setActionCommand("3");
		animalbutton.addActionListener(this);
		//panel.add(animalbutton);
		
		colorbutton = new JButton("いろ");
		colorbutton.setPreferredSize(new Dimension(250, 100));
		colorbutton.setFont(new Font("Arial", Font.PLAIN, 24));
		colorbutton.setActionCommand("4");
		colorbutton.addActionListener(this);
		
		//以下、かくパーツの細かい設定
		GridBagConstraints menuGbc = new GridBagConstraints();
		menuGbc.gridx = 0;
		menuGbc.gridy = 0;
		menuGbc.gridwidth = 2;// 横２つ分
		menuGbc.gridheight = 1;	
		menuGbc.insets = new Insets(15, 15, 15, 15);
		menuGbc.ipady = 0;
		menuLayout.setConstraints(fruitsbutton, menuGbc);
				
		menuGbc.gridx = 0;
		menuGbc.gridy = 1;
		menuGbc.gridwidth = 1;// 横２つ分
		menuGbc.gridheight = 1;	
		menuGbc.insets = new Insets(15, 15, 15, 15);
		menuGbc.ipady = 0;
		menuLayout.setConstraints(animalbutton, menuGbc);
		
		menuGbc.gridx = 1;
		menuGbc.gridy = 1;
		menuGbc.gridwidth = 1;// 横２つ分
		menuGbc.gridheight = 1;	
		menuGbc.insets = new Insets(15, 15, 15, 15);
		menuGbc.ipady = 0;
		menuLayout.setConstraints(colorbutton, menuGbc);
		//パネルに各パーツを登録
		menuPanel.add(fruitsbutton);
		menuPanel.add(animalbutton);
		menuPanel.add(colorbutton);
		// ベースのパネルの設定
		// レイアウトをBorderLayoutに
		panel.setLayout(new BorderLayout());
		// ベースのパネルに各パーツが乗ったkeyPanelをのせる
		panel.add(menuPanel, BorderLayout.CENTER);
		//パネルの一番上に問題のタイトルみたいなの書いとく
		JLabel menutitle = new JLabel("Menu");
		menutitle.setHorizontalAlignment(JLabel.CENTER);
		menutitle.setFont(new Font("Arial", Font.PLAIN, 20));
		panel.add(menutitle, BorderLayout.NORTH);
		//パネルの一番下にOffボタン
		OffButton offbutton = new OffButton();
		offbutton.setHorizontalAlignment(JLabel.CENTER);
		offbutton.setFont(new Font("Arial", Font.PLAIN, 20));
		offbutton.setMargin(new Insets(10, 0, 10, 0));
		panel.add(offbutton, BorderLayout.SOUTH);

		break;

		case 2:
		// ボタンを直接貼るパネル
		JPanel fruitsPanel = new JPanel();
		// fruitsPanelを[GridBagLayout]として作成
		GridBagLayout fruitsLayout = new GridBagLayout();
		fruitsPanel.setLayout(fruitsLayout);
		
		menubutton = new JButton("メニュー");
		menubutton.setActionCommand("1");
		menubutton.addActionListener(this);
		JLabel question = new JLabel("えいごではなんていう？");
		question.setFont(new Font("Arial", Font.PLAIN, 24));
		JLabel word = new JLabel("りんご");
		word.setFont(new Font("Arial", Font.PLAIN, 28));
		hazurebutton = new JButton("banana");
		hazurebutton.setPreferredSize(new Dimension(250, 100));
		hazurebutton.setFont(new Font("Arial", Font.PLAIN, 24));
		hazurebutton.setActionCommand("6");
		hazurebutton.addActionListener(this);
		ataributton = new JButton("apple");
		ataributton.setPreferredSize(new Dimension(250, 100));
		ataributton.setFont(new Font("Arial", Font.PLAIN, 24));
		ataributton.setActionCommand("5");
		ataributton.addActionListener(this);
		//以下、かくパーツの細かい設定
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 2;// 横２つ分
		gbc.gridheight = 1;	
		gbc.insets = new Insets(0, 15, 0, 15);
		gbc.ipady = 0;
		fruitsLayout.setConstraints(question, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.gridwidth = 2;// 横２つ分
		gbc.gridheight = 1;
		gbc.insets = new Insets(50, 15, 50, 15);
		gbc.ipady = 30;
		fruitsLayout.setConstraints(word, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.gridwidth = 1;// 横２つ分
		gbc.gridheight = 1;
		gbc.insets = new Insets(15, 15, 15, 15);
		gbc.ipady = 0;
		fruitsLayout.setConstraints(hazurebutton, gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 2;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.insets = new Insets(15, 15, 15, 15);
		gbc.ipady = 0;
		fruitsLayout.setConstraints(ataributton, gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 3;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.ipady = 20;
		gbc.insets = new Insets(100, 150, 15, 0);
		fruitsLayout.setConstraints(menubutton, gbc);
		//fruitsPanelにかくパーツを登録
		fruitsPanel.add(menubutton);
		fruitsPanel.add(question);
		fruitsPanel.add(word);
		fruitsPanel.add(hazurebutton);
		fruitsPanel.add(ataributton);
		
		// ベースのパネルの設定
		// レイアウトをBorderLayoutに
		panel.setLayout(new BorderLayout());
		// ベースのパネルに各パーツが乗ったkeyPanelをのせる
		panel.add(fruitsPanel, BorderLayout.CENTER);
		//パネルの一番上に問題のタイトルみたいなの(Fruits Question)書いとく
		JLabel toptitle = new JLabel("Fruits Question");
		toptitle.setHorizontalAlignment(JLabel.CENTER);
		toptitle.setFont(new Font("Arial", Font.PLAIN, 20));
		panel.add(toptitle, BorderLayout.NORTH);
		
		break;
		
		case 3:
			// ボタンを直接貼るパネル
			JPanel animalPanel = new JPanel();
			// fruitsPanelを[GridBagLayout]として作成
			GridBagLayout animalLayout = new GridBagLayout();
			animalPanel.setLayout(animalLayout);
			
			//animalPanel.add(new JLabel("動物パネル"), 0);
			menubutton = new JButton("メニュー");
			menubutton.setActionCommand("1");
			menubutton.addActionListener(this);
			//animalPanel.add(menubutton, 1);
			JLabel ani_question = new JLabel("えいごではなんていう？");
			ani_question.setFont(new Font("Arial", Font.PLAIN, 24));
			JLabel ani_word = new JLabel("ねこ");
			ani_word.setFont(new Font("Arial", Font.PLAIN, 28));
			hazurebutton = new JButton("dog");
			hazurebutton.setPreferredSize(new Dimension(250, 100));
			hazurebutton.setFont(new Font("Arial", Font.PLAIN, 24));
			hazurebutton.setActionCommand("6");
			hazurebutton.addActionListener(this);
			ataributton = new JButton("cat");
			ataributton.setPreferredSize(new Dimension(250, 100));
			ataributton.setFont(new Font("Arial", Font.PLAIN, 24));
			ataributton.setActionCommand("5");
			ataributton.addActionListener(this);
			//以下、かくパーツの細かい設定
			GridBagConstraints ani_gbc = new GridBagConstraints();
			ani_gbc.gridx = 0;
			ani_gbc.gridy = 0;
			ani_gbc.gridwidth = 2;// 横２つ分
			ani_gbc.gridheight = 1;	
			ani_gbc.insets = new Insets(0, 15, 0, 15);
			ani_gbc.ipady = 0;
			animalLayout.setConstraints(ani_question, ani_gbc);
			
			ani_gbc.gridx = 0;
			ani_gbc.gridy = 1;
			ani_gbc.gridwidth = 2;// 横２つ分
			ani_gbc.gridheight = 1;
			ani_gbc.insets = new Insets(50, 15, 50, 15);
			ani_gbc.ipady = 30;
			animalLayout.setConstraints(ani_word, ani_gbc);
			
			ani_gbc.gridx = 0;
			ani_gbc.gridy = 2;
			ani_gbc.gridwidth = 1;// 横２つ分
			ani_gbc.gridheight = 1;
			ani_gbc.insets = new Insets(15, 15, 15, 15);
			ani_gbc.ipady = 0;
			animalLayout.setConstraints(hazurebutton, ani_gbc);
			
			ani_gbc.gridx = 1;
			ani_gbc.gridy = 2;
			ani_gbc.gridwidth = 1;
			ani_gbc.gridheight = 1;
			ani_gbc.insets = new Insets(15, 15, 15, 15);
			ani_gbc.ipady = 0;
			animalLayout.setConstraints(ataributton, ani_gbc);
			
			ani_gbc.gridx = 1;
			ani_gbc.gridy = 3;
			ani_gbc.gridwidth = 1;
			ani_gbc.gridheight = 1;
			ani_gbc.ipady = 20;
			ani_gbc.insets = new Insets(100, 150, 15, 0);
			animalLayout.setConstraints(menubutton, ani_gbc);
			//fruitsPanelにかくパーツを登録
			animalPanel.add(menubutton);
			animalPanel.add(ani_question);
			animalPanel.add(ani_word);
			animalPanel.add(hazurebutton);
			animalPanel.add(ataributton);
			
			// ベースのパネルの設定
			// レイアウトをBorderLayoutに
			panel.setLayout(new BorderLayout());
			// ベースのパネルに各パーツが乗ったkeyPanelをのせる
			panel.add(animalPanel, BorderLayout.CENTER);
			//パネルの一番上に問題のタイトルみたいなの(Fruits Question)書いとく
			JLabel ani_title = new JLabel("Animals Question");
			ani_title.setHorizontalAlignment(JLabel.CENTER);
			ani_title.setFont(new Font("Arial", Font.PLAIN, 20));
			panel.add(ani_title, BorderLayout.NORTH);

			break;
			
		case 4:
			// ボタンを直接貼るパネル
			JPanel colorPanel = new JPanel();
			// fruitsPanelを[GridBagLayout]として作成
			GridBagLayout colorLayout = new GridBagLayout();
			colorPanel.setLayout(colorLayout);
			
			menubutton = new JButton("メニュー");
			menubutton.setActionCommand("1");
			menubutton.addActionListener(this);
			JLabel col_question = new JLabel("えいごではなんていう？");
			col_question.setFont(new Font("Arial", Font.PLAIN, 24));
			JLabel col_word = new JLabel("あか");
			col_word.setFont(new Font("Arial", Font.PLAIN, 28));
			hazurebutton = new JButton("blue");
			hazurebutton.setPreferredSize(new Dimension(250, 100));
			hazurebutton.setFont(new Font("Arial", Font.PLAIN, 24));
			hazurebutton.setActionCommand("6");
			hazurebutton.addActionListener(this);
			ataributton = new JButton("red");
			ataributton.setPreferredSize(new Dimension(250, 100));
			ataributton.setFont(new Font("Arial", Font.PLAIN, 24));
			ataributton.setActionCommand("5");
			ataributton.addActionListener(this);
			//以下、かくパーツの細かい設定
			GridBagConstraints col_gbc = new GridBagConstraints();
			col_gbc.gridx = 0;
			col_gbc.gridy = 0;
			col_gbc.gridwidth = 2;// 横２つ分
			col_gbc.gridheight = 1;	
			col_gbc.insets = new Insets(0, 15, 0, 15);
			col_gbc.ipady = 0;
			colorLayout.setConstraints(col_question, col_gbc);
			
			col_gbc.gridx = 0;
			col_gbc.gridy = 1;
			col_gbc.gridwidth = 2;// 横２つ分
			col_gbc.gridheight = 1;
			col_gbc.insets = new Insets(50, 15, 50, 15);
			col_gbc.ipady = 30;
			colorLayout.setConstraints(col_word, col_gbc);
			
			col_gbc.gridx = 0;
			col_gbc.gridy = 2;
			col_gbc.gridwidth = 1;// 横２つ分
			col_gbc.gridheight = 1;
			col_gbc.insets = new Insets(15, 15, 15, 15);
			col_gbc.ipady = 0;
			colorLayout.setConstraints(hazurebutton, col_gbc);
			
			col_gbc.gridx = 1;
			col_gbc.gridy = 2;
			col_gbc.gridwidth = 1;
			col_gbc.gridheight = 1;
			col_gbc.insets = new Insets(15, 15, 15, 15);
			col_gbc.ipady = 0;
			colorLayout.setConstraints(ataributton, col_gbc);
			
			col_gbc.gridx = 1;
			col_gbc.gridy = 3;
			col_gbc.gridwidth = 1;
			col_gbc.gridheight = 1;
			col_gbc.ipady = 20;
			col_gbc.insets = new Insets(100, 150, 15, 0);
			colorLayout.setConstraints(menubutton, col_gbc);
			//fruitsPanelにかくパーツを登録
			colorPanel.add(menubutton);
			colorPanel.add(col_question);
			colorPanel.add(col_word);
			colorPanel.add(hazurebutton);
			colorPanel.add(ataributton);
			
			// ベースのパネルの設定
			// レイアウトをBorderLayoutに
			panel.setLayout(new BorderLayout());
			// ベースのパネルに各パーツが乗ったkeyPanelをのせる
			panel.add(colorPanel, BorderLayout.CENTER);
			//パネルの一番上に問題のタイトルみたいなの(Fruits Question)書いとく
			JLabel col_title = new JLabel("colors Question");
			col_title.setHorizontalAlignment(JLabel.CENTER);
			col_title.setFont(new Font("Arial", Font.PLAIN, 20));
			panel.add(col_title, BorderLayout.NORTH);

			break;			
		
		case 5:
			// ボタンを直接貼るパネル
			JPanel atariPanel = new JPanel();
			// パネルを[GridBagLayout]として作成
			GridBagLayout atariLayout = new GridBagLayout();
			atariPanel.setLayout(atariLayout);
			
			menubutton = new JButton("メニュー");
			menubutton.setActionCommand("1");
			menubutton.addActionListener(this);
			JLabel atari = new JLabel("あたり！");
			atari.setFont(new Font("Arial", Font.PLAIN, 40));

			//以下、かくパーツの細かい設定
			GridBagConstraints ata_gbc = new GridBagConstraints();
			ata_gbc.gridx = 0;
			ata_gbc.gridy = 0;
			ata_gbc.gridwidth = 2;// 横２つ分
			ata_gbc.gridheight = 2;	
			ata_gbc.insets = new Insets(50, 15, 50, 15);
			ata_gbc.ipady = 0;
			atariLayout.setConstraints(atari, ata_gbc);			

			ata_gbc.gridx = 1;
			ata_gbc.gridy = 1;
			ata_gbc.gridwidth = 1;
			ata_gbc.gridheight = 1;
			ata_gbc.ipady = 20;
			ata_gbc.insets = new Insets(100, 150, 15, 0);
			atariLayout.setConstraints(menubutton, ata_gbc);
			//fruitsPanelにかくパーツを登録
			atariPanel.add(menubutton);
			atariPanel.add(atari);
			
			// ベースのパネルの設定
			// レイアウトをBorderLayoutに
			panel.setLayout(new BorderLayout());
			// ベースのパネルに各パーツが乗ったkeyPanelをのせる
			panel.add(atariPanel, BorderLayout.CENTER);
			//パネルの一番上に問題のタイトルみたいなの(Fruits Question)書いとく
			JLabel ata_title = new JLabel("correct");
			ata_title.setHorizontalAlignment(JLabel.CENTER);
			ata_title.setFont(new Font("Arial", Font.PLAIN, 20));
			panel.add(ata_title, BorderLayout.NORTH);			
		
			break;
			
		case 6:
			// ボタンを直接貼るパネル
			JPanel hazurePanel = new JPanel();
			// パネルを[GridBagLayout]として作成
			GridBagLayout hazureLayout = new GridBagLayout();
			hazurePanel.setLayout(hazureLayout);
			
			menubutton = new JButton("メニュー");
			menubutton.setActionCommand("1");
			menubutton.addActionListener(this);
			JLabel hazure = new JLabel("ハズレ！");
			hazure.setFont(new Font("Arial", Font.PLAIN, 40));

			//以下、かくパーツの細かい設定
			GridBagConstraints haz_gbc = new GridBagConstraints();
			haz_gbc.gridx = 0;
			haz_gbc.gridy = 0;
			haz_gbc.gridwidth = 2;// 横２つ分
			haz_gbc.gridheight = 2;	
			haz_gbc.insets = new Insets(50, 15, 50, 15);
			haz_gbc.ipady = 0;
			hazureLayout.setConstraints(hazure, haz_gbc);			

			haz_gbc.gridx = 1;
			haz_gbc.gridy = 1;
			haz_gbc.gridwidth = 1;
			haz_gbc.gridheight = 1;
			haz_gbc.ipady = 20;
			haz_gbc.insets = new Insets(100, 150, 15, 0);
			hazureLayout.setConstraints(menubutton, haz_gbc);
			//fruitsPanelにかくパーツを登録
			hazurePanel.add(menubutton);
			hazurePanel.add(hazure);
			
			// ベースのパネルの設定
			// レイアウトをBorderLayoutに
			panel.setLayout(new BorderLayout());
			// ベースのパネルに各パーツが乗ったkeyPanelをのせる
			panel.add(hazurePanel, BorderLayout.CENTER);
			//パネルの一番上に問題のタイトルみたいなの(Fruits Question)書いとく
			JLabel haz_title = new JLabel("correct");
			haz_title.setHorizontalAlignment(JLabel.CENTER);
			haz_title.setFont(new Font("Arial", Font.PLAIN, 20));
			panel.add(haz_title, BorderLayout.NORTH);			
		
			break;			

		default:
		break;
		}

		getContentPane().removeAll();
		getContentPane().add(panel);
		setVisible(true);
		}
		
		/**
		 * OFFボタンクラス.
		 */
		class OffButton extends JButton implements ActionListener {

			private static final long serialVersionUID = 1L;
			
			// コンストラクタ
			public OffButton() {
				// 親クラスにボタン名を渡す（渡した名称がボタンに表示されます）
				super("Off");
				// アクションリスナー（ボタンがクリックされたときに処理を起動する）に登録
				this.addActionListener(this);
			}
			
			/**
			 * OFFボタンがクリックされた場合の処理.<br>
			 * システムを終了します.
			 */
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		}
		
		
}
