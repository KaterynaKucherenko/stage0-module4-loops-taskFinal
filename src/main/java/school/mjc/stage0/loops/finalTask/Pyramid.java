package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
String a="";
	for(int i=1; i<=cathetusLength; i++){
	      int x=i;
	       for (int j=i; j<=cathetusLength; j++){
	           a+=" ";}
	       for (int j=1; j<=i; j++){
	            a+=(x--);}
	       for (int j=2; j<=i; j++){
	           a+=j;
	       }
	       if(i<cathetusLength){
	        a+="\n";}}
	        System.out.println(a);
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
