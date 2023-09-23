import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.application.Platform;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.text.Font;
import java.util.*;

class Main {
  public static void main(String[] args) {
     //create a scanner object to get user input   
    Scanner sc = new Scanner(System.in);
    //collect information about the dog
    System.out.println("Hello, please tell me your Dog's name?");
    String name = sc.nextLine();
    System.out.println("Nice to meet "+name+". What is "+name+"'s weight?");
    float weight = sc.nextFloat();
    //create a new weight class
    DogWeight dog = new DogWeight(weight,name);
    //create treat
    Treat treat = new Treat();
    double totalBill=0;
    
    //dispalying treats based on weight
    if(dog.getWeight()<20.0){
      int shopping;
      do{
      System.out.println("Please Choose a treat from list provided");
      System.out.println(treat.getSmallDogTreat().entrySet());
      int choice = sc.nextInt();
      double price=0;
      switch (choice){
        case 1:
          price = 3.44;
          break;
        case 2:
          price = 9.99;
          break;
        case 3:
          price = 5.74;
          break;
        case 4:
          price = 8.48;
          break;
        default:
          System.out.println("This choise is not available");
          break;
      }
       totalBill += price;
       System.out.println("Enter 1 to keep shopping or 2 to check out");
      shopping = sc.nextInt();
      } while(shopping == 1);
    }
    else if(dog.getWeight()>=20.0){
      int shopping;
      do{
      System.out.println("Please Choose a treat from list provided");
      System.out.println(treat.getLargeDogTreat().entrySet());
      int choice = sc.nextInt();
      double price=0;
      switch (choice){
        case 1:
          price = 7.44;
          break;
        case 2:
          price = 13.99;
          break;
        case 3:
          price = 15.74;
          break;
        case 4:
          price = 18.48;
          break;
        default:
          System.out.println("This choise is not available");
          break;
      }
       totalBill += price;
       System.out.println("Enter 1 to keep shopping or 2 to check out");
        shopping= sc.nextInt();
      } while(shopping == 1);
    }
    Date date = new Date();
    Bill newBill = new Bill(totalBill,date);
    //newBill.printBill();
    System.out.println(newBill);
    
    System.out.println("Do you want to suggest a Treat to add to our collection? Enter yes or no");
    String response = sc.next()+sc.nextLine();
    //System.out.println(response);
    if(response.equals("yes")){
      ArrayList<String> newTreats = new ArrayList<>();
      System.out.println("Enter the name of dog treat.\nOnce you are finidhed simply press enter to exit");
      String newTreat;
      do{   
        newTreat= sc.nextLine();
        newTreats.add(newTreat);
      } while(newTreat.length()!=0);
      System.out.println("Thanks for adding the following treats. Have a great day!");
    }else{
      System.out.println("Have a great day!");
    }
    sc.close();
  }
}
