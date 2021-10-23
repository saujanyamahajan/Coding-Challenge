package October.day23;



//451. Sort Characters By Frequency
//https://leetcode.com/problems/sort-characters-by-frequency/


class Solution {
    public String frequencySort(String s)
    {
        HashMap<Character, Integer> map = new HashMap<>();
        int n = s.length();
        
        for(int i = 0; i<n; i++)
        {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        
        PriorityQueue<Character> maxHeap = new PriorityQueue<>((a,b) -> map.get(b)- map.get(a));
        
        maxHeap.addAll(map.keySet());
        
        StringBuilder res = new StringBuilder();
        
        while(!maxHeap.isEmpty())
        {
            char current = maxHeap.remove();
            for(int i = 0; i<map.get(current); i++) 
            {
                res.append(current);                
            }
        }
        return res.toString();                

    }
}