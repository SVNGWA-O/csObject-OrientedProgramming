package lecture15and16.activity;

public class ValidatorBST<E extends Comparable<E>> implements IBTValidator<E>{

    /**
     * Check if adding elt to the old tree and getting the new tree is possible with the current invariants
     *
     * @param oldTree the given tree we assume respects the invariants
     * @param elt     the element to add
     * @param newTree the new tree which we are validating
     * @return true if we determine that the new tree respects the invariants
     */
    @Override
    public boolean validAdd(IBinTree<E> oldTree, E elt, IBinTree<E> newTree) {
        boolean newEltInOutput = contains(newTree, elt);
        boolean newTreeHasEverything = containsAll(newTree, oldTree);
        boolean noExtraGarbage = newTree.size() == oldTree.size()+1;
        boolean bstInvariant = invariant(newTree);
        return newEltInOutput && newTreeHasEverything && noExtraGarbage & bstInvariant;
    }

    public boolean contains(IBinTree<E> someTree, E elt ){
        if(someTree.isEmpty()){
            return false;
        }
        else {
            return someTree.getRoot().equals(elt) ||
                    this.contains(someTree.getLeft(),elt)
                    || this.contains(someTree.getRight(),elt);
        }
    }

    public boolean containsAll(IBinTree<E> container, IBinTree<E> elements ){
        if(elements.isEmpty()){
            return true;
        }
        else{
            return this.contains(container, elements.getRoot()) &&
                    this.containsAll(container, elements.getLeft())
                    && this.containsAll(container, elements.getRight());
        }
    }

    public boolean invariant(IBinTree<E> someTree){
        if(someTree.isEmpty()){
            return true;
        }
        else{
            E root = someTree.getRoot();
            return  smallerThanAll(root, someTree.getLeft()) && biggerThanAll(root, someTree.getRight());
        }
    }

    private boolean biggerThanAll(E root, IBinTree<E> someTree) {
        if(someTree.isEmpty()){
            return true;
        }
        else{
            return root.compareTo(someTree.getRoot())>0 &&
                    biggerThanAll(root, someTree.getLeft()) &&
                    biggerThanAll(root, someTree.getRight());
        }
    }

    public Boolean smallerThanAll(E elt, IBinTree<E> someTree){
        if (someTree.isEmpty()){
            return true;
        }
        else {
            return elt.compareTo(someTree.getRoot())<0 &&
                    smallerThanAll(elt, someTree.getLeft())
                          && smallerThanAll(elt,someTree.getRight());
        }
    }

    /**
     * Check if removing elt from the old tree and getting the new tree is possible with the current invariants
     *
     * @param oldTree the given tree we assume respects the invariants
     * @param elt     the element to remove
     * @param newTree the new tree which we are validating
     * @return true if we determine that the new tree respects the invariants
     */
    @Override
    public boolean validRemove(IBinTree<E> oldTree, E elt, IBinTree<E> newTree) {
        return false;
    }
}
