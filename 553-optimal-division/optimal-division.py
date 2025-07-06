class Solution:
    def optimalDivision(self, nums):
        if len(nums) == 1:
            return str(nums[0])
        elif len(nums) == 2:
            return str(nums[0]) + '/' + str(nums[1])
        else:
            middle = ''
            for i in range(1, len(nums)):
                if i > 1:
                    middle += '/'
                middle += str(nums[i])
            return str(nums[0]) + '/(' + middle + ')'
