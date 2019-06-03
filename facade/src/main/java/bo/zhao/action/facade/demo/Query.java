package bo.zhao.action.facade.demo;

/**
 * @author Bo.Zhao
 * @since 19/6/3
 */
public class Query {

    private DB db;

    private LocalCache localCache;

    public Query() {
        db = new DB();
        localCache = new LocalCache();
    }


    public String query(String id) {
        String data = localCache.getById(id);
        if (data == null) {
            data = db.query(id);
        }
        return data;
    }
}
