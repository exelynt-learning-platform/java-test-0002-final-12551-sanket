package TestPattern;

public class StarPattern{
	public static void main(String[] args){
	 for(int line=1;line<=5;line++){
		 for(int space=4;space>=line;space--){
			 System.out.print(" ");
		 }
		 for(int ast=1;ast<=line;ast++){
			 if(line==1 || ast==1 || ast==5 || ast==line){
			 System.out.print("* ");
		 }else{
			 System.out.print("  ");
		 }
		 }
		 System.out.println();
	 }
	 for(int i=1;i<=4;i++){
		 for(int j=1;j<=i;j++){
		 System.out.print(" ");
	 }
	 for(int k=4;k>=i;k--){
		 if(i==4 || k==1 || k==4 || k==i){
		 System.out.print("* ");
	 }else{
		 System.out.print("  ");
	 }
	 }
	 System.out.println();
	 }
   }
}