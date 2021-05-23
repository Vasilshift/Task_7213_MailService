package PackTest_1;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class MailService <T> implements Consumer<Vocabulary<T>>{

    @Override
    public void accept(Vocabulary<T> tVocabulary) {

    }

    public Map<String, List<T>> getMailBox() {

        return ;
    }

    public static class MyHashMap<K, V> extends HashMap<K, V> {
        @Override
        public V get(Object key) {
            return super.get(key);
        }
    }
    @Override
    public void accept(Object o) {

    }

    @Override
    public Consumer andThen(Consumer after) {
        return null;
    }
}
