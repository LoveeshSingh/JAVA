import java.util.*;

public class word_break{
    public static void main(String[] args){
        String str = "programmingisfunandchallenging";
        ArrayList<String> wordDict = new ArrayList<>();
        wordDict.add("programming");
        wordDict.add("is");
        wordDict.add("fun");
        wordDict.add("and");
        wordDict.add("challenging");
        wordDict.add("pro");
        wordDict.add("gram");
        wordDict.add("ming");
        wordDict.add("mingis");
        wordDict.add("funand");
        wordDict.add("challengingprogramming");
        ArrayList<String> list = wbreak(wordDict,str);
        System.out.println(list);
    }

    public static ArrayList<String> wbreak(ArrayList<String> dict , String str){
        if (str.equals("")){
            ArrayList<String> list = new ArrayList<>();
            list.add("");
            return list;
        }

        ArrayList<String> list = new ArrayList<>();
        for (int i=1 ; i<=str.length() ; i++){
            String str1 = str.substring(0,i);
            if (dict.contains(str1)){
                ArrayList<String> list1 = wbreak(dict,((i!=str.length())?(str.substring(i,str.length())):""));                 
                for(int j=0 ; j<list1.size() ; j++){
                    list1.set(j,str1+" "+list1.get(j));
                }
                list.addAll(list1);
            }
        }
        return list;
    }
}