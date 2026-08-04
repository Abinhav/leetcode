// Last updated: 04/08/2026, 12:46:50
1class Solution {
2   public String findReplaceString(String S, int[] indexes, String[] sources, String[] targets) {
3        List<int[]> indexList = new LinkedList<>();
4        for (int i = 0; i < indexes.length; i++) {
5            indexList.add(new int[]{indexes[i], i});
6        }
7        Collections.sort(indexList, (a, b) -> a[0] - b[0]);
8        StringBuilder sb = new StringBuilder();
9        int last = 0;
10        for (int[] index : indexList) {
11            int strIndex = index[0];
12            int sourceIndex = index[1];
13            if (S.substring(strIndex).indexOf(sources[sourceIndex]) == 0) {
14                sb.append(S.substring(last, strIndex));
15                sb.append(targets[sourceIndex]);
16                last = strIndex + sources[sourceIndex].length();
17            }
18        }
19        if (last != S.length()) {
20            sb.append(S.substring(last));
21        }
22        return sb.toString();
23}
24}