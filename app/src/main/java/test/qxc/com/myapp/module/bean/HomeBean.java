package test.qxc.com.myapp.module.bean;

import java.util.List;

import test.qxc.com.mylibrary.net.ResponseBean;

/**
 * 类的用途:
 *
 * @author: qinxiaochuan
 * @date: 2016/12/30.
 */

public class HomeBean extends ResponseBean {

    /**
     * date : 20170103
     * stories : [{"ga_prefix":"010308","id":9117233,"images":["http://pic2.zhimg.com/569beaf58b2170a20a2106d0b4689e21.jpg"],"title":"企业文化到底是什么呢？","type":0},{"ga_prefix":"010307","id":9112602,"images":["http://pic2.zhimg.com/ab771f4069b58780abfbe2d3a3fd28c5.jpg"],"multipic":true,"title":"新的一年，试试这些简单营养的西式早餐","type":0},{"ga_prefix":"010307","id":9117424,"images":["http://pic1.zhimg.com/14883948fc305c7413dc877da9ff5dbc.jpg"],"title":"先别急着掏钱，看起来神奇的洗脸刷不一定适合你","type":0},{"ga_prefix":"010307","id":9117444,"images":["http://pic3.zhimg.com/ecce3489d8f8ea124948e15033f20822.jpg"],"title":"如何在无领导小组面试中脱颖而出？","type":0},{"ga_prefix":"010306","id":9108463,"images":["http://pic2.zhimg.com/3f95089e27191e0535bd03921e0e0df1.jpg"],"title":"瞎扯 · 如何正确地吐槽","type":0}]
     * top_stories : [{"ga_prefix":"010307","id":9117444,"image":"http://pic2.zhimg.com/07823621d12a90c16acb51caa291f3b9.jpg","title":"如何在无领导小组面试中脱颖而出？","type":0},{"ga_prefix":"010307","id":9112602,"image":"http://pic1.zhimg.com/a9eb2560fd255dc4e848131ebf037da4.jpg","title":"新的一年，试试这些简单营养的西式早餐","type":0},{"ga_prefix":"010219","id":9116372,"image":"http://pic2.zhimg.com/69666b4a7f0d6accbd9a2e641de8bde9.jpg","title":"单身独居，越来越多人打算就这样过下去","type":0},{"ga_prefix":"010217","id":9116662,"image":"http://pic4.zhimg.com/f619e4420ac09ab6b755892d73d35f77.jpg","title":"知乎好问题 · 思维和语言的关系是什么？","type":0},{"ga_prefix":"010213","id":9102306,"image":"http://pic1.zhimg.com/29ae7db7b61112d6eedafd51757ee51c.jpg","title":"怀孕「傻三年」，不会真的变傻，可能是你的生活不一样了","type":0}]
     */

    private List<StoriesBean> stories;
    private List<TopStoriesBean> top_stories;

    public List<StoriesBean> getStories() {
        return stories;
    }

    public void setStories(List<StoriesBean> stories) {
        this.stories = stories;
    }

    public List<TopStoriesBean> getTop_stories() {
        return top_stories;
    }

    public void setTop_stories(List<TopStoriesBean> top_stories) {
        this.top_stories = top_stories;
    }

    public static class StoriesBean {
        /**
         * ga_prefix : 010308
         * id : 9117233
         * images : ["http://pic2.zhimg.com/569beaf58b2170a20a2106d0b4689e21.jpg"]
         * title : 企业文化到底是什么呢？
         * type : 0
         * multipic : true
         */

        private String title;
        private List<String> images;
        private int id;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public List<String> getImages() {
            return images;
        }

        public void setImages(List<String> images) {
            this.images = images;
        }
    }

    public static class TopStoriesBean {
        /**
         * ga_prefix : 010307
         * id : 9117444
         * image : http://pic2.zhimg.com/07823621d12a90c16acb51caa291f3b9.jpg
         * title : 如何在无领导小组面试中脱颖而出？
         * type : 0
         */

        private String image;
        private String title;
        private int id;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }
    }
}
