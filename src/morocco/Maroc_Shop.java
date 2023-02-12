/*Maroc cookies is a new pastry shop established in the north-central city of Morocco
called Beni-Mellal. Since its establishment, Maroc cookies have received an influx of
customers from all over Morocco including tourists visiting the country. This pastry
shop has managed to combine all the wonderful and aromatic flavors of Morocco
into the pastries they produce which resulted in a mass number of customers
coming in. However, Maroc cookies are now experiencing problems in having to
deal with this large number of customers at its establishment from when customers
place their orders up to when they receive their ordered pastries. For this reason,
Maroc cookies would like to cut down the process of ordering at their establishment
by creating a unique online ordering system with a chatbot called Nemo that will
interact with customers and help them place their cookie orders. Nemo should
respond to customers naturally as a normal staff at the Maroc cookies shop. The
customers should be able to perform any of the following using the Maroc cookies
ordering system.

The operations that should be provided by the Maroc cookies ordering system
include:- 

ordering system menu! 

Maroc Cookery Ordering System Menu

Viewing the pasties available for sate at the Maroc cockies shop

Buying cookies ta gift( gift box options will be provided for purchase)

Ordering pastiies

The first option from the Maroc cookies ordering system menu allows the customers
to view the pastries(in the picture) that are available for sale at the establishment.
The second option provides the customers with three gift box options(shown in the
picture) to choose from in case they would like to gift the cookies they buy.

The third option allows the customers to place their cookie orders by choosing the
cookie they would like to buy which can be from any of the three examples provided
below and the customers can also choose the quantity per cookie type they would
like to order. There should be a set price for each cookie type per one which will be
used to calculate the total cost of the customer’s order based on the choices they
have made.

The fourth option allows the customers to finalize their order so that an invoice can
be generated as a pdf file. The pdf invoice document should contain the following
information:-

1. The cookie(s) name, quantity, and the price of each cookie multiplied by the
quantity of cookies choosen.
2. The total price of the cookie(s) cost in dollars. 
3. The gift box type if selected or not, the quantity, and price of the gift box.

Extension Part:-

The date and time the customers place their order should be placed at the beginning
of the invoice and the format of how the invoice will need to look is provided in the
example below. The name of the Maroc pastry shop and logo should also be
included at the top of the invoice file. */

package morocco;

import java.util.*;

//To show images.
import javax.swing.JFrame;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//Pdf file creating.
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfWriter;

//For inserting local date and times.
import java.text.SimpleDateFormat;
import java.util.Date;

public class Maroc_Shop extends Canvas{
	static String customer_choice;
	static int random_index1;
	static int random_index2;
	static int random_index3;
	static String random_element1;
	static String random_element2;
	static String random_element3;
	static String gift;
	static int gift_no;
	static double gift_price = 4.5;
	static double orangeblossom = 12;
	static double cinnamon = 11.50;
	static double pistachio = 13.50;
	static double price;
	static double totalcookie_price;
	
	
	public void paint(Graphics g) {
		Toolkit t = Toolkit.getDefaultToolkit();
		if(customer_choice.equals("1")) {
			Image img1 = t.getImage("C:\\Users\\nasri\\Downloads\\Health+Programming+Lesson_Materials\\Health Programming Lesson_Materials\\Pictures\\pic2.png");
			g.drawImage(img1, 50, 120, this);
		}
		else if(customer_choice.equals("2")) {
			Image img2 = t.getImage("C:\\Users\\nasri\\Downloads\\Health+Programming+Lesson_Materials\\Health Programming Lesson_Materials\\Pictures\\gift.png");
			g.drawImage(img2, 50, 120, this);
		}
	}

	public static void main(String[] args) throws DocumentException, InterruptedException, MalformedURLException, IOException {
		Scanner text = new Scanner(System.in);
		Scanner number = new Scanner(System.in);
		Maroc_Shop shop = new Maroc_Shop();
		JFrame f = new JFrame();
		f.add(shop);
		f.setSize(1100, 800);
		
		//Generating Pdf File.
		Rectangle pageSize = new Rectangle(650,650);
		pageSize.setBackgroundColor(BaseColor.CYAN);
		Document document = new Document(pageSize);
		PdfWriter.getInstance(document, new FileOutputStream("C:\\Users\\nasri\\Documents\\Study\\Projects\\Java\\invoice.pdf"));
		
		List<String> pos_list = new ArrayList<>(); //Creating Arraylist.
		//Adding elements to the ArrayList by using add() method.
		pos_list.add("excellent"); 
		pos_list.add("great");
		pos_list.add("brilliant");
		Random random = new Random();
		for(int i=0; i<pos_list.size(); i++) {
			random_index1 = random.nextInt(pos_list.size());
		}
		random_element1 = pos_list.get(random_index1);
		 
		List<String> pos_list2 = new ArrayList<>(); //Creating second ArrayList for family.
		//Adding elements to the ArrayList by using add() method.
		pos_list2.add("Who is this lucky person in your family"); 
		pos_list2.add("Family members are special!");
		Random random2 = new Random();
		for(int j=0; j<pos_list2.size(); j++) {
			random_index2 = random2.nextInt(pos_list2.size());
		}
		random_element2 = pos_list2.get(random_index2);
		
		List<String> pos_list3 = new ArrayList<>(); //Creating second ArrayList for friends.
		//Adding elements to the ArrayList by using add() method.
		pos_list3.add("Your friend is so lucky!"); 
		pos_list3.add("This person must be dear to you!");
		Random random3 = new Random();
		for(int k=0; k<pos_list3.size(); k++) {
			random_index3 = random3.nextInt(pos_list3.size());
		}
		random_element3 = pos_list3.get(random_index3);
		
		System.out.println(ANSI_Colors.PURPLE_BOLD_BRIGHT);
		System.out.println("+-------------------------------------+");
		System.out.println("|                                     |");
		System.out.println("|                                     |");
		System.out.println("|    Welcome to the cookie treats     |");
		System.out.println("|      enjoy delicious pastries,      |");
		System.out.println("|      All the way from Morocco       |");
		System.out.println("|                                     |");
		System.out.println("|                                     |");
		System.out.println("+------------------------------------*/");
		System.out.println();
		System.out.println(ANSI_Colors.CYAN_BOLD_BRIGHT+"😀Hello, dear customer what is your name? ");
		String customer_name = text.nextLine();
		Thread.sleep(1000);
		System.out.println();
		System.out.println("😀 Welcome, "+customer_name+" my name is nem, the Moroccan bot!");
		Thread.sleep(1000);
		System.out.println();
		System.out.println("😀 I am here to help you purchase your order");
		Thread.sleep(1000);
		System.out.println();
		System.out.println(ANSI_Colors.RED_BOLD_BRIGHT+"Would you like to view the personal menu(yes or no)?");
		String response = text.nextLine();
		while(response.equalsIgnoreCase("yes")) {
			System.out.println();
			System.out.println(ANSI_Colors.FOREST_GREEN);
			System.out.println("+-----------------------------------+");
			System.out.println("| 1.View pastries                   |");
			System.out.println("| 2.Buy a gift box	                |");
			System.out.println("| 3.Order pastries       	  		");
			System.out.println("| 4.Finalize Order                  |");
			System.out.println("+----------------------------------*/");
			System.out.println();
			Thread.sleep(1000);
			customer_choice = text.nextLine();
			if(customer_choice.equals("1")) {
				System.out.println(ANSI_Colors.PURPLE_BOLD_BRIGHT+"😀 That is "+random_element1+" ,please have a look at the cookies we have for sale!"); 
				Thread.sleep(5000);
				f.setVisible(true);
				Thread.sleep(10000); 
				f.dispose();
				Thread.sleep(2000);
				System.out.println(ANSI_Colors.RED_BOLD_BRIGHT+"😀 Pleade have a look at our cookies menu below ");
				Thread.sleep(2000);
				System.out.println();
				System.out.println(ANSI_Colors.RED_BOLD_BRIGHT);
				System.out.println("------------- Maroc Pastries Menu -------------");
				System.out.println("|      1. Almond Orange Blossom Cookies		  |");		
				System.out.println("|      2. Cinnamon Nut Flavored Cookies		  |");
				System.out.println("|      3. Pistachio Rose Water Cookies		  |");
				System.out.println("------------- Maroc Pastries Menu -------------");
				System.out.println();
				Thread.sleep(2000);
				
				System.out.println(ANSI_Colors.RED_BOLD_BRIGHT+"😀 Please return back to the main menu, back to the main menu to complete your order");
				Thread.sleep(2000);
	
			}
			
			if(customer_choice.equals("2")) {
				System.out.println(ANSI_Colors.BLUE_BOLD_BRIGHT+"😀 oh wow, Would you like to buy a gift for a:- \n1.Family Member\n2.Friend");
				String user = text.nextLine();
				Thread.sleep(2000);
				if(user.equals("1")) {
					System.out.println("😀 "+ random_element2);
				}
				else if(user.equals("2")) {
					System.out.println("😀 "+ random_element3);
				}
				Thread.sleep(2000);
				System.out.println(ANSI_Colors.PURPLE_BOLD_BRIGHT+"😀 have a look at the gift boxes we sell and choose one before placing an order.");
				Thread.sleep(2000);
				f.setVisible(true);
				Thread.sleep(10000);
				f.dispose();
				System.out.println();
				System.out.println(ANSI_Colors.ROSY_PINK+"😀 Which gift box would you like to purchase? \n1.Gift Box A\n2.Gift Box B\n3.Gift Box C");
				String gift_choice = text.nextLine();
				if(gift_choice.equals("1")) {
					gift = "Gift Box A";
					System.out.println("😀 How many of this type of gift box would you like? ");
					gift_no = number.nextInt();
					gift_price = gift_price * gift_no;
				}
				else if(gift_choice.equals("2")) {
					gift = "Gift Box B";
					System.out.println("😀 How many of this type of gift box would you like? ");
					gift_no = number.nextInt();
					gift_price = gift_price * gift_no;
				}
				else if(gift_choice.equals("3")) {
					gift = "Gift Box C";
					System.out.println("😀 How many of this type of gift box would you like? ");
					gift_no = number.nextInt();
					gift_price = gift_price * gift_no;
				}
				System.out.println();
				System.out.println(ANSI_Colors.RED_BOLD_BRIGHT+"😀 Please return back to the main menu, back to the main menu to complete your order");
				Thread.sleep(2000);
			}
			
			else if(customer_choice.equals("3")) {
				//Creating Pdf document.
				document.open();
				Font titleFont = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 30, BaseColor.RED);
				document.add(new Paragraph("Moroccan Cookies Invoice\n", titleFont));
			    com.itextpdf.text.Image img2 = 	com.itextpdf.text.Image.getInstance("C:\\Users\\nasri\\Downloads\\Health+Programming+Lesson_Materials\\Health Programming Lesson_Materials\\Pictures\\logo2.png");
			    img2.setAbsolutePosition(550,550);
			    document.add(img2);
			    document.add(new Paragraph("\n"));
			    String customer_intro = "Customer Name:- " + customer_name;
			    document.add(new Paragraph(customer_intro));
			    document.add(new Paragraph("\n"));
			    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
			    Date date = new Date();
			    String dates = "Date of Order:- "+ formatter.format(date);
			    document.add(new Paragraph(dates));
			    document.add(new Paragraph("\n"));
			    document.add(new Paragraph("Cookie Name(s)    | Quantity    | Price($)\n")); 
			    
				System.out.println(ANSI_Colors.PURPLE_BOLD_BRIGHT+"😀 We are happy to hear that you would like to place your order "+customer_name);
				Thread.sleep(2000);
				System.out.println("😀  How many cookies would you like to order? ");
				int cookie_no = number.nextInt();
				for(int x=0; x<cookie_no; x++) {
					System.out.println("😀 Which cookie would you like to order?(Almond Orange, Cinnamon Nut,  Pistachio Rose) ");
					String cookie_name = text.nextLine();
					String cookie = cookie_name;
					System.out.println("😀 How many of this cookie would you like to order? ");
					double cookie_no2 = number.nextDouble();	
					if(cookie_name.equalsIgnoreCase("Almond Orange")) {
						price = orangeblossom * cookie_no2;
					}
					else if(cookie_name.equalsIgnoreCase("Cinnamon Nut")) {
						price = cinnamon * cookie_no2;
					}
					else if(cookie_name.equalsIgnoreCase("Pistachio Rose")) {
						price = pistachio * cookie_no2;
					}
					else {
						System.out.println(ANSI_Colors.RED_BOLD_BRIGHT+"😀 Sorry, You've entered an incorrect option! Please restart the system");
						System.exit(0);
					}
					totalcookie_price += price;
					String order = cookie + "          " + String.valueOf(cookie_no2)+ "                     " + String.valueOf(price);
					document.add(new Paragraph(order));
				}
			}
			
			else if(customer_choice.equals("4")) {
				System.out.println(ANSI_Colors.RED_BOLD_BRIGHT+"😀 "+customer_name+" Your order has now been finalized");
				Thread.sleep(2000);
				System.out.println(ANSI_Colors.LIGHT_PINK+"😀 Did you select any gift options(yes or no)? ");
				String gift_option = text.nextLine();
				if(gift_option.equalsIgnoreCase("yes")) {
					document.add(new Paragraph("\n"));
					String total_price = "            Total Cookies Price($) = "+String.valueOf(totalcookie_price);
					document.add(new Paragraph(total_price));
					document.add(new Paragraph("\n"));
					document.add(new Paragraph("Gift Box Type    | Quantity     | Price($)\n"));
					String gifts = gift + "                " + String.valueOf(gift_no) + "               " + String.valueOf(gift_price);
					document.add(new Paragraph(gifts));
					document.add(new Paragraph("\n"));
					document.close();
				}
				else if(gift_option.equalsIgnoreCase("no")) {
					gift = "Not required";
					gift_no = 0;
					gift_price = 0;
					document.add(new Paragraph("\n"));
					String total_price = "            Total Cookies Price($) = "+String.valueOf(totalcookie_price);
					document.add(new Paragraph(total_price));
					document.add(new Paragraph("\n"));
					document.add(new Paragraph("Gift Box Type    | Quantity    | Price($)\n"));
					String gifts = gift + "                " + String.valueOf(gift_no) + "               " + String.valueOf(gift_price);
					document.add(new Paragraph(gifts));
					document.add(new Paragraph("\n"));
					document.close();
				}
			}
			
			
			System.out.println(ANSI_Colors.DARK_RED+"Would you like to view the personal menu(yes or no)?");
			response = text.nextLine();
		}
		System.out.println(ANSI_Colors.GREEN_BOLD_BRIGHT+"😀 Thank You!");
		text.close();
		number.close();

	}

}
