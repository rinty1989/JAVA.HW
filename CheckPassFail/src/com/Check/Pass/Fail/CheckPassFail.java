package com.Check.Pass.Fail;

public class CheckPassFail {
public static void main(String[] args){
	int mark=50;
	System.out.println("Mark is"+ mark);

if(mark>=50){
	System.out.println("Mark A is");
}
else if (mark<25 && mark> 59){
	System.out.println("Mark B is");
}
else if( mark <45 && mark>=50){
	System.out.println("Mark is c");
}
else{
	System.out.println("Mark is lost");
}
}
}
