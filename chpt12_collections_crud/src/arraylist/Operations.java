package arraylist;

import java.util.List;

public interface Operations {
    void insertData(List<Emp> emp);
    
    void updateData(int id,String name);
    
    void deleteData(int id);
    
    void searchData(int id);
    
    void showData();
}
