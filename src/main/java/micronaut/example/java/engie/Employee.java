package micronaut.example.java.engie;

import javax.inject.Singleton;

@Singleton
public class Employee {
    private int id;
    private String name;
    public int getId(){
        return id;


    }
public void setId(int id){
    this.id = id;

}
 public String getName(){
     return name;
 }
}