package com.ozerian.test.task2;

import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * CollectionUtils class with utils method for
 * working with collection.
 */
public final class CollectionUtils {

    /**
     * getUniqueElements is util static method which takes input
     * collection as an argument and generates new collection
     * with unique elements by "num" value and with age is more than 20.
     *
     * @param elements Collection input collection for aggregation.
     * @return Collection with unique elements.
     */
    public static Collection<Element> getUniqueElements(Collection<Element> elements) {
        Set<Element> uniqueResults = elements
                .stream()
                .filter(element -> element.getAge() > 20)
                .collect(Collectors.toSet());

        return uniqueResults;
    }
}
