public class paterns1 {
    public static void main(String args[]){
        //Solid Rectange
        //for(int i=0;i<4;i++){
          //System.out.print("\n");
            //for(int j=0;j<5;j++)
            //System.out.print("*");
        //}

        //Hollow Rectange
        //int h=4;
        //int w=5;
        //for(int j=1; j<=h; j++){  
    //for(int i=1; i<=w; i++){
      //if(j ==1 || j==h || i==1 || i==w){
        //System.out.print("*");
      //}
      //else{
           //System.out.print(" ");
      //}
    //}
     //System.out.println();
  //} 
 //}
//}

//half pyramind
//*
//**
//***
//**** 
//int h=4;
//int w=4;
//for(int i=1 ; i<=h ; i++){
    //for(int j=1 ; j<=w ; j++){
        //if(j<=i){
            //System.out.print("*");
        //}else{
            //System.out.print(" ");
        //}}
        //System.out.println();
    //}}}

    //inverted half pyramid
    //****
    //***
    //** 
    //* 
    //int n=5;
    //for(int i=n; i>=1; i--){
        //for(int j=1; j<=i; j++){
            //System.out.print("*");
        //}System.out.println();
    //}}}
      
    //inverted half pyramid(180deg)
    //   *
    //  **
    // ***
    //****
    //int n=5;
    //for(int i=1; i<=n-1; i++){
        //for(int j=1; j<=n-i; j++){
            //System.out.print(" ");
        //}
        //for(int j=1; j<=i; j++){
            //System.out.print("*");
        //}System.out.println();
    //}}}

    //half pyramid with numbers
    //int n=5;
    //for(int i=1; i<=5; i++){
        //for(int j=1; j<=i; j++){
            //System.out.print(j);
        //}System.out.println();
    //}}}

    //inverted half pyramid with numbers
    //int n=5;
    //for(int i=1; i<=n; i++){
        //for(int j=1; j<=n-i+1; j++){
            //System.out.print(j);
            //}System.out.println();
    //}}}

    //flyod's triangle
    //int n=6;//number of rows
    //int number=1;
    //for(int i=1; i<=n; i++){
        //for(int j=1; j<i; j++){
            //System.out.print(number);
            //number++;
        //}System.out.println();
    //}}}

    //0-1 triangle
    int n=5;
    for(int i=1; i<=n; i++){
        for(int j=1; j<=i; j++){
            if((i+j)%2==0){
                System.out.print("1");
            }else{System.out.print("0");}
        }System.out.println();
    }}}