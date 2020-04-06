package datastructure.红黑树.删除.情景2;

public class 删除情景212 {
    /**
     * 删除情景2.1.2：替换结点的兄弟结点是黑结点
     * 当兄弟结点为黑时，其父结点和子结点的具体颜色也无法确定
     * （如果也不考虑自底向上的情况，子结点非红即为叶子结点Nil，Nil结点为黑结点），此时又得考虑多种子情景。
     *
     *
     * 删除情景2.1.2.1：替换结点的兄弟结点的右子结点是红结点，左子结点任意颜色
     * 即将删除的左子树的一个黑色结点，显然左子树的黑色结点少1了，然而右子树又又红色结点，
     * 那么我们直接向右子树“借”个红结点来补充黑结点就好啦，此时肯定需要用旋转处理了。如图22所示。
     *
     将S的颜色设为P的颜色
     将P设为黑色
     将SR设为黑色
     对P进行左旋

     *
     *删除情景2.1.2.2：替换结点的兄弟结点的右子结点为黑结点，左子结点为红结点
     * 兄弟结点所在的子树有红结点，我们总是可以向兄弟子树借个红结点过来，显然该情景可以转换为情景2.1.2.1。
     *
     *
     *
     将S设为红色
     将SL设为黑色
     对S进行右旋，得到情景2.1.2.1
     进行情景2.1.2.1的处理

     *
     *
     * 删除情景2.1.2.3：替换结点的兄弟结点的子结点都为黑结点
     * 好了，此次兄弟子树都没红结点“借”了，兄弟帮忙不了，找父母呗，这种情景我们把兄弟结点设为红色，
     * 再把父结点当作替代结点，自底向上处理，去找父结点的兄弟结点去“借”。
     * 但为什么需要把兄弟结点设为红色呢？显然是为了在P所在的子树中保证平衡
     * （R即将删除，少了一个黑色结点，子树也需要少一个），
     * 后续的平衡工作交给父辈们考虑了，还是那句，当每棵子树都保持平衡时，最终整棵总是平衡的。
     *
     *
     将S设为红色
     把P作为新的替换结点
     重新进行删除结点情景处理

     *
     */
}
