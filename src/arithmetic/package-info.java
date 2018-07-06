package arithmetic;
/**
 * 排序：
 * 1. 内部排序
 *     1. 选择排序
 *          1. 直接选择排序：从数组中取出最小的放第一个，余下再取最小的
 *          2. 堆排序：组成一个堆，堆顶和最右子节点对调，最右子节点为最大值，略去，重复当前操作
 *     2. 插入排序
 *          1. 直接插入排序：前两个数据排序，第三个数据加入，插入对应位置，依次
 *          2. 希尔排序：以length为10为例，分为10/2组，相隔4个数字组成一组，进行插入排序；下一步5/2 =2，分为两组，每组5个数，相隔1个数字分为一直，再次插入排序；下一步2/2=1，再次插入排序。
 *     3. 交换排序
 *          1. 冒泡排序：相邻两数据比较，排序，等到最后一位数据对比完成，第一轮完成，最后一位确定。其余数据重复该操作
 *          2. 快速排序：确定基准数，从右往左找比基准小的数，从左往右找比基准大的数，交换，当两个坐标遇到时，将基准交换到该位置。左右继续快速排序
 *     4. 归并排序：分治法的实现，将数组一份二，递归到一个数字，再归并。
 *     5. 基数排序：第一位数字放入0-9的桶内，从9倒到1，依次按第二位数0-9的桶内，第三位数，第四位数，倒完后，就是从大到小排序的数。
 * 2. 外部排序
 *     1. 多路归并：分治法，内存一次无法处理该数据
 *     2. 败者树
 */
