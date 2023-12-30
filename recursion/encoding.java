import java.util.*;

public class encoding{
    public static void main(String[] args){
        ArrayList<String> list = decoder("1120262");
        System.out.print(list);
    }

    public static ArrayList<String> decoder(String encoded ){
        if (encoded.length()==0){
            ArrayList<String> list = new ArrayList<>();
            list.add("");   
            return list;
        }
        else if (encoded.charAt(0)=='0'){
            ArrayList<String> list = new ArrayList<>();
            return list;
        }
        else if (encoded.length()==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(String.valueOf((char)(64+(int)(encoded.charAt(0))-(int)('0'))));
            return list;
        }
        else{
            if (encoded.charAt(1)!='0'){
                ArrayList<String> list = decoder(encoded.substring(1));
                for (int i=0 ; i<list.size() ; i++){
                    list.set(i,(char)(64+(int)(encoded.charAt(0))-(int)('0'))+list.get(i));
                }
                if (Integer.parseInt((encoded.substring(0,2)))<27){
                    ArrayList<String> list1 = decoder((encoded.length()>2)?encoded.substring(2):"");
                    for (int i=0 ; i<list1.size() ; i++){
                        list1.set(i,(char)(64+(Integer.parseInt(encoded.substring(0,2))))+list1.get(i));
                    }
                    list.addAll(list1);
                    return list;
                }
                else{
                    return list;
                }
            }
            else{
                if (Integer.parseInt((encoded.substring(0,2)))<27){
                    ArrayList<String> list1 = decoder((encoded.length()>2)?encoded.substring(2):"");
                    for (int i=0 ; i<list1.size() ; i++){
                        list1.set(i,(char)(64+(Integer.parseInt(encoded.substring(0,2))))+list1.get(i));
                    }
                    return list1;
                }
                else{
                    return decoder("");
                }
            }
        }
    }
}