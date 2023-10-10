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


public class Menu extends JFrame implements ActionListener {

	public static void main(String[] args) {
		new Menu();

	}

	public Menu() {
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
		//menuPanelやquesutionPanelをさらにpanelの上に載せることで画面を切り替えられるようにする
		JPanel panel = new JPanel();//各パーツを配置したパネルを貼るベースのパネル
		JPanel menuPanel = new JPanel();;//メニュー画面のパーツを直接配置するパネル
		JPanel quesutionPanel = new JPanel();;//問題画面のパーツを直接配置するパネル
		JPanel nextPanel = new JPanel();
		
		JButton menubutton;
		JButton nextbutton;
		JButton fruitsbutton;
		JButton animalbutton;
		JButton colorbutton;
		JButton ataributton;
		JButton hazurebutton;

		switch (command) {
		case 1:
		// quesutionPanelを[GridBagLayout]として作成
		GridBagLayout menuLayout = new GridBagLayout();
		menuPanel.setLayout(menuLayout);
		
		fruitsbutton = new JButton("くだもの");
		fruitsbutton.setPreferredSize(new Dimension(250, 100));
		fruitsbutton.setFont(new Font("Arial", Font.PLAIN, 24));
		fruitsbutton.setActionCommand("2");
		fruitsbutton.addActionListener(this);
		
		animalbutton = new JButton("どうぶつ");
		animalbutton.setPreferredSize(new Dimension(250, 100));
		animalbutton.setFont(new Font("Arial", Font.PLAIN, 24));
		animalbutton.setActionCommand("3");
		animalbutton.addActionListener(this);
		
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
		GridBagLayout fruitsLayout = new GridBagLayout();
		quesutionPanel.setLayout(fruitsLayout);
		
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
		
		//quesutionPanelにかくパーツを登録
		quesutionPanel.add(question);
		quesutionPanel.add(word);
		quesutionPanel.add(hazurebutton);
		quesutionPanel.add(ataributton);
		
		// ベースのパネルの設定
		// レイアウトをBorderLayoutに
		panel.setLayout(new BorderLayout());
		// ベースのパネルに各パーツが乗ったkeyPanelをのせる
		panel.add(quesutionPanel, BorderLayout.CENTER);
		//パネルの一番上に問題のタイトルみたいなの(Fruits Question)書いとく
		JLabel toptitle = new JLabel("Fruits Question");
		toptitle.setHorizontalAlignment(JLabel.CENTER);
		toptitle.setFont(new Font("Arial", Font.PLAIN, 20));
		panel.add(toptitle, BorderLayout.NORTH);
		//パネルの一番下にmenuとnextボタン
		
		
		menubutton = new JButton("Menu");
		menubutton.setActionCommand("1");
		menubutton.addActionListener(this);
		menubutton.setHorizontalAlignment(JLabel.CENTER);
		menubutton.setFont(new Font("Arial", Font.PLAIN, 20));
		menubutton.setMargin(new Insets(10, 0, 10, 0));
		nextPanel.add(menubutton);
		nextbutton = new JButton("Next");
		//nextbutton.setActionCommand("1");後で機能実装
		//nextbutton.addActionListener(this);
		nextbutton.setHorizontalAlignment(JLabel.CENTER);
		nextbutton.setFont(new Font("Arial", Font.PLAIN, 20));
		nextbutton.setMargin(new Insets(10, 0, 10, 0));
		nextPanel.add(nextbutton);
		panel.add(nextPanel, BorderLayout.SOUTH);
		break;
		
		case 3:
			GridBagLayout animalLayout = new GridBagLayout();
			quesutionPanel.setLayout(animalLayout);
			
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
			
			quesutionPanel.add(ani_question);
			quesutionPanel.add(ani_word);
			quesutionPanel.add(hazurebutton);
			quesutionPanel.add(ataributton);
			
			// ベースのパネルの設定
			// レイアウトをBorderLayoutに
			panel.setLayout(new BorderLayout());
			// ベースのパネルに各パーツが乗ったquesutionPanelをのせる
			panel.add(quesutionPanel, BorderLayout.CENTER);
			//パネルの一番上に問題のタイトルみたいなの(Fruits Question)書いとく
			JLabel ani_title = new JLabel("Animals Question");
			ani_title.setHorizontalAlignment(JLabel.CENTER);
			ani_title.setFont(new Font("Arial", Font.PLAIN, 20));
			panel.add(ani_title, BorderLayout.NORTH);
			menubutton = new JButton("Menu");
			menubutton.setActionCommand("1");
			menubutton.addActionListener(this);
			menubutton.setHorizontalAlignment(JLabel.CENTER);
			menubutton.setFont(new Font("Arial", Font.PLAIN, 20));
			menubutton.setMargin(new Insets(10, 0, 10, 0));
			nextPanel.add(menubutton);
			nextbutton = new JButton("Next");
			//nextbutton.setActionCommand("1");後で機能実装
			//nextbutton.addActionListener(this);
			nextbutton.setHorizontalAlignment(JLabel.CENTER);
			nextbutton.setFont(new Font("Arial", Font.PLAIN, 20));
			nextbutton.setMargin(new Insets(10, 0, 10, 0));
			nextPanel.add(nextbutton);
			panel.add(nextPanel, BorderLayout.SOUTH);

			break;
			
		case 4:
			GridBagLayout colorLayout = new GridBagLayout();
			quesutionPanel.setLayout(colorLayout);
			
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
			
			//quesutionPanelにかくパーツを登録
			quesutionPanel.add(col_question);
			quesutionPanel.add(col_word);
			quesutionPanel.add(hazurebutton);
			quesutionPanel.add(ataributton);
			
			// ベースのパネルの設定
			// レイアウトをBorderLayoutに
			panel.setLayout(new BorderLayout());
			// ベースのパネルに各パーツが乗ったquesutionPanelをのせる
			panel.add(quesutionPanel, BorderLayout.CENTER);
			//パネルの一番上に問題のタイトルみたいなの(Fruits Question)書いとく
			JLabel col_title = new JLabel("colors Question");
			col_title.setHorizontalAlignment(JLabel.CENTER);
			col_title.setFont(new Font("Arial", Font.PLAIN, 20));
			panel.add(col_title, BorderLayout.NORTH);
			//パネルの下のボタン
			menubutton = new JButton("Menu");
			menubutton.setActionCommand("1");
			menubutton.addActionListener(this);
			menubutton.setHorizontalAlignment(JLabel.CENTER);
			menubutton.setFont(new Font("Arial", Font.PLAIN, 20));
			menubutton.setMargin(new Insets(10, 0, 10, 0));
			nextPanel.add(menubutton);
			nextbutton = new JButton("Next");
			//nextbutton.setActionCommand("1");後で機能実装
			//nextbutton.addActionListener(this);
			nextbutton.setHorizontalAlignment(JLabel.CENTER);
			nextbutton.setFont(new Font("Arial", Font.PLAIN, 20));
			nextbutton.setMargin(new Insets(10, 0, 10, 0));
			nextPanel.add(nextbutton);
			panel.add(nextPanel, BorderLayout.SOUTH);

			break;			
		
		case 5:
			// ボタンを直接貼るパネル
			JPanel atariPanel = new JPanel();
			// パネルを[GridBagLayout]として作成
			GridBagLayout atariLayout = new GridBagLayout();
			atariPanel.setLayout(atariLayout);
			
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

			//panelにかくパーツを登録
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
			//パネルの下のボタン
			menubutton = new JButton("Menu");
			menubutton.setActionCommand("1");
			menubutton.addActionListener(this);
			menubutton.setHorizontalAlignment(JLabel.CENTER);
			menubutton.setFont(new Font("Arial", Font.PLAIN, 20));
			menubutton.setMargin(new Insets(10, 0, 10, 0));
			nextPanel.add(menubutton);
			nextbutton = new JButton("Next");
			//nextbutton.setActionCommand("1");後で機能実装
			//nextbutton.addActionListener(this);
			nextbutton.setHorizontalAlignment(JLabel.CENTER);
			nextbutton.setFont(new Font("Arial", Font.PLAIN, 20));
			nextbutton.setMargin(new Insets(10, 0, 10, 0));
			nextPanel.add(nextbutton);
			panel.add(nextPanel, BorderLayout.SOUTH);
		
			break;
			
		case 6:
			// ボタンを直接貼るパネル
			JPanel hazurePanel = new JPanel();
			// パネルを[GridBagLayout]として作成
			GridBagLayout hazureLayout = new GridBagLayout();
			hazurePanel.setLayout(hazureLayout);
			
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

			//panelにかくパーツを登録
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
			//パネルの下のボタン
			menubutton = new JButton("Menu");
			menubutton.setActionCommand("1");
			menubutton.addActionListener(this);
			menubutton.setHorizontalAlignment(JLabel.CENTER);
			menubutton.setFont(new Font("Arial", Font.PLAIN, 20));
			menubutton.setMargin(new Insets(10, 0, 10, 0));
			nextPanel.add(menubutton);
			nextbutton = new JButton("Next");
			//nextbutton.setActionCommand("1");後で機能実装
			//nextbutton.addActionListener(this);
			nextbutton.setHorizontalAlignment(JLabel.CENTER);
			nextbutton.setFont(new Font("Arial", Font.PLAIN, 20));
			nextbutton.setMargin(new Insets(10, 0, 10, 0));
			nextPanel.add(nextbutton);
			panel.add(nextPanel, BorderLayout.SOUTH);
		
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
