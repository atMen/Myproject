package com.multilevel.treelist;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangke on 2017-1-14.
 */
public class Node<T,B> {

    /**
     * 传入的实体对象
     */
    public B bean;
    /**
     * 设置开启 关闭的图片
     */
    public int iconExpand=-1, iconNoExpand = -1;

//    private T id;
//    /**
//     * 根节点pId为0
//     */
//    private T pId ;

    private String Name;

    /**
     * 当前的级别
     */
    private int level;

    /**
     * 是否展开
     */
    private boolean isExpand = false;

    private int icon = -1;

    /**
     * 下一级的子Node
     */
    private List<Node> children = new ArrayList<>();

    /**
     * 父Node
     */
    private Node parent;
    /**
     * 是否被checked选中
     */
    private boolean isChecked;
    /**
     * 是否为新添加的
     */
    public boolean isNewAdd = true;

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean isChecked) {
        this.isChecked = isChecked;
    }

    public Node() {}

    public Node(T id, T pId, String name) {
        super();
        this.ID = id;
        this.PID = pId;
        this.Name = name;
    }
    public Node(T id, T pId, String name,B bean) {
        super();
        this.ID = id;
        this.PID = pId;
        this.Name = name;
        this.bean = bean;
    }


    public int getIcon()
    {
        return icon;
    }

    public void setIcon(int icon)
    {
        this.icon = icon;
    }

    public T getId()
    {
        return ID;
    }

    public void setId(T id)
    {
        this.ID = id;
    }

    public T getpId()
    {
        return PID;
    }

    public void setpId(T pId)
    {
        this.PID = pId;
    }

    public String getName()
    {
        return Name;
    }

    public void setName(String name)
    {
        this.Name = name;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public boolean isExpand() {
        return isExpand;
    }

    public List<Node> getChildren() {
        return children;
    }

    public void setChildren(List<Node> children) {
        this.children = children;
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    /**
     * 是否为跟节点
     *
     * @return
     */
    public boolean isRoot() {
        return parent == null;
    }

    /**
     * 判断父节点是否展开
     *
     * @return
     */
    public boolean isParentExpand() {
        if (parent == null)
            return false;
        return parent.isExpand();
    }

    /**
     * 是否是叶子界点
     *
     * @return
     */
    public boolean isLeaf()
    {
        return children.size() == 0;
    }

    /**
     * 获取level
     */
    public int getLevel() {

        return parent == null ? 0 : parent.getLevel() + 1;
    }

    /**
     * 设置展开
     *
     * @param isExpand
     */
    public void setExpand(boolean isExpand) {
        this.isExpand = isExpand;
        if (!isExpand) {

            for (Node node : children) {
                node.setExpand(isExpand);
            }
        }
    }




    private T ID;
    private T PID;
    private String DataCode;
    private int lvl;
    private String Path;

//    public T getID() {
//        return ID;
//    }
//
//    public void setID(T ID) {
//        this.ID = ID;
//    }
//
//    public T getPID() {
//        return PID;
//    }
//
//    public void setPID(T PID) {
//        this.PID = PID;
//    }

    public String getDataCode() {
        return DataCode;
    }

    public void setDataCode(String DataCode) {
        this.DataCode = DataCode;
    }


    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public String getPath() {
        return Path;
    }

    public void setPath(String Path) {
        this.Path = Path;
    }


    @Override
    public String toString() {
        return "Node{" +
                "name='" + Name + '\'' +
                ", ID=" + ID +
                ", PID=" + PID +
                ", lvl=" + lvl +
                ", Path='" + Path + '\'' +
                '}';
    }
}
