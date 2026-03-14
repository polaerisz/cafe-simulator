import java.awt.EventQueue;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.CardLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.JOptionPane;

public class pawfectBrew extends JFrame {

	private static final long serialVersionUID = 1L;

	private JPanel contentPane;



	// DRINK TEXTFIELDS
	private JTextField txtEspresso;
	private JTextField txtAmericano;
	private JTextField txtCapuccino;
	private JTextField txtCaramel;

	// NON-CAFFEINE TEXTFIELDS
	private JTextField txthotChoco;
	private JTextField txtMatcha;
	private JTextField txtStrawberry;
	private JTextField txtLemonade;

	// PASTRIES TEXTFIELDS
	private JTextField txtCroissant;
	private JTextField txtChocoCroissant;
	private JTextField txtMuffin;
	private JTextField txtBananaBread;
	private JTextField txtCinammon;

	// DESSERTS TEXTFIELDS
	private JTextField txtCheeseCake;
	private JTextField txtChocoCake;
	private JTextField txtBrownies;
	private JTextField txtDonut;
	private JTextField txtIceCream;

	// ADD-ONS TEXTFIELDS
	private JTextField txtExtraShot;
	private JTextField txtExtraSyrup;
	private JTextField txtWhippedCream;
	private JTextField txtExtraIce;
	private JTextField txtUpgrade;

	// DRINK CHECKBOXES
	private JCheckBox cbEspresso;
	private JCheckBox cbAmericano;
	private JCheckBox cbCapuccino;
	private JCheckBox cbCaramelMac;

	// NON-CAFFEINE CHECKBOXES
	private JCheckBox cbChocolate;
	private JCheckBox cbMatcha;
	private JCheckBox cbStrawberryMilk;
	private JCheckBox cbLemonade;

	// PASTRIES CHECKBOXES
	private JCheckBox cbCroissant;
	private JCheckBox cbChocolateCroissant;
	private JCheckBox cbBlueberryMuffin;
	private JCheckBox cbBananaBread;
	private JCheckBox cbCinammon;

	// DESSERTS CHECKBOXES
	private JCheckBox cbCheesecake;
	private JCheckBox cbChocCake;
	private JCheckBox cbBrownies;
	private JCheckBox cbDonut;
	private JCheckBox cbIceCream;

	// ADD-ONS CHECKBOXES
	private JCheckBox cbExtraShot;
	private JCheckBox cbExtraSyrup;
	private JCheckBox cbWhippedCream;
	private JCheckBox cbExtraIce;
	private JCheckBox cbUpgrade;

	// DISCOUNT RADIO BUTTONS
	private final ButtonGroup discountGroup = new ButtonGroup();
	
	
	// DRINK PRICES
	double priceEspresso = 120;
	double priceAmericano = 130;
	double priceCappuccino = 140;
	double priceCaramelMac = 150;

	// NON CAFFEINE
	double priceHotChoco = 120;
	double priceMatcha = 135;
	double priceStrawberry = 125;
	double priceLemonade = 110;

	// PASTRIES
	double priceCroissant = 90;
	double priceChocoCroissant = 100;
	double priceMuffin = 95;
	double priceBananaBread = 85;
	double priceCinnamon = 100;

	// DESSERTS
	double priceCheesecake = 150;
	double priceChocoCake = 140;
	double priceBrownies = 120;
	double priceDonut = 70;
	double priceIceCream = 80;

	// ADD-ONS
	double priceExtraShot = 40;
	double priceExtraSyrup = 25;
	double priceWhippedCream = 30;
	double priceExtraIce = 10;
	double priceLarge = 50;
	
	// Button For Back
	private JButton btnBack;
	
	// CASH PAYMENT LBL AND FIELD
	private JLabel lblCashPayment;
	private JTextField txtCash;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
	    EventQueue.invokeLater(new Runnable() {
	        public void run() {
	            try {
	                pawfectBrew frame = new pawfectBrew();
	                frame.setVisible(true);
	            } catch (Exception e) {
	                e.printStackTrace();
	            }
	        }
	    });
	}


	/**
	 * Create the frame.
	 */
	public pawfectBrew() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\rachel\\eclipze-workspace\\Cafe System\\resources\\icon.png")); // App icon
		setFont(new Font("Arial", Font.PLAIN, 12));
		setTitle("Pawfect Brew");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 575, 539);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(251, 239, 225));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel headers = new JPanel();
		headers.setBackground(new Color(251, 239, 225));
		headers.setBounds(-15, 4, 579, 225);
		contentPane.add(headers);
		headers.setLayout(null);
		
		ImageIcon logo = new ImageIcon("C:\\Users\\rachel\\eclipze-workspace\\Cafe System\\resources\\pawfectTitle2.png"); //Picture header
		JLabel imageTitle = new JLabel(logo);
		imageTitle.setBackground(new Color(251, 239, 225));
		imageTitle.setBounds(-20, -12, 640, 165);

		headers.add(imageTitle);
		
		JLabel menuTitle = new JLabel(new ImageIcon("C:\\Users\\rachel\\eclipze-workspace\\Cafe System\\resources\\menuLabel.png"));
		menuTitle.setBounds(161, 148, 252, 56);
		headers.add(menuTitle);
		menuTitle.setBackground(new Color(251, 239, 225));
		
		JPanel menu = new JPanel();
		menu.setBackground(new Color(251, 239, 225));
		menu.setBounds(10, 239, 541, 289);
		contentPane.add(menu);
		menu.setLayout(null);
		
		JPanel select = new JPanel();
		select.setBackground(new Color(251, 239, 225));
		select.setBounds(0, 0, 541, 289);
		menu.add(select);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(251, 239, 225));
		panel.setLayout(null);
		
		ImageIcon coffeeIcon = new ImageIcon("C:\\Users\\rachel\\eclipze-workspace\\Cafe System\\resources\\coffeeIcon.png");

		Image coffeeImg = coffeeIcon.getImage();
		Image scaledCoffeeImg = coffeeImg.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
		ImageIcon scaledCoffeeIcon = new ImageIcon(scaledCoffeeImg);

		JLabel menuDrinksIcon = new JLabel(scaledCoffeeIcon);
		menuDrinksIcon.setBackground(new Color(251, 239, 225));
		menuDrinksIcon.setBounds(108, 10, 50, 50);

		panel.add(menuDrinksIcon);
		
		JButton btnDrinks = new JButton("Drinks");
		btnDrinks.setForeground(new Color(124, 81, 60));
		btnDrinks.setFont(new Font("Arial Black", Font.PLAIN, 10));
		btnDrinks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cl = (CardLayout) select.getLayout();
				cl.show(select, "drinksPanel");	
			}
		});
		btnDrinks.setBackground(new Color(245, 211, 210));
		btnDrinks.setBounds(98, 70, 73, 20);
		panel.add(btnDrinks);
		

		ImageIcon pastryIcon = new ImageIcon("C:\\Users\\rachel\\eclipze-workspace\\Cafe System\\resources\\dessertsIcon.png");
		Image pastryImg = pastryIcon.getImage();
		Image scaledPastryImg = pastryImg.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
		ImageIcon scaledPastryIcon = new ImageIcon(scaledPastryImg);
		
		JPanel receipt = new JPanel();

		JLabel menuPastryIcon = new JLabel(scaledPastryIcon);
		menuPastryIcon.setBackground(new Color(251, 239, 225));
		menuPastryIcon.setBounds(242, 10, 50, 50);

		panel.add(menuPastryIcon);

		
		JButton btnPastry = new JButton("Pastry");
		btnPastry.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cl = (CardLayout) select.getLayout();
				cl.show(select, "pastriesPanel");
			}
		});
		btnPastry.setForeground(new Color(124, 81, 60));
		btnPastry.setFont(new Font("Arial Black", Font.PLAIN, 10));
		btnPastry.setBackground(new Color(245, 211, 210));
		btnPastry.setBounds(216, 70, 103, 20);
		panel.add(btnPastry);
		




		JButton btnAddOns = new JButton("Add-Ons");
		btnAddOns.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cl = (CardLayout) select.getLayout();
				cl.show(select, "addonsPanel");
			}
		});
		btnAddOns.setForeground(new Color(124, 81, 60));
		btnAddOns.setFont(new Font("Arial Black", Font.PLAIN, 10));
		btnAddOns.setBackground(new Color(245, 211, 210));
		btnAddOns.setBounds(356, 70, 85, 20);

		panel.add(btnAddOns);

		


		
		
		
		
	
		ImageIcon optionalIcon = new ImageIcon("C:\\Users\\rachel\\eclipze-workspace\\Cafe System\\resources\\optionalIcon.png");
		Image optionalImg = optionalIcon.getImage();
		Image scaledOptionalImg = optionalImg.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
		ImageIcon scaledOptionalIcon = new ImageIcon(scaledOptionalImg);


		JLabel menuAddOnsIcon = new JLabel(scaledOptionalIcon);
		menuAddOnsIcon.setBounds(373, 10, 50, 50);
		menuAddOnsIcon.setBackground(new Color(251, 239, 225));
		panel.add(menuAddOnsIcon);


		CardLayout cardLayout = new CardLayout(0, 0);
		select.setLayout(cardLayout);
		select.add(panel, "mainMenu");
		
		JButton btnReview = new JButton("Review Your Order");
		btnReview.setForeground(new Color(124, 81, 60));
		btnReview.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cl = (CardLayout) select.getLayout();
				cl.show(select, "receiptPanel");
			}
		});
		btnReview.setFont(new Font("Arial Black", Font.BOLD, 10));
		btnReview.setBackground(new Color(241, 202, 196));
		btnReview.setBounds(164, 147, 211, 29);
		panel.add(btnReview);
		
		JLabel corgiIcon = new JLabel(new ImageIcon("C:\\Users\\rachel\\eclipze-workspace\\Cafe System\\resources\\dawgIcon.png"));
		corgiIcon.setBackground(new Color(251, 239, 225));
		corgiIcon.setBounds(226, 100, 93, 50);
		panel.add(corgiIcon);
		
		JPanel receipts = new JPanel();
		receipts.setBackground(new Color(251, 239, 225));
		select.add(receipts, "receiptPanel");
		receipts.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(10, 10, 273, 223);
		receipts.add(scrollPane);
		
		JTextArea txtReceipt = new JTextArea();
		txtReceipt.setEditable(false);
		txtReceipt.setFont(new Font("Arial", Font.PLAIN, 9));
		txtReceipt.setWrapStyleWord(true);
		txtReceipt.setLineWrap(true);
		scrollPane.setViewportView(txtReceipt);
		
		JLabel lblDiscount = new JLabel("Discount");
		lblDiscount.setHorizontalAlignment(SwingConstants.LEFT);
		lblDiscount.setForeground(new Color(74, 45, 32));
		lblDiscount.setFont(new Font("Arial", Font.BOLD, 14));
		lblDiscount.setBackground(new Color(204, 105, 89));
		lblDiscount.setBounds(293, 22, 120, 12);
		receipts.add(lblDiscount);
		
		JRadioButton rdStudent = new JRadioButton("Student Discount (10%)");
		rdStudent.setFont(new Font("Tahoma", Font.BOLD, 10));
		rdStudent.setBackground(new Color(248, 216, 213));
		discountGroup.add(rdStudent);
		rdStudent.setBounds(290, 40, 192, 20);
		receipts.add(rdStudent);
		
		JRadioButton rdSenior = new JRadioButton("Senior Citizen Discount (20%)");
		rdSenior.setFont(new Font("Tahoma", Font.BOLD, 10));
		rdSenior.setBackground(new Color(248, 216, 213));
		discountGroup.add(rdSenior);
		rdSenior.setBounds(290, 62, 192, 20);
		receipts.add(rdSenior);
		
		JRadioButton rdNone = new JRadioButton("None");
		rdNone.setSelected(true);
		rdNone.setFont(new Font("Tahoma", Font.BOLD, 10));
		rdNone.setBackground(new Color(248, 216, 213));
		discountGroup.add(rdNone);
		rdNone.setBounds(290, 84, 192, 20);
		receipts.add(rdNone);
		
		JLabel lblActions = new JLabel("Proceed..");
		lblActions.setHorizontalAlignment(SwingConstants.LEFT);
		lblActions.setForeground(new Color(74, 45, 32));
		lblActions.setFont(new Font("Arial", Font.BOLD, 14));
		lblActions.setBackground(new Color(204, 105, 89));
		lblActions.setBounds(293, 117, 120, 12);
		receipts.add(lblActions);
		
		JButton btnCompute = new JButton("Compute Total");
		btnCompute.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
						double subtotal = 0;
						String receipt = "===== Pawfect Brew Receipt =====\n\n";
						try {

							// Caffeine Drinks
							if(cbEspresso.isSelected()) {
								int qty = Integer.parseInt(txtEspresso.getText());
								double total = qty * priceEspresso;
								subtotal += total;
								receipt += "Espresso x" + qty + " = ₱" + total + "\n";
							}

							if(cbAmericano.isSelected()) {
								int qty = Integer.parseInt(txtAmericano.getText());
								double total = qty * priceAmericano;
								subtotal += total;
								receipt += "Americano x" + qty + " = ₱" + total + "\n";
							}

							if(cbCapuccino.isSelected()) {
								int qty = Integer.parseInt(txtCapuccino.getText());
								double total = qty * priceCappuccino;
							subtotal += total;
								receipt += "Cappuccino x" + qty + " = ₱" + total + "\n";
							}

							if(cbCaramelMac.isSelected()) {
								int qty = Integer.parseInt(txtCaramel.getText());
								double total = qty * priceCaramelMac;
								subtotal += total;
								receipt += "Caramel Macchiato x" + qty + " = ₱" + total + "\n";
							}

							// Non Caffeine
							if(cbChocolate.isSelected()) {
								int qty = Integer.parseInt(txthotChoco.getText());
								double total = qty * priceHotChoco;
								subtotal += total;
								receipt += "Hot Chocolate x" + qty + " = ₱" + total + "\n";
							}

							if(cbMatcha.isSelected()) {
								int qty = Integer.parseInt(txtMatcha.getText());
								double total = qty * priceMatcha;
								subtotal += total;
								receipt += "Matcha Latte x" + qty + " = ₱" + total + "\n";
							}

							if(cbStrawberryMilk.isSelected()) {
								int qty = Integer.parseInt(txtStrawberry.getText());
								double total = qty * priceStrawberry;
								subtotal += total;
								receipt += "Strawberry Milk x" + qty + " = ₱" + total + "\n";
							}

							if(cbLemonade.isSelected()) {
								int qty = Integer.parseInt(txtLemonade.getText());
								double total = qty * priceLemonade;
								subtotal += total;
								receipt += "Lemonade x" + qty + " = ₱" + total + "\n";
							}
							
							// Pastries
							if(cbCroissant.isSelected()) {
								int qty = Integer.parseInt(txtCroissant.getText());
								double total = qty * priceCroissant;
								subtotal += total;
								receipt += "Croissant (Plain) x" + qty + " = ₱" + total + "\n";
							}
							if(cbChocolateCroissant.isSelected()) {
							    int qty = Integer.parseInt(txtChocoCroissant.getText());
							    double total = qty * priceChocoCroissant;
							    subtotal += total;
							    receipt += "Chocolate Croissant x" + qty + " = ₱" + total + "\n";
							}

							if(cbBlueberryMuffin.isSelected()) {
							    int qty = Integer.parseInt(txtMuffin.getText());
							    double total = qty * priceMuffin;
							    subtotal += total;
							    receipt += "Blueberry Muffin x" + qty + " = ₱" + total + "\n";
							}

							if(cbBananaBread.isSelected()) {
							    int qty = Integer.parseInt(txtBananaBread.getText());
							    double total = qty * priceBananaBread;
							    subtotal += total;
							    receipt += "Banana Bread x" + qty + " = ₱" + total + "\n";
							}

							if(cbCinammon.isSelected()) {
							    int qty = Integer.parseInt(txtCinammon.getText());
							    double total = qty * priceCinnamon;
							    subtotal += total;
							    receipt += "Cinnamon Roll x" + qty + " = ₱" + total + "\n";
							}

							// Desserts
							if(cbCheesecake.isSelected()) {
							    int qty = Integer.parseInt(txtCheeseCake.getText());
							    double total = qty * priceCheesecake;
							    subtotal += total;
							    receipt += "Cheesecake x" + qty + " = ₱" + total + "\n";
							}

							if(cbChocCake.isSelected()) {
							    int qty = Integer.parseInt(txtChocoCake.getText());
							    double total = qty * priceChocoCake;
							    subtotal += total;
							    receipt += "Chocolate Cake x" + qty + " = ₱" + total + "\n";
							}

							if(cbBrownies.isSelected()) {
							    int qty = Integer.parseInt(txtBrownies.getText());
							    double total = qty * priceBrownies;
							    subtotal += total;
							    receipt += "Brownies x" + qty + " = ₱" + total + "\n";
							}

							if(cbDonut.isSelected()) {
							    int qty = Integer.parseInt(txtDonut.getText());
							    double total = qty * priceDonut;
							    subtotal += total;
							    receipt += "Donut x" + qty + " = ₱" + total + "\n";
							}

							if(cbIceCream.isSelected()) {
							    int qty = Integer.parseInt(txtIceCream.getText());
							    double total = qty * priceIceCream;
							    subtotal += total;
							    receipt += "Ice Cream x" + qty + " = ₱" + total + "\n";
							}

							// Add-Ons
							if(cbExtraShot.isSelected()) {
							    int qty = Integer.parseInt(txtExtraShot.getText());
							    double total = qty * priceExtraShot;
							    subtotal += total;
							    receipt += "Extra Shot x" + qty + " = ₱" + total + "\n";
							}

							if(cbExtraSyrup.isSelected()) {
							    int qty = Integer.parseInt(txtExtraSyrup.getText());
							    double total = qty * priceExtraSyrup;
							    subtotal += total;
							    receipt += "Extra Syrup x" + qty + " = ₱" + total + "\n";
							}

							if(cbWhippedCream.isSelected()) {
							    int qty = Integer.parseInt(txtWhippedCream.getText());
							    double total = qty * priceWhippedCream;
							    subtotal += total;
							    receipt += "Whipped Cream x" + qty + " = ₱" + total + "\n";
							}

							if(cbExtraIce.isSelected()) {
							    int qty = Integer.parseInt(txtExtraIce.getText());
							    double total = qty * priceExtraIce;
							    subtotal += total;
							    receipt += "Extra Ice x" + qty + " = ₱" + total + "\n";
							}

							if(cbUpgrade.isSelected()) {
							    int qty = Integer.parseInt(txtUpgrade.getText());
							    double total = qty * priceLarge;
							    subtotal += total;
							    receipt += "Upgrade to Large x" + qty + " = ₱" + total + "\n";
							}

							receipt += "\nSubtotal: ₱" + subtotal + "\n";

							double discount = 0;
							String discountType = "None";

							if(rdStudent.isSelected()) {
								discount = subtotal * 0.10;
								discountType = "Student Discount (10%)";
							}

							if(rdSenior.isSelected()) {
								discount = subtotal * 0.20;
								discountType = "Senior Citizen Discount (20%)";
							}

							double finalTotal = subtotal - discount;

							receipt += "Discount: " + discountType + "\n";
							receipt += "Discount Amount: ₱ " + discount + "\n";
							receipt += "Final Total: ₱ " + finalTotal + "\n";

							txtReceipt.setText(receipt);

						} catch(Exception ex) {
							txtReceipt.setText("Please enter valid quantities.");
						}
				}
			});
				
		btnCompute.setBounds(293, 139, 120, 20);
		receipts.add(btnCompute);
		
		JButton btnClear = new JButton("Clear Order");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    txtReceipt.setText(""); // This clears the receipt
		        // Clear all text fields
		        txtEspresso.setText("");
		        txtAmericano.setText("");
		        txtCapuccino.setText("");
		        txtCaramel.setText("");
		        txthotChoco.setText("");
		        txtMatcha.setText("");
		        txtStrawberry.setText("");
		        txtLemonade.setText("");
		        txtCroissant.setText("");
		        txtChocoCroissant.setText("");
		        txtMuffin.setText("");
		        txtBananaBread.setText("");
		        txtCinammon.setText("");
		        txtCheeseCake.setText("");
		        txtChocoCake.setText("");
		        txtBrownies.setText("");
		        txtDonut.setText("");
		        txtIceCream.setText("");
		        txtExtraShot.setText("");
		        txtExtraSyrup.setText("");
		        txtWhippedCream.setText("");
		        txtExtraIce.setText("");
		        txtUpgrade.setText("");

		        // Uncheck all checkboxes
		        cbEspresso.setSelected(false);
		        cbAmericano.setSelected(false);
		        cbCapuccino.setSelected(false);
		        cbCaramelMac.setSelected(false);
		        cbChocolate.setSelected(false);
		        cbMatcha.setSelected(false);
		        cbStrawberryMilk.setSelected(false);
		        cbLemonade.setSelected(false);
		        cbCroissant.setSelected(false);
		        cbChocolateCroissant.setSelected(false);
		        cbBlueberryMuffin.setSelected(false);
		        cbBananaBread.setSelected(false);
		        cbCinammon.setSelected(false);
		        cbCheesecake.setSelected(false);
		        cbChocCake.setSelected(false);
		        cbBrownies.setSelected(false);
		        cbDonut.setSelected(false);
		        cbIceCream.setSelected(false);
		        cbExtraShot.setSelected(false);
		        cbExtraSyrup.setSelected(false);
		        cbWhippedCream.setSelected(false);
		        cbExtraIce.setSelected(false);
		        cbUpgrade.setSelected(false);

		        // Reset discount selection
		        discountGroup.clearSelection();
			}
		});
		btnClear.setBounds(293, 169, 120, 20);
		receipts.add(btnClear);
		
		JButton btnPlaceOrder = new JButton("Place Order");
		btnPlaceOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				        // If receipt is empty, force user to compute first
				        if (txtReceipt.getText().isEmpty()) {
				            txtReceipt.setText("Please compute your order before placing it.");
				            return;
				        }
				        try {
				            double finalTotal = 0;
				            // Extract final total from receipt text
				            String[] lines = txtReceipt.getText().split("\n");
				            for (String line : lines) {
				                if (line.startsWith("Final Total: ₱")) {
				                    finalTotal = Double.parseDouble(line.replace("Final Total: ₱", "").trim());
				                }
				            }

				            double cash = Double.parseDouble(txtCash.getText());
				            if (cash < finalTotal) { // Error handling if the cash is not enough for the total
				                JOptionPane.showMessageDialog(
				                    pawfectBrew.this,
				                    "Insufficient cash. Please enter an amount greater than or equal to the total.",
				                    "Payment Error",
				                    JOptionPane.ERROR_MESSAGE
				                );
				                return;
				            }

				            double change = cash - finalTotal; // This line computes for the change

				            java.util.Date now = new java.util.Date();
				            String receiptNumber = "R-" + System.currentTimeMillis();

				            String finalizedReceipt = txtReceipt.getText();
				            finalizedReceipt += "\n----------------------------------\n";
				            finalizedReceipt += "Receipt No: " + receiptNumber + "\n"; // For the rceipt number
				            finalizedReceipt += "Date/Time: " + now.toString() + "\n"; // For the date and time
				            finalizedReceipt += "Cash: ₱ " + cash + "\n";
				            finalizedReceipt += "Change: ₱ " + change + "\n";
				            finalizedReceipt += "Thank you for your purchase!\n";

				            txtReceipt.setText(finalizedReceipt);

				            // Confirmation popup
				            JOptionPane.showMessageDialog(
				                pawfectBrew.this,
				                "Order placed successfully!\nThank you for choosing Pawfect Brew.",
				                "Order Confirmation",
				                JOptionPane.INFORMATION_MESSAGE
				            );

				        } catch (NumberFormatException ex) {
				            JOptionPane.showMessageDialog(
				                pawfectBrew.this,
				                "Please enter a valid cash amount.",
				                "Input Error",
				                JOptionPane.ERROR_MESSAGE
				            );
				        }
				    }
				});

		btnPlaceOrder.setBounds(293, 199, 120, 20);
		receipts.add(btnPlaceOrder);
		
		btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cl = (CardLayout) select.getLayout();
				cl.show(select, "mainMenu");
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnBack.setBackground(new Color(248, 216, 213));
		btnBack.setBounds(434, 169, 101, 50);
		receipts.add(btnBack);
		
		lblCashPayment = new JLabel("Cash Payment");
		lblCashPayment.setHorizontalAlignment(SwingConstants.CENTER);
		lblCashPayment.setForeground(new Color(74, 45, 32));
		lblCashPayment.setFont(new Font("Arial", Font.BOLD, 14));
		lblCashPayment.setBackground(new Color(204, 105, 89));
		lblCashPayment.setBounds(430, 117, 111, 12);
		receipts.add(lblCashPayment);
		
		txtCash = new JTextField();
		txtCash.setBounds(435, 141, 101, 18);
		receipts.add(txtCash);
		txtCash.setColumns(10);

		
		JPanel drinksOptions = new JPanel();
		drinksOptions.setBackground(new Color(251, 239, 225));
		select.add(drinksOptions, "drinksPanel");
		drinksOptions.setLayout(null);
		
		JLabel lblCoffee = new JLabel("Caffeine Drinks");
		lblCoffee.setForeground(new Color(74, 45, 32));
		lblCoffee.setBackground(new Color(204, 105, 89));
		lblCoffee.setHorizontalAlignment(SwingConstants.CENTER);
		lblCoffee.setFont(new Font("Arial", Font.BOLD, 14));
		lblCoffee.setBounds(10, 10, 120, 12);
		drinksOptions.add(lblCoffee);
		
		cbEspresso = new JCheckBox("Espresso  (₱120)");
		cbEspresso.setBackground(new Color(248, 216, 213));
		cbEspresso.setBounds(20, 31, 175, 20);
		drinksOptions.add(cbEspresso);
		
		cbAmericano = new JCheckBox("Americano (₱130)");
		cbAmericano.setBackground(new Color(248, 216, 213));
		cbAmericano.setBounds(20, 62, 175, 20);
		drinksOptions.add(cbAmericano);
		
		cbCapuccino = new JCheckBox("Capuccino (₱140)");
		cbCapuccino.setBackground(new Color(248, 216, 213));
		cbCapuccino.setBounds(20, 96, 175, 20);
		drinksOptions.add(cbCapuccino);
		
		cbCaramelMac = new JCheckBox("Caramel Macchiato (₱150)");
		cbCaramelMac.setBackground(new Color(248, 216, 213));
		cbCaramelMac.setBounds(20, 125, 175, 20);
		drinksOptions.add(cbCaramelMac);
		
		JLabel lblNoncaffeineDrinks = new JLabel("Non-Caffeine Drinks");
		lblNoncaffeineDrinks.setForeground(new Color(74, 45, 32));
		lblNoncaffeineDrinks.setHorizontalAlignment(SwingConstants.CENTER);
		lblNoncaffeineDrinks.setFont(new Font("Arial", Font.BOLD, 14));
		lblNoncaffeineDrinks.setBounds(293, 10, 148, 12);
		drinksOptions.add(lblNoncaffeineDrinks);
		
		cbChocolate = new JCheckBox("Hot Chocolate (₱120)");
		cbChocolate.setBackground(new Color(248, 216, 213));
		cbChocolate.setBounds(293, 31, 162, 20);
		drinksOptions.add(cbChocolate);
		
		cbMatcha = new JCheckBox("Matcha Latte (₱135)");
		cbMatcha.setBackground(new Color(248, 216, 213));
		cbMatcha.setBounds(293, 62, 162, 20);
		drinksOptions.add(cbMatcha);
		
		cbStrawberryMilk = new JCheckBox("Strawberry Milk (₱125)");
		cbStrawberryMilk.setBackground(new Color(248, 216, 213));
		cbStrawberryMilk.setBounds(293, 96, 162, 20);
		drinksOptions.add(cbStrawberryMilk);
		
		cbLemonade = new JCheckBox("Lemonade (₱110)");
		cbLemonade.setBackground(new Color(248, 216, 213));
		cbLemonade.setBounds(293, 125, 162, 20);
		drinksOptions.add(cbLemonade);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cl = (CardLayout) select.getLayout();
				cl.show(select, "mainMenu");
			}
		});
		btnNewButton.setIcon(null);
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 10));
		btnNewButton.setBackground(new Color(248, 216, 213));
		btnNewButton.setBounds(220, 201, 84, 43);
		drinksOptions.add(btnNewButton);
		
		txtEspresso = new JTextField();
		txtEspresso.setBounds(215, 33, 30, 18);
		drinksOptions.add(txtEspresso);
		txtEspresso.setColumns(10);
		
		JLabel lblAmount = new JLabel("Amount");
		lblAmount.setHorizontalAlignment(SwingConstants.CENTER);
		lblAmount.setForeground(new Color(74, 45, 32));
		lblAmount.setFont(new Font("Arial", Font.BOLD, 10));
		lblAmount.setBackground(new Color(204, 105, 89));
		lblAmount.setBounds(203, 10, 55, 12);
		drinksOptions.add(lblAmount);
		
		txtAmericano = new JTextField();
		txtAmericano.setColumns(10);
		txtAmericano.setBounds(215, 64, 30, 18);
		drinksOptions.add(txtAmericano);
		
		txtCapuccino = new JTextField();
		txtCapuccino.setColumns(10);
		txtCapuccino.setBounds(215, 98, 30, 18);
		drinksOptions.add(txtCapuccino);
		
		txtCaramel = new JTextField();
		txtCaramel.setColumns(10);
		txtCaramel.setBounds(215, 127, 30, 18);
		drinksOptions.add(txtCaramel);
		
		JLabel lblAmount_1 = new JLabel("Amount");
		lblAmount_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblAmount_1.setForeground(new Color(74, 45, 32));
		lblAmount_1.setFont(new Font("Arial", Font.BOLD, 10));
		lblAmount_1.setBackground(new Color(204, 105, 89));
		lblAmount_1.setBounds(476, 10, 55, 12);
		drinksOptions.add(lblAmount_1);
		
		txthotChoco = new JTextField();
		txthotChoco.setColumns(10);
		txthotChoco.setBounds(488, 32, 30, 18);
		drinksOptions.add(txthotChoco);
		
		txtMatcha = new JTextField();
		txtMatcha.setColumns(10);
		txtMatcha.setBounds(488, 63, 30, 18);
		drinksOptions.add(txtMatcha);
		
		txtStrawberry = new JTextField();
		txtStrawberry.setColumns(10);
		txtStrawberry.setBounds(488, 97, 30, 18);
		drinksOptions.add(txtStrawberry);
		
		txtLemonade = new JTextField();
		txtLemonade.setColumns(10);
		txtLemonade.setBounds(488, 126, 30, 18);
		drinksOptions.add(txtLemonade);
		
		JPanel pastriesOptions = new JPanel();
		pastriesOptions.setBackground(new Color(251, 239, 225));
		select.add(pastriesOptions, "pastriesPanel");
		pastriesOptions.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cl = (CardLayout) select.getLayout();
				cl.show(select, "mainMenu");

				
			}
		});
		btnNewButton_1.setIcon(null);
		btnNewButton_1.setFont(new Font("Arial", Font.BOLD, 10));
		btnNewButton_1.setBackground(new Color(248, 216, 213));
		btnNewButton_1.setBounds(220, 202, 84, 43);
		pastriesOptions.add(btnNewButton_1);
		
		JLabel lblPastries = new JLabel("Pastries");
		lblPastries.setForeground(new Color(74, 45, 32));
		lblPastries.setHorizontalAlignment(SwingConstants.CENTER);
		lblPastries.setFont(new Font("Arial", Font.BOLD, 14));
		lblPastries.setBounds(10, 10, 92, 12);
		pastriesOptions.add(lblPastries);
		
		JLabel lblDessert = new JLabel("Dessert");
		lblDessert.setForeground(new Color(74, 45, 32));
		lblDessert.setHorizontalAlignment(SwingConstants.CENTER);
		lblDessert.setFont(new Font("Arial", Font.BOLD, 14));
		lblDessert.setBounds(311, 10, 74, 12);
		pastriesOptions.add(lblDessert);
		
		cbCroissant = new JCheckBox("Croissant (₱90)");
		cbCroissant.setBackground(new Color(248, 216, 213));
		cbCroissant.setBounds(10, 35, 180, 20);
		pastriesOptions.add(cbCroissant);
		
		cbChocolateCroissant = new JCheckBox("Chocolate Croissant (₱100)");
		cbChocolateCroissant.setBackground(new Color(248, 216, 213));
		cbChocolateCroissant.setBounds(10, 65, 180, 20);
		pastriesOptions.add(cbChocolateCroissant);
		
		cbBlueberryMuffin = new JCheckBox("Blueberry Muffin (₱95)");
		cbBlueberryMuffin.setBackground(new Color(248, 216, 213));
		cbBlueberryMuffin.setBounds(10, 92, 180, 20);
		pastriesOptions.add(cbBlueberryMuffin);
		
		cbBananaBread = new JCheckBox("Banana Bread (₱85)");
		cbBananaBread.setBackground(new Color(248, 216, 213));
		cbBananaBread.setBounds(10, 122, 180, 20);
		pastriesOptions.add(cbBananaBread);
		
		cbCinammon = new JCheckBox("Cinnamon Roll (₱100)");
		cbCinammon.setBackground(new Color(248, 216, 213));
		cbCinammon.setBounds(10, 155, 180, 20);
		pastriesOptions.add(cbCinammon);
		
		cbCheesecake = new JCheckBox("Cheesecake (₱150)");
		cbCheesecake.setBackground(new Color(248, 216, 213));
		cbCheesecake.setBounds(305, 35, 150, 20);
		pastriesOptions.add(cbCheesecake);
		
		cbChocCake = new JCheckBox("Chocolate Cake (₱140)");
		cbChocCake.setBackground(new Color(248, 216, 213));
		cbChocCake.setBounds(305, 65, 150, 20);
		pastriesOptions.add(cbChocCake);
		
		cbBrownies = new JCheckBox("Brownies (₱120)");
		cbBrownies.setBackground(new Color(248, 216, 213));
		cbBrownies.setBounds(305, 92, 150, 20);
		pastriesOptions.add(cbBrownies);
		
		cbDonut = new JCheckBox("Donut (₱70)");
		cbDonut.setBackground(new Color(248, 216, 213));
		cbDonut.setBounds(305, 122, 150, 20);
		pastriesOptions.add(cbDonut);
		
		cbIceCream = new JCheckBox("Ice Cream (₱80)");
		cbIceCream.setBackground(new Color(248, 216, 213));
		cbIceCream.setBounds(305, 155, 150, 20);
		pastriesOptions.add(cbIceCream);
		
		JLabel lblAmount_2 = new JLabel("Amount");
		lblAmount_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblAmount_2.setForeground(new Color(74, 45, 32));
		lblAmount_2.setFont(new Font("Arial", Font.BOLD, 10));
		lblAmount_2.setBackground(new Color(204, 105, 89));
		lblAmount_2.setBounds(188, 11, 55, 12);
		pastriesOptions.add(lblAmount_2);
		
		txtCroissant = new JTextField();
		txtCroissant.setColumns(10);
		txtCroissant.setBounds(200, 37, 30, 18);
		pastriesOptions.add(txtCroissant);
		
		txtChocoCroissant = new JTextField();
		txtChocoCroissant.setColumns(10);
		txtChocoCroissant.setBounds(200, 67, 30, 18);
		pastriesOptions.add(txtChocoCroissant);
		
		txtMuffin = new JTextField();
		txtMuffin.setColumns(10);
		txtMuffin.setBounds(200, 94, 30, 18);
		pastriesOptions.add(txtMuffin);
		
		txtBananaBread = new JTextField();
		txtBananaBread.setColumns(10);
		txtBananaBread.setBounds(200, 124, 30, 18);
		pastriesOptions.add(txtBananaBread);
		
		txtCinammon = new JTextField();
		txtCinammon.setColumns(10);
		txtCinammon.setBounds(200, 157, 30, 18);
		pastriesOptions.add(txtCinammon);
		
		JLabel lblAmount_2_1 = new JLabel("Amount");
		lblAmount_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblAmount_2_1.setForeground(new Color(74, 45, 32));
		lblAmount_2_1.setFont(new Font("Arial", Font.BOLD, 10));
		lblAmount_2_1.setBackground(new Color(204, 105, 89));
		lblAmount_2_1.setBounds(458, 11, 55, 12);
		pastriesOptions.add(lblAmount_2_1);
		
		txtCheeseCake = new JTextField();
		txtCheeseCake.setColumns(10);
		txtCheeseCake.setBounds(470, 37, 30, 18);
		pastriesOptions.add(txtCheeseCake);
		
		txtChocoCake = new JTextField();
		txtChocoCake.setColumns(10);
		txtChocoCake.setBounds(470, 67, 30, 18);
		pastriesOptions.add(txtChocoCake);
		
		txtBrownies = new JTextField();
		txtBrownies.setColumns(10);
		txtBrownies.setBounds(470, 94, 30, 18);
		pastriesOptions.add(txtBrownies);
		
		txtDonut = new JTextField();
		txtDonut.setColumns(10);
		txtDonut.setBounds(470, 124, 30, 18);
		pastriesOptions.add(txtDonut);
		
		txtIceCream = new JTextField();
		txtIceCream.setColumns(10);
		txtIceCream.setBounds(470, 157, 30, 18);
		pastriesOptions.add(txtIceCream);
		
		JPanel addOns = new JPanel();
		addOns.setBackground(new Color(251, 239, 225));
		select.add(addOns, "addonsPanel");
		addOns.setLayout(null);
		
		JButton btnNewButton_1_1 = new JButton("Back");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cl = (CardLayout) select.getLayout();
				cl.show(select, "mainMenu");
			}
		});
		btnNewButton_1_1.setIcon(null);
		btnNewButton_1_1.setFont(new Font("Arial", Font.BOLD, 10));
		btnNewButton_1_1.setBackground(new Color(248, 216, 213));
		btnNewButton_1_1.setBounds(383, 124, 84, 43);
		addOns.add(btnNewButton_1_1);
		
		JLabel lblAddOns = new JLabel("Optional Add-ons");
		lblAddOns.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddOns.setForeground(new Color(74, 45, 32));
		lblAddOns.setFont(new Font("Arial", Font.BOLD, 14));
		lblAddOns.setBounds(10, 10, 121, 12);
		addOns.add(lblAddOns);
		
		cbExtraShot = new JCheckBox("Extra Shot Espresso (₱40)");
		cbExtraShot.setBackground(new Color(248, 216, 213));
		cbExtraShot.setBounds(10, 37, 185, 20);
		addOns.add(cbExtraShot);
		
		cbExtraSyrup = new JCheckBox("Extra Syrup (₱25)");
		cbExtraSyrup.setBackground(new Color(248, 216, 213));
		cbExtraSyrup.setBounds(10, 64, 185, 20);
		addOns.add(cbExtraSyrup);
		
		cbWhippedCream = new JCheckBox("Whipped Cream (₱30)");
		cbWhippedCream.setBackground(new Color(248, 216, 213));
		cbWhippedCream.setBounds(10, 95, 185, 20);
		addOns.add(cbWhippedCream);
		
		cbExtraIce = new JCheckBox("Extra Ice (₱10)");
		cbExtraIce.setBackground(new Color(248, 216, 213));
		cbExtraIce.setBounds(10, 124, 185, 20);
		addOns.add(cbExtraIce);
		
		cbUpgrade = new JCheckBox("Upgrade to Large Size (₱50)");
		cbUpgrade.setBackground(new Color(248, 216, 213));
		cbUpgrade.setBounds(10, 153, 185, 20);
		addOns.add(cbUpgrade);
		
		JLabel menuTitle_1 = new JLabel(new ImageIcon("C:\\Users\\rachel\\eclipze-workspace\\Cafe System\\resources\\pawIcon.png"));
		menuTitle_1.setBackground(new Color(251, 239, 225));
		menuTitle_1.setBounds(359, 10, 132, 109);
		addOns.add(menuTitle_1);
		
		JLabel lblAmount_2_2 = new JLabel("Amount");
		lblAmount_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblAmount_2_2.setForeground(new Color(74, 45, 32));
		lblAmount_2_2.setFont(new Font("Arial", Font.BOLD, 10));
		lblAmount_2_2.setBackground(new Color(204, 105, 89));
		lblAmount_2_2.setBounds(198, 11, 55, 12);
		addOns.add(lblAmount_2_2);
		
		txtExtraShot = new JTextField();
		txtExtraShot.setColumns(10);
		txtExtraShot.setBounds(210, 39, 30, 18);
		addOns.add(txtExtraShot);
		
		txtExtraSyrup = new JTextField();
		txtExtraSyrup.setColumns(10);
		txtExtraSyrup.setBounds(210, 66, 30, 18);
		addOns.add(txtExtraSyrup);
		
		txtWhippedCream = new JTextField();
		txtWhippedCream.setColumns(10);
		txtWhippedCream.setBounds(210, 97, 30, 18);
		addOns.add(txtWhippedCream);
		
		txtExtraIce = new JTextField();
		txtExtraIce.setColumns(10);
		txtExtraIce.setBounds(210, 126, 30, 18);
		addOns.add(txtExtraIce);
		
		txtUpgrade = new JTextField();
		txtUpgrade.setColumns(10);
		txtUpgrade.setBounds(210, 155, 30, 18);
		addOns.add(txtUpgrade);

	}
}
