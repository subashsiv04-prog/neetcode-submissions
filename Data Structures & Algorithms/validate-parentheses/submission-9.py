class Solution:
    def isValid(self, s: str) -> bool:
        maps = {")": "(", "}": "{", "]": "["}
        l = []
        for a in s:
            if a in maps:
                if l and l[-1] == maps[a]:
                    l.pop()
                else:
                    return False
            else:
                l.append(a)
        return not l