class Solution {
    public Node lowestCommonAncestor(Node p, Node q) {
        Node pt1 = p,pt2 = q;
        while(pt1 != pt2){
            pt1 = (pt1 != null) ? pt1.parent : q;
            pt2 = (pt2 != null) ? pt2.parent : p;
        }
        return pt1;
    }
}