class Solution:
    def maximalRectangle(self, matrix):
        if not matrix:
            return 0
        
        n, m = len(matrix), len(matrix[0])
        heights = [0] * m
        max_area = 0
        
        for row in matrix:
            # Update histogram heights
            for j in range(m):
                if row[j] == "1":
                    heights[j] += 1
                else:
                    heights[j] = 0
            
            # Compute largest rectangle in histogram
            max_area = max(max_area, self.largestRectangleArea(heights))
        
        return max_area
    
    def largestRectangleArea(self, heights):
        stack = []
        max_area = 0
        heights.append(0)  # sentinel
        
        for i, h in enumerate(heights):
            while stack and heights[stack[-1]] > h:
                height = heights[stack.pop()]
                width = i if not stack else i - stack[-1] - 1
                max_area = max(max_area, height * width)
            stack.append(i)
        
        heights.pop()
        return max_area