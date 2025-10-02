package cwh_13;
// wrire a program to print "good morning" and "welcome" continuously on the screen in a java using threads
class practise13 extends Thread{ //Class extends Thread class
public void run(){
                // infinite loopwhile (true)
                {
                                System.out.println("good Morning");
                }
}
}
class practise13b extends Thread{
public void run(){
                // infinite loop
                while (true) { 
                               System.out.println("Welcome");
                                }
                }
}
public class cwh_13_q1 {
                public static void main(String[] args) {
                    practise13 p1 = new practise13();//creates an p1 object of the thread class
                    practise13b p2 = new practise13b();// creates an p2 object for the thread class
                    p1.start(); //Starts from the first and ends to the infinite
                    p2.start();// Starts from the first thread and runs upto the infinite
                }          
}
