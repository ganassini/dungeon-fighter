package ui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.plaf.basic.BasicToolTipUI;
import javax.swing.AbstractButton;
import java.awt.Window;
import java.awt.CardLayout;
import java.awt.Graphics;
import java.awt.Dimension;
import java.awt.Container;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;

public class GamePanel {
	private static JPanel pGame = new JPanel();
    private static JButton btnBack = new JButton("Back to Main Menu");

    static {
        /* panel layout */
        pGame.setBackground(Color.BLACK);
        pGame.add(new JLabel("Game Screen"));
        /* panel buttons*/
        pGame.add(btnBack);
    }

	public static JPanel getPanel() {
        return pGame;
    }

    public static JButton getBtn(String btnName) {
		return btnBack;
	}
}
