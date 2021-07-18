import java.util.*;
public class DefangingIP {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String address = scn.next();
        String res = "";
        for(int i = 0; i<address.length(); i++){
            if(address.charAt(i) == '.'){
                res += "[.]";
            }else{
                res+=address.charAt(i);
            }
        }
        
        System.out.println(res);
    }
    }
}
