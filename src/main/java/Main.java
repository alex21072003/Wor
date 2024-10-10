import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {

            System.out.println("Enter your hour");
            int hour = new Scanner(System.in).nextInt();
            System.out.println("Enter your minute");
            int minute = new Scanner(System.in).nextInt();
            if(hour == 10 && minute == 0){
                System.out.println("Your teacher is come to school");
            }
            if(hour == 10 && minute == 30|| hour == 10&& minute == 31|| hour == 10 && minute ==32||
            hour == 10 && minute ==33||hour == 10&&minute==34||hour==10 && minute ==35|| hour == 10 && minute==36||
            hour == 10 && minute ==37||hour == 10&&minute ==38||hour==10&&minute==39||hour == 10&&minute==40||
            hour == 10 &&minute == 41||hour == 10&& minute==42||hour==10&&minute==43||hour==10&&minute==44||
                    hour==10 && minute ==45|| hour == 10&&minute==46||hour==10&& minute==47|| hour==10&&minute==48||
            hour ==10&&minute==49||hour == 10&&minute == 50){
                System.out.println("you are at the first lecture");
            }
            if(hour == 10&&minute==51||hour == 10&&minute ==52|| hour == 10&& minute == 53||hour == 10||minute == 54||
            hour == 10 && minute == 55||hour == 10&&minute == 56||hour== 10&&minute ==57|| hour== 10&&minute==58||
            hour == 10&&minute ==59||hour ==12&&minute == 0){
                System.out.println("you can ask questions about this lesson");
                if(hour == 12){
                    System.out.println("The teacher you can talk about idividual lessons ");
                }
                if(hour == 13 && minute == 20 || hour== 13 &&minute == 21&&hour == 13&&minute == 22||
                hour == 13&& minute ==23&& hour ==13 && minute == 24&& hour == 13&& minute ==25||
                hour == 13 && minute == 26||hour == 13 && minute == 27&& hour == 13&& minute == 28||hour ==13&&minute==2||
                hour ==13&&minute==30){
                    System.out.println("teacher has lunch");
                }
                if(hour == 13 &&minute == 40||hour == 13&& minute == 41||hour == 13|| minute == 42||hour==13&&minute==43
                ||hour==13&&minute ==44||hour==13&&minute==45||hour==13&&minute==46||hour==13&&minute==47
                ||hour ==13&&minute==48||hour == 13 && minute == 49|| hour ==13 && minute ==50|| hour ==13&&minute==51
                ||hour == 13&& minute ==52||hour==13&&minute==53||hour==13&&minute==54||hour==13&&minute==55
                ||hour == 13&&minute==56||hour ==13&&minute==57||hour==13&&minute==58||hour==13&&minute==59||hour==14&&minute==00){
                    System.out.println("Teacher is a second lesson");
                }
                if(hour == 14){
                    System.out.println("The teacher you can talk to you about idividual lessons");
                }
                if(hour == 15){
                    System.out.println("The teacher can  talk to you about idividual lessons");
                }
                if(hour ==16){
                    System.out.println("The teacher  can talk to you about idividual lessons");
                }
                if(hour == 17){
                    System.out.println("The teacher can talk  to you  about idividual lessons");
                }
                if(hour ==18 && minute ==0||hour==18&&minute==1||hour==18&&minute==2||hour==18&&minute==3||hour==18&&minute==4
                ||hour==18&&minute==4||hour==18&&minute==5||hour==18&&minute==6||hour==18&&minute==7||
                hour==18&&minute==8||hour==18&&minute==9||hour==18&&minute==10||hour==18&&minute==11||
                hour==18&&minute==12||hour==18&&minute==13||hour==18&&minute==14||hour==18&&minute==15||
                hour==18&&minute==16||hour==18&&minute==17||hour==18&&minute==18||hour==18&&minute==19||
                hour==18&&minute==20||hour==18&&minute==21||hour==18&&minute==22||hour==18&&minute==23||
                hour==18&&minute==24||hour==18&&minute==25||hour==18&&minute==26||hour==18&&minute==27||
                hour==18&&minute==28||hour==18&&minute==29||hour==18&&minute==30||hour==18&&minute==31||
                hour==18&&minute==32||hour==18&&minute==33||hour==18&&minute==34||hour==18&&minute==35||
                hour==18&&minute==36||hour==18&&minute==37||hour==18&&minute==38||hour==18&&minute==39||
                hour==18&&minute==40||hour==18&&minute==41||hour==18&&minute==42||hour==18&&minute==43||
                hour==18&&minute==44||hour==18&&minute==45||hour==18&&minute==46||hour==18&&minute==47||
                hour==18&&minute==48||hour==18&&minute==49||hour==18&&minute==50||hour==18&&minute==51||
                hour==18&&minute==52||hour==18&&minute==53||hour==18&&minute==54||hour==18&&minute==55||
                hour==18&&minute==56||hour==18&&minute==57||hour==18&&minute==58||hour==18&&minute==59||
                hour==19&&minute==0||hour==19&&minute==1||hour==19&&minute==2||hour==19&&minute==3||
                hour==19&&minute==4||hour==19&&minute==5||hour==19&&minute==6||hour==19&&minute==7||
                hour==19&&minute==8||hour==19&&minute==9||hour==19&&minute==10||hour==19&&minute==11||
                hour==19&&minute==12||hour==19&&minute==13||hour==19&&minute==14||hour==19&&minute==15||
                hour==19&&minute==16||hour==19&&minute==17||hour==19&&minute==18||hour==19&&minute==19||
                hour==19&&minute==20||hour==19&&minute==21||hour==19&&minute==22||hour==19&&minute==23||
                hour==19&&minute==24||hour==19&&minute==25||hour==19&&minute==26||hour==19&&minute==27||
                hour==19&&minute==28||hour==19&&minute==29||hour==19&&minute==30){
                    System.out.println("Teacher in a third lesson");
                }
                if(hour==19&&minute==31||hour==19&&minute==32||hour==19&&minute==33||hour==19&&minute==34||
                hour==19&&minute==35||hour==19&&minute==36||hour==19&&minute==37||hour==19&&minute==38||
                hour==19&&minute==40||hour==19&&minute==41||hour==19&&minute==42||hour==19&&minute==43||
                hour==19&&minute==44||hour==19&&minute==45||hour==19&&minute==46||hour==19&&minute==47||
                hour==19&&minute==48||hour==19&&minute==49||hour==19&&minute==50){
                    System.out.println("The teacher can talk to you about idividual lessons");
                }
                if(hour == 19&&minute==51||hour==19&&minute==52||hour==19&&minute==53||hour==19&&minute==54||
                hour==19&&minute==55||hour==19&&minute==56||hour==19&&minute==57||hour==19&&minute==58||
                hour==19&&minute==59){
                    System.out.println("Teacher prepares and take his closes to backpack");
                }
                if(hour==20){
                    System.out.println("Teacher goes to his car and go home");
                }
                if(hour ==21) {
                    System.out.println("teacher is home he watches TV but,students can write him  about individual lessons");
                }
                if(hour== 22){
                    System.out.println("Teacher prepares and go to bed");
                }
                if(hour==23){
                    System.out.println("teacher is sleeping");
                }
                if(hour==0){
                    System.out.println("teacher is sleeping");
                }
                if(hour==1){
                    System.out.println("teacher is sleeping");
                }
                if(hour==2){
                    System.out.println("teacher is sleeping");
                }
                if(hour==3){
                    System.out.println("teacher is sleeping");
                }
                if(hour==4){
                    System.out.println("teacher is sleeping");
                }
                if(hour== 5){
                    System.out.println("teacher is sleeping");
                }
                if(hour==6){
                    System.out.println("teacher is sleeping");
                }
                if(hour==7){
                    System.out.println("teacher is sleeping");
                }
                if(hour==8){
                    System.out.println("teacher is wakes up he prepares to go colledge");
                }
                if(hour==9){
                    System.out.println("teacher is sitting to the car and go to colledge");
                }



            }
        }
    }
}