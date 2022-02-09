package panza.sam._4o_tam_v_guave;

import com.google.common.collect.Multimap;

import javax.annotation.Nonnull;
import java.util.function.Function;

public class InverseMultimap<K, V> implements Function<Multimap<K, V>, Multimap<V, K>> {
    @Override
    @Nonnull
    public Multimap<V, K> apply(@Nonnull Multimap<K, V> that) {
        //TODO
        throw new UnsupportedOperationException();
    }
}
