package Problem20210428;

import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

class Solution {
    
    public int solution(String[] lines) {
        int answer = 1;
        List<Long> s_list = new ArrayList<>();
        List<Long> e_list = new ArrayList<>();
        
        for (String s : lines) {
            int n = s.length();
            int index = s.lastIndexOf(" ");
            String responseTime = s.substring(0, index);
            String duration = s.substring(index+1, n-1);
            
            //Pair<Long, Long> p = getIncludedTime(responseTime, duration);
            
            //s_list.add(p.getKey());
            //e_list.add(p.getValue());
        }
        
        int n = s_list.size();
        for (int i=0; i<n-1; i++) {
            long end_time = e_list.get(i);
            long start_time = s_list.get(i);
            int cnt = 1;
            for (int j=i+1; j<n; j++) {
                long s = s_list.get(j);
                long e = e_list.get(j);
                
                if (Math.abs(end_time-s) < 1000 || Math.abs(end_time-e) < 1000
                    || Math.abs(start_time-s) < 1000 || Math.abs(start_time-e) < 1000
                    || start_time <= s && e <= end_time
                    || s <= start_time && end_time <= e
                   ) {
                    cnt++;
                }
            }
            answer = Math.max(answer, cnt);
        }
           
        return answer;
    }
    
    /*public Pair<Long, Long> getIncludedTime(String responseTime, String duration) {
        float d = Float.parseFloat(duration);
       
        ZonedDateTime zdt = LocalDateTime.parse(responseTime, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS" , Locale.US ))
            .atZone(ZoneId.of( "Asia/Seoul" ));
        //System.out.println(zdt);
        
        ZonedDateTime zdt_end = zdt;
        long long_end = zdt_end.toInstant().toEpochMilli();
        long long_start = (long_end-(long)(d*1000-1));

        return new Pair<>(long_start, long_end);
    }*/
}
