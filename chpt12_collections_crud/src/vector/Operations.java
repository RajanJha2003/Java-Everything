package vector;


import java.util.Vector;

public interface Operations {
    void insertData(Vector<Emp> emp);
    
    void updateData(int id,String name);
    
    void deleteData(int id);
    
    void searchData(int id);
    
    void showData();

	

	
}
