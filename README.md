# Dungeon Fighter

Dungeon Fighter is a board game themed around [South Park: The Stick of Truth](https://www.southparkstudios.com.br/w/index.php/South_Park:_The_Stick_of_Truth) designed with Java Swing made by Guilherme Ganassini, Lorenzo Saldanha e Gustavo Domenech for "Object Oriented Programming" course at Federal University of Pelotas.

## Screenshots

### MenuPanel
![Menu](assets/screenshots/menu.png)
### SelectHeroPanel
![SelectHero](assets/screenshots/select_hero.png)
### BattlePanel
![Battle](assets/screenshots/battle.png)
![Battle-2](assets/screenshots/battle_2.png)
### GamePanel
![Board](assets/screenshots/board.png)
### others
![Game won](assets/screenshots/game_won.png)
![Game lost](assets/screenshots/game_over.png)

## Libraries

* [javax.swing.SwingUtilities](https://docs.oracle.com/en/java/javase/17/docs/api/java.desktop/javax/swing/SwingUtilities.html)
* [javax.swing.JFrame](https://docs.oracle.com/en/java/javase/22/docs/api/java.desktop/javax/swing/JFrame.html)
* [javax.swing.WindowConstants.EXITONFAILURE](https://docs.oracle.com/en/java/javase/22/docs/api/java.desktop/javax/swing/WindowConstants.html)
* [javax.swing.JFrame.setDefaultCloseOperation()](https://docs.oracle.com/en/java/javase/22/docs/api/java.desktop/javax/swing/JFrame.html#setDefaultCloseOperation(int))
* [javax.swing.JPanel](https://docs.oracle.com/en/java/javase/22/docs/api/java.desktop/javax/swing/JPanel.html)
* [javax.swing.JLabel](https://docs.oracle.com/en/java/javase/22/docs/api/java.desktop/javax/swing/JLabel.html)
* [javax.swing.JButton](https://docs.oracle.com/en/java/javase/22/docs/api/java.desktop/javax/swing/JButton.html)
* [javax.swing.AbstractButton](https://docs.oracle.com/en/java/javase/22/docs/api/java.desktop/javax/swing/AbstractButton.html)
* [javax.swing.AbstractButton.addActionListener(ActionListener l)](https://docs.oracle.com/en/java/javase/22/docs/api/java.desktop/java/awt/Button.html#addActionListener(java.awt.event.ActionListener))
* [javax.swing,Jcomponent](https://docs.oracle.com/en/java/javase/22/docs/api/java.desktop/javax/swing/JComponent.html)
* [javax.swing.JComponent.paintComponent()](https://docs.oracle.com/en/java/javase/22/docs/api/java.desktop/javax/swing/JComponent.html#paintComponent(java.awt.Graphics))
* [javax.swing.JPanel.setBackground()](https://docs.oracle.com/en/java/javase/22/docs/api/java.desktop/javax/swing/JComponent.html#setBackground(java.awt.Color))
* [javax.swing.plaf.basic.BasicToolTopUI](javax.swing.plaf.basic.BasicToolTipUI)
* [javax.swing.plaf.basic.BasicToolTopUI.getPreferredSize()](https://docs.oracle.com/javase/8/docs/api/javax/swing/plaf/basic/BasicToolTipUI.html#getPreferredSize-javax.swing.JComponent-)
* [java.awt.Window](https://docs.oracle.com/en/java/javase/22/docs/api/java.desktop/java/awt/Window.html)
* [java.awt.Window.pack()](https://docs.oracle.com/en/java/javase/22/docs/api/java.desktop/java/awt/Window.html#pack())
* [java.awt.Window.setVisible()](https://docs.oracle.com/en/java/javase/22/docs/api/java.desktop/java/awt/Window.html#setVisible(boolean))
* [java.awt.Container](https://docs.oracle.com/en/java/javase/22/docs/api/java.desktop/java/awt/Container.html)
* [java.awt.Container.add()](https://docs.oracle.com/en/java/javase/22/docs/api/java.desktop/java/awt/Container.html#add(java.awt.Component))
* [java.awt.Container.setLayout()](https://docs.oracle.com/en/java/javase/22/docs/api/java.desktop/java/awt/Container.html#setLayout(java.awt.LayoutManager))
* [java.awt.CardLayout](https://docs.oracle.com/en/java/javase/22/docs/api/java.desktop/java/awt/CardLayout.html)
* [java.awt.CardLayout.show()](https://docs.oracle.com/en/java/javase/22/docs/api/java.desktop/java/awt/CardLayout.html#show(java.awt.Container,java.lang.String))
* [java.awt.Graphics](https://docs.oracle.com/en/java/javase/22/docs/api/java.desktop/java/awt/Graphics.html)
* [java.awt.Image](https://docs.oracle.com/en/java/javase/22/docs/api/java.desktop/java/awt/image/package-summary.html)
* [java.awt.Graphics.drawImage(Image img, int x, int y, int width, int height, ImageObserver observer)](https://docs.oracle.com/en/java/javase/22/docs/api/java.desktop/java/awt/Graphics.html#drawImage(java.awt.Image,int,int,int,int,java.awt.image.ImageObserver))
* [java.awt.Dimension](https://docs.oracle.com/en/java/javase/22/docs/api/java.desktop/java/awt/Dimension.html)
* [java.awt.GridBagLayout](https://docs.oracle.com/en/java/javase/22/docs/api/java.desktop/java/awt/GridBagLayout.html)
* [java.awt.GridBagConstraints](https://docs.oracle.com/en/java/javase/22/docs/api/java.desktop/java/awt/GridBagConstraints.html)
* [GridBagConstraints.RELATIVE](https://docs.oracle.com/en/java/javase/22/docs/api/java.desktop/java/awt/GridBagConstraints.html#RELATIVE)
* [java.awt.Insets(int top, int left, int bottom, int right)](https://docs.oracle.com/en/java/javase/22/docs/api/java.desktop/java/awt/Insets.html)
* [javax.imageio.ImageIO](https://docs.oracle.com/en/java/javase/22/docs/api/java.desktop/javax/imageio/ImageIO.html)
* [javax.imageio.ImageIO.read(File input)](https://docs.oracle.com/en/java/javase/22/docs/api/java.desktop/javax/imageio/ImageIO.html#read(java.io.File))
* [java.io.File](https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/io/File.html)
* [java.io.IOException](https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/io/IOException.html)
* [java.io.IOException.printStackTrace()](https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/lang/Throwable.html#printStackTrace())
* [java.util.concurrent.ThreadLocalRandom](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/ThreadLocalRandom.html)

































