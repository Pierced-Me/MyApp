package test.qxc.com.myapp.module.bean;

import java.util.List;

import test.qxc.com.mylibrary.net.ResponseBean;

/**
 * 类的用途:
 *
 * @author: qinxiaochuan
 * @date: 2017/1/4.
 */

public class WeChatBean extends ResponseBean {

    /**
     * code : 200
     * msg : success
     * newslist : [{"ctime":"2017-01-04","title":"这大概是百度大脑诞生2年来最正式的一次大考","description":"深几度","picUrl":"http://mmbiz.qpic.cn/mmbiz_jpg/ZVoaibkuWvjZ0ZotNMicsEAV0zOREiakpbhAIoQ0RLLQJpT21MnkKlHdy0fDicNLxyU6GiaC2wYvGu6fKAXs2FLcG2g/0?wx_fmt=jpeg","url":"http://mp.weixin.qq.com/s/svEkXM_nx13k-vmR4c35Zw"},{"ctime":"2017-01-04","title":"未来简史：本书只适合高智商且勇敢的人","description":"中信书店","picUrl":"http://mmbiz.qpic.cn/mmbiz_jpg/nqelflZYRc7OrkYxwhHZvQicwnG7LJQ3s3nz2fiaCMFx1pgNxmyveUxPkVpkpHNpnMKAOLmz2uOdNex4dGlkDExQ/0?wx_fmt=jpeg","url":"http://mp.weixin.qq.com/s/GHPl131MXZDMoIp1lg6C2Q"},{"ctime":"2017-01-04","title":"体验了下微信小程序，感受到了腾讯的野心。","description":"差评","picUrl":"http://mmbiz.qpic.cn/mmbiz_png/yZPTcMGWibvtfOSUMkd7NjQF88nkSDKNFLyRMXTbeMqex5T6CCfY2FFEnMz5uia4SARSNpicUIrBib2rC8E6zPiaLkA/0?wx_fmt=png","url":"http://mp.weixin.qq.com/s/6t8YEOzkUezWJO7Y9v3qnw"},{"ctime":"2017-01-04","title":"如何度过20岁开头的穷苦日子","description":"新世相","picUrl":"http://mmbiz.qpic.cn/mmbiz_jpg/5ROs96OaibImYXialxp8GBuWdAmCbvdZ5f8zEjPQOr49PIVUdkVcIVgpVJtBeP5Y7AIueBbwk1qhnX10eZnp7icrA/0?wx_fmt=jpeg","url":"http://mp.weixin.qq.com/s/BsWITk-EI9LYz7dhyg3icQ"},{"ctime":"2017-01-02","title":"发财树也能开花，花朵还很漂亮！","description":"流意盆栽","picUrl":"http://mmbiz.qpic.cn/mmbiz_jpg/5hX4zhRicEEHxTdyFibfe1xrbcI1qaAs6yOnY31L6v02T96VxCR3GcZhEwS956NLAFpLLktN34R4baaBauWg4N5A/0?wx_fmt=jpeg","url":"http://mp.weixin.qq.com/s/yficc0tDfgFIoKGxhJZMsg"},{"ctime":"2017-01-02","title":"很多事都是后知后觉，比如喝水、添衣和想你。","description":"我要WhatYouNeed","picUrl":"http://mmbiz.qpic.cn/mmbiz_png/zynprs47B4RfDAH6Os3rIFOwzVHGR37yywpmwm7icwJ2q2OgylXt1v1c4pXv2GZl863Oh5tP5FMLubT5uQnxT8Q/0?wx_fmt=png","url":"http://mp.weixin.qq.com/s/psvCdmdncjAeYov_dzmQOQ"},{"ctime":"2017-01-02","title":"这个神奇的眼罩只需戴19分钟，比做大保健还舒服！","description":"差评","picUrl":"http://mmbiz.qpic.cn/mmbiz_jpg/yZPTcMGWibvucibXtEFAYXic59vNKADwhjicATjicbIic68bZvGnPCXWicf7IkOPhLmYaBj8sJvHIBDbY3XNbDw2EQiaOQ/0?wx_fmt=jpeg","url":"http://mp.weixin.qq.com/s/j9uTFY5Bw0wYWRBCmSssmA"},{"ctime":"2017-01-02","title":"从段首空两格说起","description":"小道消息","picUrl":"http://mmbiz.qpic.cn/mmbiz/ow5rEn8QGlEL46kJgQzicrPNevGzU1xtwjOeLwQDxm8s3RPs7XvNfOlz3qkhdv3hiaKUyCOrZZGU4saAfW9gK52w/0?wx_fmt=jpeg","url":"http://mp.weixin.qq.com/s/V7hN40XyuSF7cIW8Og0SlA"},{"ctime":"2017-01-02","title":"罗振宇《时间的朋友》跨年演讲精华版：2017年的5大趋势与变化","description":"腾讯科技","picUrl":"http://mmbiz.qpic.cn/mmbiz_jpg/ow6przZuPIHMrXsUsOOBxS3GibwyCicH9JxJrbQ1icaWEqqMPmybia7RuFJyicam8njlqgubeAlgr4Kw1icOucGXaOLQ/0?wx_fmt=jpeg","url":"http://mp.weixin.qq.com/s/qyC9KS308xKhALR-dAyeWQ"},{"ctime":"2017-01-02","title":"王小川：让搜狗少犯错的，不是精通，而是不懂","description":"科技50","picUrl":"http://mmbiz.qpic.cn/mmbiz_jpg/kfceBEgJM8ATns4R7iakibiazo3qJf31icILIcwQa8dBDRCYuLJnUibAGYcxWMYGjCbfN005MnUSFULRrLYYn2GjyRg/640?wx_fmt=jpeg","url":"http://mp.weixin.qq.com/s/difkR5jVDKNODKVazfZLxQ"}]
     */

    private List<NewslistBean> newslist;

    public List<NewslistBean> getNewslist() {
        return newslist;
    }

    public void setNewslist(List<NewslistBean> newslist) {
        this.newslist = newslist;
    }

    public static class NewslistBean {
        /**
         * ctime : 2017-01-04
         * title : 这大概是百度大脑诞生2年来最正式的一次大考
         * description : 深几度
         * picUrl : http://mmbiz.qpic.cn/mmbiz_jpg/ZVoaibkuWvjZ0ZotNMicsEAV0zOREiakpbhAIoQ0RLLQJpT21MnkKlHdy0fDicNLxyU6GiaC2wYvGu6fKAXs2FLcG2g/0?wx_fmt=jpeg
         * url : http://mp.weixin.qq.com/s/svEkXM_nx13k-vmR4c35Zw
         */

        private String ctime;
        private String title;
        private String description;
        private String picUrl;
        private String url;

        public String getCtime() {
            return ctime;
        }

        public void setCtime(String ctime) {
            this.ctime = ctime;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getPicUrl() {
            return picUrl;
        }

        public void setPicUrl(String picUrl) {
            this.picUrl = picUrl;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }
}
