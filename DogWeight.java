public class DogWeight extends Dog{
  public float weight;
  public DogWeight(float weight,String name){
    super(name);
    this.weight = weight;
  }
   //Getters and setters for name
  public String getName() {
		return name;
	}
  public void setName(String name) {
		this.name = name;
    }
   //Getters and setters for weight
  public float getWeight() {
		return weight;
	}
  public void setName(float weight) {
		this.weight = weight;
    }
  //overrinding the wag method from dogs
  @Override
  public void wag(){
    System.out.println(name+ " likes the treat! Who's a good dog?!");
  };
}