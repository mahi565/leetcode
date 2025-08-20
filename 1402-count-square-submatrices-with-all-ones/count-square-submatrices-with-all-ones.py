class Solution:
    def countSquares(self, matrix: list[list[int]]) -> int:
        r, c = len(matrix), len(matrix[0])
        count = 0
        for i in range(r):
            for j in range(c):
                if matrix[i][j] == 1 and i > 0 and j > 0:
                    matrix[i][j] = min(
                        matrix[i-1][j],
                        matrix[i][j-1],
                        matrix[i-1][j-1]
                    ) + 1
                count += matrix[i][j]

        return count
