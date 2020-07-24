package com.epam.Maven_OOPS;


/**
 * Hello world!
 *
 */
import java.util.*;
class KitKat extends NewYearGift{
	int quantity;

	public KitKat(String name, int price, int weight, int quantity) {
		super(name, price, weight);
		this.quantity= quantity;
	}
}
class Bournville extends NewYearGift{
int quantity;

    public Bournville(String name, int price, int weight, int quantity) {
        super(name, price, weight);
        this.quantity= quantity;
    }
}


class Dairy_Milk extends NewYearGift{
	int quantity;

	public Dairy_Milk(String name, int price, int weight, int quantity) {
		super(name, price, weight);
		this.quantity= quantity;
	}
}


class Hersheys extends NewYearGift {
    int quantity;

    public Hersheys(String name, int price, int weight, int quantity) {
        super(name, price, weight);
        this.quantity= quantity;
    }
}




public class App {
	public static void main( String[] args )	{
		Scanner sc = new Scanner(System.in);
		int quantity = 0, total_no_candies = 0;
		char n1;
		NewYearGift collect;
		Boolean n = true;
		int price, weight = 0,totalbox_wt = 0, totalweight = 0;
		System.out.println("Fill the New Year Gift Box!!");
		ArrayList<NewYearGift> giftbox =  new ArrayList<NewYearGift>();
		while(n) {
			System.out.println("List of candies");

			System.out.println("1. Kitkat");
			System.out.println("2. Bournville");
			System.out.println("3. DairyMilk");
			System.out.println("4. Hersheys");
			System.out.println("5. Candies in giftbox");
			System.out.println("6. Total Weight of candies");
			System.out.println("Choose a number from 1-6");
			try {

				switch(sc.next().charAt(0)){
				case '1':
					System.out.println("please enter the quantity");
					quantity = sc.nextInt();
					System.out.println("please enter the weight in grams");
					weight = sc.nextInt();
					System.out.println("Please enter the price ");
					price = sc.nextInt();
					collect = new KitKat("KitKat",price, weight,quantity);
					totalweight = collect.calculateWeight(weight, quantity);
					totalbox_wt = totalbox_wt + totalweight;
					total_no_candies = total_no_candies + quantity;
					giftbox.add(collect);
					System.out.println("Added "+collect.getName());

					System.out.println("Do you want another item (y/n)");
					n1 = sc.next().charAt(0);
					if(n1 == 'y'|| n1 == 'Y') {
						n = true;
						break;
					}
					else {
						n = false;
						break;
					}
				case '2':
					System.out.println("Please enter the quantity");
			          quantity = sc.nextInt();
			          System.out.println("Please enter the weight in grams");
			          weight = sc.nextInt();
			          System.out.println("Please enter the price ");
			          price = sc.nextInt();
			          collect = new Bournville("Bournville",price, weight,quantity);
			          totalweight = collect.calculateWeight(weight, quantity);
			          totalbox_wt = totalbox_wt + totalweight;
			          total_no_candies += quantity;
			          giftbox.add(collect);
			          System.out.println("Added "+collect.getName());
			          

			      
			          System.out.println("Do you want another item (y/n)");
			          n1 = sc.next().charAt(0);
			          if(n1 == 'y'|| n1 == 'Y') {
			          n = true;
			          break;
			          }
			          else {
			          n = false;
			          break;
			          }
				case '3':
					System.out.println("Please enter the quantity");
			          quantity = sc.nextInt();
			          System.out.println("Please enter the weight in grams");
			          weight = sc.nextInt();
			          System.out.println("Please enter the price ");
			          price = sc.nextInt();
			          collect = new Dairy_Milk("Dairy_Milk",price, weight,quantity);
			          totalweight = collect.calculateWeight(weight, quantity);
			          totalbox_wt = totalbox_wt + totalweight;
			          total_no_candies += quantity;
			          giftbox.add(collect);
			          System.out.println("Added "+collect.getName());
			          
			          System.out.println("Do you want another item (y/n)");
			          n1 = sc.next().charAt(0);
			          if(n1 == 'y'|| n1 == 'Y') {
			          n = true;
			          break;
			          }
			          else {
			          n = false;
			          break;
			          }
				case '4':
					System.out.println("Please enter the quantity");
			        quantity = sc.nextInt();
			        System.out.println("Please enter the weight in grams");
			        weight = sc.nextInt();
			        System.out.println("Please enter the price ");
			        price = sc.nextInt();
			        collect = new Hersheys("Hersheys", price, weight,quantity);
			        totalweight = collect.calculateWeight(weight, quantity);
			        totalbox_wt = totalbox_wt + totalweight;
			        total_no_candies += quantity;
			        giftbox.add(collect);
			        System.out.println("added "+collect.getName());
			        System.out.println("Do you want another item (y/n)");
			        n1 = sc.next().charAt(0);
			        if(n1 == 'y'|| n1 == 'Y') {
			             n = true;
			                 break;
			               }
			        else
			            {
			        n = false;
			        break;
			            }
				case '5':
					Collections.sort(giftbox,new SortByPrice());
					for(NewYearGift i:giftbox) {
						System.out.println("Name: "+i.getName()+" Price: "+i.getCost()+" Weight: "+i.getWeight());
					}
					System.out.println(giftbox);
					break;
				case '6':
					System.out.println(totalweight);
					break;
				default:
					System.out.println("Enter valid Input");
					break;
				}
				}
			catch(Exception e){
				System.out.println("select candies you want:");



			}
			}
		
		System.out.println("candies present in giftbox are:");
		
		System.out.println(giftbox);
		System.out.println("\n");
		System.out.println("Total weight of candies in giftbox is :" +totalbox_wt+ "grams");
		System.out.println("Total number of candies in the giftbox:" +total_no_candies);
		
	}
}