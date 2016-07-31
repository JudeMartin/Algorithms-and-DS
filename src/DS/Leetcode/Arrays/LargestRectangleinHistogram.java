/* https://leetcode.com/problems/largest-rectangle-in-histogram/ */
public class Solution {
    public int largestRectangleArea(int[] input) {
        Deque<Integer> stack = new LinkedList<>();
        int maxArea = 0;
        int area = 0;
        int i;
        for(i = 0; i < input.length;) {
            if(stack.isEmpty() || input[i] >= input[stack.peekFirst()]) {
                stack.offerFirst(i++);
            } else {
                int top = stack.pollFirst();
                if(stack.isEmpty()) {
                    area = (input[top] * i); 
                } else {
                    area = (input[top] * (i - stack.peekFirst() - 1));
                }
                if(area > maxArea) {
                    maxArea = area;
                }
            }
        }
        while(!stack.isEmpty()) {
            int top = stack.pollFirst();// it's poll -> remove the element from the stack and not peek
            if(stack.isEmpty()) {
                area = input[top] * i;
            } else {
                area = input[top] * (i - stack.peekFirst() - 1);                
            }
            if(area > maxArea) {
                maxArea = area;
            }
        }
        return maxArea;
    }
}
