package cwh_11;
// create an abstrac5t class pen with methods write() and refil() abstract methods
abstract class pen{
                abstract void write();
                abstract void refil();
       } 
       class Fountainpen extends pen{
                void write() {
                System.out.println("Writing...");
                }
                void refil() {
                System.out.println("Refilling....");
                }
                void changenib(){
                System.out.println("Nibbbbbb changeeeeed");
                }
       }
public class cwh_11_q1 {
                public static void main(String[] args) {
                                Fountainpen krishu = new Fountainpen();
                                krishu.write();
                                krishu.refil();
                                krishu.changenib();
                }
}

