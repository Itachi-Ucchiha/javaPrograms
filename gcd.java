public class rough {
    public static void main(String[] args) {

// ❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌
    // --------------my code -------------
    int x1 =72;
    int y1 =6;
    for(int i =y1; i>0;i--){
        if(x1%i==0 && y1%i==0){ // problem will arise if y1>x1....not a valid code
            System.out.println(i);
            break;
        }
    }
// ❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌





// ✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅
    // ------training-----------------
    int x =72;
    int y =6;
    int gcd =1;    
    for(int i=1; i<=x && i<=y; i++){
        if(x%i==0 && y%i==0){
            gcd = i;
        }
    }
    System.out.println(gcd);
// ✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅


}
}
