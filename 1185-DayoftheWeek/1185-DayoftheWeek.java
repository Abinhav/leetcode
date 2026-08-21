// Last updated: 21/08/2026, 11:54:16
1import java.time.LocalDate;
2
3class Solution {
4    public String dayOfTheWeek(int day, int month, int year) {
5        LocalDate date = LocalDate.of(year, month, day);
6
7        String w= date.getDayOfWeek().toString();
8        String a=w.substring(1);
9        return w.charAt(0)+a.toLowerCase();
10    }
11}