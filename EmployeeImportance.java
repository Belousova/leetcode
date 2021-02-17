//690. Employee Importance
/*
// Definition for Employee.
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};
*/

class Solution {
    public int getImportance(List<Employee> employees, int id) {
        Map<Integer, Employee> map = new HashMap<>();
        for (int i=0; i<employees.size(); i++){
            map.put(employees.get(i).id, employees.get(i));
        }
        
        int sum = 0;
        Queue<Integer> q = new LinkedList<>();
        q.add(id);
        while (!q.isEmpty()) {
            Employee e = map.get(q.remove());
            sum += e.importance;
            for (int i=0; i<e.subordinates.size(); i++){
                q.add(e.subordinates.get(i));
            
            }
        
        }
        return sum;
    }
}
