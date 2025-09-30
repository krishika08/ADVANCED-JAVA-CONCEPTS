package cwh_11;
// creating a class monkey with methods jump() and bite() 
// creating a class human that inherits monkey class
// creating a interface basicAnimal that implements monkey class 
// yse polymorphism
class Monkey{
void jump(){
                System.out.println("JUMPINGGGGG....");
}
                void bite(){
                                System.out.println("BITINGGGGG.....");
                }
}
interface basicAnimal{
                void eat();
                void sleep();
}
class human extends Monkey implements basicAnimal{
                public void eat(){
                                System.out.println("Eatinggg");
                }
                public void sleep(){
                                System.out.println("Sleeping");
                }
                void read(){
                                System.out.println("Reading");
                }
}
public class cwh_11_q2 {
                public static void main(String[] args) {
                                human krishu = new human();
                                krishu.eat();
                                krishu.sleep();
                                krishu.read();
                                krishu.bite();
                                krishu.jump();
                                Monkey bandar = new human(); //bandar is an object of human but make as a reference of monkey
                                //conclusion,so bandar can't use the methods of human that are not is monkey
                                bandar.bite();
                                bandar.jump();


                }

                
}
