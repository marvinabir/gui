package Data;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame implements ActionListener {
    private JTextField textForEncryptionField;
    private JTextField encryptionKeyField;
    private JTextField textForDecryptionField;
    private JTextField decryptionKeyField;
    private JButton encryptButton;
    private JButton decryptButton;
    private JButton chatButton;
    private JButton logoutButton;
    private JButton fileTransferButton;

    public Main() {
        setTitle("Data Encryption System");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout()); // Use BorderLayout for main container

        // Top panel for chat and logout buttons
        JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT)); // Panel for chat and logout buttons
        chatButton = new JButton("Chat");
        chatButton.addActionListener(this);
        topPanel.add(chatButton);
        logoutButton = new JButton("Logout");
        logoutButton.addActionListener(this);
        topPanel.add(logoutButton);
        add(topPanel, BorderLayout.NORTH); // Add to top of the main container

        // Center panel for main content
        JPanel centerPanel = new JPanel(new GridBagLayout()); // Use GridBagLayout for center panel
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5); // Add some spacing between components

        // Text for encryption field
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        centerPanel.add(new JLabel("Text for Encryption:"), gbc);

        gbc.gridx = 1;
        gbc.gridwidth = 3; // Span three columns
        gbc.fill = GridBagConstraints.HORIZONTAL; // Allow horizontal resizing
        textForEncryptionField = new JTextField();
        textForEncryptionField.setPreferredSize(new Dimension(300, 30)); // Fixed size
        centerPanel.add(textForEncryptionField, gbc);

        // Encryption key field
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        centerPanel.add(new JLabel("Encryption Key:"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridwidth = 3; // Span three columns
        gbc.fill = GridBagConstraints.HORIZONTAL; // Allow horizontal resizing
        encryptionKeyField = new JTextField();
        encryptionKeyField.setPreferredSize(new Dimension(300, 20)); // Fixed size
        centerPanel.add(encryptionKeyField, gbc);

        // Encrypt button
        gbc.gridx = 4;
        gbc.gridy = 1; // Align with encryption key field
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.NONE; // Reset fill mode
        encryptButton = new JButton("Encrypt");
        encryptButton.addActionListener(this);
        centerPanel.add(encryptButton, gbc);

        // Text for decryption field
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.NONE; // Reset fill mode
        centerPanel.add(new JLabel("Text for Decryption:"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.gridwidth = 3; // Span three columns
        gbc.fill = GridBagConstraints.HORIZONTAL; // Allow horizontal resizing
        textForDecryptionField = new JTextField();
        textForDecryptionField.setPreferredSize(new Dimension(300, 30)); // Fixed size
        centerPanel.add(textForDecryptionField, gbc);

        // Decryption key field
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        centerPanel.add(new JLabel("Decryption Key:"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.gridwidth = 3; // Span three columns
        gbc.fill = GridBagConstraints.HORIZONTAL; // Allow horizontal resizing
        decryptionKeyField = new JTextField();
        decryptionKeyField.setPreferredSize(new Dimension(300, 20)); // Fixed size
        centerPanel.add(decryptionKeyField, gbc);

        // Decrypt button
        gbc.gridx = 4;
        gbc.gridy = 3; // Align with decryption key field
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.NONE; // Reset fill mode
        decryptButton = new JButton("Decrypt");
        decryptButton.addActionListener(this);
        centerPanel.add(decryptButton, gbc);

        add(centerPanel, BorderLayout.CENTER); // Add to center of the main container

        // Bottom panel for file transfer button
        JPanel bottomPanel = new JPanel(new FlowLayout(FlowLayout.CENTER)); // Panel for file transfer button
        fileTransferButton = new JButton("File Transfer");
        fileTransferButton.addActionListener(this);
        bottomPanel.add(fileTransferButton);
        add(bottomPanel, BorderLayout.SOUTH); // Add to bottom of the main container

        pack(); // Pack components to fit preferred sizes
        setLocationRelativeTo(null); // Center the window
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == encryptButton) {
            // Perform encryption
            String textForEncryption = textForEncryptionField.getText();
            String encryptionKey = encryptionKeyField.getText();
            // Placeholder for actual encryption logic
            JOptionPane.showMessageDialog(this, "Encryption performed!");
        } else if (e.getSource() == decryptButton) {
            // Perform decryption
            String textForDecryption = textForDecryptionField.getText();
            String decryptionKey = decryptionKeyField.getText();
            // Placeholder for actual decryption logic
            JOptionPane.showMessageDialog(this, "Decryption performed!");
        } else if (e.getSource() == chatButton) {
            // Handle chat button action
            JOptionPane.showMessageDialog(this, "Opening chat...");
        } else if (e.getSource() == logoutButton) {
            // Handle logout button action
            JOptionPane.showMessageDialog(this, "Logging out...");
        } else if (e.getSource() == fileTransferButton) {
            // Handle file transfer button action
            JOptionPane.showMessageDialog(this, "File Transfer initiated...");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Main main = new Main();
            main.setVisible(true);
        });
    }
}
