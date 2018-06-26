package customer.tcrj.com.myproject.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by leict on 2018/4/9.
 */

public class flfgInfo implements Serializable{


    public String getStat() {
        return stat;
    }

    public void setStat(String stat) {
        this.stat = stat;
    }

    /**
     * PageIndex : 5
     * PageSize : 4
     * TotalItemCount : 1
     * TotalPageCount : 1
     * Data : [{"ID":1,"MenuID":1,"MenuName":"目录名称","Title":"法规标题","IssueOrgan":"颁布单位","PublishMessage":"发文字号","IssueTime":"2018-05-15T00:00:00","Source":"法规来源","Status":1,"StatusName":"启用","lawRuleMenu":{"lawRuleInfos":[{"ID":1,"MenuID":1,"Title":"法规标题","IssueOrgan":"颁布单位","PublishMessage":"发文字号","IssueTime":"2018-05-15T00:00:00","Source":"法规来源","Content":"<p>法规全文<\/p><p>asdfasdfasdfa<\/p><p>\\asdfasdfasdf<\/p><p>asdfasdfaafafafafafaf<\/p><p><img src=\"/uploadedfiles/ueuploads/image/20180516/6366207983188470801432815.png\" title=\"研发部规划.png\" alt=\"研发部规划.png\"/><\/p>","UpdateStaffID":1,"UpdateTime":"2018-05-16T15:03:53.443","Status":1}],"Parent":null,"ID":1,"ParentID":null,"Name":"目录名称","Type":1,"OrderID":1,"CreateStaffID":1,"CreateTime":"2018-05-15T14:02:48.477","Status":1,"Remark":"备注","Path":"逻辑路径"}}]
     */
    private String stat;
    private int PageIndex;
    private int PageSize;
    private int TotalItemCount;
    private int TotalPageCount;
    private List<DataBean> Data;

    public int getPageIndex() {
        return PageIndex;
    }

    public void setPageIndex(int PageIndex) {
        this.PageIndex = PageIndex;
    }

    public int getPageSize() {
        return PageSize;
    }

    public void setPageSize(int PageSize) {
        this.PageSize = PageSize;
    }

    public int getTotalItemCount() {
        return TotalItemCount;
    }

    public void setTotalItemCount(int TotalItemCount) {
        this.TotalItemCount = TotalItemCount;
    }

    public int getTotalPageCount() {
        return TotalPageCount;
    }

    public void setTotalPageCount(int TotalPageCount) {
        this.TotalPageCount = TotalPageCount;
    }

    public List<DataBean> getData() {
        return Data;
    }

    public void setData(List<DataBean> Data) {
        this.Data = Data;
    }

    public static class DataBean implements Serializable{
        /**
         * ID : 1
         * MenuID : 1
         * MenuName : 目录名称
         * Title : 法规标题
         * IssueOrgan : 颁布单位
         * PublishMessage : 发文字号
         * IssueTime : 2018-05-15T00:00:00
         * Source : 法规来源
         * Status : 1
         * StatusName : 启用
         * lawRuleMenu : {"lawRuleInfos":[{"ID":1,"MenuID":1,"Title":"法规标题","IssueOrgan":"颁布单位","PublishMessage":"发文字号","IssueTime":"2018-05-15T00:00:00","Source":"法规来源","Content":"<p>法规全文<\/p><p>asdfasdfasdfa<\/p><p>\\asdfasdfasdf<\/p><p>asdfasdfaafafafafafaf<\/p><p><img src=\"/uploadedfiles/ueuploads/image/20180516/6366207983188470801432815.png\" title=\"研发部规划.png\" alt=\"研发部规划.png\"/><\/p>","UpdateStaffID":1,"UpdateTime":"2018-05-16T15:03:53.443","Status":1}],"Parent":null,"ID":1,"ParentID":null,"Name":"目录名称","Type":1,"OrderID":1,"CreateStaffID":1,"CreateTime":"2018-05-15T14:02:48.477","Status":1,"Remark":"备注","Path":"逻辑路径"}
         */

        private int ID;
        private int MenuID;
        private String MenuName;
        private String Title;
        private String IssueOrgan;
        private String PublishMessage;
        private String IssueTime;
        private String Source;
        private String Status;
        private String StatusName;

        public String getContent() {
            return Content;
        }

        public void setContent(String content) {
            Content = content;
        }

        private String Content;
        private LawRuleMenuBean lawRuleMenu;

        public int getID() {
            return ID;
        }

        public void setID(int ID) {
            this.ID = ID;
        }

        public int getMenuID() {
            return MenuID;
        }

        public void setMenuID(int MenuID) {
            this.MenuID = MenuID;
        }

        public String getMenuName() {
            return MenuName;
        }

        public void setMenuName(String MenuName) {
            this.MenuName = MenuName;
        }

        public String getTitle() {
            return Title;
        }

        public void setTitle(String Title) {
            this.Title = Title;
        }

        public String getIssueOrgan() {
            return IssueOrgan;
        }

        public void setIssueOrgan(String IssueOrgan) {
            this.IssueOrgan = IssueOrgan;
        }

        public String getPublishMessage() {
            return PublishMessage;
        }

        public void setPublishMessage(String PublishMessage) {
            this.PublishMessage = PublishMessage;
        }

        public String getIssueTime() {
            return IssueTime;
        }

        public void setIssueTime(String IssueTime) {
            this.IssueTime = IssueTime;
        }

        public String getSource() {
            return Source;
        }

        public void setSource(String Source) {
            this.Source = Source;
        }

        public String getStatus() {
            return Status;
        }

        public void setStatus(String Status) {
            this.Status = Status;
        }

        public String getStatusName() {
            return StatusName;
        }

        public void setStatusName(String StatusName) {
            this.StatusName = StatusName;
        }

        public LawRuleMenuBean getLawRuleMenu() {
            return lawRuleMenu;
        }

        public void setLawRuleMenu(LawRuleMenuBean lawRuleMenu) {
            this.lawRuleMenu = lawRuleMenu;
        }

        public static class LawRuleMenuBean implements Serializable{
            /**
             * lawRuleInfos : [{"ID":1,"MenuID":1,"Title":"法规标题","IssueOrgan":"颁布单位","PublishMessage":"发文字号","IssueTime":"2018-05-15T00:00:00","Source":"法规来源","Content":"<p>法规全文<\/p><p>asdfasdfasdfa<\/p><p>\\asdfasdfasdf<\/p><p>asdfasdfaafafafafafaf<\/p><p><img src=\"/uploadedfiles/ueuploads/image/20180516/6366207983188470801432815.png\" title=\"研发部规划.png\" alt=\"研发部规划.png\"/><\/p>","UpdateStaffID":1,"UpdateTime":"2018-05-16T15:03:53.443","Status":1}]
             * Parent : null
             * ID : 1
             * ParentID : null
             * Name : 目录名称
             * Type : 1
             * OrderID : 1
             * CreateStaffID : 1
             * CreateTime : 2018-05-15T14:02:48.477
             * Status : 1
             * Remark : 备注
             * Path : 逻辑路径
             */

            private Object Parent;
            private int ID;
            private Object ParentID;
            private String Name;
            private int Type;
            private int OrderID;
            private int CreateStaffID;
            private String CreateTime;
            private int Status;
            private String Remark;
            private String Path;
            private List<LawRuleInfosBean> lawRuleInfos;

            public Object getParent() {
                return Parent;
            }

            public void setParent(Object Parent) {
                this.Parent = Parent;
            }

            public int getID() {
                return ID;
            }

            public void setID(int ID) {
                this.ID = ID;
            }

            public Object getParentID() {
                return ParentID;
            }

            public void setParentID(Object ParentID) {
                this.ParentID = ParentID;
            }

            public String getName() {
                return Name;
            }

            public void setName(String Name) {
                this.Name = Name;
            }

            public int getType() {
                return Type;
            }

            public void setType(int Type) {
                this.Type = Type;
            }

            public int getOrderID() {
                return OrderID;
            }

            public void setOrderID(int OrderID) {
                this.OrderID = OrderID;
            }

            public int getCreateStaffID() {
                return CreateStaffID;
            }

            public void setCreateStaffID(int CreateStaffID) {
                this.CreateStaffID = CreateStaffID;
            }

            public String getCreateTime() {
                return CreateTime;
            }

            public void setCreateTime(String CreateTime) {
                this.CreateTime = CreateTime;
            }

            public int getStatus() {
                return Status;
            }

            public void setStatus(int Status) {
                this.Status = Status;
            }

            public String getRemark() {
                return Remark;
            }

            public void setRemark(String Remark) {
                this.Remark = Remark;
            }

            public String getPath() {
                return Path;
            }

            public void setPath(String Path) {
                this.Path = Path;
            }

            public List<LawRuleInfosBean> getLawRuleInfos() {
                return lawRuleInfos;
            }

            public void setLawRuleInfos(List<LawRuleInfosBean> lawRuleInfos) {
                this.lawRuleInfos = lawRuleInfos;
            }

            public static class LawRuleInfosBean implements Serializable{
                /**
                 * ID : 1
                 * MenuID : 1
                 * Title : 法规标题
                 * IssueOrgan : 颁布单位
                 * PublishMessage : 发文字号
                 * IssueTime : 2018-05-15T00:00:00
                 * Source : 法规来源
                 * Content : <p>法规全文</p><p>asdfasdfasdfa</p><p>\asdfasdfasdf</p><p>asdfasdfaafafafafafaf</p><p><img src="/uploadedfiles/ueuploads/image/20180516/6366207983188470801432815.png" title="研发部规划.png" alt="研发部规划.png"/></p>
                 * UpdateStaffID : 1
                 * UpdateTime : 2018-05-16T15:03:53.443
                 * Status : 1
                 */

                private int ID;
                private int MenuID;
                private String Title;
                private String IssueOrgan;
                private String PublishMessage;
                private String IssueTime;
                private String Source;
                private String Content;
                private int UpdateStaffID;
                private String UpdateTime;
                private int Status;

                public int getID() {
                    return ID;
                }

                public void setID(int ID) {
                    this.ID = ID;
                }

                public int getMenuID() {
                    return MenuID;
                }

                public void setMenuID(int MenuID) {
                    this.MenuID = MenuID;
                }

                public String getTitle() {
                    return Title;
                }

                public void setTitle(String Title) {
                    this.Title = Title;
                }

                public String getIssueOrgan() {
                    return IssueOrgan;
                }

                public void setIssueOrgan(String IssueOrgan) {
                    this.IssueOrgan = IssueOrgan;
                }

                public String getPublishMessage() {
                    return PublishMessage;
                }

                public void setPublishMessage(String PublishMessage) {
                    this.PublishMessage = PublishMessage;
                }

                public String getIssueTime() {
                    return IssueTime;
                }

                public void setIssueTime(String IssueTime) {
                    this.IssueTime = IssueTime;
                }

                public String getSource() {
                    return Source;
                }

                public void setSource(String Source) {
                    this.Source = Source;
                }

                public String getContent() {
                    return Content;
                }

                public void setContent(String Content) {
                    this.Content = Content;
                }

                public int getUpdateStaffID() {
                    return UpdateStaffID;
                }

                public void setUpdateStaffID(int UpdateStaffID) {
                    this.UpdateStaffID = UpdateStaffID;
                }

                public String getUpdateTime() {
                    return UpdateTime;
                }

                public void setUpdateTime(String UpdateTime) {
                    this.UpdateTime = UpdateTime;
                }

                public int getStatus() {
                    return Status;
                }

                public void setStatus(int Status) {
                    this.Status = Status;
                }
            }
        }
    }
}
