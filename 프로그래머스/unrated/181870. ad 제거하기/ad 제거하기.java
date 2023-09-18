
import java.util.ArrayList;
class Solution {
   public String[] solution(String[] strArr) {
        ArrayList<String> arrayList = new ArrayList<>();

        for (String str : strArr)
            if (!str.contains("ad"))
                arrayList.add(str);

        int idx = 0;
        String[] answer = new String[arrayList.size()];
        for (String str : arrayList)
            answer[idx++] = str;
        return answer;
    }
}