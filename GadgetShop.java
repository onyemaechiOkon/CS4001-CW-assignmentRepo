package gadgetshop;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import java.util.ArrayList;
import gadgetShop.Gadget;
import gadgetShop.MP3;
import gadgetShop.Mobile;

public class GadgetShop {

    private final ArrayList<Gadget> gadgets;
    private JFrame frame;

//    Initializing the textFields
    private JTextField modelField;
    private JTextField priceField;
    private JTextField weightField;
    private JTextField sizeField;
    private JTextField creditField;
    private JTextField memoryField;
    private JTextField phoneNoField;
    private JTextField durationField;
    private JTextField downloadSizeField;
    private JTextField displayNumberField;
    private JTextField memoryFreedField;


//    Initializing the buttons
    private JButton addMobileButton;
    private JButton addMP3Button;
    private JButton clearButton;
    private JButton displayAllButton;
    private JButton callButton;
    private JButton downloadMusicButton;    
    private JButton deleteMusicButton;


    public GadgetShop() {
        gadgets = new ArrayList<>();
        initializeGUI();
        addButtonListeners();
    }

    private void initializeGUI() {
        frame = new JFrame("Gadget Shop");
        frame.setSize(400, 1000);
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Declaring the buttons
        addMobileButton = new JButton("Add Mobile");
        addMP3Button = new JButton("Add MP3");
        clearButton = new JButton("Clear");
        displayAllButton = new JButton("Display All");
        callButton = new JButton("Make A Call");
        downloadMusicButton = new JButton("Download Music");
        deleteMusicButton = new JButton("Delete Music");
        addMobileButton.setPreferredSize(new Dimension(130, 25));
        addMP3Button.setPreferredSize(new Dimension(130, 25));
        clearButton.setPreferredSize(new Dimension(130, 25));
        displayAllButton.setPreferredSize(new Dimension(130, 25));
        callButton.setPreferredSize(new Dimension(130, 25));
        downloadMusicButton.setPreferredSize(new Dimension(130, 25));
        deleteMusicButton.setPreferredSize(new Dimension(130, 25));
        

        //        Initializing the labels
        JLabel modelLabel = new JLabel("Model: ");
        JLabel priceLabel = new JLabel("Price: ");
        JLabel weightLabel = new JLabel("Weight: ");
        JLabel sizeLabel = new JLabel("Size: ");
        JLabel creditLabel = new JLabel("Credit: ");
        JLabel memoryLabel = new JLabel("Available Memory: ");
        JLabel phoneNumberLabel = new JLabel("Phone No: ");
        JLabel durationLabel = new JLabel("Duration: ");
        JLabel downloadLabel = new JLabel("Download size: ");
        JLabel displayNumberLabel = new JLabel("Display Number: ");
        JLabel memoryFreed = new JLabel("Memory To Free: ");
        modelLabel.setPreferredSize(new Dimension(130, 25));
        priceLabel.setPreferredSize(new Dimension(130, 25));
        weightLabel.setPreferredSize(new Dimension(130, 25));
        sizeLabel.setPreferredSize(new Dimension(130, 25));
        creditLabel.setPreferredSize(new Dimension(130, 25));
        memoryLabel.setPreferredSize(new Dimension(130, 25));
        phoneNumberLabel.setPreferredSize(new Dimension(130, 25));
        durationLabel.setPreferredSize(new Dimension(130, 25));
        downloadLabel.setPreferredSize(new Dimension(130, 25));
        displayNumberLabel.setPreferredSize(new Dimension(130, 25));
        memoryFreed.setPreferredSize(new Dimension(130, 25));

        //        Initializing the text fields
        modelField = new JTextField();
        modelField.setPreferredSize(new Dimension(130, 25));
        priceField = new JTextField();
        priceField.setPreferredSize(new Dimension(130, 25));
        weightField = new JTextField();
        weightField.setPreferredSize(new Dimension(130, 25));
        sizeField = new JTextField();
        sizeField.setPreferredSize(new Dimension(130, 25));
        creditField = new JTextField();
        creditField.setPreferredSize(new Dimension(130, 25));
        memoryField = new JTextField();
        memoryField.setPreferredSize(new Dimension(130, 25));
        phoneNoField = new JTextField();
        phoneNoField.setPreferredSize(new Dimension(130, 25));
        durationField = new JTextField();
        durationField.setPreferredSize(new Dimension(130, 25));
        downloadSizeField = new JTextField();
        downloadSizeField.setPreferredSize(new Dimension(130, 25));
        displayNumberField = new JTextField();
        displayNumberField.setPreferredSize(new Dimension(130, 25));
        memoryFreedField = new JTextField();
        memoryFreedField.setPreferredSize(new Dimension(130, 25));

//        Adding the first row of components
        JPanel panel1 = new JPanel();
        panel1.add(modelLabel);
        panel1.add(priceLabel);
        panel1.add(weightLabel);
        panel1.add(sizeLabel);

        JPanel panel2 = new JPanel();
        panel2.add(modelField);
        panel2.add(priceField);
        panel2.add(weightField);
        panel2.add(sizeField);

        JPanel panel3 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panel3.add(creditLabel);
        panel3.add(memoryLabel);

        JPanel panel4 = new JPanel();
        panel4.add(creditField);
        panel4.add(memoryField);
        panel4.add(addMobileButton);
        panel4.add(addMP3Button);

        JPanel panel5 = new JPanel();
        panel5.add(phoneNumberLabel);
        panel5.add(durationLabel);
        panel5.add(downloadLabel);
        panel5.add(displayNumberLabel);

        JPanel panel6 = new JPanel();
        panel6.add(phoneNoField);
        panel6.add(durationField);
        panel6.add(downloadSizeField);
        panel6.add(displayNumberField);

        JPanel panel7 = new JPanel();
        panel7.add(memoryFreedField);
        panel7.add(deleteMusicButton);
        panel7.add(callButton);
        panel7.add(downloadMusicButton);

        JPanel panel8 = new JPanel();
        panel8.add(clearButton);
        panel8.add(displayAllButton);
        
        JPanel panel9 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panel9.add(memoryFreed);
        
        
        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);
        frame.add(panel4);
        frame.add(panel8);
        frame.add(panel5);
        frame.add(panel6);
        frame.add(panel9);
        frame.add(panel7);
        frame.add(Box.createRigidArea(new Dimension(0, 10)));
    }

    private void addButtonListeners() {
        addMobileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String model = modelField.getText();
                    String priceText = priceField.getText();
                    String weightText = weightField.getText();
                    String size = sizeField.getText();
                    String creditText = creditField.getText();

                    if (model.isEmpty() || priceText.isEmpty() || weightText.isEmpty() || size.isEmpty() || creditText.isEmpty()) {
                        JOptionPane.showMessageDialog(frame, "Fill in all fields.", "Error", JOptionPane.ERROR_MESSAGE);
                    } else {
                        float price = Float.parseFloat(priceText);
                        int weight = Integer.parseInt(weightText);
                        int callingCredit = Integer.parseInt(creditText);

                        addMobile(model, price, weight, size, callingCredit);
                        JOptionPane.showMessageDialog(frame, "Mobile gadget added successfully", "Success", JOptionPane.PLAIN_MESSAGE);
                        clearFields();
                    }

                } catch (NumberFormatException err) {
                    JOptionPane.showMessageDialog(frame, "Enter a valid number", "Error", JOptionPane.ERROR_MESSAGE);
                    throw new NumberFormatException("Invalid number input");
                }

            }
        });

        addMP3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String model = modelField.getText();
                    String priceText = priceField.getText();
                    String weightText = weightField.getText();
                    String size = sizeField.getText();
                    String memoryText = memoryField.getText();

                    if (model.isEmpty() || priceText.isEmpty() || weightText.isEmpty() || size.isEmpty() || memoryText.isEmpty()) {
                        JOptionPane.showMessageDialog(frame, "Fill in all fields.", "Error", JOptionPane.ERROR_MESSAGE);
                    } else {
                        float price = Float.parseFloat(priceText);
                        int weight = Integer.parseInt(weightText);
                        int availableMemory = Integer.parseInt(memoryText);

                        addMP3(model, price, weight, size, availableMemory);
                        JOptionPane.showMessageDialog(frame, "MP3 gadget added successfully", "Success", JOptionPane.PLAIN_MESSAGE);
                        clearFields();
                    }

                } catch (NumberFormatException err) {
                    JOptionPane.showMessageDialog(frame, "Enter a valid number", "Error", JOptionPane.ERROR_MESSAGE);
                    throw new NumberFormatException("Invalid number input");
                }

            }
        });

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clearFields();
            }
        });

        displayAllButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayAll();
            }
        });

        callButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Integer displayNumber = getDisplayNumber();
                if (displayNumber != -1) {
                    try {
                        String phoneNumberText = phoneNoField.getText();
                        String durationText = durationField.getText();

                        if (phoneNumberText.isEmpty() || durationText.isEmpty()) {
                            JOptionPane.showMessageDialog(frame, "Phone Number and duration required to make a call.", "Error", JOptionPane.ERROR_MESSAGE);
                        } else {
                            Integer duration = Integer.valueOf(durationText);
                            makeCall(displayNumber, phoneNumberText, duration);
                        }
                    } catch (NumberFormatException err) {
                        JOptionPane.showMessageDialog(frame, "Enter a valid parameters to make a call", "Error", JOptionPane.ERROR_MESSAGE);
                        throw new NumberFormatException("Invalid number input");
                    }
                } else {
                    JOptionPane.showMessageDialog(frame, "Enter a valid display number", "Error", JOptionPane.ERROR_MESSAGE);

                }
            }
        });

        downloadMusicButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Integer displayNumber = getDisplayNumber();
                if (displayNumber != -1) {
                    try {
                        String downloadSizeText = downloadSizeField.getText();

                        if (downloadSizeText.isEmpty()) {
                            JOptionPane.showMessageDialog(frame, "Download size is required to download music.", "Error", JOptionPane.ERROR_MESSAGE);
                        } else {
                            Integer downloadSize = Integer.valueOf(downloadSizeText);
                            downloadMusic(displayNumber, downloadSize);
                        }
                    } catch (NumberFormatException err) {
                        JOptionPane.showMessageDialog(frame, "Enter a valid download size.", "Error", JOptionPane.ERROR_MESSAGE);
                        throw new NumberFormatException("Invalid number input");
                    }
                } else {
                    JOptionPane.showMessageDialog(frame, "Enter a valid display number", "Error", JOptionPane.ERROR_MESSAGE);

                }
            }
        });
        
        deleteMusicButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Integer displayNumber = getDisplayNumber();
                if (displayNumber != -1) {
                    try {
                        String memoryFreedText = memoryFreedField.getText();

                        if (memoryFreedText.isEmpty()) {
                            JOptionPane.showMessageDialog(frame, "Music size is required to delete music.", "Error", JOptionPane.ERROR_MESSAGE);
                        } else {
                            Integer memoryFreed = Integer.valueOf(memoryFreedText);
                            deleteMusic(displayNumber, memoryFreed);
                        }
                    } catch (NumberFormatException err) {
                        JOptionPane.showMessageDialog(frame, "Enter a valid memory to free.", "Error", JOptionPane.ERROR_MESSAGE);
                        throw new NumberFormatException("Invalid number input");
                    }
                } else {
                    JOptionPane.showMessageDialog(frame, "Enter a valid display number", "Error", JOptionPane.ERROR_MESSAGE);

                }
            }
        });
    }

    private int getDisplayNumber() {
        int displayNumber = -1;

        try {
            String displayNumberText = displayNumberField.getText();
            if (!displayNumberText.isEmpty()) {
                Integer displayNumberInput = Integer.valueOf(displayNumberText);

                if (displayNumberInput < 0 || displayNumberInput >= gadgets.size()) {
                    JOptionPane.showMessageDialog(frame, "Display number out of range", "Error", JOptionPane.ERROR_MESSAGE);

                } else {
                    displayNumber = displayNumberInput;
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame, "Enter a valid display number", "Error", JOptionPane.ERROR_MESSAGE);
            throw new NumberFormatException("Invalid display number input");
        }
        return displayNumber;
    }

    private void clearFields() {
        modelField.setText("");
        priceField.setText("");
        weightField.setText("");
        sizeField.setText("");
        creditField.setText("");
        memoryField.setText("");
        phoneNoField.setText("");
        durationField.setText("");
        downloadSizeField.setText("");
        displayNumberField.setText("");
    }

    public void addMobile(String model, float price, int weight, String size, int callingCredit) {
        Mobile mobile = new Mobile(model, price, weight, size, callingCredit);
        gadgets.add(mobile);
    }

    public void addMP3(String model, float price, int weight, String size, int availableMemory) {
        MP3 mp3 = new MP3(model, price, weight, size, availableMemory);
        gadgets.add(mp3);
    }

    public void displayAll() {
        for (int i = 0; i < gadgets.size(); i++) {
            System.out.println("Display Number: " + i);
            gadgets.get(i).display();
        }
    }

    public void makeCall(int displayNumber, String phoneNumber, int duration) {
        Gadget gadget = gadgets.get(displayNumber);
        if (gadget instanceof Mobile) {
            Mobile mobile = (Mobile) gadget;
            mobile.makeCall(phoneNumber, duration);
        } else {
            JOptionPane.showMessageDialog(frame, "Invalid gadget type for making a call.", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println("Invalid gadget type for making a call.");
        }
    }

    public void downloadMusic(int displayNumber, int downloadSize) {
        Gadget gadget = gadgets.get(displayNumber);
        if (gadget instanceof MP3) {
            MP3 mp3 = (MP3) gadget;
            mp3.downloadMusic(downloadSize);
        } else {
            JOptionPane.showMessageDialog(frame, "Invalid gadget type for downloading music.", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println("Invalid gadget type for downloading music.");
        }
    }
    
    public void deleteMusic(int displayNumber, int memoryFreed) {
        Gadget gadget = gadgets.get(displayNumber);
        if (gadget instanceof MP3) {
            MP3 mp3 = (MP3) gadget;
            mp3.deleteMusic(memoryFreed);
        } else {
            JOptionPane.showMessageDialog(frame, "Invalid gadget type for deleting music.", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println("Invalid gadget type for deleting music.");
        }
    }

    public void displayGUI() {
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        GadgetShop shop = new GadgetShop();
        shop.displayGUI();
    }
}
