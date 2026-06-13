package lecture15and16.activity;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/* Lecture 16:
   Learning Objectives
   - Understand and Write code with generics <E> <T> etc.
   - Implement the validator generically using a dependency on the element type Comparable<T>
   - Discuss Optional<T>
 */
public class Examples {
    @Test
    public void validBST() {
        IBinTree<Integer> mt = new BTEmpty<>();
        IBinTree<Integer> bst123 =
                new BTNode<>(2,
                        new BTNode<>(1, mt, mt),
                        new BTNode<>(3, mt, mt));

        IBinTree<Integer> bst1234 =
                new BTNode<>(2,
                        new BTNode<>(1, mt, mt),
                        new BTNode<>(3, mt,
                                new BTNode<>(4, mt, mt)));
        IBinTree<Integer> bst1234also =
                new BTNode<>(3,
                        new BTNode<>(2, new BTNode<>(1, mt, mt), mt),
                        new BTNode<>(4, mt, mt));
        assertTrue(new ValidatorBST<Integer>().validAdd(bst123, 4, bst1234));
        assertTrue(new ValidatorBST<Integer>().validAdd(bst123, 4, bst1234also));
    }
}