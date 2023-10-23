class Solution {
    public int getVal(char ch){
        switch(ch){
            case 'I':return 1;
            case 'V':return 5;
            case 'X':return 10;
              case 'L':return 50;
               case 'C':return 100;
                case 'D':return 500; 
                 case 'M':return 1000;

        }
return -1;
    }




    public int romanToInt(String s) {
        int sum=0;
        for(int i=0;i<s.length()-1;i++){
            char ch1=s.charAt(i);
            char ch2=s.charAt(i+1);
    
            if(i<s.length()-1&&getVal(ch1)<getVal(s.charAt(i+1))){
                sum -=getVal(ch1);

            }else{
                sum +=getVal(ch1);
            }
        }
        return sum;
        
    }
}