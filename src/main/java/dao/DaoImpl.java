package dao;

public class DaoImpl implements IDao{
    @Override
    public double getData() {
        System.out.println("Version BDD");
        return 24;
    }
}
