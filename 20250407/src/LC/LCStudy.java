package LC;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class LCStudy {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //20250407 task1
        //指针实现：
        int p1 = m-1; //指向nums1的最后一个有效元素
        int p2 = n-1; //指向nums2的最后一个元素
        int p = m + n -1; //指向nums1的最后位置

        //从后往前遍历
        while(p1>=0&&p1>=0){
            if (nums1[p1] > nums2[p2]){
                nums1[p1] = nums1[p1];
                p1--;
            }else{
                nums1[p] = nums2[p2];
                p2--;
            }
            p--;
        }
        System.arraycopy(nums2, 0, nums1, 0, p2 + 1);
    }
    //20250407 task2
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>(); //定义一个List变量作为返回
        middleOrder(root,res);
        return res;
    }
    public void middleOrder(TreeNode root,List<Integer> res){
        if (root == null) return;
        middleOrder(root.left,res);
        res.add(root.val);
        middleOrder(root.right,res);
    }
    //20250407 task3
    //获取二叉树的最大深度
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        int leftHeight = maxDepth(root.left); //递归计算左子树的最大深度
        int rightHeight = maxDepth(root.right); //递归计算右子树的最大深度
        return Math.max(leftHeight,rightHeight)+1; //加上最初的根节点
    }

}
