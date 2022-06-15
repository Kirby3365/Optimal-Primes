class PrimeNumberChecker{
  static boolean CheckPrimeNum(int num){
    int timesDivided = 0;
    for(int i = 1; i <= num; i++){
      if((num % i) <= 0){
        timesDivided++;
      }
    }
    
    if(timesDivided == 2)
      return true;
    
    return false;
  }
}