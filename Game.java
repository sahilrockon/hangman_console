package hangman;
import java.util.Scanner;
public class Game {
String pl1 ;int sco1;
String pl2;int sco2;

	public static void main(String[] args) {
     start();
		Game ob=new Game();
     String a="yes";
		do{
		ob.sco1=ob.sco1+ob.game(ob.pl1);
		ob.sco2=ob.sco2+ob.game(ob.pl2);
		System.out.println("\n\n SCORES :: "+ob.pl1+": "+ob.sco1+" ||  "+ob.pl2+" : "+ob.sco2);
		System.out.println("\n\nENTER yes/no :        yes : continue || no : exit ");
		Scanner sc=new Scanner(System.in);
		a=sc.nextLine();
		}while(a.equals("yes"));
	}	
Game(){	
Scanner sc=new Scanner(System.in);
System.out.println("First Player \nEnter the Name: ");
pl1=sc.nextLine();
System.out.println("\nSecond Player\nEnter the Name: ");
pl2=sc.nextLine();
}		
	
/*static void start(){	
System.out.println("                                                              \n"+                
"88                                                                                  \n"+                
"88                                                                              \n"+                
"88                                                                                 \n"+                
"88,dPPYba,  ,adPPYYba, 8b,dPPYba,   ,adPPYb,d8 88,dPYba,a,dPYba,  ,adPPYYba, 8b,dPPYba,      \n"+                
"88P'    a8a aa     `Y8 88P'   `a8a a8a    `Y88 88P'    88      8a aa     `Y8 88P'   ` 8a     \n"+                
"88       88 ,adPPPPP88 88       88 8b       88 88      88      88 ,adPPPPP88 88       88     \n"+                
"88       88 88,    ,88 88       88 a8a,   ,d88 88      88      88 88,    ,88 88       88    \n"+                
"88       88 `a8bbdPaY8 88       88  `aYbbdPaY8 88      88      88 `a8bbdPaY8 88       88     \n"+                
 "                                   aa,    ,88 \n"+                        
 "                                    aY8bbdPa  ");
                   		
	
}*/


int game(String pl1){
data obj=new data();	
int k=(int)Math.floor(Math.random()*(obj.words.length));
String m=obj.words[k];
m=m.toUpperCase();
int bla=0;
StringBuilder sb=new StringBuilder(m);
for(int i=0;i<m.length()/2;++i){
int se=(int)Math.floor(Math.random()*(m.length()));
if(sb.charAt(se)!='_'){
sb.setCharAt(se,'_');
++bla;
}else{--i;}
}

System.out.println("\n\nLOADING........ \n YOUR TURN   : "+pl1+"  WORD  IS :  "+sb);
System.out.println("ENTER YOUR ANSWER :  ");
Scanner sc=new Scanner(System.in);
String j=sc.nextLine();
j=j.toUpperCase();
if(m.equals(j)){
	win();
return 5;}else{
	System.out.println("CORRECT ANSWER :"+m);
	hanged();
 return -3;}

}

static void hanged(){
System.out.println("               \n"+
"             ____________                      \n"+
"	     |/      |                   \n"+
"	     |      (_)                   \n"+
"	     |      \\|/                  \n"+
"	     |       |                   \n"+
"	     |      / \\               \n"+
"	     |                         \n"+
"	_____|___");	
}

static void win(){
	
System.out.println("       \n"+
"          ______                 \n"+ 
"|      |    |    |\\    |    \n"+
"|      |    |    | \\   |     \n"+ 
"|  /\\  |    |    |  \\  |   \n"+
"| /  \\ |    |    |   \\ |    \n"+
"|/    \\| ___|___ |    \\|    \n"+
 "        ");	
	
	
}static void start(){
System.out.println("                                  \n"+                                        
"| |                                                      \n"+
"| |__   __ _ _ __   __ _ _ __ ___   __ _ _ __            \n"+ 
"| '_ \\ / _` | '_ \\ / _` | '_ ` _ \\ / _` | '_ \\        \n"+
"| | | | (_| | | | | (_| | | | | | | (_| | | | |        \n"+
"|_| |_|\\__,_|_| |_|\\__, |_| |_| |_|\\__,_|_| |_|    \n"+
  "                    __/ |                         \n"+
     "                   |___/  ");	 
	
	
	
	
	
}

}