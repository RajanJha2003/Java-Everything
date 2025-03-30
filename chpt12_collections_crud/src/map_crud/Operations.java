package map_crud;




import java.util.Map;

public interface Operations {
    void insertData(Map<Integer, String> students);
    
    void updateData(int id,String name);
    
    void deleteData(int id);
    
    void searchData(int id);
    
    void showData();
}

