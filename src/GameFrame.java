import javax.swing.*;

public class GameFrame extends JFrame {
    private GamePanel gamePanel;

    GameFrame() {
        gamePanel = new GamePanel(); // Initialize gamePanel
        this.add(gamePanel);
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);

        // Create a JMenuBar
        JMenuBar menuBar = new JMenuBar();

        // Create a JMenu
        JMenu optionsMenu = new JMenu("Options");

        // Create a JMenuItem for reset
        JMenuItem resetMenuItem = new JMenuItem("Reset");
        resetMenuItem.addActionListener(e -> gamePanel.restartGame());

        // Add reset JMenuItem to the JMenu
        optionsMenu.add(resetMenuItem);

        // Add the JMenu to the JMenuBar
        menuBar.add(optionsMenu);

        // Set the JMenuBar for the JFrame
        this.setJMenuBar(menuBar);
    }
}
