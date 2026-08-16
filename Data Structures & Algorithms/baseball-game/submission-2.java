class Solution {
    public int calPoints(String[] operations) {
       Stack<Integer> s = new Stack<>();
       int len = operations.length;
       int sum = 0;
       for(int i=0;i<len;i++) {
        switch(operations[i]) {
            case "1" :
                s.push(1);
                break;
            case "2" :
                s.push(2);
                break;
            case "5" :
                s.push(5);
                break;
            case "+" :
                s.push(s.get(s.size()-1) + s.get(s.size()-2));
                break;
            case "C" :
                s.pop();
                break;
            case "D" :
                s.push((s.get(s.size() -1)) * 2);
                break;
            default:
                s.push(Integer.parseInt(operations[i]));
        }
       }
        while(!s.isEmpty()) {
            sum += s.pop();
        }
       return sum; 
    }
}