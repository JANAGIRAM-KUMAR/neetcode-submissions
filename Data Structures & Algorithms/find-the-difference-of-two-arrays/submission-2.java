class Solution { public List<List<Integer>> findDifference(int[] nums1, int[] nums2) { Set<Integer> set1 = new HashSet<>(), set2 = new HashSet<>(); for(int n : nums1) set1.add(n); for(int n : nums2) set2.add(n); List<Integer> l1 = new ArrayList<>(), l2 = new ArrayList<>();for(int n : set1) if(!set2.contains(n)) l1.add(n); for(int n : set2) if(!set1.contains(n)) l2.add(n); return Arrays.asList(l1,l2); }}
    
        
