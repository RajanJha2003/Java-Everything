package treeset;

import java.util.TreeSet;


public interface Operations {
    void insertData(TreeSet<Emp> emp);
    
    void updateData(int id,String name);
    
    void deleteData(int id);
    
    void searchData(int id);
    
    void showData();
}
