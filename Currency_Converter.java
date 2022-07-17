import java.util.*;
import java.io.*;
import java.text.DecimalFormat;
public class Currency_Converter {
    public static void main(String[] args){
        double rupee,dollar,pound,euro;
        DecimalFormat f = new DecimalFormat("##.###");
        try (Scanner sc = new Scanner(System.in)) {
			System.out.println(" **WelCome to Currency Converter** \nEnter the currency code \n1:Indian to International\n2:International to Indian \n3:International to International");
			System.out.println();

			int X = sc.nextInt();
			if(X==1){
			    System.out.println("1:Rupees to Dollar \n2: Rupees to Pound \n3:Rupees to Euro");
			    int C = sc.nextInt();
			    switch(C){
			        case 1:{
			            System.out.println("Enter amount in rupees:");
			            rupee = sc.nextFloat();
			            dollar = rupee / 78;
			            System.out.println("Dollar : "+f.format(dollar));
			            break;
			        }
			        case 2:{
			            System.out.println("Enter amount in rupees:");
			            rupee = sc.nextFloat();
			            pound = rupee / 101;
			            System.out.println("Pound : "+f.format(pound));
			            break;
			        }
			        case 3:{
			            System.out.println("Enter amount in rupees:");
			            rupee = sc.nextFloat();
			            euro = rupee / 84;
			            System.out.println("Euro : "+f.format(euro));
			            break;
			        }
			        default:{
			        System.out.println("Please enter correct value");}
			    }
			    
			}
			if(X==2){
			    System.out.println("1:Dollar to Rupees \n2:Pound to Rupees \n3:Euro to Rupees");
			    int D = sc.nextInt();
			    switch(D){
			        case 1:{
			            System.out.println("Enter amount in Dollar:");
			            dollar = sc.nextFloat();
			            rupee = dollar * 75;
			            System.out.println("Rupees : "+f.format(rupee));
			            break;
			        }
			        case 2:{
			            System.out.println("Enter amount in Pound:");
			            pound = sc.nextFloat();
			            rupee = pound * 101;
			            System.out.println("Rupees : "+f.format(rupee));
			            break;
			        }
			        case 3:{
			            System.out.println("Enter amount in Euro:");
			            euro = sc.nextFloat();
			            rupee = euro * 84;
			            System.out.println("Rupees : "+f.format(rupee));
			            break;
			        }
			        default:{
			        System.out.println("Please enter correct value");}

			    }
			}
			if(X==3){
			    System.out.println("1:Dollar to Pound \n2:Dollar to Euro \n3:Pound to Dollar \n4:Pound to Euro \n5:Euro to Dollar \n6:Euro to Pound");
			    int E = sc.nextInt();
			    switch(E){
			        case 1:{
			            System.out.println("Enter amount in dollar:");
			            dollar = sc.nextFloat();
			            pound = dollar * 0.72;
			            System.out.println("Pound : "+f.format(pound));
			            break;
			        }
			        case 2:{
			            System.out.println("Enter amount in dollar:");
			            dollar = sc.nextFloat();
			            euro = dollar * 0.88;
			            System.out.println("Euro : "+f.format(euro));
			            break;
			        }
			        case 3:{
			            System.out.println("Enter amount in Pound:");
			            pound = sc.nextFloat();
			            dollar = pound * 1.35;
			            System.out.println("Dollar : "+f.format(dollar));
			            break;
			        }
			        case 4:{
			            System.out.println("Enter amount in Pound:");
			            pound = sc.nextFloat();
			            euro = pound * 1.36;
			            System.out.println("Euro : "+f.format(euro));
			            break;
			        }
			        case 5:{
			            System.out.println("Enter amount in Euro:");
			            euro = sc.nextFloat();
			            dollar = euro * 1.12;
			            System.out.println("Dollar : "+f.format(dollar));
			            break;
			        }
			        case 6:{
			            System.out.println("Enter amount in Euro:");
			            euro = sc.nextFloat();
			            pound = euro * 0.73;
			            System.out.println("Pound : "+f.format(pound));
			            break;
			        }
			        default:{
			            System.out.println("Please enter correct value");
                    }

			    }
			}
		}
    }
}
