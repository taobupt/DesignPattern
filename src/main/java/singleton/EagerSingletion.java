package singleton;

/**
 * Created by tao on 3/20/17.
 */
public class EagerSingletion {
    //当类加载时，静态成员 instance 会被初始化，类的私有构造函数会被调用，，单例类的唯一实例会被调用
    private EagerSingletion() {

    }

    private static final EagerSingletion instance = new EagerSingletion();

    public static EagerSingletion getInstance() {
        return instance;
    }
}
