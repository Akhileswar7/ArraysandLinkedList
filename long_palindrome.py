class long_palindrome:
    def longestPalindrome(self, s: str) -> str:
        long=""
        def find(self,left,right):
            while left>=0 and right<len(s) and s[left]==s[right]:
                left-=1
                right+=1
            return s[left+1:right]
        for i in range(len(s)):
            s1=find(s,i,i)
            if len(s1)>len(long):
                long=s1
            s2=find(s,i,i+1)
            if len(s2)>len(long):
                long=s2
        print(long)
a=long_palindrome()
a.longestPalindrome("akhillihk")