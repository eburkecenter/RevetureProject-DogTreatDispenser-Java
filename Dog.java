public abstract class Dog{
  //give dog a name
  public String name;
  // actions for if dog approves of treat;
  abstract void wag();
  //constructor
  public Dog(String name){
    this.name=name;
  }
}