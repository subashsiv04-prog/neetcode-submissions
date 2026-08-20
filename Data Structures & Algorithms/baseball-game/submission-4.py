class Solution:
    def calPoints(self, operations: List[str]) -> int:
        score = []
        for i in range(len(operations)):
            if operations[i] == "D":
                d = 2 * int(score[-1])
                score.append(d)
            elif operations[i] == "C":
                score.pop()
            elif operations[i] == "+":
                s = int(score[-1]) + int(score[-2])
                score.append(s)
            else:
                score.append(int(operations[i]))
        return sum(score)
   





