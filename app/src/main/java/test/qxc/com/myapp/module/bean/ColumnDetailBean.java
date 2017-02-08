package test.qxc.com.myapp.module.bean;

import java.util.List;

import test.qxc.com.mylibrary.net.ResponseBean;

/**
 * 类的用途:
 *
 * @author: qinxiaochuan
 * @date: 2017/1/5.
 */

public class ColumnDetailBean extends ResponseBean {

    /**
     * name : 深夜惊奇
     * stories : [{"date":"20160601","display_date":"6 月 1 日","id":8387524,"images":["http://pic3.zhimg.com/91125c9aebcab1c84f58ce4f8779551e.jpg"],"title":"深夜惊奇 · 要穿内衣"},{"date":"20160531","display_date":"5 月 31 日","id":8358164,"images":["http://pic1.zhimg.com/dafb3b8dd2a552f9107097377cb75a44.jpg"],"title":"深夜惊奇 · 童年夏日记忆"},{"date":"20160530","display_date":"5 月 30 日","id":8357883,"images":["http://pic2.zhimg.com/643a7a7dec81507a2304e4e956dc1fb5.jpg"],"title":"深夜惊奇 · 意外收入"},{"date":"20160529","display_date":"5 月 29 日","id":8370953,"images":["http://pic3.zhimg.com/4aaeb2db0a0766e4491fcbcc7fe2d21a.jpg"],"title":"深夜惊奇 · 无知少年太羞耻"},{"date":"20160528","display_date":"5 月 28 日","id":8358651,"images":["http://pic4.zhimg.com/2c8dd6d2359d10dd4b38a471b1ea9db7.jpg"],"title":"深夜惊奇 · 分开睡"},{"date":"20160527","display_date":"5 月 27 日","id":8358390,"images":["http://pic1.zhimg.com/b14385da3b12a2262069d75247be6660.jpg"],"multipic":true,"title":"深夜惊奇 · 亲手盖个别墅"},{"date":"20160526","display_date":"5 月 26 日","id":8357715,"images":["http://pic3.zhimg.com/1d5bb363e20bec02d0dd5280789ee80e.jpg"],"title":"深夜惊奇 · 回到过去"},{"date":"20160525","display_date":"5 月 25 日","id":8354729,"images":["http://pic3.zhimg.com/5472736212d7f0ec083bd2bc32dec13e.jpg"],"title":"深夜惊奇 · 礼物太雷人了"},{"date":"20160524","display_date":"5 月 24 日","id":8347574,"images":["http://pic3.zhimg.com/4b63a2d68262d0a95ce41f08bc6f90be.jpg"],"title":"深夜惊奇 · 大海捞针"},{"date":"20160523","display_date":"5 月 23 日","id":8343614,"images":["http://pic3.zhimg.com/f486d773bd56e24c2ffca4e31ba82aea.jpg"],"title":"深夜惊奇 · 心酸至极"},{"date":"20160522","display_date":"5 月 22 日","id":8339246,"images":["http://pic4.zhimg.com/1d8837227fb255c22ec714ef3ea1751b.jpg"],"title":"深夜惊奇 · 不能忍"},{"date":"20160521","display_date":"5 月 21 日","id":8335453,"images":["http://pic2.zhimg.com/3bbad0a4981ca18a1364ed897a2066ed.jpg"],"title":"深夜惊奇 · 十五六岁的错误"},{"date":"20160520","display_date":"5 月 20 日","id":7979139,"images":["http://pic4.zhimg.com/f5f852327d05d765892ed48e8bc9315b.jpg"],"title":"深夜惊奇 · 人性有彩蛋"},{"date":"20160519","display_date":"5 月 19 日","id":8324357,"images":["http://pic3.zhimg.com/f18516731177bce509e564479bcece82.jpg"],"title":"深夜惊奇 · 游戏里的男人"},{"date":"20160518","display_date":"5 月 18 日","id":8320802,"images":["http://pic1.zhimg.com/c72119a96946f0c73ae19b0935404dfc.jpg"],"title":"深夜惊奇 · 撩妹力负 Max"},{"date":"20160517","display_date":"5 月 17 日","id":8313481,"images":["http://pic2.zhimg.com/d956822131b43dfde8776507ea427ee9.jpg"],"title":"深夜惊奇 · 得了罕见病"},{"date":"20160516","display_date":"5 月 16 日","id":8310101,"images":["http://pic2.zhimg.com/f04c667f2a6b36d80bb44675989482f5.jpg"],"title":"深夜惊奇 · 月入十万难不难"},{"date":"20160515","display_date":"5 月 15 日","id":8304959,"images":["http://pic2.zhimg.com/76c820299e95ab3dfe399fd435918ced.jpg"],"title":"深夜惊奇 · 替你好好活着"},{"date":"20160514","display_date":"5 月 14 日","id":8301930,"images":["http://pic4.zhimg.com/f83ec4a0c32ea195fe6f737786ca38ab.jpg"],"title":"深夜惊奇 · 做过最潇洒的事"},{"date":"20160513","display_date":"5 月 13 日","id":8295413,"images":["http://pic2.zhimg.com/17ace64287ce3c6a6b476549eec6abf5.jpg"],"title":"深夜惊奇 · 就怕货比货"}]
     * timestamp : 1463148001
     */

    private List<StoriesBean> stories;

    public List<StoriesBean> getStories() {
        return stories;
    }

    public void setStories(List<StoriesBean> stories) {
        this.stories = stories;
    }

    public static class StoriesBean {
        /**
         * date : 20160601
         * display_date : 6 月 1 日
         * id : 8387524
         * images : ["http://pic3.zhimg.com/91125c9aebcab1c84f58ce4f8779551e.jpg"]
         * title : 深夜惊奇 · 要穿内衣
         * multipic : true
         */

        private int id;
        private String title;
        private List<String> images;

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
}
