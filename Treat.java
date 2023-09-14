
import java.util.*;
public class Treat{
  //Map of unit price and treat
  HashMap<Double,String> smallDogTreat = new LinkedHashMap<>();
  HashMap<Double,String> largeDogTreat = new LinkedHashMap<>();
  
  public Treat(){
  //Map<Integer, String> topMovies = new HashMap<>();
  smallDogTreat.put(3.44,"Ziwi Good Dog Rewards Air-Dried Beef Dog");
  smallDogTreat.put(9.99,"Stewart Pro-Treat Beef Liver Freeze-Dried Raw Dog Treats");
  smallDogTreat.put(5.74,"BondVet Lucky Dog Chicken Jerky");
  smallDogTreat.put(8.48,"Best Bully Sticks 6-Inch Bully Sticks");
  largeDogTreat.put(7.44,"Charlee Bear Original Crunch Natural Dog Treats");
  largeDogTreat.put(13.99,"Barkworthies Lamb Lung Dog Treats");
  largeDogTreat.put(15.74,"Jiminy’s Cricket Peas & Sweet-Potato Dog Treats");
  largeDogTreat.put(18.48,"Nugget’s Healthy Eats Bone Broth Brew");
  }
  //Date date = new Date();

  //creating getter and setter for small dog treats
  public HashMap<Double, String> getSmallDogTreat(){
        return this.smallDogTreat;
   }

    public void setSmallDogTreat(HashMap<Double,String> smallDogTreat){
        this.smallDogTreat = smallDogTreat;
   }
  //creating getter and setter for large dog treats
  public HashMap<Double, String> getLargeDogTreat(){
        return this.largeDogTreat;
   }

    public void setLargeDogTreat(HashMap<Double,String> largeDogTreat){
        this.largeDogTreat = largeDogTreat;
   }
}