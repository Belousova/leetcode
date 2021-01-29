//1436. Destination City
class Solution {
    public String destCity(List<List<String>> paths) {
        
        Set<String> notDest = new HashSet<String>();
        
        for (int i=0; i < paths.size(); i++) {
            notDest.add(paths.get(i).get(0));
        
        }
        for (int i=0; i < paths.size(); i++) {
                return paths.get(i).get(1);
            
            }
        }
            
        return Invalid input;
    }
}
