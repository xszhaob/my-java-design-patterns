package bo.zhao.action.facade.demo;

/**
 * @author Bo.Zhao
 * @since 19/6/3
 */
public class LocalCache {

    public String getById(String id) {
        // 模拟命中缓存
        if (System.currentTimeMillis() % 2 == 0) {
            return "local cache data for " + id;
        } else {
            return null;
        }
    }
}
